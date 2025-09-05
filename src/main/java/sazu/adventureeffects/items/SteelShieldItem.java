package sazu.adventureeffects.items;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;

public class SteelShieldItem extends ShieldItem {
    public SteelShieldItem(Settings settings) {
        super(settings);
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return ingredient.isIn(AdventureMaterial.STEEL_TAG);
    }
}
