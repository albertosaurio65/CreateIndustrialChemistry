package net.forsteri.createindustrialchemistry.substances.abstracts;

import org.forsteri123.unlimitedfluidity.core.RisingGas;

import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public abstract class RisingGases extends RisingGas implements IFluid {
    protected RisingGases(Properties properties) {
        super(properties);
    }
}
