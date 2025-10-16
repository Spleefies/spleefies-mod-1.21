package net.spleefies.spleefies_mod;

import net.fabricmc.api.ClientModInitializer;
import net.spleefies.spleefies_mod.item.ModItems;

public class SpleefiesModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
