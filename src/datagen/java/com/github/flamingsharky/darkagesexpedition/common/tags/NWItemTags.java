package com.github.flamingsharky.newworld.datagen.common.tags;

import com.github.flamingsharky.newworld.NewWorldMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class NWItemTags extends ItemTagsProvider {

    public NWItemTags(DataGenerator generator, BlockTagsProvider blockTags, ExistingFileHelper helper) {
        super(generator, blockTags, NewWorldMod.MOD_ID, helper);
    }

    @Override
    protected void addTags() {
        //NOTHING YET BECAUSE NO ITEMS FOR IT
    }

    @Override
    public String getName() {
        return "NewWorldMod Tags";
    }
}
