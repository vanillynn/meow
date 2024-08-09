package world.vanillyn.entity.Bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import world.vanillyn.Meow;


public class Magnetiboo extends Bangboo {
    public Magnetiboo(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // this.goalSelector.add(1, new MeowEntities.FollowPlayerGoal(this, 1.0D)); // 1.0D is the speed; adjust as necessary
        // Add other goals if necessary
    }


    public Identifier getCustomTexture() {
        return Meow.id("textures/entity/bangboo/magnetiboo/magnetiboo.png");
    }
}
