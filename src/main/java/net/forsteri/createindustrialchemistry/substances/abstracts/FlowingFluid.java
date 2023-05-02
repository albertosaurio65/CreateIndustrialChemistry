package net.forsteri.createindustrialchemistry.substances.abstracts;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class FlowingFluid extends ForgeFlowingFluid implements IFluid {
    protected FlowingFluid(ForgeFlowingFluid.Properties properties) {
        super(properties);
    }
}
