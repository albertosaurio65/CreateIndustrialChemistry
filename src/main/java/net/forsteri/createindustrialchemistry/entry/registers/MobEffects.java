package net.forsteri.createindustrialchemistry.entry.registers;

import net.forsteri.createindustrialchemistry.usefulStuffs.medicine.PoisonResistanceEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.effect.MobEffect;

import static net.forsteri.createindustrialchemistry.entry.registers.DeferredRegisters.*;

public class MobEffects {

    public static final RegistryObject<MobEffect> POISON_RESISTANCE
            = MOB_EFFECTS.register("poison_resistance", () -> new PoisonResistanceEffect(MobEffectCategory.BENEFICIAL, 0xFEA300));
    public static void register(){}
}
