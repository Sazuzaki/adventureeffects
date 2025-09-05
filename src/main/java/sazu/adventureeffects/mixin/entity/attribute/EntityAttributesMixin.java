package sazu.adventureeffects.mixin.entity.attribute;

import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import sazu.adventureeffects.AdventureEffectsRegistry;

@Mixin(EntityAttributes.class)
public class EntityAttributesMixin {
    @Shadow
    private static EntityAttribute register(String id, EntityAttribute attribute) {
        throw new AssertionError();
    }

    static {
        AdventureEffectsRegistry.RANGED_DAMAGE = register(AdventureEffectsRegistry.MOD_ID + ":generic.ranged_damage", new ClampedEntityAttribute("attribute.name.generic.ranged_damage", 0.0, -1024.0, 1024.0).setTracked(true));
    }
}
