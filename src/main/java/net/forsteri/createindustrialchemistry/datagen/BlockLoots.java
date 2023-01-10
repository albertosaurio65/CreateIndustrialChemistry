package net.forsteri.createindustrialchemistry.datagen;

import net.forsteri.createindustrialchemistry.entry.registers.DeferredRegisters;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import static net.forsteri.createindustrialchemistry.entry.registers.substances.Mixtures.*;
import static net.forsteri.createindustrialchemistry.entry.registers.substances.SolidSubstances.*;

public class BlockLoots extends BlockLoot {

    @Override
    protected void addTables() {
        this.dropSelves(
                PURIFIED_SAND,
                ACIDIC_SAND,
                POLYISOPRENE_BLOCK
        );
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return DeferredRegisters.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    @SafeVarargs
    public final void dropSelves(RegistryObject<Block>... pBlocks) {
        for(RegistryObject<Block> pBlock: pBlocks){
            dropSelf(pBlock.get());
        }
    }
}
