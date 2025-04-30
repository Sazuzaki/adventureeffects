package sazu.adventureeffects.potion;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.potion.Potion;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import sazu.adventureeffects.AdventureEffectsRegistry;

public class AdventurePotions {
    public static final RegistryEntry<Potion> MANA_POTION = registerPotion("mana_potion",
            new Potion(new StatusEffectInstance(AdventureEffectsRegistry.MANA_RESTORATION, 0, 0)));
    public static final RegistryEntry<Potion> STRONG_MANA_POTION = registerPotion("strong_mana_potion",
            new Potion(new StatusEffectInstance(AdventureEffectsRegistry.MANA_RESTORATION, 0, 1)));

    private static RegistryEntry<Potion> registerPotion(String name, Potion potion) {
        return Registry.registerReference(Registries.POTION, Identifier.of(AdventureEffectsRegistry.MOD_ID, name), potion);
    }

    public static void registerPotions(){
        AdventureEffectsRegistry.LOGGER.info("Registering potions for " + AdventureEffectsRegistry.MOD_ID);
    }
}
