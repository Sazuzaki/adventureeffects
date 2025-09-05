package sazu.adventureeffects.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.util.hit.EntityHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import sazu.adventureeffects.AdventureEffectsRegistry;

@Mixin(PersistentProjectileEntity.class)
public abstract class MixinArrowEntity {
    @Inject(method = "onEntityHit", at = @At("HEAD"))
    private void onEntityHit(EntityHitResult entityHitResult, CallbackInfo ci) {
        Entity target = entityHitResult.getEntity();
        if (!(target instanceof LivingEntity livingTarget)) return;

        PersistentProjectileEntity arrow = (PersistentProjectileEntity) (Object) this;
        Entity shooter = arrow.getOwner();

        if (shooter instanceof LivingEntity livingShooter) {
            double boost = livingShooter.getAttributeValue(AdventureEffectsRegistry.RANGED_DAMAGE);

            double baseDamage = arrow.getDamage();
            double newDamage = baseDamage * (1.0 + boost);

            arrow.setDamage(newDamage);
        }
    }
}
