package net.gagan.londonbus;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.util.Identifier;

public class LondonBusEntityRenderer extends MobEntityRenderer<LondonBusEntity, LivingEntityRenderState, LondonBusEntityModel> {
  public LondonBusEntityRenderer(EntityRendererFactory.Context context) {
    super(context, new LondonBusEntityModel(context.getPart(LondonBus.MODEL_BUS_LAYER)), 0.5f);
  }

  @Override
  public LivingEntityRenderState createRenderState() {
    return new LivingEntityRenderState();
  }

  @Override
  public Identifier getTexture(LivingEntityRenderState state) {
    return Identifier.of("london-bus", "bus.png");
  }
}
