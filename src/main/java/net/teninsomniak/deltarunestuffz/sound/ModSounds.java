package net.teninsomniak.deltarunestuffz.sound;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.teninsomniak.deltarunestuffz.DELTARUNEStuffz;

public class ModSounds {

    public static final SoundEvent FRIEND_INSIDE_ME = registerSoundEvent("friend_inside_me");
    public static final SoundEvent DONT_FORGET = registerSoundEvent("dont_forget");
    public static final SoundEvent FOUNTAIN_MAKE = registerSoundEvent("fountain_make");
    public static final SoundEvent FOUNTAIN_TARGET = registerSoundEvent("fountain_target");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(DELTARUNEStuffz.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
    public static void registerSounds() {
        DELTARUNEStuffz.LOGGER.info("Registering Mod Sounds for " + DELTARUNEStuffz.MOD_ID);
    }
}
