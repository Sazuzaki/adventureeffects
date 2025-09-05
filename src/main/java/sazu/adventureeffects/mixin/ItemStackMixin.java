package sazu.adventureeffects.mixin;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.EnumSet;
import java.util.Set;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin {

    @Unique
    private static final Set<EquipmentSlot> ARMOR_SLOTS = EnumSet.of(
            EquipmentSlot.HEAD,
            EquipmentSlot.CHEST,
            EquipmentSlot.LEGS,
            EquipmentSlot.FEET
    );


    @Unique
    private static final Set<EquipmentSlot> WEAPON_SLOTS = EnumSet.of(
            EquipmentSlot.MAINHAND,
            EquipmentSlot.OFFHAND
    );

    @Unique
    private static final Set<String> SKIPPED_ATTRIBUTES = Set.of(
            "l2damagetracker:crit_rate",
            "l2damagetracker:crit_damage",
            "l2damagetracker:bow_strength",
            "l2damagetracker:explosion_damage",
            "l2damagetracker:fire_damage",
            "l2damagetracker:magic_damage",
            "l2damagetracker:damage_absorbtion",
            "l2damagetracker:damage_reduction",
            "ranged_weapon:haste"
    );

    @Inject(method = "getAttributeModifiers", at = @At("RETURN"), cancellable = true)
    private void multiplyPerfectAttributes(EquipmentSlot slot, CallbackInfoReturnable<Multimap<EntityAttribute, EntityAttributeModifier>> cir) {
        ItemStack stack = (ItemStack)(Object)this;

        NbtCompound tag = stack.getNbt();
        if (tag != null && "perfect".equals(tag.getString("ForgingQuality")) && WEAPON_SLOTS.contains(slot)) {
            Multimap<EntityAttribute, EntityAttributeModifier> original = cir.getReturnValue();
            Multimap<EntityAttribute, EntityAttributeModifier> modified = HashMultimap.create();

            for (var entry : original.entries()) {
                EntityAttribute attribute = entry.getKey();
                Identifier id = Registries.ATTRIBUTE.getId(attribute);

                if (
                        attribute.equals(EntityAttributes.GENERIC_ATTACK_DAMAGE) ||
                                attribute.equals(EntityAttributes.GENERIC_ATTACK_SPEED) ||
                                attribute.equals(EntityAttributes.GENERIC_ARMOR) ||
                                (id != null && SKIPPED_ATTRIBUTES.contains(id.toString()))
                ) {
                    modified.put(attribute, entry.getValue()); // keep original
                    continue;
                }

                EntityAttributeModifier old = entry.getValue();
                EntityAttributeModifier scaled = new EntityAttributeModifier(
                        old.getId(),
                        old.getName(),
                        old.getValue() + 2,
                        old.getOperation()
                );
                modified.put(attribute, scaled);
            }

            cir.setReturnValue(modified);
        } else if (tag != null && "master".equals(tag.getString("ForgingQuality")) && WEAPON_SLOTS.contains(slot)) {
            Multimap<EntityAttribute, EntityAttributeModifier> original = cir.getReturnValue();
            Multimap<EntityAttribute, EntityAttributeModifier> modified = HashMultimap.create();

            for (var entry : original.entries()) {
                EntityAttribute attribute = entry.getKey();
                Identifier id = Registries.ATTRIBUTE.getId(attribute);

                if (
                        attribute.equals(EntityAttributes.GENERIC_ATTACK_DAMAGE) ||
                                attribute.equals(EntityAttributes.GENERIC_ATTACK_SPEED) ||
                                attribute.equals(EntityAttributes.GENERIC_ARMOR) ||
                                (id != null && SKIPPED_ATTRIBUTES.contains(id.toString()))
                ) {
                    modified.put(attribute, entry.getValue()); // keep original
                    continue;
                }

                EntityAttributeModifier old = entry.getValue();
                EntityAttributeModifier scaled = new EntityAttributeModifier(
                        old.getId(),
                        old.getName(),
                        old.getValue() + 3,
                        old.getOperation()
                );
                modified.put(attribute, scaled);
            }

            cir.setReturnValue(modified);
        } else if (tag != null && "poor".equals(tag.getString("ForgingQuality")) && WEAPON_SLOTS.contains(slot)) {
            Multimap<EntityAttribute, EntityAttributeModifier> original = cir.getReturnValue();
            Multimap<EntityAttribute, EntityAttributeModifier> modified = HashMultimap.create();

            for (var entry : original.entries()) {
                EntityAttribute attribute = entry.getKey();
                Identifier id = Registries.ATTRIBUTE.getId(attribute);

                if (
                        attribute.equals(EntityAttributes.GENERIC_ATTACK_DAMAGE) ||
                                attribute.equals(EntityAttributes.GENERIC_ATTACK_SPEED) ||
                                attribute.equals(EntityAttributes.GENERIC_ARMOR) ||
                                (id != null && SKIPPED_ATTRIBUTES.contains(id.toString()))
                ) {
                    modified.put(attribute, entry.getValue()); // keep original
                    continue;
                }

                EntityAttributeModifier old = entry.getValue();
                EntityAttributeModifier scaled = new EntityAttributeModifier(
                        old.getId(),
                        old.getName(),
                        old.getValue() - 1,
                        old.getOperation()
                );
                modified.put(attribute, scaled);
            }

            cir.setReturnValue(modified);
        } else if (tag != null && "expert".equals(tag.getString("ForgingQuality")) && WEAPON_SLOTS.contains(slot)) {
            Multimap<EntityAttribute, EntityAttributeModifier> original = cir.getReturnValue();
            Multimap<EntityAttribute, EntityAttributeModifier> modified = HashMultimap.create();

            for (var entry : original.entries()) {
                EntityAttribute attribute = entry.getKey();
                Identifier id = Registries.ATTRIBUTE.getId(attribute);

                if (
                        attribute.equals(EntityAttributes.GENERIC_ATTACK_DAMAGE) ||
                                attribute.equals(EntityAttributes.GENERIC_ATTACK_SPEED) ||
                                attribute.equals(EntityAttributes.GENERIC_ARMOR) ||
                                (id != null && SKIPPED_ATTRIBUTES.contains(id.toString()))
                ) {
                    modified.put(attribute, entry.getValue()); // keep original
                    continue;
                }

                EntityAttributeModifier old = entry.getValue();
                EntityAttributeModifier scaled = new EntityAttributeModifier(
                        old.getId(),
                        old.getName(),
                        old.getValue() + 1,
                        old.getOperation()
                );
                modified.put(attribute, scaled);
            }

            cir.setReturnValue(modified);
        } else if (tag != null && "expert".equals(tag.getString("ForgingQuality")) && ARMOR_SLOTS.contains(slot)) {
            Multimap<EntityAttribute, EntityAttributeModifier> original = cir.getReturnValue();
            Multimap<EntityAttribute, EntityAttributeModifier> modified = HashMultimap.create();

            for (var entry : original.entries()) {
                EntityAttribute attribute = entry.getKey();
                Identifier id = Registries.ATTRIBUTE.getId(attribute);

                if (
                                attribute.equals(EntityAttributes.GENERIC_ARMOR) ||
                                (id != null && SKIPPED_ATTRIBUTES.contains(id.toString()))
                ) {
                    modified.put(attribute, entry.getValue()); // keep original
                    continue;
                }

                EntityAttributeModifier old = entry.getValue();
                EntityAttributeModifier scaled = new EntityAttributeModifier(
                        old.getId(),
                        old.getName(),
                        old.getValue() * 1.15,
                        old.getOperation()
                );
                modified.put(attribute, scaled);
            }

            cir.setReturnValue(modified);
        } else if (tag != null && "perfect".equals(tag.getString("ForgingQuality")) && ARMOR_SLOTS.contains(slot)) {
            Multimap<EntityAttribute, EntityAttributeModifier> original = cir.getReturnValue();
            Multimap<EntityAttribute, EntityAttributeModifier> modified = HashMultimap.create();

            for (var entry : original.entries()) {
                EntityAttribute attribute = entry.getKey();
                Identifier id = Registries.ATTRIBUTE.getId(attribute);

                if (
                                attribute.equals(EntityAttributes.GENERIC_ARMOR) ||
                                (id != null && SKIPPED_ATTRIBUTES.contains(id.toString()))
                ) {
                    modified.put(attribute, entry.getValue()); // keep original
                    continue;
                }

                EntityAttributeModifier old = entry.getValue();
                EntityAttributeModifier scaled = new EntityAttributeModifier(
                        old.getId(),
                        old.getName(),
                        old.getValue() * 1.30,
                        old.getOperation()
                );
                modified.put(attribute, scaled);
            }

            cir.setReturnValue(modified);
        } else if (tag != null && "master".equals(tag.getString("ForgingQuality")) && ARMOR_SLOTS.contains(slot)) {
            Multimap<EntityAttribute, EntityAttributeModifier> original = cir.getReturnValue();
            Multimap<EntityAttribute, EntityAttributeModifier> modified = HashMultimap.create();

            for (var entry : original.entries()) {
                EntityAttribute attribute = entry.getKey();
                Identifier id = Registries.ATTRIBUTE.getId(attribute);

                if (
                                attribute.equals(EntityAttributes.GENERIC_ARMOR) ||
                                (id != null && SKIPPED_ATTRIBUTES.contains(id.toString()))
                ) {
                    modified.put(attribute, entry.getValue()); // keep original
                    continue;
                }

                EntityAttributeModifier old = entry.getValue();
                EntityAttributeModifier scaled = new EntityAttributeModifier(
                        old.getId(),
                        old.getName(),
                        old.getValue() * 1.50,
                        old.getOperation()
                );
                modified.put(attribute, scaled);
            }

            cir.setReturnValue(modified);
        } else if (tag != null && "poor".equals(tag.getString("ForgingQuality")) && ARMOR_SLOTS.contains(slot)) {
            Multimap<EntityAttribute, EntityAttributeModifier> original = cir.getReturnValue();
            Multimap<EntityAttribute, EntityAttributeModifier> modified = HashMultimap.create();

            for (var entry : original.entries()) {
                EntityAttribute attribute = entry.getKey();
                Identifier id = Registries.ATTRIBUTE.getId(attribute);

                if (
                                attribute.equals(EntityAttributes.GENERIC_ARMOR) ||
                                (id != null && SKIPPED_ATTRIBUTES.contains(id.toString()))
                ) {
                    modified.put(attribute, entry.getValue()); // keep original
                    continue;
                }

                EntityAttributeModifier old = entry.getValue();
                EntityAttributeModifier scaled = new EntityAttributeModifier(
                        old.getId(),
                        old.getName(),
                        old.getValue() * 0.85,
                        old.getOperation()
                );
                modified.put(attribute, scaled);
            }

            cir.setReturnValue(modified);
        }
    }
}