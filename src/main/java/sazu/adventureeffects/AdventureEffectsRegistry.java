package sazu.adventureeffects;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sazu.adventureeffects.effect.*;
import sazu.adventureeffects.event.SleepManaRegenHandler;
import sazu.adventureeffects.potion.AdventurePotions;
import sazu.adventureeffects.util.PotionsUtil;

public class AdventureEffectsRegistry implements ModInitializer {
	public static final String MOD_ID = "adventureeffects";
	public static final StatusEffect MANA_REGEN = new ManaRegen();
	public static final StatusEffect MANA_RESTORATION = new ManaRestorationEffect();
	public static final StatusEffect MANA_BOOST = new MaxManaEffect();
	public static final StatusEffect MIGHT = new MightEffect();
	public static final StatusEffect DEFENSE_BOOST = new DefenseBoostEffect();
	public static final StatusEffect COMBO = new ComboEffect();

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "mana_regen"), MANA_REGEN);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "mana_restoration"), MANA_RESTORATION);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "mana_boost"), MANA_BOOST);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "might"), MIGHT);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "defense_boost"), DEFENSE_BOOST);
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "combo"), COMBO);
		AdventurePotions.registerPotions();
		SleepManaRegenHandler.register();

		FabricBrewingRecipeRegistry.registerPotionRecipe(
				Potions.AWKWARD,
				Ingredient.ofItems(Items.AMETHYST_SHARD),
				AdventurePotions.MANA_POTION.value()
		);
		FabricBrewingRecipeRegistry.registerPotionRecipe(
				AdventurePotions.MANA_POTION.value(),
				Ingredient.ofItems(Items.GLOWSTONE_DUST),
				AdventurePotions.STRONG_MANA_POTION.value()
		);
		FabricBrewingRecipeRegistry.registerPotionRecipe(
				AdventurePotions.MANA_POTION.value(),
				Ingredient.ofItems(Items.GUNPOWDER),
				PotionsUtil.createSplashPotion(AdventurePotions.MANA_POTION)
		);
		FabricBrewingRecipeRegistry.registerPotionRecipe(
				AdventurePotions.MANA_POTION.value(),
				Ingredient.ofItems(Items.DRAGON_BREATH),
				PotionsUtil.createLingeringPotion(AdventurePotions.MANA_POTION)
		);
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Adventure Effects Loaded!");
	}
}