package world.vanillyn.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundCategory;

public class PsychOrb extends Block {
    public PsychOrb(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {
            player.teleport(pos.getX() + (world.random.nextDouble() - 0.5) * 10, pos.getY() + (world.random.nextDouble() - 0.5) * 10, pos.getZ() + (world.random.nextDouble() - 0.5) * 10, true);
            world.playSound(null, pos, SoundEvents.ITEM_CHORUS_FRUIT_TELEPORT, SoundCategory.BLOCKS, 1.0F, 1.0F);
            player.getItemCooldownManager().set(this.asItem(), 20);
        }
        return ActionResult.SUCCESS;
    }
}
