package world.vanillyn.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static world.vanillyn.Meow.LOGGER;
import static world.vanillyn.Meow.MOD_ID;

public class MeowBlocks {
    public static Block register(Block block, String name, boolean shouldRegisterItem) {
        // Register the block and its item.
        Identifier id = Identifier.of(MOD_ID, name);

        // Sometimes, you may not want to register an item for the block.
        // Eg: if it's a technical block like `minecraft:air` or `minecraft:end_gateway`
        if (shouldRegisterItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, id, blockItem);
        }

        return Registry.register(Registries.BLOCK, id, block);
    }
    public static void initialize() {
        LOGGER.info("Blocks initialized!");
    }
    public static final Block MEOW_ORE = register(
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.STONE)),
            "meow_ore",
            true
    );
    public static final Block DEEPSLATE_MEOW_ORE = register(
            new Block(AbstractBlock.Settings.create().sounds(BlockSoundGroup.DEEPSLATE)),
            "deepslae_meow_ore",
            true
    );
}
