package net.gagan.londonbus;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LondonBus implements ModInitializer {
	public static final String MOD_ID = "london-bus";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final EntityModelLayer MODEL_BUS_LAYER = new EntityModelLayer(Identifier.of("london-bus", "bus"), "main");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
		ModEntities.registerEntities();
		FabricDefaultAttributeRegistry.register(ModEntities.BUS, LondonBusEntity.createBaseHorseAttributes());
		EntityRendererRegistry.register(ModEntities.BUS, LondonBusEntityRenderer::new);
		EntityModelLayerRegistry.registerModelLayer(MODEL_BUS_LAYER, LondonBusEntityModel::getTexturedModelData);
	}
}