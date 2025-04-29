package sazu.adventureeffects.effect;

import com.github.theredbrain.manaattributes.ManaAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ManaRegen extends StatusEffect {
    public ManaRegen() {
        super(StatusEffectCategory.BENEFICIAL, 0xe9b8b3);

        this.addAttributeModifier(
                ManaAttributes.MANA_REGENERATION, // <- the custom attribute
                "7107DE5E-7CE8-4030-940E-514C1F160890", // random UUID, needs to be unique
                2.0D, // 2 increase
                EntityAttributeModifier.Operation.ADDITION
        );
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

}
