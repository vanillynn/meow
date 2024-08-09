package world.vanillyn.entity.Bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import world.vanillyn.Meow;
import world.vanillyn.items.MeowItems;

public class Bangboo extends PathAwareEntity {
    public Bangboo(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    public ActionResult interactMob(World world, PlayerEntity player, Hand hand) {
        if (!world.isClient) {
            ItemStack stack = new ItemStack(MeowItems.BANGBOO_CORE_EOUS); // Replace with your custom item
            if (!player.getInventory().insertStack(stack)) {
                player.dropItem(stack, false);
            }
            this.remove(RemovalReason.DISCARDED);
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }

    public Identifier getCustomTexture() {
        return Meow.id("textures/entity/bangboo/blankboo/blankboo.png");
    }
}
