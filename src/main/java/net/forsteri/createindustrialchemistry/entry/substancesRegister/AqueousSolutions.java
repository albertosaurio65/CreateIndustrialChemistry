package net.forsteri.createindustrialchemistry.entry.substancesRegister;

import net.forsteri.createindustrialchemistry.utility.Registers;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.*;

@SuppressWarnings({"unused"})
public class AqueousSolutions {
    public static void register(){}

    public static final Registers.Fluids CALCIUM_CHLORIDE_AQUEOUS_SOLUTION = new Registers.Fluids(
            "calcium_chloride", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.acidic(4.5f), AQUEOUS_SOLUTION_TAB);

    public static final Registers.Fluids HYDROCHLORIC_ACID = new Registers.Fluids(
            "hydrochloric_acid", false, 0xFFFFFD96, Registers.Fluids.FluidBlockGens.acidic(-1.08f), AQUEOUS_SOLUTION_TAB);

    public static final Registers.Fluids HYDROIODIC_ACID = new Registers.Fluids(
            "hydroiodic_acid", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.acidic(-1.08f), AQUEOUS_SOLUTION_TAB);
}
