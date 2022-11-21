package net.forsteri.createindustrialchemistry.entry.substancesRegister.tileEntities;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntityEntry;
import net.forsteri.createindustrialchemistry.CreateIndustrialChemistry;
import net.forsteri.createindustrialchemistry.substances.equipment.kineticElectrolyzer.KineticElectrolyzerInstance;
import net.forsteri.createindustrialchemistry.substances.equipment.kineticElectrolyzer.KineticElectrolyzerRenderer;
import net.forsteri.createindustrialchemistry.substances.equipment.kineticElectrolyzer.KineticElectrolyzerTileEntity;
import net.forsteri.createindustrialchemistry.substances.equipment.mechanicalCooler.MechanicalCoolerInstance;
import net.forsteri.createindustrialchemistry.substances.equipment.mechanicalCooler.MechanicalCoolerRenderer;
import net.forsteri.createindustrialchemistry.substances.equipment.mechanicalCooler.MechanicalCoolerTileEntity;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.*;

public class TileEntities {
    public static void register(){}

    private static final CreateRegistrate REGISTRATE = CreateIndustrialChemistry
            .registrate()
            .creativeModeTab(
                    () -> EQUIPMENT_TAB
            );

    public static final BlockEntityEntry<KineticElectrolyzerTileEntity> KINETIC_ELECTROLYZER_TILE_ENTITY = REGISTRATE
            .tileEntity("kinetic_electrolyzer", KineticElectrolyzerTileEntity::new)
            .instance(() -> KineticElectrolyzerInstance::new, false)
            .validBlocks(Blocks.KINETIC_ELECTROLYZER_BLOCK)
            .renderer(() -> KineticElectrolyzerRenderer::new)
            .register();

    public static final BlockEntityEntry<MechanicalCoolerTileEntity> MECHANICAL_COOLER_TILE_ENTITY = REGISTRATE
            .tileEntity("mechanical_cooler", MechanicalCoolerTileEntity::new)
            .instance(() -> MechanicalCoolerInstance::new, false)
            .validBlocks(Blocks.MECHANICAL_COOLER_BLOCK)
            .renderer(() -> MechanicalCoolerRenderer::new)
            .register();
}
