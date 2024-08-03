package world.vanillyn.items;

import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

public class MeowMaterial implements ToolMaterial{
    @Override
    public int getDurability() {
        return 600;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0f;
    }

    @Override
    public float getAttackDamage() {
        return 1.2f;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return null;
    }

    @Override
    public int getEnchantability() {
        return 24;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(MeowItems.MEOW_SUBSTANCE, MeowItems.MEOW_INGOT);
    }
    public static final MeowMaterial INSTANCE = new MeowMaterial();
}