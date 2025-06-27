package net.teninsomniak.deltarunestuffz.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.teninsomniak.deltarunestuffz.DELTARUNEStuffz;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //Weapons
    public static final Item DEBUG_WEAPON = registerItem("debug_weapon",
            new SwordItem(ToolMaterials.NETHERITE, 1, 1f, new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS)));
    public static final Item WOOD_BLADE = registerItem("wood_blade",
            new Item(new FabricItemSettings().maxCount(1).group(ModItemGroup.DELTARUNE_WEAPONS)));
    //Armour
    public static final Item DEBUG_HELMET = registerItem("debug_helmet",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.DELTARUNE_ARMOUR)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DELTARUNEStuffz.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DELTARUNEStuffz.LOGGER.debug("Registering Mod Items for " + DELTARUNEStuffz.MOD_ID);
    }
}
