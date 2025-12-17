package net.gagan.londonbus;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.AbstractHorseEntity;
import net.minecraft.world.World;

public class LondonBusEntity extends AbstractHorseEntity {
  protected LondonBusEntity(EntityType<? extends AbstractHorseEntity> entityType, World world) {
    super(entityType, world);
  }
}
