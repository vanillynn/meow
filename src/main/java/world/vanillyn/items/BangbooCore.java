package world.vanillyn.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;


public class BangbooCore extends Item {
    private final EntityType<?> entityType;

    public BangbooCore(Settings settings, EntityType<?> entityType) {
        super(settings);
        this.entityType = entityType;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if (!world.isClient) {
            BlockPos pos = context.getBlockPos().offset(context.getSide());

            entityType.spawnFromItemStack((ServerWorld) world, context.getStack(), context.getPlayer(), pos, SpawnReason.SPAWN_EGG, true, true);
            world.playSound(null, pos, SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            context.getStack().decrement(1); // Decrease the item stack by one
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}