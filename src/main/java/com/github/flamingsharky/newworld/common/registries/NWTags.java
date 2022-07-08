package com.github.flamingsharky.newworld.common.registries;

import com.github.flamingsharky.newworld.NewWorldMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class NWTags {
    public static void setup() {
        NWTags.Blocks.init();
        NWTags.Items.init();
    }

    public static class Blocks {
        private static void init() {}

        public static final TagKey<Block> FIR_BLOCKS = tag("fir_blocks");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(NewWorldMod.resource(name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        private static void init() {}

        public static final TagKey<Item> FIR_BLOCKS_ITEM = tag("fir_blocks");


        private static TagKey<Item> tag(String name) {
            return ItemTags.create(NewWorldMod.resource(name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
