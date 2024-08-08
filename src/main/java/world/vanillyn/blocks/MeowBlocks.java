package world.vanillyn.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import world.vanillyn.Meow;

import static world.vanillyn.Meow.LOGGER;

public class MeowBlocks {
    public static Block register(Block block, String name, boolean regItem) {

        if (regItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, Meow.id(name), blockItem);
        }

        return Registry.register(Registries.BLOCK, Meow.id(name), block);
    }
    public static void initialize() {
        LOGGER.info("Blocks initialized!");
    }
    public static final Block MEOW_ORE = register(
            new Block(AbstractBlock.Settings.create().hardness(7).sounds(BlockSoundGroup.STONE)),
            "meow_ore",
            true
    );

    public static final Block DEEPSLATE_MEOW_ORE = register(
            new Block(AbstractBlock.Settings.create().hardness(9).sounds(BlockSoundGroup.DEEPSLATE)),
            "deepslate_meow_ore",
            true
    );
    public static final Block PSYCH_ORB = register(
            new PsychOrb(AbstractBlock.Settings.create().hardness(100)),
            "psych_orb",
            true
    );
}
