package world.vanillyn.render.Model.RapidEyes;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import world.vanillyn.entity.RapidEyes.RadioBox;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class RadioModel extends EntityModel<RadioBox> {
    private final ModelPart bb_main;
    public RadioModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create().uv(0, 0).cuboid(-5.0F, -4.0F, -1.0F, 10.0F, 4.0F, 2.0F, new Dilation(0.0F))
                .uv(0, 10).cuboid(-4.0F, -5.0F, -1.5F, 8.0F, 2.0F, 2.0F, new Dilation(0.0F))
                .uv(9, 14).cuboid(3.75F, -9.0F, -0.25F, 1.0F, 3.0F, 1.0F, new Dilation(0.0F))
                .uv(0, 14).cuboid(-3.45F, -4.45F, -1.55F, 5.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(0, 6).cuboid(-5.0F, -6.0F, -1.0F, 10.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 24.0F, 0.0F));
        return TexturedModelData.of(modelData, 32, 32);
    }
    @Override
    public void setAngles(RadioBox entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        bb_main.render(matrices, vertices, light, overlay, color);
    }
}