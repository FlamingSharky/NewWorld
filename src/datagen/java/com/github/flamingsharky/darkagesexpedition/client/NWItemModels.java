package com.github.flamingsharky.newworld.datagen.client;

import com.github.flamingsharky.newworld.NewWorldMod;
import com.github.flamingsharky.newworld.common.registries.NWBlocks;
import com.github.flamingsharky.newworld.common.registries.NWItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NWItemModels extends ItemModelProvider {

    public NWItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, NewWorldMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {

        withExistingParent(NWItems.FIR_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/fir_log"));
        withExistingParent(NWItems.STRIPPED_FIR_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/stripped_fir_log"));
        withExistingParent(NWItems.FIR_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/fir_planks"));
        withExistingParent(NWItems.FIR_SAPLING_ITEM.get().getRegistryName().getPath(), modLoc("block/fir_sapling"));
        withExistingParent(NWItems.FIR_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/fir_trapdoor_bottom"));
        withExistingParent(NWItems.FIR_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/fir_leaves"));

        singleTexture(NWBlocks.FIR_DOOR.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/fir_door"));

    }
}
