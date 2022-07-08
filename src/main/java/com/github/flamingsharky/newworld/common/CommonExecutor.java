package com.github.flamingsharky.newworld.common;

import com.github.flamingsharky.newworld.common.registries.NWTags;
import com.github.flamingsharky.newworld.common.registries.blocks.NWWoodTypes;
import com.github.flamingsharky.newworld.utils.ISidedExecutor;
import net.minecraft.client.renderer.Sheets;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class CommonExecutor implements ISidedExecutor {
    @Override
    public void setup() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        NWTags.setup();
    }

    public void commonSetup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
                    Sheets.addWoodType(NWWoodTypes.FIR);
                }
        );
    }
}
