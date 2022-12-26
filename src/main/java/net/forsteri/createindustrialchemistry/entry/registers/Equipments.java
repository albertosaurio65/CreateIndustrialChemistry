package net.forsteri.createindustrialchemistry.entry.registers;

import net.forsteri.createindustrialchemistry.entry.registers.entities.Types;
import net.forsteri.createindustrialchemistry.substances.abstracts.ChemicalSubstance;
import net.forsteri.createindustrialchemistry.substances.equipment.MetalTank;
import net.forsteri.createindustrialchemistry.usefulStuffs.balloon.BalloonItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.registries.RegistryObject;

import static net.forsteri.createindustrialchemistry.entry.CreativeModeTabs.*;
import static net.forsteri.createindustrialchemistry.entry.registers.DeferredRegisters.*;

@SuppressWarnings("unused")
public class Equipments {
    public static void register(){}

    public static final RegistryObject<Item> EMPTY_METAL_TANK = ITEMS.register("empty_metal_tank",
            () -> new MetalTank(
                    Fluids.EMPTY,
                    new Item.Properties()
                            .tab(EQUIPMENT_TAB)
                            .stacksTo(16)
            ));

    public static final RegistryObject<Item> DIRTY_TANK = ITEMS.register("dirty_metal_tank",
            () -> new ChemicalSubstance(
                    new Item.Properties()
                            .tab(EQUIPMENT_TAB)
                            .stacksTo(1)
            ));

    public static final RegistryObject<Item> HYDROGEN_BALLOON = ITEMS.register("hydrogen_balloon",
            () -> new BalloonItem(
                    new Item.Properties()
                            .tab(EQUIPMENT_TAB)
                            .stacksTo(16),
                    Types.HYDROGEN_BALLOON
            ));
}
