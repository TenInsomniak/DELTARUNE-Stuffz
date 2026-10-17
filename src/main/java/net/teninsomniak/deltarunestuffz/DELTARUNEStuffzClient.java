package net.teninsomniak.deltarunestuffz;

import net.fabricmc.api.ClientModInitializer;
import net.teninsomniak.deltarunestuffz.item.ModItems;

public class DELTARUNEStuffzClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
