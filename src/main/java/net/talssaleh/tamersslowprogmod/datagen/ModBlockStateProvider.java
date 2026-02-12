package net.talssaleh.tamersslowprogmod.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.talssaleh.tamersslowprogmod.TamersSlowProgressionMod;
import net.talssaleh.tamersslowprogmod.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, TamersSlowProgressionMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (DeferredBlock<?> block : ModBlocks.getAllBlocks()) {
            this.blockWithItem(block);
        }
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        this.simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
