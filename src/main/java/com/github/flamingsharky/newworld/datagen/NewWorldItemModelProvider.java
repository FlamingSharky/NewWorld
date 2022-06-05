package com.github.flamingsharky.newworld.datagen;

import com.github.flamingsharky.newworld.NewWorldMod;
import com.github.flamingsharky.newworld.setup.Registration;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NewWorldItemModelProvider extends ItemModelProvider {

    public NewWorldItemModelProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, NewWorldMod.MOD_ID, helper);
    }

    @Override
    protected void registerModels() {

        withExistingParent(Registration.FIR_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/fir_log"));
        withExistingParent(Registration.STRIPPED_FIR_LOG_ITEM.get().getRegistryName().getPath(), modLoc("block/stripped_fir_log"));
        withExistingParent(Registration.FIR_PLANKS_ITEM.get().getRegistryName().getPath(), modLoc("block/fir_planks"));
        withExistingParent(Registration.FIR_SAPLING_ITEM.get().getRegistryName().getPath(), modLoc("block/fir_sapling"));
        withExistingParent(Registration.FIR_TRAPDOOR_ITEM.get().getRegistryName().getPath(), modLoc("block/fir_trapdoor"));
        withExistingParent(Registration.FIR_LEAVES_ITEM.get().getRegistryName().getPath(), modLoc("block/fir_leaves"));

        singleTexture(Registration.FIR_DOOR.get().getRegistryName().getPath(), mcLoc("item/generated"), "layer0", modLoc("item/fir_door"));

    }
}
