package world.vanillyn;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import world.vanillyn.blocks.MeowBlocks;
import world.vanillyn.entity.MeowEntities;
import world.vanillyn.items.MeowItems;
import net.minecraft.util.Identifier;

public class Meow implements ModInitializer {
	public static final String MOD_ID = "meow";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		MeowItems.initialize();
		MeowBlocks.initialize();
		MeowEntities.initialize();


	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}