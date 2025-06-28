package net.teninsomniak.deltarunestuffz.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.teninsomniak.deltarunestuffz.DELTARUNEStuffz;
import net.minecraft.util.registry.Registry;
import net.teninsomniak.deltarunestuffz.sound.ModSounds;

public class ModItems {
    //Other
    public static final Item FRIEND_INSIDE_ME_MUSICDISC = registerItem("friend_inside_me_musicdisc",
            new MusicDiscItem(9, ModSounds.FRIEND_INSIDE_ME,
                    new FabricItemSettings().rarity(Rarity.RARE).maxCount(1).group(ModItemGroup.DELTARUNE_ITEMS), 30));



    //Weapons
    public static final Item DEBUG_WEAPON = registerItem("debug_weapon",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 1,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS)));



    //Swords
    public static final Item WOOD_BLADE = registerItem("wood_blade",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 1,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS)));

    public static final Item TREFOIL = registerItem("trefoil",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 4,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_UNUSED)));

    public static final Item MECHA_SABER = registerItem("mecha_saber",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 4,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS)));

    public static final Item TWISTED_SWORD = registerItem("twisted_sword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 16,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_UNUSED)));

    public static final Item BOUNCE_BLADE = registerItem("bounce_blade",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 2,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS)));

    public static final Item SPOOKYSWORD = registerItem("spookysword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 2,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS)));

    public static final Item BROKEN_SWORD = registerItem("broken_sword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, -532482349,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS)));

    public static final Item SABER_TEN = registerItem("saber_ten",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 6,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS)));

    public static final Item WINGLADE_SWORD = registerItem("winglade_sword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 8,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS)));

    public static final Item JINGLE_BLADE = registerItem("jingle_blade",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 7,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS)));




    //Armour
    public static final Item DEBUG_HELMET = registerItem("debug_helmet",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_ARMOUR)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DELTARUNEStuffz.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DELTARUNEStuffz.LOGGER.debug("Registering Mod Items for " + DELTARUNEStuffz.MOD_ID);
    }
}
