package net.forsteri.createindustrialchemistry.substances.utility.fluids;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.state.BlockState;

public interface TankPickup extends net.minecraftforge.common.extensions.IForgeBucketPickup{
    ItemStack tankPickupBlock(LevelAccessor pLevel, BlockPos pPos, BlockState pState);
}
