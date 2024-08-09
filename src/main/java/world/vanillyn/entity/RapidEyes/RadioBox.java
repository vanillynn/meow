package world.vanillyn.entity.RapidEyes;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

import java.util.Random;

import static world.vanillyn.items.RadioMessage.radio_message;

public class RadioBox extends PathAwareEntity {
    public RadioBox(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    public ActionResult interactMob(World world, PlayerEntity user) {
        if (!world.isClient) {
            Random random = new Random();
            int index = random.nextInt(radio_message.length);
            String radio = radio_message[index];

            user.sendMessage(Text.literal(radio));
        }
        return ActionResult.PASS;
    }

}
