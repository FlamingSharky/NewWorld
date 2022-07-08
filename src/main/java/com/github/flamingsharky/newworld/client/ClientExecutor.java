package com.github.flamingsharky.newworld.client;

import com.github.flamingsharky.newworld.common.registries.NWBlocks;
import com.github.flamingsharky.newworld.utils.ISidedExecutor;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class ClientExecutor implements ISidedExecutor {
    @Override
    public void setup() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
    }

    public void clientSetup(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(NWBlocks.FIR_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(NWBlocks.FIR_TRAPDOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(NWBlocks.FIR_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(NWBlocks.FIR_LEAVES.get(), RenderType.cutout());
    }
}
