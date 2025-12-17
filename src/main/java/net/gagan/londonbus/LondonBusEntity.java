package net.gagan.londonbus;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jspecify.annotations.Nullable;

public class LondonBusEntity extends AbstractHorseEntity {
  protected LondonBusEntity(EntityType<? extends AbstractHorseEntity> entityType, World world) {
    super(entityType, world);
  }

  @Override
  public ActionResult interactMob(PlayerEntity player, Hand hand) {
    bondWithPlayer(player);
    return super.interactMob(player, hand);
  }

  @Override
  public @Nullable LivingEntity getControllingPassenger() {
    Entity var2 = this.getFirstPassenger();
    if (var2 instanceof PlayerEntity) {
      PlayerEntity playerEntity = (PlayerEntity)var2;
      return playerEntity;
    }
    return super.getControllingPassenger();
  }

  @Override
  protected void initGoals() {}
}
