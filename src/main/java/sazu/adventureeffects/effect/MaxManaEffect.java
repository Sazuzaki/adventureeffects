package sazu.adventureeffects.effect;

import com.github.theredbrain.manaattributes.ManaAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class MaxManaEffect extends StatusEffect {
    public MaxManaEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x6603fc);

        this.addAttributeModifier(
                ManaAttributes.MAX_MANA,
                "26065aac-270b-4b17-8248-39ed9ec02b06",
                50.0D,
                EntityAttributeModifier.Operation.ADDITION
        );
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
