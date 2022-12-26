package net.forsteri.createindustrialchemistry.entry;

import net.forsteri.createindustrialchemistry.entry.registers.substances.AqueousSolutions;
import net.forsteri.createindustrialchemistry.entry.registers.Equipments;
import net.forsteri.createindustrialchemistry.entry.registers.substances.GasSubstances;
import net.forsteri.createindustrialchemistry.entry.registers.substances.SolidSubstances;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

@MethodsReturnNonnullByDefault
public class CreativeModeTabs {
    public static final CreativeModeTab COMPOUND_SUBSTANCE_TAB = new CreativeModeTab("compound_substance_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SolidSubstances.SODIUM_HYDROXIDE.get());
        }
    };

    public static final CreativeModeTab ELEMENTARY_SUBSTANCE_TAB = new CreativeModeTab("elementary_substance_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SolidSubstances.SODIUM.get());
        }
    };

    public static final CreativeModeTab EQUIPMENT_TAB = new CreativeModeTab("equipment_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Equipments.EMPTY_METAL_TANK.get());
        }
    };

    public static final CreativeModeTab FLUID_TAB = new CreativeModeTab("fluid_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(GasSubstances.HYDROGEN.TANK.get());
        }
    };

    public static final CreativeModeTab ALKALI_SUBSTANCE_TAB = new CreativeModeTab("alkali_substance_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SolidSubstances.SODIUM.get());
        }
    };

    public static final CreativeModeTab AQUEOUS_SOLUTION_TAB = new CreativeModeTab("aqueous_solution_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AqueousSolutions.HYDROCHLORIC_ACID.TANK.get());
        }
    };

    public static final CreativeModeTab MIXTURE_TAB = new CreativeModeTab("mixture_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(AqueousSolutions.CALCIUM_CHLORIDE_AQUEOUS_SOLUTION.TANK.get());
        }
    };
}
