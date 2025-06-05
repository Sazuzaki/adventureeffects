package sazu.adventureeffects.effect;

import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class DefenseBoostEffect extends StatusEffect {
    public DefenseBoostEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xff8f00);

        this.addAttributeModifier(
                EntityAttributes.GENERIC_ARMOR,
                "651ad5b7-39f5-4ed3-a0cc-79834a3eb263",
                0.1D, // 10% increase
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL
        );
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
