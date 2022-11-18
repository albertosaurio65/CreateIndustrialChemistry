package net.forsteri.createindustrialchemistry.substances.equipment.kineticElectrolyzer.recipe;

import com.simibubi.create.content.contraptions.processing.BasinRecipe;
import com.simibubi.create.content.contraptions.processing.ProcessingRecipeBuilder;
import net.forsteri.createindustrialchemistry.entry.substancesRegister.tileEntities.RecipeTypes;

public class ElectrolyzerRecipe extends BasinRecipe {
    public ElectrolyzerRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(RecipeTypes.ELECTROLYSIS, params);
    }
}
