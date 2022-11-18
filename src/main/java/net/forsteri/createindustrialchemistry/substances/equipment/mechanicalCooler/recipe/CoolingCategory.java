package net.forsteri.createindustrialchemistry.substances.equipment.mechanicalCooler.recipe;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.jei.category.BasinCategory;
import com.simibubi.create.content.contraptions.processing.BasinRecipe;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public class CoolingCategory extends BasinCategory {
    public CoolingCategory(Info<BasinRecipe> info) {
        super(info, false);
    }

    private final NotAnimatedCooler cooler = new NotAnimatedCooler();

    @Override
    public void draw(BasinRecipe recipe, IRecipeSlotsView iRecipeSlotsView, PoseStack matrixStack, double mouseX, double mouseY) {
        super.draw(recipe, iRecipeSlotsView, matrixStack, mouseX, mouseY);

        cooler.draw(matrixStack, getBackground().getWidth() / 2 + 3, 34);
    }
}
