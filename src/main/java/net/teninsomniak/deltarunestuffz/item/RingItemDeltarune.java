package net.teninsomniak.deltarunestuffz.item;

import com.google.common.collect.Multimap;
import dev.emi.trinkets.api.SlotReference;
import dev.emi.trinkets.api.TrinketItem;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.UUID;

public class RingItemDeltarune extends TrinketItem {
    public RingItemDeltarune(Settings settings, int bonusDamage, String itemId) {
        super(settings);
        bonus_damage = bonusDamage;
        item_id = itemId;
    }
    public int bonus_damage;
    public String item_id;
    public Multimap<EntityAttribute, EntityAttributeModifier> getModifiers(ItemStack stack, SlotReference slot, LivingEntity entity, UUID uuid) {
        var modifiers = super.getModifiers(stack, slot, entity, uuid);
        if (bonus_damage != 0) {
            modifiers.put(EntityAttributes.GENERIC_ATTACK_DAMAGE, new EntityAttributeModifier(uuid, "deltarune-stuffz:attack_damage", bonus_damage, EntityAttributeModifier.Operation.ADDITION));
        }
        if (item_id.equals("thorn_ring")) {
            modifiers.put(EntityAttributes.GENERIC_MAX_HEALTH, new EntityAttributeModifier(uuid, "deltarune-stuffz:max_health", -0.6, EntityAttributeModifier.Operation.MULTIPLY_TOTAL));
            //entity.damage(DamageSource.GENERIC, 3);
            /* if (entity.getHealth() > 8.0f) {
                entity.setHealth(8.0f);
            } */
            /* if (entity.getHealth() > 8.0f) {
                entity.damage(DamageSource.CACTUS, 1);
            } */
            if (entity.getHealth() > 8.0f) {
                entity.damage(DamageSource.CACTUS, (entity.getHealth()-8.0f));
            }
        }
        return modifiers;
    }

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
