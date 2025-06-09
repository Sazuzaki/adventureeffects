package sazu.adventureeffects.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import sazu.adventureeffects.AdventureEffectsRegistry;

public class AdventureItems {
    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Identifier itemID = new Identifier(AdventureEffectsRegistry.MOD_ID, id);

        // Register the item.

        // Return the registered item!
        return Registry.register(Registries.ITEM, itemID, item);
    }
    public static final Item ATMA_SWORD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.EPIC)),
            "atma_sword"
    );

    public static final Item ATMA_SHIELD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.EPIC)),
            "atma_shield"
    );

    public static final Item ATMA_BOW = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.EPIC)),
            "atma_bow"
    );

    public static final Item ATMA_STAFF = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.EPIC)),
            "atma_staff"
    );

    public static void init() {

    }
}
