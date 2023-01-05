package net.forsteri.createindustrialchemistry.usefulStuffs.balloon;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.function.Supplier;

@ParametersAreNonnullByDefault
public class BalloonItem extends Item {

    public final Supplier<EntityType<BalloonEntity>> balloonType;
    public BalloonItem(Properties pProperties, Supplier<EntityType<BalloonEntity>> balloonType) {
        super(pProperties);
        this.balloonType = balloonType;
    }

    @Override
    public @NotNull InteractionResult useOn(UseOnContext pContext) {
        BalloonEntity balloon = new BalloonEntity(balloonType.get(), pContext.getLevel());
        balloon.setBalloonItem(this);
        balloon.setPos(pContext.getClickLocation());
        balloon.xo = pContext.getClickLocation().x;
        balloon.yo = pContext.getClickLocation().y;
        balloon.zo = pContext.getClickLocation().z;
        pContext.getLevel().addFreshEntity(balloon);
        return InteractionResult.SUCCESS;
    }

    @Override
    public @NotNull InteractionResult interactLivingEntity(ItemStack pStack, Player pPlayer, LivingEntity pInteractionTarget, InteractionHand pUsedHand) {
        if (!(pInteractionTarget instanceof Mob && ((Mob) pInteractionTarget).canBeLeashed(pPlayer)) && !(pInteractionTarget instanceof Player)) return InteractionResult.PASS;
        BalloonEntity balloon = new BalloonEntity(balloonType.get(), pInteractionTarget.level);
        balloon.setBalloonItem(this);
        balloon.setPos(pInteractionTarget.getX(), pInteractionTarget.getY(), pInteractionTarget.getZ());
        balloon.xo = pInteractionTarget.getX();
        balloon.yo = pInteractionTarget.getY();
        balloon.zo = pInteractionTarget.getZ();
        pInteractionTarget.level.addFreshEntity(balloon);
        if (pInteractionTarget instanceof Mob) {
            ((Mob) pInteractionTarget).setLeashedTo(balloon, true);
        }
        if(!pPlayer.isCreative()) pStack.shrink(1);
        return InteractionResult.SUCCESS;
    }
}
