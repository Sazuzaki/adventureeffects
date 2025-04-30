package sazu.adventureeffects.util;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.registry.entry.RegistryEntry;

public class PotionsUtil {
    public static Potion createSplashPotion(RegistryEntry<Potion> potion) {
        ItemStack stack = new ItemStack(Items.SPLASH_POTION);
        PotionUtil.setPotion(stack, potion.value()); // Use .value() to get the actual Potion object
        return PotionUtil.getPotion(stack);
    }

    public static Potion createLingeringPotion(RegistryEntry<Potion> potion) {
        ItemStack stack = new ItemStack(Items.LINGERING_POTION);
        PotionUtil.setPotion(stack, potion.value()); // Use .value() to get the actual Potion object
        return PotionUtil.getPotion(stack);
    }
}
