package sazu.adventureeffects.mixin;


import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import sazu.adventureeffects.AdventureEffectsRegistry;

@Mixin(PlayerEntity.class)
public abstract class PlayerEntityMixin {

    @ModifyArg(
            method = "addExhaustion(F)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/entity/player/HungerManager;addExhaustion(F)V"
            ),
            index = 0
    )
    private float reduceExhaustionIfWellFed(float exhaustion) {
        PlayerEntity player = (PlayerEntity)(Object) this;

        if (player.hasStatusEffect(AdventureEffectsRegistry.WELL_FED)) {
            return exhaustion * 0.5f;
        }

        return exhaustion;
    }
}