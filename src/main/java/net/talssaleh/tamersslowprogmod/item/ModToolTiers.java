package net.talssaleh.tamersslowprogmod.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.talssaleh.tamersslowprogmod.util.ModTags;

public class ModToolTiers {
    public static final Tier FLINT = new SimpleTier(
            ModTags.Blocks.INCORRECT_FOR_FLINT_TOOL,
            70,
            3,
            1,
            5,
            () -> Ingredient.of(Items.FLINT, ModItems.FLINT_SHARD.get()));
}
