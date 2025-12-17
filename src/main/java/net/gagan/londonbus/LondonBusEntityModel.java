package net.gagan.londonbus;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.util.math.MatrixStack;

public class LondonBusEntityModel extends EntityModel<EntityRenderState> {

  private final ModelPart base;

  public LondonBusEntityModel(ModelPart part) {
    super(part);
    this.base = part.getChild("main");
  }

  public static TexturedModelData getTexturedModelData() {
    ModelData data = new ModelData();
    ModelPartData partData = data.getRoot();
    partData.addChild("main", ModelPartBuilder.create()
        .uv(0, 0)
        .cuboid(0f, 0f, 0f, 48f, 64f, 112f),
        ModelTransform.origin(0f, 0f, 0f));

    return TexturedModelData.of(data, 256, 256);
  }

  public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
    // Render the main part
    base.render(matrices, vertices, light, overlay);
  }
}
