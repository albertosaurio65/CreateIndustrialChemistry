package net.forsteri.createindustrialchemistry.substances.equipment.kineticElectrolyzer.recipe;

import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.compat.jei.category.BasinCategory;
import com.simibubi.create.content.contraptions.processing.BasinRecipe;
import mezz.jei.api.gui.ingredient.IRecipeSlotsView;
import net.minecraft.MethodsReturnNonnullByDefault;

import javax.annotation.ParametersAreNonnullByDefault;

@MethodsReturnNonnullByDefault
@ParametersAreNonnullByDefault
public class ElectrolysisCategory extends BasinCategory {
    public ElectrolysisCategory(Info<BasinRecipe> info) {
        super(info, false);
    }

    private final NotAnimatedElectrolyzer electrolyzer = new NotAnimatedElectrolyzer();

    @Override
    public void draw(BasinRecipe recipe, IRecipeSlotsView iRecipeSlotsView, PoseStack matrixStack, double mouseX, double mouseY) {
        super.draw(recipe, iRecipeSlotsView, matrixStack, mouseX, mouseY);

        electrolyzer.draw(matrixStack, getBackground().getWidth() / 2 + 3, 34);
    }
}
