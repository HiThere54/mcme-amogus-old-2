
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.thedoomdragons.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.thedoomdragons.client.renderer.ImpostrRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheDoomDragonsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TheDoomDragonsModEntities.IMPOSTR.get(), ImpostrRenderer::new);
	}
}
