package sazu.adventureeffects.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class MightEffect extends StatusEffect {
    public MightEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xff8f00);

        this.addAttributeModifier(
                EntityAttributes.GENERIC_ATTACK_DAMAGE,
                "2704d06a-885f-42b7-b53a-109f19fa544d",
                0.1D, // 10% increase
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL
        );
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
