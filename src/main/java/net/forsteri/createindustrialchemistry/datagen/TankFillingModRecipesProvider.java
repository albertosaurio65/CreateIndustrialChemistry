package net.forsteri.createindustrialchemistry.datagen;

import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.Create;
import com.simibubi.create.content.contraptions.processing.ProcessingRecipe;
import com.simibubi.create.content.contraptions.processing.ProcessingRecipeBuilder;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import com.simibubi.create.foundation.utility.recipe.IRecipeTypeInfo;
import net.forsteri.createindustrialchemistry.CreateIndustrialChemistry;
import net.forsteri.createindustrialchemistry.entry.registers.DeferredRegisters;
import net.forsteri.createindustrialchemistry.entry.registers.Equipments;
import net.forsteri.createindustrialchemistry.substances.abstracts.FlowingFluid;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class TankFillingModRecipesProvider extends ProcessingRecipeGen {
    public TankFillingModRecipesProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected IRecipeTypeInfo getRecipeType() {
        return AllRecipeTypes.FILLING;
    }

    @SuppressWarnings("UnusedReturnValue")
    <T extends ProcessingRecipe<?>> GeneratedRecipe create(String name,
                                                           UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        return create(CreateIndustrialChemistry.asResource(name), transform);
    }

    protected void buildCraftingRecipes(Consumer<FinishedRecipe> p_200404_1_) {
        for(RegistryObject<Fluid> fluid : DeferredRegisters.FLUIDS.getEntries()){
            if(fluid.get() instanceof FlowingFluid) {
                //noinspection ConstantConditions
                if(fluid.get().isSource(null)) {
                    create(fluid.getId().getPath(), b ->
                            b.require(((FlowingFluid) fluid.get()).getSource(), 1000)
                                    .require(Equipments.EMPTY_METAL_TANK.get())
                                    .output(((FlowingFluid) fluid.get()).getTank()));
                }
            }
        }

        all.forEach(c -> c.register(p_200404_1_));
        Create.LOGGER.info(getName() + " registered " + all.size() + " recipe" + (all.size() == 1 ? "" : "s"));
    }
}
