package net.teninsomniak.deltarunestuffz;

import net.fabricmc.api.ModInitializer;

import net.minecraft.particle.ParticleTypes;
import net.teninsomniak.deltarunestuffz.item.ModItems;
import net.teninsomniak.deltarunestuffz.particle.ModParticles;
import net.teninsomniak.deltarunestuffz.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DELTARUNEStuffz implements ModInitializer {
	public static final String MOD_ID = "deltarune-stuffz";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModSounds.registerSounds();

		ModParticles.registerParticles();
	}
}