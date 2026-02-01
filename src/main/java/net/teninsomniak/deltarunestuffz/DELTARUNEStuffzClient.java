package net.teninsomniak.deltarunestuffz;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.teninsomniak.deltarunestuffz.particle.ModParticles;
import net.teninsomniak.deltarunestuffz.particle.custom.FountainParticle;

public class DELTARUNEStuffzClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(ModParticles.FOUNTAIN_PARTICLE, FountainParticle.Factory::new);
    }
}
