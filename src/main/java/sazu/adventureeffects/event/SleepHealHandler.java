package sazu.adventureeffects.event;

import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class SleepHealHandler {

    private static final ConcurrentHashMap<UUID, Integer> sleepTicksMap = new ConcurrentHashMap<>();

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(SleepHealHandler::onServerTick);
    }

    private static void onServerTick(MinecraftServer server) {
        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
            if (player.isSleeping()) {
                UUID playerUUID = player.getUuid();
                int sleepTicks = sleepTicksMap.getOrDefault(playerUUID, 0) + 1;

                if (sleepTicks >= 100) {
                    restoreHealth(player);
                    sleepTicks = 0;
                }
                sleepTicksMap.put(playerUUID, sleepTicks);
            } else {
                sleepTicksMap.remove(player.getUuid());
            }
        }
    }

    private static void restoreHealth(ServerPlayerEntity player) {
        float maxHealth = player.getMaxHealth();
        player.setHealth(maxHealth);
    }
}
