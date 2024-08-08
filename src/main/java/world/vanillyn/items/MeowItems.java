package world.vanillyn.items;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import world.vanillyn.Meow;

import static world.vanillyn.Meow.LOGGER;

public class MeowItems {

    public static <T extends Item> T register(T item, String id, RegistryKey<ItemGroup> group){

        ItemGroupEvents.modifyEntriesEvent(group).register(itemGroup -> itemGroup.add(item));
        return Registry.register(Registries.ITEM, Meow.id(id), item);

    }

    public static void initialize() {

        LOGGER.info("Items initialized!");

    }

    // Needle
    public static final Item NEEDLE = register(new Needle(new Item.Settings().maxCount(32)  ), "needle", ItemGroups.TOOLS);
    public static final Item MEOW_SUBSTANCE = register(new MeowSubstance(new Item.Settings()), "meow_substance", ItemGroups.INGREDIENTS);
    public static final Item DRELIUM = register(new Drelium(new Item.Settings()), "drelium", ItemGroups.INGREDIENTS);
    public static final Item EMPTY_NEEDLE = register(new EmptyNeedle(new Item.Settings()), "empty_needle", ItemGroups.INGREDIENTS);


    // Meow Tools
    public static final Item MEOW_INGOT = register(new MeowIngot(new Item.Settings()), "meow_ingot", ItemGroups.INGREDIENTS);
    public static final Item MEOW_SWORD = register(new SwordItem(MeowTools.MEOW_MATERIAL, new Item.Settings()), "meow_sword", ItemGroups.COMBAT);
    public static final Item MEOW_PICKAXE = register(new PickaxeItem(MeowTools.MEOW_MATERIAL, new Item.Settings()), "meow_pickaxe", ItemGroups.TOOLS);
    public static final Item MEOW_AXE = register(new AxeItem(MeowTools.MEOW_MATERIAL, new Item.Settings()), "meow_axe", ItemGroups.TOOLS);
    public static final Item MEOW_SHOVEL = register(new ShovelItem(MeowTools.MEOW_MATERIAL, new Item.Settings()), "meow_shovel", ItemGroups.TOOLS);

    // Rapid Eyes
    public static final Item RADIO = register(new Radio (new Item.Settings()), "radio", ItemGroups.TOOLS);


}
