package net.forsteri.createindustrialchemistry.entry.substancesRegister;

import net.forsteri.createindustrialchemistry.utility.Registers;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.*;

@SuppressWarnings({"unused"})
public class GasSubstances {

    public static final Registers.Fluids HYDROGEN = new Registers.Fluids(
            "hydrogen", true, 0xFFB3DFFF, ELEMENTARY_SUBSTANCE_TAB);

    public static final Registers.Fluids CARBON_DIOXIDE = new Registers.Fluids(
            "carbon_dioxide", false, 0xFFFFFFFF, 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids WATER_VAPOR = new Registers.Fluids(
            "water_vapor", true, 0xFFFFFFFF, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids CARBON_MONOXIDE = new Registers.Fluids(
            "carbon_monoxide", true, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::poisonous, 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids OXYGEN = new Registers.Fluids(
            "oxygen", true, 0x8887CEEB, ELEMENTARY_SUBSTANCE_TAB);

    public static final Registers.Fluids CHLORINE = new Registers.Fluids(
            "chlorine", true, 0xFFFDFDA0, 1, ELEMENTARY_SUBSTANCE_TAB);

    public static final Registers.Fluids HYDROGEN_IODIDE = new Registers.Fluids(
            "hydrogen_iodide", true, 0xFFFFFFFF, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids ACETONE_GAS = new Registers.Fluids(
            "acetone_gas", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(19.2f), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids ISOPROPYL_ALCOHOL_GAS = new Registers.Fluids(
            "isopropyl_alcohol_gas", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(16.5f), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids PROPYLENE = new Registers.Fluids(
            "propylene", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(2.1f), Registers.Fluids.TankItemGens.fuel(9600), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids METHANE = new Registers.Fluids(
            "methane", true, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(1200), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids ACETYLENE = new Registers.Fluids(
            "acetylene", true, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids BENZENE = new Registers.Fluids(
            "benzene", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(6.1f), 1, COMPOUND_SUBSTANCE_TAB);

    public static void register(){}
}
