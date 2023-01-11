package net.forsteri.createindustrialchemistry.utility;

import net.forsteri.createindustrialchemistry.entry.registers.Equipments;
import net.forsteri.createindustrialchemistry.substances.abstracts.ChemicalSubstance;
import net.forsteri.createindustrialchemistry.substances.abstracts.FluidBlock;
import net.forsteri.createindustrialchemistry.substances.abstracts.fluidBlockTypes.AcidicFluidBlock;
import net.forsteri.createindustrialchemistry.substances.abstracts.fluidBlockTypes.HotFluidBlock;
import net.forsteri.createindustrialchemistry.substances.abstracts.fluidBlockTypes.PoisonousFluidBlock;
import net.forsteri.createindustrialchemistry.substances.abstracts.generals.GeneralFlowingFluid;
import net.forsteri.createindustrialchemistry.substances.abstracts.generals.GeneralRisingGas;
import net.forsteri.createindustrialchemistry.substances.abstracts.itemTypes.WaterSolubleItem;
import net.forsteri.createindustrialchemistry.substances.equipment.MetalTank;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.*;
import static net.forsteri.createindustrialchemistry.entry.registers.DeferredRegisters.*;

public class Registers {
    public static class Fluids {
        public RegistryObject<FlowingFluid> SOURCE;
        public RegistryObject<FlowingFluid> FLOWING;

        public RegistryObject<LiquidBlock> BLOCK;
        public RegistryObject<Item> TANK;
        public ForgeFlowingFluid.Properties PROPERTIES;
        public Fluids(String name, boolean rises, int color, Function<Fluids, FluidBlock> fluidBlockGen, FunctionInterface.TankItemGenFunction tankItemGen, int distance, CreativeModeTab... creativeModeTabs) {
            this.PROPERTIES = new ForgeFlowingFluid.Properties(
                    () -> this.SOURCE.get(), () -> this.FLOWING.get(),
                    FluidAttributes.builder(WATER_STILL_RL, WATER_FLOWING_RL)
                            .density(10)
                            .luminosity(0)
                            .viscosity(0)
                            .sound(SoundEvents.BUCKET_FILL)
                            .color(color)
            )
                    .slopeFindDistance(7/distance)
                    .levelDecreasePerBlock(7/distance)
                    .block(() -> this.BLOCK.get())
                    .bucket(() -> Items.BUCKET);
            if(!rises) {
                this.SOURCE = FLUIDS.register(name, () -> new GeneralFlowingFluid.Source(this.PROPERTIES, () -> this.TANK.get()));
                this.FLOWING = FLUIDS.register(name + "_flowing", () -> new GeneralFlowingFluid.Flowing(this.PROPERTIES, () -> this.TANK.get()));
            }else {
                this.SOURCE = FLUIDS.register(name, () -> new GeneralRisingGas.Source(this.PROPERTIES, () -> this.TANK.get()));
                this.FLOWING = FLUIDS.register(name + "_flowing", () -> new GeneralRisingGas.Flowing(this.PROPERTIES, () -> this.TANK.get()));
            }
            this.BLOCK = BLOCKS.register(name,
                    () -> fluidBlockGen.apply(this));


            this.TANK = ITEMS.register(name+"_tank",
                    () -> tankItemGen.apply(this, color, creativeModeTabs));
        }

        public Fluids(String name, boolean rises, int color, Function<Fluids, FluidBlock> function, int distance, CreativeModeTab... creativeModeTabs){
            this(name, rises, color, function, TankItemGens::normal, distance, creativeModeTabs);
        }

        public Fluids(String name, boolean rises, int color, CreativeModeTab... creativeModeTabs) {
            this(name, rises, color, FluidBlockGens::normal, 2, creativeModeTabs);
        }

        public Fluids(String name, boolean rises, int color, Function<Fluids, FluidBlock> function, CreativeModeTab... creativeModeTabs) {
            this(name, rises, color, function, 2, creativeModeTabs);
        }

        public Fluids(String name, boolean rises, int color, int distance, CreativeModeTab... creativeModeTabs) {
            this(name, rises, color, FluidBlockGens::normal, distance, creativeModeTabs);
        }

        public static class FluidBlockGens{
            public static FluidBlock normal(Fluids fluidsInstance){
                return new FluidBlock(() -> fluidsInstance.SOURCE.get(), BlockBehaviour.Properties.of(Material.LAVA)
                        .noOcclusion()
                        .strength(100f)
                        .noDrops());
            }

            public static FluidBlock hot(Fluids fluidsInstance){
                return new HotFluidBlock(() -> fluidsInstance.SOURCE.get(), BlockBehaviour.Properties.of(Material.LAVA)
                        .noOcclusion()
                        .strength(100f)
                        .noDrops());
            }

            public static Function<Fluids, FluidBlock> acidic(float pH){
                return (Fluids fluids) -> new AcidicFluidBlock(() -> fluids.SOURCE.get(), BlockBehaviour.Properties.of(Material.LAVA)
                        .noOcclusion()
                        .strength(100f)
                        .noDrops(), pH);
            }

            public static Function<Fluids, FluidBlock> basic(float pH){
                return acidic(pH);
            }

            public static FluidBlock poisonous(Fluids fluidsInstance){
                return new PoisonousFluidBlock(() -> fluidsInstance.SOURCE.get(), BlockBehaviour.Properties.of(Material.LAVA)
                        .noOcclusion()
                        .strength(100f)
                        .noDrops());
            }
        }

        public static class TankItemGens{
            public static Item normal(Fluids fluidsInstance, Integer color, CreativeModeTab... creativeModeTabs){
                return new MetalTank(
                        fluidsInstance.SOURCE,
                        new Item.Properties()
                                .stacksTo(1)
                        ,color, creativeModeTabs);
            }

            public static FunctionInterface.TankItemGenFunction fuel(int fuelTime){
                return (Fluids fluids, Integer color, CreativeModeTab... creativeModeTabs) -> (new MetalTank(
                        fluids.SOURCE,
                        new Item.Properties()
                                .stacksTo(1)
                                .craftRemainder(Equipments.EMPTY_METAL_TANK.get()
                                ), color, fuelTime, creativeModeTabs));
            }
        }

    }

    public static class Compounds {
        public static Compounds createCompound(String name){
            return new Compounds(name).addTabs(COMPOUND_SUBSTANCE_TAB);
        }

        public static Compounds createElement(String name){
            return new Compounds(name).addTabs(ELEMENTARY_SUBSTANCE_TAB);
        }

        public static Compounds createMixture(String name){
            return new Compounds(name).addTabs(MIXTURE_TAB);
        }

        public final String name;

        public List<CreativeModeTab> tabs;

        public @Nullable RegistryObject<Item> item;

        public Compounds(String name){
            this.name = name;
            this.tabs = new ArrayList<>();
            this.waterSoluble = false;
        }

        public Item get(){
            assert this.item != null;
            return this.item.get();
        }

        public Compounds register(){
            if(waterSoluble){
                this.solution = new Registers.Fluids(this.name+"_solution", false, this.color, this.fluidBlockGen, 3, this.tabs.toArray(new CreativeModeTab[0]));

                this.item = ITEMS.register(name,
                        () -> new WaterSolubleItem(new Item.Properties(), this.solution.BLOCK,tabs.toArray(tabs.toArray(new CreativeModeTab[0]))));

                return this;
            }

            this.item = ITEMS.register(name,
                    () -> new ChemicalSubstance(new Item.Properties(), tabs.toArray(tabs.toArray(new CreativeModeTab[0]))));
            return this;
        }

        public Compounds addTabs(CreativeModeTab... tabs){
            Collections.addAll(this.tabs, tabs);
            return this;
        }

        public Compounds waterSoluble(int color, Function<Fluids, FluidBlock> fluidBlockGen){
            this.waterSoluble = true;
            this.fluidBlockGen = fluidBlockGen;
            this.color = color;
            return this;
        }

        public boolean waterSoluble;

        protected Function<Fluids, FluidBlock> fluidBlockGen;

        protected int color;

        public @Nullable Fluids solution;
    }
}
