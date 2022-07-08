package com.github.flamingsharky.newworld;

import com.github.flamingsharky.newworld.client.ClientExecutor;
import com.github.flamingsharky.newworld.common.CommonExecutor;
import com.github.flamingsharky.newworld.common.registries.NWItems;
import com.github.flamingsharky.newworld.common.registries.NWBlocks;
import com.github.flamingsharky.newworld.utils.ISidedExecutor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

@Mod(NewWorldMod.MOD_ID)
public class NewWorldMod {
    public static final String MOD_ID = "newworld";
    private static final Logger LOGGER = LogManager.getLogger();

    public static final ISidedExecutor EXECUTOR = DistExecutor.unsafeRunForDist(() -> ClientExecutor::new, () -> CommonExecutor::new);

    public static final CreativeModeTab NewWorldTab = new CreativeModeTab(MOD_ID) {
        @Override @NotNull
        public ItemStack makeIcon()
        {
            return new ItemStack(NWBlocks.FIR_SAPLING.get());
        }
    };

    public NewWorldMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        EXECUTOR.setup();
        NWBlocks.BLOCKS.register(eventBus);
        NWItems.ITEMS.register(eventBus);
    }
    public static ResourceLocation resource(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
