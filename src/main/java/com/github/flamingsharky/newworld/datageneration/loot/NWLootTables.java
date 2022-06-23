package com.github.flamingsharky.newworld.datageneration.loot;

import com.github.flamingsharky.newworld.setup.Registration;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class NWLootTables extends BlockLoot {

    private static final float[] LEAF_SAPLING_CHANCES = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};

    @Override
    protected void addTables() {
        this.dropSelf(Registration.FIR_LOG.get());
        this.dropSelf(Registration.STRIPPED_FIR_LOG.get());
        this.dropSelf(Registration.FIR_PLANKS.get());
        this.dropSelf(Registration.FIR_SAPLING.get());
        this.dropSelf(Registration.FIR_DOOR.get());
        this.dropSelf(Registration.FIR_TRAPDOOR.get());

        this.add(Registration.FIR_LEAVES.get(), (block) ->
                createLeavesDrops(block, Registration.FIR_LEAVES.get(), LEAF_SAPLING_CHANCES));

    }
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Registration.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}