package world.vanillyn.render.Renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import world.vanillyn.Meow;
import world.vanillyn.MeowClient;
import world.vanillyn.entity.Bangboo.Blankboo;
import world.vanillyn.render.Model.Bangboo.BlankbooModel;

public class BangbooRenderer extends MobEntityRenderer<Blankboo, BlankbooModel> {

    public BangbooRenderer(EntityRendererFactory.Context context) {
        super(context, new BlankbooModel(context.getPart(MeowClient.MODEL_BANGBOO_LAYER)), 1f);
    }

    @Override
    public Identifier getTexture(Blankboo entity) {
        return Meow.id("textures/entity/bangboo/blankboo/blankboo.png");
    }
}