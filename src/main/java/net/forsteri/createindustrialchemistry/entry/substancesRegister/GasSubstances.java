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
            "acetone_gas", true, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(19.2f), 1, COMPOUND_SUBSTANCE_TAB);
    public static void register(){}
}
