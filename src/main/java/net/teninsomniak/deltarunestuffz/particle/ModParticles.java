package net.teninsomniak.deltarunestuffz.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teninsomniak.deltarunestuffz.DELTARUNEStuffz;

public class ModParticles {
    public static final DefaultParticleType FOUNTAIN_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(DELTARUNEStuffz.MOD_ID, "fountain_particle"),
                FOUNTAIN_PARTICLE);
    }
}
