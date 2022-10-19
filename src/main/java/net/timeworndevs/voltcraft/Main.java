package net.timeworndevs.voltcraft;

import net.fabricmc.api.ModInitializer;
import net.timeworndevs.voltcraft.registry.BlockEntities;
import net.timeworndevs.voltcraft.registry.Common;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "voltcraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Common.register();
		BlockEntities.register();
	}
}
