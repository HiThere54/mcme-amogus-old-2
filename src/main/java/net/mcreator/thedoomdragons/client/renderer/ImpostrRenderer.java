
package net.mcreator.thedoomdragons.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.thedoomdragons.entity.ImpostrEntity;
import net.mcreator.thedoomdragons.client.model.Modelimpostr;

public class ImpostrRenderer extends MobRenderer<ImpostrEntity, Modelimpostr<ImpostrEntity>> {
	public ImpostrRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelimpostr(context.bakeLayer(Modelimpostr.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ImpostrEntity entity) {
		return new ResourceLocation("the_doom_dragons:textures/imp.png");
	}
}
