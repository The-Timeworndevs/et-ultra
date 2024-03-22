package net.timeworndevs.et_ultra;

import net.fabricmc.api.ModInitializer;

import net.timeworndevs.et_ultra.common.CommonBlockRegistry;
import net.timeworndevs.et_ultra.common.CommonItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MODID = "et_ultra";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		CommonBlockRegistry.register();
		CommonItemRegistry.register();
		LOGGER.info("Hello Fabric world!");
	}
}