package sazu.adventureeffects.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import sazu.adventureeffects.AdventureEffectsRegistry;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {
    @Inject(method = "createLivingAttributes", at = @At("RETURN"))
    private static void adventureeffects$createLivingAttributes(CallbackInfoReturnable<DefaultAttributeContainer.Builder> cir) {
        cir.getReturnValue()
                .add(AdventureEffectsRegistry.RANGED_DAMAGE);
    }
}