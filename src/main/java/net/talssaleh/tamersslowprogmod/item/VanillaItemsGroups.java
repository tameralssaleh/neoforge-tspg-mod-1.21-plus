package net.talssaleh.tamersslowprogmod.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

import java.util.List;

public class VanillaItemsGroups {
    public static class Tools {
        public static final List<Item> axes = List.of(
                Items.WOODEN_AXE,
                Items.STONE_AXE,
                Items.IRON_AXE,
                Items.GOLDEN_AXE,
                Items.DIAMOND_AXE,
                Items.NETHERITE_AXE
        );
    }
}
