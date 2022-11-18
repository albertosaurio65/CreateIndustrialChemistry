package net.forsteri.createindustrialchemistry.substances.equipment.mechanicalCooler.recipe;

import com.simibubi.create.content.contraptions.processing.BasinRecipe;
import com.simibubi.create.content.contraptions.processing.ProcessingRecipeBuilder;
import net.forsteri.createindustrialchemistry.entry.substancesRegister.tileEntities.RecipeTypes;

public class CoolingRecipe extends BasinRecipe {
    public CoolingRecipe(ProcessingRecipeBuilder.ProcessingRecipeParams params) {
        super(RecipeTypes.COOLING, params);
    }
}
