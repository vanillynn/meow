package world.vanillyn.render.Renderer;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import world.vanillyn.Meow;
import world.vanillyn.MeowClient;
import world.vanillyn.entity.RapidEyes.RadioBox;
import world.vanillyn.render.Model.RapidEyes.RadioModel;

public class RadioRenderer extends MobEntityRenderer<RadioBox, RadioModel> {

    public RadioRenderer(EntityRendererFactory.Context context) {
        super(context, new RadioModel(context.getPart(MeowClient.RADIO_MODEL)), 1f);
    }

    @Override
    public Identifier getTexture(RadioBox entity) {
        return Meow.id("textures/entity/rapideyes/radio.png");
    }
}