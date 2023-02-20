package net.forsteri.createindustrialchemistry.entry.registers.substances;

import net.forsteri.createindustrialchemistry.utility.Registers;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.*;

@SuppressWarnings({"unused"})
public class GasSubstances {

    public static final Registers.Fluids HYDROGEN = new Registers.Fluids(
            "hydrogen", true, 0xFFB3DFFF, 7, ELEMENTARY_SUBSTANCE_TAB);

    public static final Registers.Fluids CARBON_DIOXIDE = new Registers.Fluids(
            "carbon_dioxide", false, 0xFFFFFFFF, 2, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids WATER_VAPOR = new Registers.Fluids(
            "water_vapor", true, 0xFFFFFFFF, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids CARBON_MONOXIDE = new Registers.Fluids(
            "carbon_monoxide", true, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::poisonous, 7, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids OXYGEN = new Registers.Fluids(
            "oxygen", true, 0x8887CEEB, ELEMENTARY_SUBSTANCE_TAB);

    public static final Registers.Fluids CHLORINE = new Registers.Fluids(
            "chlorine", true, 0xFFFDFDA0, Registers.Fluids.FluidBlockGens::poisonous, 7, ELEMENTARY_SUBSTANCE_TAB);

    public static final Registers.Fluids HYDROGEN_IODIDE = new Registers.Fluids(
            "hydrogen_iodide", true, 0xFFFFFFFF, 7, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids ACETONE_GAS = new Registers.Fluids(
            "acetone_gas", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(19.2f), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids ISOPROPYL_ALCOHOL_GAS = new Registers.Fluids(
            "isopropyl_alcohol_gas", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(16.5f), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids ETHYLENE = new Registers.Fluids(
            "ethylene", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids PROPYLENE = new Registers.Fluids(
            "propylene", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids METHANE = new Registers.Fluids(
            "methane", true, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 7, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids ACETYLENE = new Registers.Fluids(
            "acetylene", true, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, 7, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids BENZENE = new Registers.Fluids(
            "benzene", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::poisonous, 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids HYDROGEN_CHLORIDE = new Registers.Fluids(
            "hydrogen_chloride", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.acidic(-5.9f), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids ETHANE = new Registers.Fluids(
            "ethane", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 7, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids PROPANE = new Registers.Fluids(
            "propane", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 7, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids BUTANE = new Registers.Fluids(
            "butane", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 7, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids PENTANE = new Registers.Fluids(
            "pentane", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 7, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids HEXANE = new Registers.Fluids(
            "hexane", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 7, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids N_BUTENE = new Registers.Fluids(
            "n_butene", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids N_PENTENE = new Registers.Fluids(
            "n_pentene", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 1, COMPOUND_SUBSTANCE_TAB);

    public static final Registers.Fluids N_HEXENE = new Registers.Fluids(
            "n_hexene", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens::normal, Registers.Fluids.TankItemGens.fuel(9600), 1, COMPOUND_SUBSTANCE_TAB);

    public static void register(){}
}
