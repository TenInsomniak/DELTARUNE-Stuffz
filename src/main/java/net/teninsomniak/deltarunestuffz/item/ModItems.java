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
    //Testing
    public static final Item PARTICLE_TEST = registerItem("particle_test",
            new ParticleTestItem(new FabricItemSettings().maxCount(1).group(ModItemGroup.TEST_ITEMS)));



    //Other
    public static final Item FRIEND_INSIDE_ME_MUSICDISC = registerItem("friend_inside_me_musicdisc",
            new MusicDiscItem(9, ModSounds.FRIEND_INSIDE_ME,
                    new FabricItemSettings().rarity(Rarity.RARE).maxCount(1).group(ModItemGroup.DELTARUNE_ITEMS), 30));
    //Midi from: https://onlinesequencer.net/2773101
    public static final Item DONT_FORGET_MUSICDISC = registerItem("dont_forget_musicdisc",
            new MusicDiscItem(9, ModSounds.DONT_FORGET,
                    new FabricItemSettings().rarity(Rarity.RARE).maxCount(1).group(ModItemGroup.DELTARUNE_ITEMS), 50));



    //Swords
    public static final Item WOOD_BLADE = registerItem("wood_blade",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 1,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_SWORDS), "wood_blade"));

    public static final Item TREFOIL = registerItem("trefoil",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 4,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_UNUSED), "trefoil"));

    public static final Item MECHA_SABER = registerItem("mecha_saber",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 4,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_SWORDS), "mecha_saber"));

    public static final Item TWISTED_SWORD = registerItem("twisted_sword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 16,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_UNUSED), "twisted_sword"));

    public static final Item BOUNCE_BLADE = registerItem("bounce_blade",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 2,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_SWORDS), "bounce_blade"));

    public static final Item SPOOKYSWORD = registerItem("spookysword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 2,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_SWORDS), "spookysword"));

    public static final Item BROKEN_SWORD = registerItem("broken_sword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, -532482349,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_SWORDS), "broken_sword"));

    public static final Item SABER_TEN = registerItem("saber_ten",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 6,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_SWORDS), "saber_ten"));

    public static final Item WINGLADE_SWORD = registerItem("winglade_sword",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 8,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_SWORDS), "winglade_sword"));

    public static final Item JINGLE_BLADE = registerItem("jingle_blade",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 7,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_SWORDS), "jingle_blade"));

    public static final Item BLACK_SHARD = registerItem("black_shard",
            new SwordItemDeltarune(ToolMaterialsDeltarune.SWORD, 16,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_SWORDS), "black_shard"));


    //Axes
    public static final Item MANE_AX = registerItem("mane_ax",
            new AxeItemDeltarune(ToolMaterialsDeltarune.AXE, 0,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_AXES), "mane_ax"));

    public static final Item BRAVE_AX = registerItem("brave_ax",
            new AxeItemDeltarune(ToolMaterialsDeltarune.AXE, 2,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_AXES), "brave_ax"));

    public static final Item DEVILSKNIFE = registerItem("devilsknife",
            new AxeItemDeltarune(ToolMaterialsDeltarune.AXE, 5,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_AXES), "devilsknife"));

    public static final Item AUTO_AXE = registerItem("auto_axe",
            new AxeItemDeltarune(ToolMaterialsDeltarune.AXE, 4,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_AXES), "auto_axe"));

    public static final Item TOXIC_AXE = registerItem("toxic_axe",
            new AxeItemDeltarune(ToolMaterialsDeltarune.AXE, 6,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_AXES), "toxic_axe"));

    public static final Item JUSTICE_AXE = registerItem("justice_axe",
            new AxeItemDeltarune(ToolMaterialsDeltarune.AXE, 12,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_AXES), "justice_axe"));

    public static final Item ABSORB_AX = registerItem("absorb_ax",
            new AxeItemDeltarune(ToolMaterialsDeltarune.AXE, 8,
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_AXES), "absorb_ax"));





    //Scarfs
    //Rings (oh no)
    public static final Item SNOW_RING = registerItem("snow_ring",
            new RingItemDeltarune(
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_RINGS), 1, "snow_ring"));
    public static final Item FREEZE_RING = registerItem("freeze_ring",
            new RingItemDeltarune(
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_RINGS), 4, "freeze_ring"));
    public static final Item THORN_RING = registerItem("thorn_ring",
            new RingItemDeltarune(
                    new FabricItemSettings().group(ModItemGroup.DELTARUNE_RINGS), 14, "thorn_ring"));
    //for rings/scarfs: https://github.com/emilyploszaj/trinkets
    //Armour



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(DELTARUNEStuffz.MOD_ID, name), item);
    }
    public static void registerModItems() {
        DELTARUNEStuffz.LOGGER.debug("Registering Mod Items for " + DELTARUNEStuffz.MOD_ID);
    }
}
