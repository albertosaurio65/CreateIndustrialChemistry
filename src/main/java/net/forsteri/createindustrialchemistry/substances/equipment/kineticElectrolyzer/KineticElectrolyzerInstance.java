package net.forsteri.createindustrialchemistry.substances.equipment.kineticElectrolyzer;

import com.jozufozu.flywheel.api.Instancer;
import com.jozufozu.flywheel.api.Material;
import com.jozufozu.flywheel.api.MaterialManager;
import com.jozufozu.flywheel.core.Materials;
import com.jozufozu.flywheel.core.materials.model.ModelData;
import com.simibubi.create.AllBlockPartials;
import com.simibubi.create.content.contraptions.base.SingleRotatingInstance;
import com.simibubi.create.content.contraptions.base.flwdata.RotatingData;
import net.forsteri.createindustrialchemistry.entry.registers.tileEntities.TilePartials;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;

public class KineticElectrolyzerInstance extends SingleRotatingInstance {

    protected ModelData extendedModel;
    public KineticElectrolyzerInstance(MaterialManager modelManager, KineticElectrolyzerTileEntity tile) {
        super(modelManager, tile);

        Material<ModelData> mat = materialManager.defaultSolid()
                .material(Materials.TRANSFORMED);

        Instancer<ModelData> cannon = mat.getModel(TilePartials.KINETIC_ELECTROLYZER_EXTENDED);
        extendedModel = cannon.createInstance();

        extendedModel.loadIdentity()
                .translate(getInstancePosition().below().below())
                .setBlockLight(world.getBrightness(LightLayer.BLOCK, pos.below().below()));
        if(tile.getBlockState().getValue(BlockStateProperties.HORIZONTAL_FACING).getAxis() == Direction.Axis.Z){
            extendedModel.rotateCentered(Direction.UP, (float) (Math.PI/2));
        }
    }

    @Override
    public void updateLight() {
        super.updateLight();
        relight(getWorldPosition().below().below(), extendedModel);
    }

    @Override
    public void remove() {
        super.remove();
        extendedModel.delete();
    }

    @Override
    protected Instancer<RotatingData> getModel() {
//        Direction facing = blockState.getValue(BlockStateProperties.HORIZONTAL_FACING);
//        BlockState referenceState = blockState.rotate(blockEntity.getLevel(), blockEntity.getBlockPos(), Rotation.CLOCKWISE_180);
//        Direction facing = referenceState.getValue(BlockStateProperties.HORIZONTAL_FACING);
//        return getRotatingMaterial().getModel(shaft());
        return getRotatingMaterial().getModel(AllBlockPartials.SHAFT_HALF, blockState, Direction.UP);
    }
}
