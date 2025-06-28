package net.teninsomniak.deltarunestuffz.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.teninsomniak.deltarunestuffz.DELTARUNEStuffz;

public class ModItemGroup {
    public static final ItemGroup DELTARUNE_WEAPONS = FabricItemGroupBuilder.build(
            new Identifier(DELTARUNEStuffz.MOD_ID, "deltarune_weapons"), () -> new ItemStack(ModItems.DEBUG_WEAPON));
    public static final ItemGroup DELTARUNE_ARMOUR = FabricItemGroupBuilder.build(
            new Identifier(DELTARUNEStuffz.MOD_ID, "deltarune_armour"), () -> new ItemStack(ModItems.DEBUG_HELMET));
    public static final ItemGroup DELTARUNE_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier(DELTARUNEStuffz.MOD_ID, "deltarune_blocks"), () -> new ItemStack(Items.STICKY_PISTON));
    public static final ItemGroup DELTARUNE_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(DELTARUNEStuffz.MOD_ID, "deltarune_items"), () -> new ItemStack(Items.STICK));
    public static final ItemGroup DELTARUNE_MOBS = FabricItemGroupBuilder.build(
            new Identifier(DELTARUNEStuffz.MOD_ID, "deltarune_mobs"), () -> new ItemStack(Items.PIG_SPAWN_EGG));
    public static final ItemGroup DELTARUNE_UNUSED = FabricItemGroupBuilder.build(
            new Identifier(DELTARUNEStuffz.MOD_ID, "deltarune_unused"), () -> new ItemStack(Items.BARRIER));
}
