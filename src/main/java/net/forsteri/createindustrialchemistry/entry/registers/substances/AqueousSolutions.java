package net.forsteri.createindustrialchemistry.entry.registers.substances;

import net.forsteri.createindustrialchemistry.utility.Registers;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.*;

@SuppressWarnings({"unused"})
public class AqueousSolutions {
    public static void register(){}

    public static final Registers.Fluids CALCIUM_CHLORIDE_AQUEOUS_SOLUTION = new Registers.Fluids(
            "calcium_chloride_aqueous_solution", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.acidic(4.5f), AQUEOUS_SOLUTION_TAB);

    public static final Registers.Fluids HYDROCHLORIC_ACID = new Registers.Fluids(
            "hydrochloric_acid", false, 0xFFFFFD96, Registers.Fluids.FluidBlockGens.acidic(-1.08f), AQUEOUS_SOLUTION_TAB);

    public static final Registers.Fluids HYDROIODIC_ACID = new Registers.Fluids(
            "hydroiodic_acid", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.acidic(-1.08f), AQUEOUS_SOLUTION_TAB);

    public static final Registers.Fluids SODIUM_HYDROXIDE_AQUEOUS_SOLUTION = new Registers.Fluids(
            "sodium_hydroxide_aqueous_solution", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(14.0f), AQUEOUS_SOLUTION_TAB);

    public static final Registers.Fluids SODIUM_ALUMINATE_AQUEOUS_SOLUTION = new Registers.Fluids(
            "sodium_aluminate_aqueous_solution", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(14.0f), AQUEOUS_SOLUTION_TAB);

    public static final Registers.Fluids CALCIUM_ACETATE_AQUEOUS_SOLUTION = new Registers.Fluids(
            "calcium_acetate_aqueous_solution", false, 0xFFFFFFFF, Registers.Fluids.FluidBlockGens.acidic(0.7f), AQUEOUS_SOLUTION_TAB);
}
