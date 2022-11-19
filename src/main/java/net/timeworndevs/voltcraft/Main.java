package net.timeworndevs.voltcraft;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.timeworndevs.voltcraft.registry.BlockEntities;
import net.timeworndevs.voltcraft.registry.Registryhelper;
import net.timeworndevs.voltcraft.screen.PoweredFurnaceScreen;
import net.timeworndevs.voltcraft.screen.VCScreenHandler;
import net.timeworndevs.voltcraft.world.feature.FeatureRegistry;
import net.timeworndevs.voltcraft.world.generation.OreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "voltcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		FeatureRegistry.Register();
		BlockEntities.register();
		VCScreenHandler.register();
		Registryhelper.register();
		OreGeneration.generateOres();
	}
}
