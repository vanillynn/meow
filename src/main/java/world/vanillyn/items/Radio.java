package world.vanillyn.items;

import net.minecraft.block.Block;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.*;

import static world.vanillyn.items.RadioMessage.radio_message;


public class Radio extends Item {
    public Radio(Settings settings){
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (world.isClient) {
            return TypedActionResult.pass(user.getStackInHand(hand));
        }

        Random random = new Random();
        int index = random.nextInt(radio_message.length);
        String radio = radio_message[index];

        user.sendMessage(Text.literal(radio));

        user.addStatusEffect((new StatusEffectInstance(StatusEffects.DARKNESS, 2 * 20, 6)));
        user.addStatusEffect((new StatusEffectInstance(StatusEffects.SLOWNESS, 2 * 20, 6)));
        user.addStatusEffect((new StatusEffectInstance(StatusEffects.REGENERATION, 3 * 20, 6)));

        return TypedActionResult.success(user.getStackInHand(hand));
    }
}
