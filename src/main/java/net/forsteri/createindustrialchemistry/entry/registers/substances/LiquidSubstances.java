package net.forsteri.createindustrialchemistry.entry.registers.substances;

import net.forsteri.createindustrialchemistry.utility.Registers;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.COMPOUND_SUBSTANCE_TAB;
import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.ELEMENTARY_SUBSTANCE_TAB;
import static net.forsteri.createindustrialchemistry.utility.Registers.Fluids;

@SuppressWarnings({"unused"})
public class LiquidSubstances {
    public static final Fluids DISTILLED_WATER = new Registers.Fluids(
            "distilled_water", false, 0xFF43D5EE, COMPOUND_SUBSTANCE_TAB);

    public static final Fluids MOLTEN_SALT = new Registers.Fluids(
            "molten_salt", false, 0xFFDD6612, Fluids.FluidBlockGens::hot, COMPOUND_SUBSTANCE_TAB);

    public static final Fluids MOLTEN_CARBON = new Registers.Fluids(
            "molten_carbon", false, 0xFFDD6612, Fluids.FluidBlockGens::hot, ELEMENTARY_SUBSTANCE_TAB);

    public static final Fluids MOLTEN_SILICON = new Registers.Fluids(
            "molten_silicon", false, 0xFFDD6612, Fluids.FluidBlockGens::hot, ELEMENTARY_SUBSTANCE_TAB);

    public static final Fluids METHANOL = new Registers.Fluids(
            "methanol", false, 0xFFFFFFFF, Fluids.FluidBlockGens::normal, COMPOUND_SUBSTANCE_TAB);

    public static final Fluids ACETIC_ACID = new Registers.Fluids(
            "acetic_acid", false, 0xFFFFFFFF, Fluids.FluidBlockGens.acidic(1.0f), COMPOUND_SUBSTANCE_TAB);

    public static final Fluids MOLTEN_LITHIUM_CHLORIDE = new Registers.Fluids(
            "molten_lithium_chloride", false, 0xFFFFFFFF, Fluids.FluidBlockGens::hot, COMPOUND_SUBSTANCE_TAB);

    public static final Fluids MOLTEN_ALUMINIUM_OXIDE = new Registers.Fluids(
            "molten_aluminium_oxide", false, 0xFFDD6612, Fluids.FluidBlockGens::hot, COMPOUND_SUBSTANCE_TAB);

    public static final Fluids MOLTEN_ALUMINIUM = new Registers.Fluids(
            "molten_aluminium", false, 0xFFDD6612, Fluids.FluidBlockGens::hot, ELEMENTARY_SUBSTANCE_TAB);

    public static final Fluids ACETONE = new Registers.Fluids(
            "acetone", false, 0xFFFFFFFF, Fluids.FluidBlockGens.basic(19.2f), COMPOUND_SUBSTANCE_TAB);

    public static final Fluids ISOPRENE = new Registers.Fluids(
            "isoprene", false, 0xFFFFFFFF, Fluids.FluidBlockGens::normal, COMPOUND_SUBSTANCE_TAB);

    public static final Fluids N_BUTANOL = new Registers.Fluids(
            "n_butanol", false, 0xFFFFFFFF, Fluids.FluidBlockGens::normal, COMPOUND_SUBSTANCE_TAB);

    public static final Fluids N_BUTYLCHLORIDE = new Registers.Fluids(
            "n_butylchloride", false, 0xFFFFFFFF, Fluids.FluidBlockGens::normal, COMPOUND_SUBSTANCE_TAB);

    public static void register(){}
}
