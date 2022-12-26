package net.forsteri.createindustrialchemistry.entry.registers.tileEntities;

import com.jozufozu.flywheel.core.PartialModel;
import net.forsteri.createindustrialchemistry.CreateIndustrialChemistry;

public class TilePartials {
    public static final PartialModel KINETIC_ELECTROLYZER_EXTENDED = block("block/kinetic_electrolyzer/extended");


    @SuppressWarnings("SameParameterValue")
    private static PartialModel block(String path) {
        return new PartialModel(CreateIndustrialChemistry.asResource(path));
    }

    public static void register(){}
}
