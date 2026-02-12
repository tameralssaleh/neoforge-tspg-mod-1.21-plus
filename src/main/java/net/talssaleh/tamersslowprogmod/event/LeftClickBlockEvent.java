package net.talssaleh.tamersslowprogmod.event;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.talssaleh.tamersslowprogmod.TamersSlowProgressionMod;
import net.talssaleh.tamersslowprogmod.block.VanillaBlockGroups;
import net.talssaleh.tamersslowprogmod.item.ModItems;
import net.talssaleh.tamersslowprogmod.item.VanillaItemsGroups;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = TamersSlowProgressionMod.MOD_ID)
public class LeftClickBlockEvent {

    public static void handleWoodBasedBlockBreaking(PlayerInteractEvent.LeftClickBlock event, Player player, BlockState state, ItemStack handStack) {
        if (player.isCreative()) return;
        List<Item> allowedAxes = new ArrayList<>(VanillaItemsGroups.Tools.axes);
        allowedAxes.add(ModItems.FLINT_AXE.get());
        if (!allowedAxes.contains(handStack.getItem())) {
            event.setCanceled(true);
            player.displayClientMessage(Component.literal("You need an axe to chop trees or break wooden blocks"), true);
            return;
        }
    }

    @SubscribeEvent
    public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
        Level level = event.getLevel();
        if (level.isClientSide()) return; // Only run on server side.
        if (event.getHand() != InteractionHand.MAIN_HAND) return;

        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        Player player = event.getEntity();
        ItemStack handStack = player.getItemInHand(event.getHand());

        if (VanillaBlockGroups.WoodBasedBlocks.contains(state.getBlock())) {
            // Check if the block being broken is a wood based block (i.e. logs, doors, stairs, etc.)
            handleWoodBasedBlockBreaking(event, player, state, handStack);
        }
    }
}
