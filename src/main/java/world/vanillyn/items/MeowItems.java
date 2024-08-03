package world.vanillyn.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


import static world.vanillyn.Meow.MOD_ID;
import static world.vanillyn.Meow.LOGGER;

public class MeowItems {
    public static final RegistryKey<ItemGroup> MEOW_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(MOD_ID, "item_group"));
    public static final ItemGroup MEOW_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(MeowItems.MEOW_SWORD))
            .displayName(Text.translatable("item_group.meow"))
            .build();
    public static <T extends Item> T register(T item, String id){
        // Create the identifier for the item.
        Identifier itemID = Identifier.of(MOD_ID, id);

        ItemGroupEvents.modifyEntriesEvent(MEOW_GROUP_KEY).register(itemGroup -> itemGroup.add(item));

        return Registry.register(Registries.ITEM, itemID, item);
    }
    public static void initialize() {
        LOGGER.info("Items initialized!");

    }

    // meow needle
    public static final Item NEEDLE = register(new Needle(new Item.Settings().maxCount(32)  ), "needle");
    public static final Item MEOW_SUBSTANCE = register(new MeowSubstance(new Item.Settings()), "meow_substance");
    public static final Item DRELIUM = register(new Drelium(new Item.Settings()), "drelium");
    public static final Item EMPTY_NEEDLE = register(new EmptyNeedle(new Item.Settings()), "empty_needle");

    // Tools and Material
    public static final Item MEOW_INGOT = register(new MeowIngot(new Item.Settings()), "meow_ingot");
    public static final Item MEOW_SWORD = register(new SwordItem(MeowMaterial.INSTANCE, new Item.Settings()), "meow_sword");
    public static final Item MEOW_PICKAXE = register(new PickaxeItem(MeowMaterial.INSTANCE, new Item.Settings()), "meow_pickaxe");
    public static final Item MEOW_SHOVEL = register(new ShovelItem(MeowMaterial.INSTANCE, new Item.Settings()), "meow_shovel");
    public static final Item MEOW_AXE = register(new AxeItem(MeowMaterial.INSTANCE, new Item.Settings()), "meow_axe");



}
