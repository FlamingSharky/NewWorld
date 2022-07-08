package com.github.flamingsharky.newworld.common.registries;

import com.github.flamingsharky.newworld.NewWorldMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class NWItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, NewWorldMod.MOD_ID);
    public static final Item.Properties DEFAULT_PROPERTIES = new Item.Properties().tab(NewWorldMod.NewWorldTab);

    public static final Item.Properties ITEM_PROPERTIES = new Item.Properties().tab(NewWorldMod.NewWorldTab);

    //ITEMS

    //FIR
    public static final RegistryObject<Item> FIR_LOG_ITEM = fromBlock(NWBlocks.FIR_LOG);
    public static final RegistryObject<Item> STRIPPED_FIR_LOG_ITEM = fromBlock(NWBlocks.STRIPPED_FIR_LOG);
    public static final RegistryObject<Item> FIR_PLANKS_ITEM = fromBlock(NWBlocks.FIR_PLANKS);
    public static final RegistryObject<Item> FIR_SAPLING_ITEM = fromBlock(NWBlocks.FIR_SAPLING);
    public static final RegistryObject<Item> FIR_DOOR_ITEM = fromBlock(NWBlocks.FIR_DOOR);
    public static final RegistryObject<Item> FIR_TRAPDOOR_ITEM = fromBlock(NWBlocks.FIR_TRAPDOOR);
    public static final RegistryObject<Item> FIR_LEAVES_ITEM = fromBlock(NWBlocks.FIR_LEAVES);

    public static <B extends Block> RegistryObject<Item> fromBlock(RegistryObject<B> block) {
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), DEFAULT_PROPERTIES));
    }
}
