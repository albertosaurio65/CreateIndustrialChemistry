package net.forsteri.createindustrialchemistry.substances.abstracts.itemTypes;

import net.forsteri.createindustrialchemistry.substances.abstracts.ChemicalSubstance;
import net.forsteri.createindustrialchemistry.substances.abstracts.properties.inFluid.WaterSoluble;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.LiquidBlock;

import java.util.function.Supplier;

public class WaterSolubleItem extends ChemicalSubstance implements WaterSoluble {

    public final Supplier<LiquidBlock> solution;
    public WaterSolubleItem(Properties pProperties, Supplier<LiquidBlock> solution, CreativeModeTab... creativeModeTabs) {
        super(pProperties, creativeModeTabs);
        this.solution = solution;
    }

    @Override
    public LiquidBlock getSolution() {
        return solution.get();
    }
}
