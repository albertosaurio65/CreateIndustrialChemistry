package net.forsteri.createindustrialchemistry.usefulStuffs.balloon;

import com.jozufozu.flywheel.core.PartialModel;
import com.mojang.blaze3d.vertex.PoseStack;
import com.simibubi.create.foundation.render.CachedBufferer;
import com.simibubi.create.foundation.render.SuperByteBuffer;
import net.forsteri.createindustrialchemistry.CreateIndustrialChemistry;
import net.forsteri.createindustrialchemistry.entry.registers.entities.EntityPartials;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

public class BalloonRenderer extends EntityRenderer<BalloonEntity> {

    protected EntityRendererProvider.Context context;

    public BalloonRenderer(EntityRendererProvider.Context p_174389_) {
        super(p_174389_);
        this.context = p_174389_;
    }

    @Override
    public void render(BalloonEntity pEntity, float pEntityYaw, float pPartialTicks, @NotNull PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        PartialModel partialModel = EntityPartials.BALLOONS;
        SuperByteBuffer sbb = CachedBufferer.partial(partialModel, Blocks.AIR.defaultBlockState());
        sbb.rotateY(-pEntityYaw)
                .rotateX(0F + pEntity.getXRot())
                .translate(-.5, -1 / 32f, -.5);

        sbb.forEntityRender()
                .light(pPackedLight)
                .renderInto(pMatrixStack, pBuffer.getBuffer(Sheets.solidBlockSheet()));
        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull BalloonEntity pEntity) {
        return CreateIndustrialChemistry.asResource("entity/balloon");
    }
}
