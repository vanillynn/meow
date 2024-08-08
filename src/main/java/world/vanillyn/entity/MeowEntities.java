package world.vanillyn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import world.vanillyn.Meow;
import world.vanillyn.entity.Bangboo.Blankboo;
import world.vanillyn.entity.RapidEyes.RadioBox;

import static net.minecraft.registry.Registries.ENTITY_TYPE;
import static world.vanillyn.Meow.LOGGER;


public class MeowEntities {
    public static final EntityType<Blankboo> BANGBOO_BLANKBOO = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("bangboo_blankboo"),
            EntityType.Builder.create(Blankboo::new, SpawnGroup.MISC)
                    .dimensions(1F, 1F) // Adjust dimensions as necessary
                    .build("bangboo_blankboo")
    );
    public static final EntityType<RadioBox> RADIO_BOX = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("radio_box"),
            EntityType.Builder.create(RadioBox::new, SpawnGroup.MISC)
                    .dimensions(.5F, 1F) // Adjust dimensions as necessary
                    .build("radio_box")
    );

    public static void initialize() {
        LOGGER.info("Mobs initialized!");
    }



}