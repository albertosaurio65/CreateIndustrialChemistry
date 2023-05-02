package net.forsteri.createindustrialchemistry.substances.abstracts;

import net.minecraft.world.item.Item;
import org.forsteri123.unlimitedfluidity.core.Swimable;
import org.forsteri123.unlimitedfluidity.core.Unspongable;

public interface IFluid extends Unspongable, Swimable {
    Item getTank();

    default boolean damageTank(){
        return false;
    }
}
