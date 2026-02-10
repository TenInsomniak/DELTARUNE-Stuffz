package net.teninsomniak.deltarunestuffz.particle.custom;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.world.World;

public class FountainParticle extends SpriteBillboardParticle {
    private final SpriteProvider spriteProvider;

    protected FountainParticle(ClientWorld level, double xCoord, double yCoord, double zCoord,
                               SpriteProvider spriteSet, double xd, double yd, double zd) {
        super(level, xCoord, yCoord, zCoord, xd, yd, zd);

        this.spriteProvider = spriteSet;
        this.velocityMultiplier = 0.0f;
        this.x = xd;
        this.y = yd;
        this.z = zd;
        //this.scale *= 0.75f;
        this.scale(2.0f);
        //this.maxAge = 20;
        this.maxAge = 10;
        this.setSpriteForAge(spriteSet);

        this.red = 1f;
        this.green = 1f;
        this.blue = 1f;
    }

    @Override
    public void tick() {
        super.tick();
        this.setSpriteForAge(this.spriteProvider);
    }

    //fading
    /*
    @Override
    public void tick() {
        super.tick();
        fadeOut();
    }

    private void fadeOut() {
        this.alpha = (-(1/(float)maxAge) * age + 1);
    }
    */
    //fading

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider sprites;

        public Factory(SpriteProvider spriteSet){
            this.sprites = spriteSet;
        }

        public Particle createParticle(DefaultParticleType particleType, ClientWorld level, double x, double y, double z,
                                       double dx, double dy, double dz) {
            return new FountainParticle(level, x, y, z, this.sprites, dx, dy, dz);
        }
    }

}
