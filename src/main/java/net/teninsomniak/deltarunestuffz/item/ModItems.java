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
    //Midi from: https://onlinesequencer.net/2773101
    public static final Item DONT_FORGET_MUSICDISC = registerItem("dont_forget_musicdisc",
            new MusicDiscItem(9, ModSounds.DONT_FORGET,
                    new FabricItemSettings().rarity(Rarity.RARE).maxCount(1).group(ModItemGroup.DELTARUNE_ITEMS), 50));



    //Debug
    public static final Item DEBUG_WEAPON = registerItem("debug_weapon",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 1,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS), "wood_blade"));
    public static final Item DEBUG_HELMET = registerItem("debug_helmet",
            new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_ARMOUR)));

    //to edit: winglade

    //Swords
    public static final Item WOOD_BLADE = registerItem("wood_blade",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 1,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS), "wood_blade"));

    public static final Item TREFOIL = registerItem("trefoil",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 4,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_UNUSED), "trefoil"));

    public static final Item MECHA_SABER = registerItem("mecha_saber",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 4,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS), "mecha_saber"));

    public static final Item TWISTED_SWORD = registerItem("twisted_sword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 16,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_UNUSED), "twisted_sword"));

    public static final Item BOUNCE_BLADE = registerItem("bounce_blade",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 2,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS), "bounce_blade"));

    public static final Item SPOOKYSWORD = registerItem("spookysword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 2,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS), "spookysword"));

    public static final Item BROKEN_SWORD = registerItem("broken_sword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, -532482349,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS), "broken_sword"));

    public static final Item SABER_TEN = registerItem("saber_ten",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 6,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS), "saber_ten"));

    public static final Item WINGLADE_SWORD = registerItem("winglade_sword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 8,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS), "winglade_sword"));

    public static final Item JINGLE_BLADE = registerItem("jingle_blade",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 7,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS), "jingle_blade"));

    public static final Item BLACK_SHARD = registerItem("black_shard",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 16,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_WEAPONS), "black_shard"));



    //Axes
    //Scarfs
    //Rings (oh no)
    //for rings/scarfs: https://github.com/emilyploszaj/trinkets
    //Armour



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DELTARUNEStuffz.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DELTARUNEStuffz.LOGGER.debug("Registering Mod Items for " + DELTARUNEStuffz.MOD_ID);
    }
}
