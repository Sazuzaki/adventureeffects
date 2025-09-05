package sazu.adventureeffects;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;
import net.minecraft.client.item.ModelPredicateProviderRegistry;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import sazu.adventureeffects.items.AdventureItems;

@Environment(EnvType.CLIENT)
public class AdventureeffectsClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		ModelPredicateProviderRegistry.register(
				AdventureItems.STEEL_KITE_SHIELD,
				new Identifier("blocking"),
				(ItemStack stack, net.minecraft.client.world.ClientWorld world, LivingEntity entity, int seed) -> {
					return (entity != null && entity.isUsingItem() && entity.getActiveItem() == stack) ? 1.0F : 0.0F;
				}
		);
	}
}
