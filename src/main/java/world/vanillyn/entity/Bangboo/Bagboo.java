package world.vanillyn.entity.Bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import world.vanillyn.Meow;
import world.vanillyn.entity.MeowEntities;


public class Bagboo extends Bangboo {
    public Bagboo(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // this.goalSelector.add(1, new MeowEntities.FollowPlayerGoal(this, 1.0D)); // 1.0D is the speed; adjust as necessary
        // Add other goals if necessary
    }


    public Identifier getCustomTexture() {
        return Meow.id("textures/entity/bangboo/bagboo/bagboo.png");
    }
}
