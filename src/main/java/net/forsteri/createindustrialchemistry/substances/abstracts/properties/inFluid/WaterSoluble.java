package net.forsteri.createindustrialchemistry.substances.abstracts.properties.inFluid;

import net.forsteri.createindustrialchemistry.entry.registers.substances.LiquidSubstances;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraftforge.common.extensions.IForgeItem;

public interface WaterSoluble extends IForgeItem {
    default boolean onEntityItemUpdate(ItemStack stack, ItemEntity entity) {
        BlockPos pos = new BlockPos(entity.position());
        if((
                entity.level.getBlockState(pos).is(Blocks.WATER) ||
                entity.level.getBlockState(pos).is(LiquidSubstances.DISTILLED_WATER.BLOCK.get()))) {
            entity.level.setBlock(pos, getSolution().defaultBlockState(), 3);
            entity.kill();
        }
        return false;
    }

    LiquidBlock getSolution();
}
