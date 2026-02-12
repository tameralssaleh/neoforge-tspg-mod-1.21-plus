package net.talssaleh.tamersslowprogmod.event;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.talssaleh.tamersslowprogmod.TamersSlowProgressionMod;
import net.talssaleh.tamersslowprogmod.item.ModItems;

@EventBusSubscriber(modid = TamersSlowProgressionMod.MOD_ID)
public class RightClickBlockEvent {

    private static void handleFlintKnapping(PlayerInteractEvent.RightClickBlock event, Player player, Level level, ItemStack handStack) {

        float roll = level.getRandom().nextFloat();

        if (roll < 0.20f) {
            // 20% chance to drop flint shards.
            ItemStack flintShards = new ItemStack(ModItems.FLINT_SHARD.get(), level.random.nextIntBetweenInclusive(1, 3));
            player.drop(flintShards, false);
            if (!player.isCreative()) {
                handStack.shrink(1);
            }
            event.setCancellationResult(InteractionResult.SUCCESS);
            event.setCanceled(true);
            return;
        }

        if (roll < 0.50f) {
            // 30% drop it breaks and does not drop flint shards
            if (!player.isCreative()) {
                handStack.shrink(1);
            }

            level.playSound(null, player.blockPosition(), SoundEvents.ITEM_BREAK, SoundSource.PLAYERS, 1.0f, 1.0f);
            event.setCancellationResult(InteractionResult.SUCCESS);
            event.setCanceled(true);
        }

        // 50% chance it does nothing.

        level.playSound(null, player.blockPosition(), SoundEvents.STONE_HIT, SoundSource.PLAYERS, 1.0f, 1.0f);
    }

    @SubscribeEvent
    public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        if (level.isClientSide()) return; // Only run on server side.
        if (event.getHand() != InteractionHand.MAIN_HAND) return;

        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);

        Player player = event.getEntity();
        ItemStack handStack = player.getItemInHand(event.getHand());

        if ((state.is(Blocks.STONE) || state.is(Blocks.DEEPSLATE)) && handStack.getItem() == Items.FLINT) {
            handleFlintKnapping(event, player, level, handStack);
        }
    }
}
