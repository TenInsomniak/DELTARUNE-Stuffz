package net.teninsomniak.deltarunestuffz.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.teninsomniak.deltarunestuffz.DELTARUNEStuffz;

public class ModItems {
    public static final Item  WOOD_BLADE = registerItem("wood_blade", new Item(new Item.Settings()));
    public static final Item  TREFOIL = registerItem("trefoil", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DELTARUNEStuffz.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DELTARUNEStuffz.LOGGER.info("Registering Items for " + DELTARUNEStuffz.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(WOOD_BLADE);
        });
    }
}