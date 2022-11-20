package net.forsteri.createindustrialchemistry.substances.abstracts.generals;

import net.forsteri.createindustrialchemistry.substances.abstracts.RisingGases;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

@ParametersAreNonnullByDefault
public abstract class GeneralRisingGas extends RisingGases {

    public Supplier<Item> tankSupplier;
    protected GeneralRisingGas(Properties properties, Supplier<Item> supplier) {
        super(properties);
        this.tankSupplier = supplier;
    }

    @Override
    public Item getTank() {
        return tankSupplier.get();
    }

    public static class Flowing extends GeneralRisingGas
    {
        public Flowing(Properties properties, Supplier<Item> supplier)
        {
            super(properties, supplier);
            registerDefaultState(getStateDefinition().any().setValue(LEVEL, 7));
        }

        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(LEVEL);
        }

        public int getAmount(FluidState state) {
            return state.getValue(LEVEL);
        }

        public boolean isSource(FluidState state) {
            return false;
        }
    }

    public static class Source extends GeneralRisingGas
    {
        public Source(Properties properties, Supplier<Item> supplier)
        {
            super(properties, supplier);
        }

        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }
}
