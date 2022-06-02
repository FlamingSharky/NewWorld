package com.github.flamingsharky.newworld;


import com.github.flamingsharky.newworld.setup.ClientSetup;
import com.github.flamingsharky.newworld.setup.ModSetup;
import com.github.flamingsharky.newworld.setup.Registration;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(NewWorldMod.MOD_ID)
public class NewWorldMod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "newworld";

    public NewWorldMod() {
        Registration.init();
        // Register ourselves for server and other game events we are interested in
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(ModSetup::init);
        if (FMLEnvironment.dist == Dist.CLIENT) {
            eventBus.addListener(ClientSetup::init);
        }
        ModSetup.setup();
    }
    public static final CreativeModeTab NewWorldModTab = new CreativeModeTab("newworldcreativetab") {
        @Override
        public ItemStack makeIcon()
        {
            return new ItemStack(Registration.FIR_SAPLING.get());
        }
    };
}
