package sazu.adventureeffects.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.item.Item;

public class AdventureMaterial implements ToolMaterial {
    public static final AdventureMaterial INSTANCE = new AdventureMaterial();
    public static final TagKey<Item> STEEL_TAG = TagKey.of(RegistryKeys.ITEM, new Identifier("adventureeffects", "steel"));

    @Override
    public int getDurability() {
        return 500;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7.0f;
    }

    @Override
    public float getAttackDamage() {
        return 3.0f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.fromTag(STEEL_TAG);
    }
}
