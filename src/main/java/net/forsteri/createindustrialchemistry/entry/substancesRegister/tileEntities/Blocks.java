package net.forsteri.createindustrialchemistry.entry.substancesRegister.tileEntities;

import com.simibubi.create.foundation.block.BlockStressDefaults;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.BlockStateGen;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.forsteri.createindustrialchemistry.CreateIndustrialChemistry;
import net.forsteri.createindustrialchemistry.substances.equipment.kineticElectrolyzer.KineticElectrolyzerBlock;
import net.forsteri.createindustrialchemistry.substances.equipment.kineticElectrolyzer.KineticElectrolyzerBlockItem;
import net.forsteri.createindustrialchemistry.substances.equipment.mechanicalCooler.MechanicalCoolerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.*;

public class Blocks {
    private static final CreateRegistrate REGISTRATE = CreateIndustrialChemistry
            .registrate()
            .creativeModeTab(
                    () -> EQUIPMENT_TAB);

    public static final BlockEntry<KineticElectrolyzerBlock> KINETIC_ELECTROLYZER_BLOCK = REGISTRATE.block("kinetic_electrolyzer", KineticElectrolyzerBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .blockstate(BlockStateGen.horizontalBlockProvider(true))
            .properties(BlockBehaviour.Properties::noOcclusion)
            .item(KineticElectrolyzerBlockItem::new)
            .build()
            .transform(BlockStressDefaults.setImpact(8))
            .register();

    public static final BlockEntry<MechanicalCoolerBlock> MECHANICAL_COOLER_BLOCK = REGISTRATE.block("mechanical_cooler", MechanicalCoolerBlock::new)
            .initialProperties(SharedProperties::softMetal)
            .defaultBlockstate()
            .blockstate((c, p) -> p.simpleBlock(c.getEntry(), AssetLookup.partialBaseModel(c, p)))
            .properties(BlockBehaviour.Properties::noOcclusion)
            .item()
            .build()
            .transform(BlockStressDefaults.setImpact(8))
            .register();

    public static void register(){}
}
