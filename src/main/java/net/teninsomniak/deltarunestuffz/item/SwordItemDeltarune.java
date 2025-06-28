package net.teninsomniak.deltarunestuffz.item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.UseAction;

public class SwordItemDeltarune extends SwordItem {
    public SwordItemDeltarune(ToolMaterial toolMaterial, int bonusAttackDamage, Settings settings) {
        super(toolMaterial, bonusAttackDamage+2, -2.4f, settings);
    }
}
