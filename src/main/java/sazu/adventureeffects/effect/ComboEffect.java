package sazu.adventureeffects.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

import java.util.UUID;

public class ComboEffect extends StatusEffect {
    private static final UUID ATTACK_DAMAGE_MODIFIER_UUID = UUID.fromString("ad169d33-4009-4d81-b422-afd81155cd9b");

    public ComboEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0xe9b8b3);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        super.applyUpdateEffect(entity, amplifier);
        applyScaledAttackDamageModifier(entity, amplifier);
    }

    @Override
    public void onRemoved(LivingEntity entity, net.minecraft.entity.attribute.AttributeContainer attributes, int amplifier) {
        super.onRemoved(entity, attributes, amplifier);
        removeAttackDamageModifier(entity);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        return true;
    }

    private void applyScaledAttackDamageModifier(LivingEntity entity, int amplifier) {
        EntityAttributeInstance attributeInstance = entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        if (attributeInstance == null) return;

        // Remove existing modifier if present
        EntityAttributeModifier existingModifier = attributeInstance.getModifier(ATTACK_DAMAGE_MODIFIER_UUID);
        if (existingModifier != null) {
            attributeInstance.removeModifier(existingModifier);
        }

        double scaledValue = 0.05D * (amplifier + 1);

        EntityAttributeModifier newModifier = new EntityAttributeModifier(
                ATTACK_DAMAGE_MODIFIER_UUID,
                "Combo Attack Damage Modifier",
                scaledValue,
                EntityAttributeModifier.Operation.MULTIPLY_TOTAL
        );

        attributeInstance.addPersistentModifier(newModifier);
    }

    private void removeAttackDamageModifier(LivingEntity entity) {
        EntityAttributeInstance attributeInstance = entity.getAttributeInstance(EntityAttributes.GENERIC_ATTACK_DAMAGE);
        if (attributeInstance == null) return;

        EntityAttributeModifier existingModifier = attributeInstance.getModifier(ATTACK_DAMAGE_MODIFIER_UUID);
        if (existingModifier != null) {
            attributeInstance.removeModifier(existingModifier);
        }
    }
}
