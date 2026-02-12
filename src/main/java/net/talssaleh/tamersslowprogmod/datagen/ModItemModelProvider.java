package net.talssaleh.tamersslowprogmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.talssaleh.tamersslowprogmod.TamersSlowProgressionMod;
import net.talssaleh.tamersslowprogmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TamersSlowProgressionMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (DeferredItem<?> item : ModItems.ALL_ITEMS) {
            basicItem(item.get());
        }
        for (DeferredItem<?> item : ModItems.TOOLS_AND_WEAPONS) {
            handheldItem(item);
        }
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(TamersSlowProgressionMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
