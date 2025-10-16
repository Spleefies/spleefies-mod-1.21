package net.spleefies.spleefies_mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.spleefies.spleefies_mod.SpleefiesMod;

public class ModItems {
    public static final Item MUSIC_NOTE = registerItem("music_note", new Item(new Item.Settings()));
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(SpleefiesMod.MOD_ID,name), item);
    }
    public static void registerModItems() {
        SpleefiesMod.LOGGER.info("Registering mod items for" + SpleefiesMod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(MUSIC_NOTE);
        });
    }
}
