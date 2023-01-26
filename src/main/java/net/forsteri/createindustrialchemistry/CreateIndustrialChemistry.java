package net.forsteri.createindustrialchemistry;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.forsteri.createindustrialchemistry.entry.handlers.ColorHandlers;
import net.forsteri.createindustrialchemistry.entry.registers.DeferredRegisters;
import net.forsteri.createindustrialchemistry.entry.registers.entities.EntityPartials;
import net.forsteri.createindustrialchemistry.entry.registers.tileEntities.TilePartials;
import net.forsteri.createindustrialchemistry.entry.registers.tileEntities.RecipeTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateIndustrialChemistry.MOD_ID)
public class CreateIndustrialChemistry {

    public static final String MOD_ID = "createindustrialchemistry";

    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    @SuppressWarnings("removal")
    public static final NonNullSupplier<CreateRegistrate> REGISTRATE = CreateRegistrate.lazy(CreateIndustrialChemistry.MOD_ID);

    public CreateIndustrialChemistry() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        DeferredRegisters.register(eventBus);
        RecipeTypes.register(eventBus);
        eventBus.addListener(this::setup);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> TilePartials::register);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> EntityPartials::register);
        MinecraftForge.EVENT_BUS.register(this);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> eventBus.addListener(ColorHandlers::registerItemColors));
    }

    private void setup(final FMLCommonSetupEvent event) {
        // Some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {
            // Register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(CreateIndustrialChemistry.MOD_ID, path);
    }

    public static CreateRegistrate registrate() {
        return REGISTRATE.get();
    }
}
