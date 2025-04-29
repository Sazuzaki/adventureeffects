package sazu.adventureeffects;

import net.fabricmc.api.ModInitializer;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sazu.adventureeffects.effect.ManaRegen;

public class AdventureEffectsRegistry implements ModInitializer {
	public static final String MOD_ID = "adventureeffects";
	public static final StatusEffect MANA_REGEN = new ManaRegen();

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Registry.register(Registries.STATUS_EFFECT, new Identifier(MOD_ID, "mana_regen"), MANA_REGEN);
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}