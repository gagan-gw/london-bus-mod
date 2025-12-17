package net.gagan.londonbus;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntities {
  public static final EntityType<LondonBusEntity> BUS = Registry.register(
      Registries.ENTITY_TYPE,
      Identifier.of("london-bus", "bus"),
      EntityType.Builder
          .create(LondonBusEntity::new, SpawnGroup.CREATURE)
          .dimensions(3.0f, 4.0f).build(
              RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of("london-bus", "bus"))
          )
  );

  public static void registerEntities() {
    LondonBus.LOGGER.info("registering london bus entities");
  }
}
