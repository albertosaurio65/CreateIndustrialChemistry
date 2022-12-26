package net.forsteri.createindustrialchemistry.usefulStuffs.balloon;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientboundAddEntityPacket;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class BalloonEntity extends Entity {
    public BalloonEntity(EntityType<? extends Entity> p_20966_, Level p_20967_) {
        super(p_20966_, p_20967_);
    }

    @Override
    protected void defineSynchedData() {}

    @Override
    protected void readAdditionalSaveData(@NotNull CompoundTag pCompound) {}

    @Override
    protected void addAdditionalSaveData(@NotNull CompoundTag pCompound) {}

    @Override
    public @NotNull Packet<?> getAddEntityPacket() {
        return new ClientboundAddEntityPacket(this);
    }

    @SuppressWarnings("unchecked")
    public static void build(EntityType.Builder<?> builder) {
        EntityType.Builder<BalloonEntity> entityBuilder = (EntityType.Builder<BalloonEntity>) builder;
        entityBuilder.sized(.25f, .25f);
    }

    @Override
    public void tick() {
        super.tick();
        this.setDeltaMovement(getDeltaMovement().x, 0.27f, getDeltaMovement().z);
        this.move(MoverType.SELF, this.getDeltaMovement());
        if(this.getY() > 1024) this.kill();
    }
}
