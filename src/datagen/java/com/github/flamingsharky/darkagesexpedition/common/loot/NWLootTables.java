package com.github.flamingsharky.newworld.datagen.common.loot;

import com.github.flamingsharky.newworld.common.registries.NWBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

public class NWLootTables extends BlockLoot {

    private static final float[] LEAF_SAPLING_CHANCES = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};

    @Override
    protected void addTables() {
        this.dropSelf(NWBlocks.FIR_LOG.get());
        this.dropSelf(NWBlocks.STRIPPED_FIR_LOG.get());
        this.dropSelf(NWBlocks.FIR_PLANKS.get());
        this.dropSelf(NWBlocks.FIR_SAPLING.get());
        this.dropSelf(NWBlocks.FIR_DOOR.get());
        this.dropSelf(NWBlocks.FIR_TRAPDOOR.get());

        this.add(NWBlocks.FIR_LEAVES.get(), (block) ->
                createLeavesDrops(block, NWBlocks.FIR_LEAVES.get(), LEAF_SAPLING_CHANCES));

    }
    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return NWBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}