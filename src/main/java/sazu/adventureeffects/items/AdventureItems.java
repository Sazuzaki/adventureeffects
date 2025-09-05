package sazu.adventureeffects.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SwordItem;
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

    public static final Item STONE_CLAYMORE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "stone_claymore_head"
    );

    public static final Item IRON_CLAYMORE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "iron_claymore_head"
    );

    public static final Item STEEL_CLAYMORE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "steel_claymore_head"
    );

    public static final Item GOLD_CLAYMORE_HEAD = register(
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "gold_claymore_head"
    );

    public static final Item AETERNIUM_CLAYMORE_HEAD = register(
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "aeternium_claymore_head"
    );
    public static final Item HEATED_AETERNIUM_INGOT = register(
            new Item(new FabricItemSettings().rarity(Rarity.EPIC).maxCount(1)),
            "heated_aeternium_ingot"
    );

    public static final Item STONE_GREAT_HAMMER_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "stone_great_hammer_head"
    );

    public static final Item IRON_GREAT_HAMMER_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "iron_great_hammer_head"
    );

    public static final Item GOLDEN_GREAT_HAMMER_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "golden_great_hammer_head"
    );

    public static final Item STEEL_GREAT_HAMMER_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "steel_great_hammer_head"
    );

    public static final Item AETERNIUM_GREAT_HAMMER_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "aeternium_great_hammer_head"
    );

    public static final Item IRON_MACE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "iron_mace_head"
    );

    public static final Item GOLDEN_MACE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "golden_mace_head"
    );

    public static final Item STEEL_MACE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "steel_mace_head"
    );

    public static final Item AETERNIUM_MACE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "aeternium_mace_head"
    );

    public static final Item HOLY_STAFF_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "holy_staff_head"
    );

    public static final Item HOLY_WAND_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "holy_wand_head"
    );

    public static final Item IRON_HANDLE = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "iron_handle"
    );

    public static final Item IRON_POLE = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "iron_pole"
    );

    public static final Item GOLD_PLATE = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "gold_plate"
    );

    public static final Item IRON_DAGGER_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "iron_dagger_head"
    );

    public static final Item GOLDEN_DAGGER_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "golden_dagger_head"
    );

    public static final Item STEEL_DAGGER_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "steel_dagger_head"
    );

    public static final Item AETERNIUM_DAGGER_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "aeternium_dagger_head"
    );

    public static final Item IRON_DOUBLE_AXE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "iron_double_axe_head"
    );

    public static final Item GOLDEN_DOUBLE_AXE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "golden_double_axe_head"
    );

    public static final Item STEEL_DOUBLE_AXE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "steel_double_axe_head"
    );

    public static final Item AETERNIUM_DOUBLE_AXE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "aeternium_double_axe_head"
    );

    public static final Item IRON_GLAIVE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "iron_glaive_head"
    );

    public static final Item GOLDEN_GLAIVE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "golden_glaive_head"
    );

    public static final Item STEEL_GLAIVE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "steel_glaive_head"
    );

    public static final Item AETERNIUM_GLAIVE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "aeternium_glaive_head"
    );

    public static final Item IRON_SICKLE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "iron_sickle_head"
    );

    public static final Item GOLDEN_SICKLE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "golden_sickle_head"
    );

    public static final Item STEEL_SICKLE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "steel_sickle_head"
    );

    public static final Item AETERNIUM_SICKLE_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "aeternium_sickle_head"
    );

    public static final Item IRON_SPEAR_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "iron_spear_head"
    );

    public static final Item GOLDEN_SPEAR_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "golden_spear_head"
    );

    public static final Item STEEL_SPEAR_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "steel_spear_head"
    );

    public static final Item AETERNIUM_SPEAR_HEAD = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new Item(new FabricItemSettings().rarity(Rarity.COMMON)),
            "aeternium_spear_head"
    );

    public static final Item STEEL_CLAYMORE = register(
            new SwordItem(
                    AdventureMaterial.INSTANCE,
                    6, // attack damage bonus
                    -3.0f, // attack speed
                    new FabricItemSettings().rarity(Rarity.COMMON)
            ),
            "steel_claymore"
    );

    public static final Item STEEL_GREAT_HAMMER = register(
            new SwordItem(
                    AdventureMaterial.INSTANCE,
                    9, // attack damage bonus
                    -3.2f, // attack speed
                    new FabricItemSettings().rarity(Rarity.COMMON)
            ),
            "steel_great_hammer"
    );

    public static final Item STEEL_MACE = register(
            new SwordItem(
                    AdventureMaterial.INSTANCE,
                    5, // attack damage bonus
                    -2.8f, // attack speed
                    new FabricItemSettings().rarity(Rarity.COMMON)
            ),
            "steel_mace"
    );

    public  static final Item STEEL_KITE_SHIELD = register(
            new SteelShieldItem(new FabricItemSettings()
                    .maxDamage(500)
                    .rarity(Rarity.COMMON)
            ),
            "steel_kite_shield"
    );

    public static final Item STEEL_DAGGER = register(
            new SwordItem(
                    AdventureMaterial.INSTANCE,
                    1, // attack damage bonus
                    -1.6f, // attack speed
                    new FabricItemSettings().rarity(Rarity.COMMON)
            ),
            "steel_dagger"
    );

    public static final Item STEEL_DOUBLE_AXE = register(
            new SwordItem(
                    AdventureMaterial.INSTANCE,
                    5, // attack damage bonus
                    -2.8f, // attack speed
                    new FabricItemSettings().rarity(Rarity.COMMON)
            ),
            "steel_double_axe"
    );

    public static final Item STEEL_SICKLE = register(
            new SwordItem(
                    AdventureMaterial.INSTANCE,
                    2, // attack damage bonus
                    -2.0f, // attack speed
                    new FabricItemSettings().rarity(Rarity.COMMON)
            ),
            "steel_sickle"
    );

    public static final Item STEEL_GLAIVE = register(
            new SwordItem(
                    AdventureMaterial.INSTANCE,
                    4, // attack damage bonus
                    -2.6f, // attack speed
                    new FabricItemSettings().rarity(Rarity.COMMON)
            ),
            "steel_glaive"
    );

    public static final Item STEEL_SPEAR = register(
            new SwordItem(
                    AdventureMaterial.INSTANCE,
                    3, // attack damage bonus
                    -2.6f, // attack speed
                    new FabricItemSettings().rarity(Rarity.COMMON)
            ),
            "steel_spear"
    );

    public static void init() {

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(STONE_CLAYMORE_HEAD);
            entries.add(IRON_CLAYMORE_HEAD);
            entries.add(STEEL_CLAYMORE_HEAD);
            entries.add(STEEL_CLAYMORE);
            entries.add(GOLD_CLAYMORE_HEAD);
            entries.add(STONE_GREAT_HAMMER_HEAD);
            entries.add(IRON_GREAT_HAMMER_HEAD);
            entries.add(GOLDEN_GREAT_HAMMER_HEAD);
            entries.add(STEEL_GREAT_HAMMER_HEAD);
            entries.add(AETERNIUM_GREAT_HAMMER_HEAD);
            entries.add(STEEL_GREAT_HAMMER);
            entries.add(AETERNIUM_CLAYMORE_HEAD);
            entries.add(HEATED_AETERNIUM_INGOT);
            entries.add(IRON_MACE_HEAD);
            entries.add(GOLDEN_MACE_HEAD);
            entries.add(STEEL_MACE_HEAD);
            entries.add(STEEL_MACE);
            entries.add(STEEL_DAGGER);
            entries.add(AETERNIUM_MACE_HEAD);
            entries.add(HOLY_STAFF_HEAD);
            entries.add(HOLY_WAND_HEAD);
            entries.add(IRON_HANDLE);
            entries.add(IRON_POLE);
            entries.add(STEEL_KITE_SHIELD);
            entries.add(IRON_DAGGER_HEAD);
            entries.add(GOLDEN_DAGGER_HEAD);
            entries.add(STEEL_DAGGER_HEAD);
            entries.add(AETERNIUM_DAGGER_HEAD);
            entries.add(IRON_DOUBLE_AXE_HEAD);
            entries.add(GOLDEN_DOUBLE_AXE_HEAD);
            entries.add(STEEL_DOUBLE_AXE_HEAD);
            entries.add(STEEL_DOUBLE_AXE);
            entries.add(AETERNIUM_DOUBLE_AXE_HEAD);
            entries.add(IRON_GLAIVE_HEAD);
            entries.add(GOLDEN_GLAIVE_HEAD);
            entries.add(STEEL_GLAIVE_HEAD);
            entries.add(STEEL_GLAIVE);
            entries.add(AETERNIUM_GLAIVE_HEAD);
            entries.add(IRON_SICKLE_HEAD);
            entries.add(GOLDEN_SICKLE_HEAD);
            entries.add(STEEL_SICKLE_HEAD);
            entries.add(STEEL_SICKLE);
            entries.add(AETERNIUM_SICKLE_HEAD);
            entries.add(IRON_SPEAR_HEAD);
            entries.add(GOLDEN_SPEAR_HEAD);
            entries.add(STEEL_SPEAR_HEAD);
            entries.add(STEEL_SPEAR);
            entries.add(AETERNIUM_SPEAR_HEAD);

        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GOLD_PLATE);
            entries.add(ATMA_SWORD);
            entries.add(ATMA_SHIELD);
            entries.add(ATMA_BOW);
            entries.add(ATMA_STAFF);
        });

    }
}
