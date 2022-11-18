package net.forsteri.createindustrialchemistry.substances.equipment.mechanicalCooler;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.contraptions.base.KineticBlock;
import com.simibubi.create.foundation.block.ITE;
import net.forsteri.createindustrialchemistry.entry.substancesRegister.tileEntities.TileEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("deprecation")
public class MechanicalCoolerBlock extends KineticBlock implements ITE<MechanicalCoolerTileEntity> {
    public MechanicalCoolerBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canSurvive(@NotNull BlockState state, LevelReader worldIn, BlockPos pos) {
        return !AllBlocks.BASIN.has(worldIn.getBlockState(pos.below()));
    }

    @Override
    public Direction.Axis getRotationAxis(BlockState state) {
        return Direction.Axis.Y;
    }

    @Override
    public Class<MechanicalCoolerTileEntity> getTileEntityClass() {
        return MechanicalCoolerTileEntity.class;
    }

    @Override
    public BlockEntityType<? extends MechanicalCoolerTileEntity> getTileEntityType() {
        return TileEntities.MECHANICAL_COOLER_TILE_ENTITY.get();
    }

    @Override
    public boolean hasShaftTowards(LevelReader world, BlockPos pos, BlockState state, Direction face) {
        return face == Direction.UP;
    }
}
