package net.forsteri.createindustrialchemistry.entry.registers.entities;

import com.jozufozu.flywheel.core.PartialModel;
import net.forsteri.createindustrialchemistry.CreateIndustrialChemistry;

public class EntityPartials {
    public static final PartialModel BALLOONS = entity("balloon");
    private static PartialModel entity(String path) {
        return new PartialModel(CreateIndustrialChemistry.asResource("entity/" + path));
    }

    public static void register(){}
}
