package sazu.adventureeffects.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(WitherEntity.class)
public abstract class WitherEntityMixin {
    @Inject(method = "addStatusEffect", at = @At("HEAD"), cancellable = true)
    private void forceAddStatusEffect(StatusEffectInstance effect, @Nullable Entity source, CallbackInfoReturnable<Boolean> cir) {
        // Directly apply the effect to avoid base immunity
        this.addEffectDirect(effect);
        cir.setReturnValue(true);
    }

    // Helper to avoid calling super.addStatusEffect
    private void addEffectDirect(StatusEffectInstance effect) {
        ((LivingEntity)(Object)this).getActiveStatusEffects().put(effect.getEffectType(), effect);
    }
}
