package net.teninsomniak.deltarunestuffz.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.teninsomniak.deltarunestuffz.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generatedBlockStateModels(BlockStateModelGenerator blockStateModelGenerator){

    }
    @Override
    public void generatedItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.WOOD_BLADE, "");
    }
}
