package net.talssaleh.tamersslowprogmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.talssaleh.tamersslowprogmod.TamersSlowProgressionMod;
import net.talssaleh.tamersslowprogmod.item.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, TamersSlowProgressionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS).add(ModItems.FLINT_SWORD.get());
        tag(ItemTags.PICKAXES).add(ModItems.FLINT_PICKAXE.get());
        tag(ItemTags.AXES).add(ModItems.FLINT_AXE.get());
        tag(ItemTags.SHOVELS).add(ModItems.FLINT_SHOVEL.get());
        tag(ItemTags.HOES).add(ModItems.FLINT_HOE.get());
    }
}
