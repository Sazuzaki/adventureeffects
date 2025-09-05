package sazu.adventureeffects.mixin;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.jetbrains.annotations.Nullable;

@Mixin(EnderDragonEntity.class)
public abstract class EnderDragonEntityMixin extends LivingEntity {

    protected EnderDragonEntityMixin() {
        super(null, null); // required constructor for mixin, won't be used
    }

    /**
     * Allow the Ender Dragon to receive status effects
     * instead of blocking them.
     * @author Sazu
     * @reason remove status immunity
     */
    @Overwrite
    public boolean addStatusEffect(StatusEffectInstance effect, @Nullable Entity source) {
        return super.addStatusEffect(effect, source);
    }
}
