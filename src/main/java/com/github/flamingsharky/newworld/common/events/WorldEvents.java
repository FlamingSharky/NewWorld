package com.github.flamingsharky.newworld.common.events;


import com.github.flamingsharky.newworld.NewWorldMod;
import com.github.flamingsharky.newworld.common.world.gen.TreeGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid= NewWorldMod.MOD_ID)
public class WorldEvents {

	@SubscribeEvent
	public static void biomeLoadEvent(final BiomeLoadingEvent loadingEvent) {
		TreeGeneration.generateTrees(loadingEvent);
	}
}
