package net.forsteri.createindustrialchemistry.entry.substancesRegister;

import net.forsteri.createindustrialchemistry.CreateIndustrialChemistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

public class DeferredRegisters {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateIndustrialChemistry.MOD_ID);

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, CreateIndustrialChemistry.MOD_ID);

    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, CreateIndustrialChemistry.MOD_ID);

    public static void register(IEventBus eventBus){
        SolidSubstances.register();
        LiquidSubstances.register();
        GasSubstances.register();
        Equipments.register();
        WaterMixtures.register();
        Mixtures.register();
        ITEMS.register(eventBus);
        BLOCKS.register(eventBus);
        FLUIDS.register(eventBus);
    }

    public static final ResourceLocation WATER_STILL_RL = new ResourceLocation("block/water_still");
    public static final ResourceLocation WATER_FLOWING_RL = new ResourceLocation("block/water_flow");
    public static final ResourceLocation WATER_OVERLAY_RL = new ResourceLocation("block/water_overlay");


}
