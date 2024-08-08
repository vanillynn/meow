package world.vanillyn;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

import world.vanillyn.entity.RapidEyes.RadioBox;
import world.vanillyn.render.Model.Bangboo.BlankbooModel;
import world.vanillyn.render.Model.RapidEyes.RadioModel;
import world.vanillyn.render.Renderer.BangbooRenderer;
import world.vanillyn.render.Renderer.RadioRenderer;
import world.vanillyn.entity.Bangboo.Blankboo;

import static world.vanillyn.entity.MeowEntities.BANGBOO_BLANKBOO;
import static world.vanillyn.entity.MeowEntities.RADIO_BOX;


@Environment(EnvType.CLIENT)
public class MeowClient implements ClientModInitializer {
	public static final EntityModelLayer MODEL_BANGBOO_LAYER = new EntityModelLayer(Meow.id("bangboo_blankboo"), "main");
	public static final EntityModelLayer RADIO_MODEL = new EntityModelLayer(Meow.id("radio"), "main");
	@Override
	public void onInitializeClient() {
		FabricDefaultAttributeRegistry.register(BANGBOO_BLANKBOO, Blankboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_BLANKBOO, BangbooRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(MODEL_BANGBOO_LAYER, BlankbooModel::getTexturedModelData);

		FabricDefaultAttributeRegistry.register(RADIO_BOX, RadioBox.createMobAttributes());
		EntityRendererRegistry.register(RADIO_BOX, RadioRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(RADIO_MODEL, RadioModel::getTexturedModelData);
	}
}