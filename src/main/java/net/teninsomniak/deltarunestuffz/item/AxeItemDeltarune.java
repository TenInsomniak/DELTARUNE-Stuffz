package net.teninsomniak.deltarunestuffz.item;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AxeItemDeltarune extends AxeItem {
    public AxeItemDeltarune(ToolMaterial toolMaterial, int bonusAttackDamage, Settings settings, String itemId) {
        super(toolMaterial, bonusAttackDamage+4, -3f, settings);
        item_id = itemId;
    }
    public String item_id;
    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (!Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("itemTooltip.deltarune-stuffz.press_shift").formatted(Formatting.DARK_GRAY));
        } else {
            tooltip.add(Text.translatable("itemTooltip.deltarune-stuffz." + item_id + "_desc").formatted(Formatting.DARK_GRAY));
        }
        tooltip.add(Text.translatable("itemTooltip.deltarune-stuffz." + item_id + "_stats").formatted(Formatting.GRAY));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
