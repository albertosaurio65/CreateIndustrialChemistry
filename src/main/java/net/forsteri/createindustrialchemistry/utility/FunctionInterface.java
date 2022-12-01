package net.forsteri.createindustrialchemistry.utility;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;

public class FunctionInterface {
    @FunctionalInterface
    public interface TankItemGenFunction {
        Item apply(Registers.Fluids fluids, Integer color, CreativeModeTab... creativeModeTabs);
    }
}
