package world.vanillyn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import world.vanillyn.Meow;
import world.vanillyn.entity.Bangboo.*;
import world.vanillyn.entity.RapidEyes.RadioBox;

import java.util.EnumSet;

import static net.minecraft.registry.Registries.ENTITY_TYPE;
import static world.vanillyn.Meow.LOGGER;


public class MeowEntities {
    public static final EntityType<Bangboo> BANGBOO_BLANKBOO = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("blankboo"),
            EntityType.Builder.create(Bangboo::new, SpawnGroup.MISC)
                    .dimensions(1F, 1F) // Adjust dimensions as necessary
                    .build("blankboo")
    );
    public static final EntityType<Eous> BANGBOO_EOUS = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("bangboo_eous"),
            EntityType.Builder.create(Eous::new, SpawnGroup.MISC)
                    .dimensions(1F, 1F) // Adjust dimensions as necessary
                    .build("bangboo_eous")
    );
    public static final EntityType<Bagboo> BANGBOO_BAGBOO = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("bangboo_bagboo"),
            EntityType.Builder.create(Bagboo::new, SpawnGroup.MISC)
                    .dimensions(1F, 1F) // Adjust dimensions as necessary
                    .build("bangboo_bagboo")
    );
    public static final EntityType<Sharkboo> BANGBOO_SHARKBOO = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("bangboo_sharkboo"),
            EntityType.Builder.create(Sharkboo::new, SpawnGroup.MISC)
                    .dimensions(1F, 1F) // Adjust dimensions as necessary
                    .build("bangboo_sharkboo")
    );
    public static final EntityType<Magnetiboo> BANGBOO_MAGNETIBOO = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("bangboo_magnetiboo"),
            EntityType.Builder.create(Magnetiboo::new, SpawnGroup.MISC)
                    .dimensions(1F, 1F) // Adjust dimensions as necessary
                    .build("bangboo_magnetiboo")
    );
    public static final EntityType<Luckyboo> BANGBOO_LUCKYBOO = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("bangboo_luckyboo"),
            EntityType.Builder.create(Luckyboo::new, SpawnGroup.MISC)
                    .dimensions(1F, 1F) // Adjust dimensions as necessary
                    .build("bangboo_luckyboo")
    );
    public static final EntityType<Exploreboo> BANGBOO_EXPLOREBOO = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("bangboo_exploreboo"),
            EntityType.Builder.create(Exploreboo::new, SpawnGroup.MISC)
                    .dimensions(1F, 1F) // Adjust dimensions as necessary
                    .build("bangboo_exploreboo")
    );
    public static final EntityType<Amillion> BANGBOO_AMILLION = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("bangboo_amillion"),
            EntityType.Builder.create(Amillion::new, SpawnGroup.MISC)
                    .dimensions(1F, 1F) // Adjust dimensions as necessary
                    .build("bangboo_amillion")
    );
    public static final EntityType<RadioBox> RADIO_BOX = Registry.register(
            Registries.ENTITY_TYPE,
            Meow.id("radio_box"),
            EntityType.Builder.create(RadioBox::new, SpawnGroup.MISC)
                    .dimensions(.5F, 1F) // Adjust dimensions as necessary
                    .build("radio_box")
    );

    public static class FollowPlayerGoal extends Goal {
        private final MobEntity entity;
        private PlayerEntity targetPlayer;
        private final double speed;

        public FollowPlayerGoal(MobEntity entity, double speed) {
            this.entity = entity;
            this.speed = speed;
            this.setControls(EnumSet.of(Goal.Control.MOVE, Goal.Control.LOOK));
        }

        @Override
        public boolean canStart() {
            this.targetPlayer = this.entity.getWorld().getClosestPlayer(this.entity, 10.0D);
            return this.targetPlayer != null;
        }

        @Override
        public boolean shouldContinue() {
            return this.targetPlayer != null && this.targetPlayer.isAlive() && this.entity.squaredDistanceTo(this.targetPlayer) > 2.0D;
        }

        @Override
        public void start() {
            this.entity.getNavigation().startMovingTo(this.targetPlayer, this.speed);
        }

        @Override
        public void stop() {
            this.targetPlayer = null;
            this.entity.getNavigation().stop();
        }

        @Override
        public void tick() {
            this.entity.getLookControl().lookAt(this.targetPlayer, 30.0F, 30.0F);
            this.entity.getNavigation().startMovingTo(this.targetPlayer, this.speed);
        }
    }

    public static void initialize() {
        LOGGER.info("Mobs initialized!");
    }



}