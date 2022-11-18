package net.forsteri.createindustrialchemistry.substances.equipment.mechanicalCooler;

import com.jozufozu.flywheel.api.Instancer;
import com.jozufozu.flywheel.api.MaterialManager;
import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.content.contraptions.base.SingleRotatingInstance;
import com.simibubi.create.content.contraptions.base.flwdata.RotatingData;
import net.minecraft.core.Direction;

public class MechanicalCoolerInstance extends SingleRotatingInstance {
    public MechanicalCoolerInstance(MaterialManager modelManager, MechanicalCoolerTileEntity tile) {
        super(modelManager, tile);
    }

    @Override
    protected Instancer<RotatingData> getModel() {
        return getRotatingMaterial().getModel(AllBlockPartials.SHAFT_HALF, blockState, Direction.UP);
    }


}
