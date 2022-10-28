package net.forsteri.createindustrialchemistry.item.abstracts;

import net.forsteri.createindustrialchemistry.entry.creativeModeTabs.ElementarySubstanceTab;
import net.forsteri.createindustrialchemistry.entry.creativeModeTabs.families.AlkaliSubstanceTab;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ChemicalSubstance extends Item {
    protected final Collection<CreativeModeTab> creativeModeTabs;

    public ChemicalSubstance(Properties pProperties, CreativeModeTab... creativeModeTabs) {
        super(pProperties);
        this.creativeModeTabs = new ArrayList<>(
                Arrays.asList(creativeModeTabs)
        );
    }

    @Override
    public Collection<CreativeModeTab> getCreativeTabs() {
        return this.creativeModeTabs;
    }
}
