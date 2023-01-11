package net.forsteri.createindustrialchemistry.datagen;

import net.forsteri.createindustrialchemistry.CreateIndustrialChemistry;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CreateIndustrialChemistry.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGens {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();

        if (event.includeClient()) {
            generator.addProvider(new LangMerger(generator));
        }

        generator.addProvider(new EmptyingModRecipesProvider(generator));
        generator.addProvider(new TankFillingModRecipesProvider(generator));
        generator.addProvider(new WaterSolutionDryAndProductionRecipesProvider(generator));
        generator.addProvider(new AutoWaterJsonProvider(generator, CreateIndustrialChemistry.MOD_ID, event.getExistingFileHelper()));
        generator.addProvider(new TankModelProvider(generator, CreateIndustrialChemistry.MOD_ID, event.getExistingFileHelper()));
        generator.addProvider(new LootProvider(generator));
    }
}
