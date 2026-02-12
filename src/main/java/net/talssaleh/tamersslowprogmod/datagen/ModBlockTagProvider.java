package net.talssaleh.tamersslowprogmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.talssaleh.tamersslowprogmod.TamersSlowProgressionMod;
import net.talssaleh.tamersslowprogmod.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, TamersSlowProgressionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        for (DeferredBlock<?> block : ModBlocks.getAllBlocks()) {
            this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block.get());
        }

//        for (DeferredBlock<?> block : ModBlocks.getAllIronToolNeededBlocks()) {
//            this.tag(BlockTags.NEEDS_IRON_TOOL).add(block.get());
//        }
    }
}
