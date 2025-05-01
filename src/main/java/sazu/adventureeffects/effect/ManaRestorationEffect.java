package sazu.adventureeffects.effect;

import com.github.theredbrain.manaattributes.entity.ManaUsingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.InstantStatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ManaRestorationEffect extends InstantStatusEffect {
    public ManaRestorationEffect(){
        super(StatusEffectCategory.BENEFICIAL, 0x5A9CFF);
    }

    @Override
    public void applyInstantEffect(Entity source, Entity attacker, LivingEntity target, int amplifier, double unused) {
        if (!target.getWorld().isClient && target instanceof ManaUsingEntity manaUser) {
            float restoreAmount = 10.0F * (amplifier + 2); // Flat mana restore
            float currentMana = manaUser.manaattributes$getMana();
            manaUser.manaattributes$setMana(currentMana + restoreAmount);
        }
    }
}
