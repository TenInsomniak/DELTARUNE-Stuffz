package net.teninsomniak.deltarunestuffz.item;

import net.minecraft.client.particle.Particle;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LightningEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.teninsomniak.deltarunestuffz.particle.ModParticles;
import net.teninsomniak.deltarunestuffz.sound.ModSounds;

public class ParticleTestItem extends Item {
    public ParticleTestItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }
        BlockPos position = user.getBlockPos().offset(user.getHorizontalFacing(), 5);


        //world.addParticle(ModParticles.FOUNTAIN_PARTICLE, position.getX(), position.getY(), position.getZ(), 0.0, 0.0, 0.0);
        //world.playSound(null, position, SoundEvents.BLOCK_ANVIL_PLACE, SoundCategory.MASTER, 1.0f, 1.0f);
        world.playSound(null, position, ModSounds.FOUNTAIN_TARGET, SoundCategory.MASTER, 1.0f, 1.0f);
        //world.addParticle(ModParticles.FOUNTAIN_PARTICLE, true, 0, 0, 0, 0.0, 0.0, 0.0);
        world.addParticle(ParticleTypes.SOUL, true, 0, 0, 0, 0.0, 0.0, 0.0);


        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
