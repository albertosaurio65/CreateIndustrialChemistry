package net.forsteri.createindustrialchemistry.datagen;

import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.Create;
import com.simibubi.create.content.contraptions.processing.HeatCondition;
import com.simibubi.create.content.contraptions.processing.ProcessingRecipe;
import com.simibubi.create.content.contraptions.processing.ProcessingRecipeBuilder;
import com.simibubi.create.foundation.data.recipe.ProcessingRecipeGen;
import com.simibubi.create.foundation.utility.recipe.IRecipeTypeInfo;
import net.forsteri.createindustrialchemistry.CreateIndustrialChemistry;
import net.forsteri.createindustrialchemistry.entry.registers.DeferredRegisters;
import net.forsteri.createindustrialchemistry.entry.registers.substances.LiquidSubstances;
import net.forsteri.createindustrialchemistry.substances.abstracts.itemTypes.WaterSolubleItem;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Consumer;
import java.util.function.UnaryOperator;

@SuppressWarnings("UnusedReturnValue")
public class WaterSolutionDryAndProductionRecipesProvider extends ProcessingRecipeGen{
    public WaterSolutionDryAndProductionRecipesProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected IRecipeTypeInfo getRecipeType() {
        return AllRecipeTypes.MIXING;
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
        for(RegistryObject<Item> item: DeferredRegisters.ITEMS.getEntries()){
            if(item.get() instanceof WaterSolubleItem){
                create(
                        ((WaterSolubleItem) item.get()).solution.get().getRegistryName().getPath() + "_drying",
                        b -> b
                                .require(((WaterSolubleItem) item.get()).solution.get().getFluid().getSource(), 1000)
                                .output(item.get())
                                .output(LiquidSubstances.DISTILLED_WATER.SOURCE.get(), 1000)
                                .requiresHeat(HeatCondition.HEATED));
                create(((WaterSolubleItem) item.get()).solution.get().getRegistryName().getPath() + "_mixing",
                        b -> b
                                .output(((WaterSolubleItem) item.get()).solution.get().getFluid().getSource(), 1000)
                                .require(item.get())
                                .require(LiquidSubstances.DISTILLED_WATER.SOURCE.get(), 1000));
            }
        }

        all.forEach(c -> c.register(p_200404_1_));
        Create.LOGGER.info(getName() + " registered " + all.size() + " recipe" + (all.size() == 1 ? "" : "s"));
    }
}
