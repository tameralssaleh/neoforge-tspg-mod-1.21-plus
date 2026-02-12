package net.talssaleh.tamersslowprogmod.block;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;

public class OreDrop {
    public final DeferredBlock<?> ore;
    public final Supplier<Item> drop;

    public OreDrop(DeferredBlock<?> ore, Supplier<Item> drop) {
        this.ore = ore;
        this.drop = drop;
    }
}