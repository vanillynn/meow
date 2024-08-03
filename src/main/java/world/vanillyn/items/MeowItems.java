package world.vanillyn.items;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static world.vanillyn.Meow.MOD_ID;
import static world.vanillyn.Meow.LOGGER;

public class MeowItems {

    public static <T extends Item> T register(T item, String id, RegistryKey<ItemGroup> group){
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(MOD_ID, id);

        ItemGroupEvents.modifyEntriesEvent(group).register(itemGroup -> itemGroup.add(item));

        return Registry.register(Registries.ITEM, itemID, item);
    }
    public static void initialize() {
        LOGGER.info("Items initialized!");
    }

    // meow needle
    public static final Item NEEDLE = register(new Needle(new Item.Settings().maxCount(32)  ), "needle", ItemGroups.TOOLS);
    public static final Item MEOW_SUBSTANCE = register(new MeowSubstance(new Item.Settings()), "meow_substance", ItemGroups.INGREDIENTS);
    public static final Item DRELIUM = register(new Drelium(new Item.Settings()), "drelium", ItemGroups.INGREDIENTS);
    public static final Item EMPTY_NEEDLE = register(new EmptyNeedle(new Item.Settings()), "empty_needle", ItemGroups.INGREDIENTS);


    // Tools and Material
    public static final Item MEOW_INGOT = register(new MeowIngot(new Item.Settings()), "meow_ingot", ItemGroups.INGREDIENTS);
    public static final Item MEOW_SWORD = register(new SwordItem(MeowMaterial.MEOW_MATERIAL, new Item.Settings()), "meow_sword", ItemGroups.COMBAT);
    public static final Item MEOW_PICKAXE = register(new PickaxeItem(MeowMaterial.MEOW_MATERIAL, new Item.Settings()), "meow_pickaxe", ItemGroups.TOOLS);



}
