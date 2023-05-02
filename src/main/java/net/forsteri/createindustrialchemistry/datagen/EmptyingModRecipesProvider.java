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
import net.forsteri.createindustrialchemistry.substances.abstracts.IFluid;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

@SuppressWarnings("UnusedReturnValue")
public class EmptyingModRecipesProvider extends ProcessingRecipeGen{
    public EmptyingModRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected IRecipeTypeInfo getRecipeType() {
        return AllRecipeTypes.EMPTYING;
    }

//    GeneratedRecipe HONEY_BOTTLE = create("hydrogen_tank", b -> b.require(GasSubstances.HYDROGEN_TANK.get())
//            .output(GasSubstances.HYDROGEN_SOURCE.get(), 250)
//            .output(Equipments.EMPTY_METAL_TANK.get()));

    <T extends ProcessingRecipe<?>> GeneratedRecipe create(String name,
                                                           UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        return create(CreateIndustrialChemistry.asResource(name), transform);
    }

    @SuppressWarnings("ConstantConditions")
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> p_200404_1_) {
        for(RegistryObject<Fluid> fluid : DeferredRegisters.FLUIDS.getEntries()){
            if(fluid.get() instanceof IFluid) {
                if(fluid.get().isSource(null)) {
                    if(((IFluid) fluid.get()).damageTank()){
                        create(fluid.getId().getPath(), b -> b.require(((IFluid) fluid.get()).getTank())
                                .output(((ForgeFlowingFluid) fluid.get()).getSource(), 1000)
                                .output(Equipments.DIRTY_TANK.get()));
                    }else {
                        create(fluid.getId().getPath(), b -> b.require(((IFluid) fluid.get()).getTank())
                                .output(((ForgeFlowingFluid) fluid.get()).getSource(), 1000)
                                .output(Equipments.EMPTY_METAL_TANK.get()));
                    }
                }
            }
        }

        all.forEach(c -> c.register(p_200404_1_));
        Create.LOGGER.info(getName() + " registered " + all.size() + " recipe" + (all.size() == 1 ? "" : "s"));
    }
}
