package net.forsteri.createindustrialchemistry.substances.equipment.kineticElectrolyzer;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Wearable;
import net.minecraft.world.level.block.Block;

public class KineticElectrolyzerBlockItem extends BlockItem implements Wearable {
    public KineticElectrolyzerBlockItem(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public boolean canEquip(ItemStack stack, EquipmentSlot armorType, Entity entity) {
        //noinspection StatementWithEmptyBody
        if(armorType == EquipmentSlot.HEAD){
//            Advancement.Builder
        }
        return armorType == EquipmentSlot.HEAD;
    }
}
