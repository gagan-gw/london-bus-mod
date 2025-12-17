package net.gagan.londonbus;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.VehicleEntity;
import net.minecraft.item.Item;
import net.minecraft.storage.ReadView;
import net.minecraft.storage.WriteView;
import net.minecraft.world.World;

public class LondonBusEntity extends VehicleEntity {

  public LondonBusEntity(EntityType<?> entityType, World world) {
    super(entityType, world);
  }

  @Override
  protected Item asItem() {
    return null;
  }

  @Override
  protected void readCustomData(ReadView view) {

  }

  @Override
  protected void writeCustomData(WriteView view) {

  }
}
