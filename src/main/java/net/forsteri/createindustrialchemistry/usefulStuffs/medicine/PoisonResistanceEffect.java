package net.forsteri.createindustrialchemistry.usefulStuffs.medicine;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;

public class PoisonResistanceEffect extends MobEffect {
    public PoisonResistanceEffect(MobEffectCategory category, int color){
        super(category, color);
    }

    @Override
    public void applyEffectTick(LivingEntity pLivingEntity, int pAmplifier) {
        pLivingEntity.removeEffect(MobEffects.POISON);
        pLivingEntity.removeEffect(MobEffects.DIG_SLOWDOWN);
        pLivingEntity.removeEffect(MobEffects.WEAKNESS);
        pLivingEntity.removeEffect(MobEffects.WITHER);
        pLivingEntity.removeEffect(MobEffects.CONFUSION);

        super.applyEffectTick(pLivingEntity, pAmplifier);
    }

    @Override
    public boolean isDurationEffectTick(int pDuration, int pAmplifier) {
        return true;
    }
}
