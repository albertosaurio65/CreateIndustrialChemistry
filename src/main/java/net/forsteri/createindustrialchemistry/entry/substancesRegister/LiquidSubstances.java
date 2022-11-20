package net.forsteri.createindustrialchemistry.entry.substancesRegister;

import net.forsteri.createindustrialchemistry.entry.creativeModeTabs.CompoundSubstanceTab;
import net.forsteri.createindustrialchemistry.entry.creativeModeTabs.ElementarySubstanceTab;
import net.forsteri.createindustrialchemistry.entry.creativeModeTabs.FluidTab;
import net.forsteri.createindustrialchemistry.substances.abstracts.FlowingFluid;
import net.forsteri.createindustrialchemistry.substances.abstracts.fluidBlockTypes.HotFluidBlock;
import net.forsteri.createindustrialchemistry.substances.abstracts.generals.GeneralFlowingFluid;
import net.forsteri.createindustrialchemistry.substances.compound.MoltenSalt;
import net.forsteri.createindustrialchemistry.substances.compound.PureWater;
import net.forsteri.createindustrialchemistry.substances.equipment.MetalTank;
import net.forsteri.createindustrialchemistry.substances.abstracts.FluidBlock;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;

import static net.forsteri.createindustrialchemistry.entry.substancesRegister.DeferredRegisters.*;

@SuppressWarnings({"Convert2MethodRef", "FunctionalExpressionCanBeFolded"})
public class LiquidSubstances {
    public static final RegistryObject<FlowingFluid> PURE_WATER_SOURCE
            = FLUIDS.register("distilled_water", () -> new PureWater.Source(LiquidSubstances.PURE_WATER_PROPERTIES));

    public static final RegistryObject<FlowingFluid> PURE_WATER_FLOWING
            = FLUIDS.register("distilled_water_flowing", () -> new PureWater.Flowing(LiquidSubstances.PURE_WATER_PROPERTIES));

    public static final ForgeFlowingFluid.Properties PURE_WATER_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LiquidSubstances.PURE_WATER_SOURCE.get(), () -> LiquidSubstances.PURE_WATER_FLOWING.get(),
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(10)
                    .luminosity(0)
                    .viscosity(0)
                    .sound(SoundEvents.BUCKET_FILL)
                    .color(0xFF43D5EE)
    )
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(() -> LiquidSubstances.PURE_WATER_BLOCK.get())
            .bucket(() -> Items.BUCKET);

    public static final RegistryObject<LiquidBlock> PURE_WATER_BLOCK = BLOCKS.register("distilled_water",
            () -> new FluidBlock(() -> LiquidSubstances.PURE_WATER_SOURCE.get(), BlockBehaviour.Properties.of(Material.WATER)
                    .noOcclusion()
                    .strength(100f)
                    .noDrops()));

    public static final RegistryObject<Item> PURE_WATER_TANK = ITEMS.register("distilled_water_tank",
            () -> new MetalTank(
                    LiquidSubstances.PURE_WATER_SOURCE,
                    new Item.Properties()
                            .stacksTo(1),
                    0xFF43D5EE, CompoundSubstanceTab.COMPOUND_SUBSTANCE_TAB, FluidTab.FLUID_TAB));

    public static final RegistryObject<FlowingFluid> MOLTEN_SALT_SOURCE
            = FLUIDS.register("molten_salt", () -> new MoltenSalt.Source(LiquidSubstances.MOLTEN_SALT_PROPERTIES));

    public static final RegistryObject<FlowingFluid> MOLTEN_SALT_FLOWING
            = FLUIDS.register("molten_salt_flowing", () -> new MoltenSalt.Flowing(LiquidSubstances.MOLTEN_SALT_PROPERTIES));

    public static final ForgeFlowingFluid.Properties MOLTEN_SALT_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LiquidSubstances.MOLTEN_SALT_SOURCE.get(), () -> LiquidSubstances.MOLTEN_SALT_FLOWING.get(),
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(10)
                    .luminosity(0)
                    .viscosity(0)
                    .sound(SoundEvents.BUCKET_FILL)
                    .color(0xFFDD6612)
    )
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(() -> LiquidSubstances.MOLTEN_SALT_BLOCK.get())
            .bucket(() -> Items.BUCKET);

    public static final RegistryObject<LiquidBlock> MOLTEN_SALT_BLOCK = BLOCKS.register("molten_salt",
            () -> new HotFluidBlock(() -> LiquidSubstances.MOLTEN_SALT_SOURCE.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noOcclusion()
                    .strength(100f)
                    .noDrops()));

    public static final RegistryObject<Item> MOLTEN_SALT_TANK = ITEMS.register("molten_salt_tank",
            () -> new MetalTank(
                    LiquidSubstances.MOLTEN_SALT_SOURCE,
                    new Item.Properties()
                            .stacksTo(1)
                    ,0xFFDD6612, CompoundSubstanceTab.COMPOUND_SUBSTANCE_TAB, FluidTab.FLUID_TAB));

    public static final RegistryObject<FlowingFluid> MOLTEN_CARBON_SOURCE
            = FLUIDS.register("molten_carbon", () -> new GeneralFlowingFluid.Source(
                    LiquidSubstances.MOLTEN_CARBON_PROPERTIES, () -> LiquidSubstances.MOLTEN_CARBON_TANK.get())
    );

    public static final RegistryObject<FlowingFluid> MOLTEN_CARBON_FLOWING
            = FLUIDS.register("molten_carbon_flowing", () -> new GeneralFlowingFluid.Flowing(
                    LiquidSubstances.MOLTEN_CARBON_PROPERTIES, () -> LiquidSubstances.MOLTEN_CARBON_TANK.get()
    ));

    public static final ForgeFlowingFluid.Properties MOLTEN_CARBON_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LiquidSubstances.MOLTEN_CARBON_SOURCE.get(), () -> LiquidSubstances.MOLTEN_CARBON_FLOWING.get(),
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(10)
                    .luminosity(0)
                    .viscosity(0)
                    .sound(SoundEvents.BUCKET_FILL)
                    .color(0xFFDD6612)
    )
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(() -> LiquidSubstances.MOLTEN_CARBON_BLOCK.get())
            .bucket(() -> Items.BUCKET);

    public static final RegistryObject<LiquidBlock> MOLTEN_CARBON_BLOCK = BLOCKS.register("molten_carbon",
            () -> new HotFluidBlock(() -> LiquidSubstances.MOLTEN_CARBON_SOURCE.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noOcclusion()
                    .strength(100f)
                    .noDrops()));

    public static final RegistryObject<Item> MOLTEN_CARBON_TANK = ITEMS.register("molten_carbon_tank",
            () -> new MetalTank(
                    LiquidSubstances.MOLTEN_CARBON_SOURCE,
                    new Item.Properties()
                            .stacksTo(1)
                    ,0xFFDD6612, ElementarySubstanceTab.ELEMENTARY_SUBSTANCE_TAB, FluidTab.FLUID_TAB));

    public static final RegistryObject<FlowingFluid> MOLTEN_SILICON_SOURCE
            = FLUIDS.register("molten_silicon", () -> new GeneralFlowingFluid.Source(
            LiquidSubstances.MOLTEN_SILICON_PROPERTIES, () -> LiquidSubstances.MOLTEN_SILICON_TANK.get())
    );

    public static final RegistryObject<FlowingFluid> MOLTEN_SILICON_FLOWING
            = FLUIDS.register("molten_silicon_flowing", () -> new GeneralFlowingFluid.Flowing(
            LiquidSubstances.MOLTEN_SILICON_PROPERTIES, () -> LiquidSubstances.MOLTEN_SILICON_TANK.get()
    ));

    public static final ForgeFlowingFluid.Properties MOLTEN_SILICON_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LiquidSubstances.MOLTEN_SILICON_SOURCE.get(), () -> LiquidSubstances.MOLTEN_SILICON_FLOWING.get(),
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(10)
                    .luminosity(0)
                    .viscosity(0)
                    .sound(SoundEvents.BUCKET_FILL)
                    .color(0xFFDD6612)
    )
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(() -> LiquidSubstances.MOLTEN_SILICON_BLOCK.get())
            .bucket(() -> Items.BUCKET);

    public static final RegistryObject<LiquidBlock> MOLTEN_SILICON_BLOCK = BLOCKS.register("molten_silicon",
            () -> new HotFluidBlock(() -> LiquidSubstances.MOLTEN_SILICON_SOURCE.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noOcclusion()
                    .strength(100f)
                    .noDrops()));

    public static final RegistryObject<Item> MOLTEN_SILICON_TANK = ITEMS.register("molten_silicon_tank",
            () -> new MetalTank(
                    LiquidSubstances.MOLTEN_SILICON_SOURCE,
                    new Item.Properties()
                            .stacksTo(1)
                    ,0xFFDD6612, ElementarySubstanceTab.ELEMENTARY_SUBSTANCE_TAB, FluidTab.FLUID_TAB));

    public static final RegistryObject<FlowingFluid> METHANOL_SOURCE
            = FLUIDS.register("methanol", () -> new GeneralFlowingFluid.Source(
            LiquidSubstances.METHANOL_PROPERTIES, () -> LiquidSubstances.METHANOL_TANK.get())
    );

    public static final RegistryObject<FlowingFluid> METHANOL_FLOWING
            = FLUIDS.register("methanol_flowing", () -> new GeneralFlowingFluid.Flowing(
            LiquidSubstances.METHANOL_PROPERTIES, () -> LiquidSubstances.METHANOL_TANK.get()
    ));

    public static final ForgeFlowingFluid.Properties METHANOL_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LiquidSubstances.METHANOL_SOURCE.get(), () -> LiquidSubstances.METHANOL_FLOWING.get(),
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(10)
                    .luminosity(0)
                    .viscosity(0)
                    .sound(SoundEvents.BUCKET_FILL)
                    .color(0xFFFFFFFF)
    )
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(() -> LiquidSubstances.METHANOL_BLOCK.get())
            .bucket(() -> Items.BUCKET);

    public static final RegistryObject<LiquidBlock> METHANOL_BLOCK = BLOCKS.register("methanol",
            () -> new FluidBlock(() -> LiquidSubstances.METHANOL_SOURCE.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noOcclusion()
                    .strength(100f)
                    .noDrops()));

    public static final RegistryObject<Item> METHANOL_TANK = ITEMS.register("methanol_tank",
            () -> new MetalTank(
                    LiquidSubstances.METHANOL_SOURCE,
                    new Item.Properties()
                            .stacksTo(1)
                    ,0xFFFFFFFF, CompoundSubstanceTab.COMPOUND_SUBSTANCE_TAB, FluidTab.FLUID_TAB));

    public static final RegistryObject<FlowingFluid> MOLTEN_LITHIUM_CHLORIDE_SOURCE
            = FLUIDS.register("molten_lithium_chloride", () -> new GeneralFlowingFluid.Source(
            LiquidSubstances.MOLTEN_LITHIUM_CHLORIDE_PROPERTIES, () -> LiquidSubstances.MOLTEN_LITHIUM_CHLORIDE_TANK.get())
    );

    public static final RegistryObject<FlowingFluid> MOLTEN_LITHIUM_CHLORIDE_FLOWING
            = FLUIDS.register("molten_lithium_chloride_flowing", () -> new GeneralFlowingFluid.Flowing(
            LiquidSubstances.MOLTEN_LITHIUM_CHLORIDE_PROPERTIES, () -> LiquidSubstances.MOLTEN_LITHIUM_CHLORIDE_TANK.get()
    ));

    public static final ForgeFlowingFluid.Properties MOLTEN_LITHIUM_CHLORIDE_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> LiquidSubstances.MOLTEN_LITHIUM_CHLORIDE_SOURCE.get(), () -> LiquidSubstances.MOLTEN_LITHIUM_CHLORIDE_FLOWING.get(),
            FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                    .density(10)
                    .luminosity(0)
                    .viscosity(0)
                    .sound(SoundEvents.BUCKET_FILL)
                    .color(0xFFDD6612)
    )
            .slopeFindDistance(2)
            .levelDecreasePerBlock(2)
            .block(() -> LiquidSubstances.MOLTEN_LITHIUM_CHLORIDE_BLOCK.get())
            .bucket(() -> Items.BUCKET);

    public static final RegistryObject<LiquidBlock> MOLTEN_LITHIUM_CHLORIDE_BLOCK = BLOCKS.register("molten_lithium_chloride",
            () -> new HotFluidBlock(() -> LiquidSubstances.MOLTEN_LITHIUM_CHLORIDE_SOURCE.get(), BlockBehaviour.Properties.of(Material.LAVA)
                    .noOcclusion()
                    .strength(100f)
                    .noDrops()));

    public static final RegistryObject<Item> MOLTEN_LITHIUM_CHLORIDE_TANK = ITEMS.register("molten_lithium_chloride_tank",
            () -> new MetalTank(
                    LiquidSubstances.MOLTEN_LITHIUM_CHLORIDE_SOURCE,
                    new Item.Properties()
                            .stacksTo(1)
                    ,0xFFDD6612, CompoundSubstanceTab.COMPOUND_SUBSTANCE_TAB, FluidTab.FLUID_TAB));



    public static void register(){}
}
