package net.forsteri.createindustrialchemistry.entry.substancesRegister;

import net.forsteri.createindustrialchemistry.substances.abstracts.ChemicalSubstance;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.*;
import static net.forsteri.createindustrialchemistry.entry.substancesRegister.DeferredRegisters.BLOCKS;
import static net.forsteri.createindustrialchemistry.entry.substancesRegister.DeferredRegisters.ITEMS;

@SuppressWarnings("unused")
public class Mixtures {
    public static void register(){}

    public static final RegistryObject<Block> ACIDIC_SAND = BLOCKS.register("acidic_sand",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND)));

    public static final RegistryObject<Item> ACIDIC_SAND_ITEM = ITEMS.register("acidic_sand",
            () -> new BlockItem(ACIDIC_SAND.get(), new Item.Properties().tab(MIXTURE_TAB)));

    public static final RegistryObject<Block> PURIFIED_SAND = BLOCKS.register("purified_sand",
            () -> new FallingBlock(BlockBehaviour.Properties.of(Material.SAND)));

    public static final RegistryObject<Item> PURIFIED_SAND_ITEM = ITEMS.register("purified_sand",
            () -> new BlockItem(PURIFIED_SAND.get(), new Item.Properties().tab(MIXTURE_TAB)));

    public static final RegistryObject<Item> COPPER_ZINC_OXIDE = ITEMS.register("copper_zinc_oxide",
            () -> new ChemicalSubstance(new Item.Properties(), MIXTURE_TAB));
}
