package world.vanillyn;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;

import world.vanillyn.entity.Bangboo.*;
import world.vanillyn.entity.RapidEyes.RadioBox;
import world.vanillyn.render.Model.Bangboo.BangbooModel;
import world.vanillyn.render.Model.RapidEyes.RadioModel;
import world.vanillyn.render.Renderer.BangbooRenderer;
import world.vanillyn.render.Renderer.RadioRenderer;

import static world.vanillyn.entity.MeowEntities.*;


@Environment(EnvType.CLIENT)
public class MeowClient implements ClientModInitializer {
	public static final EntityModelLayer MODEL_BANGBOO_LAYER = new EntityModelLayer(Meow.id("blankboo"), "main");
	public static final EntityModelLayer RADIO_MODEL = new EntityModelLayer(Meow.id("radio"), "main");
	@Override
	public void onInitializeClient() {
		FabricDefaultAttributeRegistry.register(BANGBOO_BLANKBOO, Bangboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_BLANKBOO, BangbooRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(MODEL_BANGBOO_LAYER, BangbooModel::getTexturedModelData);

		FabricDefaultAttributeRegistry.register(BANGBOO_EOUS, Eous.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_EOUS, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_BAGBOO, Bagboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_BAGBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_SHARKBOO, Sharkboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_SHARKBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_EXPLOREBOO, Exploreboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_EXPLOREBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_AMILLION, Amillion.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_AMILLION, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_MAGNETIBOO, Magnetiboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_MAGNETIBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_LUCKYBOO, Luckyboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_LUCKYBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(RADIO_BOX, RadioBox.createMobAttributes());
		EntityRendererRegistry.register(RADIO_BOX, RadioRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(RADIO_MODEL, RadioModel::getTexturedModelData);
	}
}