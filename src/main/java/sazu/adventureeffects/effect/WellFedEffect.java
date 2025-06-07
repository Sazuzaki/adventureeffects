package sazu.adventureeffects.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class WellFedEffect extends StatusEffect {
    public WellFedEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x98D982); // greenish color
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }
}
