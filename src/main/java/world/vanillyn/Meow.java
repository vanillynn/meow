package world.vanillyn;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import world.vanillyn.items.MeowItems;

public class Meow implements ModInitializer {
	public static final String MOD_ID = "meow";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		MeowItems.initialize();
		LOGGER.info("Hello Fabric world!");

	}
}