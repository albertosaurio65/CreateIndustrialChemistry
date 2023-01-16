package net.forsteri.createindustrialchemistry.entry.registers.substances;

import net.forsteri.createindustrialchemistry.substances.compound.CalciumOxide;
import net.forsteri.createindustrialchemistry.substances.element.Potassium;
import net.forsteri.createindustrialchemistry.substances.element.Sodium;
import net.forsteri.createindustrialchemistry.utility.Registers;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.RegistryObject;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.*;
import static net.forsteri.createindustrialchemistry.entry.registers.DeferredRegisters.BLOCKS;
import static net.forsteri.createindustrialchemistry.entry.registers.DeferredRegisters.ITEMS;
import static net.forsteri.createindustrialchemistry.utility.Registers.Compounds;
import static net.forsteri.createindustrialchemistry.utility.Registers.Compounds.createCompound;
import static net.forsteri.createindustrialchemistry.utility.Registers.Compounds.createElement;

@SuppressWarnings("unused")
public class SolidSubstances {
    public static void register(){}

    public static final RegistryObject<Item> SODIUM = ITEMS.register("sodium",
            () -> new Sodium(new Item.Properties(), ELEMENTARY_SUBSTANCE_TAB, ALKALI_SUBSTANCE_TAB));

    public static final RegistryObject<Item> POTASSIUM = ITEMS.register("potassium",
            () -> new Potassium(new Item.Properties(), ELEMENTARY_SUBSTANCE_TAB, ALKALI_SUBSTANCE_TAB));

    public static final Compounds SODIUM_HYDROXIDE = createCompound("sodium_hydroxide")
            .addTabs(ALKALI_SUBSTANCE_TAB)
            .waterSoluble(0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(14))
            .register();

    public static final Compounds POTASSIUM_HYDROXIDE = createCompound("potassium_hydroxide")
            .addTabs(ALKALI_SUBSTANCE_TAB)
            .waterSoluble(0xFFFFFFFF, Registers.Fluids.FluidBlockGens.basic(13))
            .register();

    public static final Compounds CALCIUM_CARBONATE = createCompound("calcium_carbonate")
            .addTabs(ALKALI_SUBSTANCE_TAB)
            .register();

    public static final Compounds CALCIUM_CHLORIDE = createCompound("calcium_chloride").register();

    public static final Compounds CRUDE_SILICON_DIOXIDE = createCompound("crude_silicon_dioxide").register();

    public static final Compounds CRUDE_SODIUM_METASILICATE = createCompound("crude_sodium_metasilicate").register();
    
    public static final Compounds SALT = createCompound("salt").register();

    public static final Compounds METASILICIC_ACID = createCompound("metasilicic_acid").register();

    public static final Compounds GRAPHITE = createElement("graphite").register();

    public static final Compounds SILICON_DIOXIDE = createCompound("silicon_dioxide").register();

    public static final Compounds SILICON = createElement("silicon").register();

    public static final RegistryObject<Item> CALCIUM_OXIDE = ITEMS.register("calcium_oxide",
            () -> new CalciumOxide(new Item.Properties(), COMPOUND_SUBSTANCE_TAB));

    public static final Compounds CALCIUM_HYDROXIDE = createCompound("calcium_hydroxide").register();

    public static final Compounds ZINC_DUSTS = createElement("zinc_dusts").register();

    public static final Compounds COPPER_DUSTS = createElement("copper_dusts").register();

    public static final Compounds ZINC_OXIDE = createCompound("zinc_oxide").register();

    public static final Compounds SODIUM_IODIDE = createCompound("sodium_iodide").register();

    public static final Compounds IODINE = createElement("iodine").register();

    public static final Compounds SPODUMENE = createCompound("spodumene").register();

    public static final Compounds SPODUMENE_DUSTS = createCompound("spodumene_dusts").register();

    public static final Compounds LITHIUM_CHLORIDE = createCompound("lithium_chloride").register();

    public static final Compounds ALUMINIUM_OXIDE = createCompound("aluminium_oxide").register();

    public static final Compounds LITHIUM = createElement("lithium").register();

    public static final Compounds LITHIUM_IODIDE = createCompound("lithium_iodide").register();

    public static final Compounds GOETHITE = createCompound("goethite").register();

    public static final Compounds NICKEL_OXIDE_HYDROXIDE = createCompound("nickel_oxide_hydroxide").register();

    public static final Compounds ALUMINIUM = createElement("aluminium").register();

    public static final Compounds NICKEL = createElement("nickel").register();

    public static final Compounds ZINC_CHLORIDE = createCompound("zinc_chloride").register();

    public static final Compounds N_BUTYLLITHIUM = createCompound("n_butyllithium").register();

    public static final Compounds CALCIUM_CARBIDE = createCompound("calcium_carbide").register();

    public static final Compounds IRON_DUSTS = createElement("iron_dusts").register();

    public static final RegistryObject<Block> POLYISOPRENE_BLOCK = BLOCKS.register("polyisoprene_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(0.3f)));

    public static final RegistryObject<Item> POLYISOPRENE_BLOCK_ITEM = ITEMS.register("polyisoprene_block",
            () -> new BlockItem(POLYISOPRENE_BLOCK.get(), new Item.Properties().tab(COMPOUND_SUBSTANCE_TAB)));

    public static final Compounds POLYISOPRENE_SHEET = createCompound("polyisoprene_sheet").register();

    public static final Compounds DIAMOND_DUSTS = createElement("diamond_dusts").register();
}
