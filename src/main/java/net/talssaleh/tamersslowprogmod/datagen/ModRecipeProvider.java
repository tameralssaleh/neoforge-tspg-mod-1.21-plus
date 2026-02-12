package net.talssaleh.tamersslowprogmod.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.talssaleh.tamersslowprogmod.block.ModBlocks;
import net.talssaleh.tamersslowprogmod.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        // Misc Items

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.PLANT_STRING.get())
                .pattern("FF")
                .pattern("FF")
                .define('F', ModItems.PLANT_FIBERS.get())
                .unlockedBy("has_plant_fibers", has(ModItems.PLANT_FIBERS)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_AXE_HEAD.get())
                .pattern("FF")
                .pattern(" F")
                .define('F', ModItems.FLINT_SHARD)
                .unlockedBy("has_flint_shard", has(ModItems.FLINT_SHARD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_PICKAXE_HEAD.get())
                .pattern("FFF")
                .define('F', ModItems.FLINT_SHARD)
                .unlockedBy("has_flint_shard", has(ModItems.FLINT_SHARD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_SWORD_BLADE.get())
                .pattern("F")
                .pattern("F")
                .define('F', ModItems.FLINT_SHARD)
                .unlockedBy("has_flint_shard", has(ModItems.FLINT_SHARD)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FLINT_SHOVEL_HEAD.get())
                .requires(ModItems.FLINT_SHARD)
                .unlockedBy("has_flint_shard", has(ModItems.FLINT_SHARD)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_HOE_BLADE.get())
                .pattern("FF")
                .define('F', ModItems.FLINT_SHARD)
                .unlockedBy("has_flint_shard", has(ModItems.FLINT_SHARD)).save(recipeOutput);

        // Tools, Weapons, & Armor

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_PICKAXE.get())
                .pattern("FP")
                .pattern("S ")
                .define('F', ModItems.FLINT_PICKAXE_HEAD)
                .define('P', ModItems.PLANT_STRING)
                .define('S', Items.STICK)
                .unlockedBy("has_plant_string", has(ModItems.PLANT_STRING)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_AXE.get())
                .pattern("FP")
                .pattern("S ")
                .define('F', ModItems.FLINT_AXE_HEAD)
                .define('P', ModItems.PLANT_STRING)
                .define('S', Items.STICK)
                .unlockedBy("has_plant_string", has(ModItems.PLANT_STRING)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_SWORD.get())
                .pattern("FP")
                .pattern("S ")
                .define('F', ModItems.FLINT_SWORD_BLADE)
                .define('P', ModItems.PLANT_STRING)
                .define('S', Items.STICK)
                .unlockedBy("has_plant_string", has(ModItems.PLANT_STRING)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_SHOVEL.get())
                .pattern("FP")
                .pattern("S ")
                .define('F', ModItems.FLINT_SHOVEL_HEAD)
                .define('P', ModItems.PLANT_STRING)
                .define('S', Items.STICK)
                .unlockedBy("has_plant_string", has(ModItems.PLANT_STRING)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_HOE.get())
                .pattern("FP")
                .pattern("S ")
                .define('F', ModItems.FLINT_HOE_BLADE)
                .define('P', ModItems.PLANT_STRING)
                .define('S', Items.STICK)
                .unlockedBy("has_plant_string", has(ModItems.PLANT_STRING)).save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_PICKAXE.get())
                .pattern("FP")
                .pattern("S ")
                .define('F', ModItems.FLINT_PICKAXE_HEAD)
                .define('P', Items.STRING)
                .define('S', Items.STICK)
                .unlockedBy("has_plant_string", has(ModItems.PLANT_STRING)).save(recipeOutput, "tamerssurvivalmod:flint_pickaxe_from_string");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_AXE.get())
                .pattern("FP")
                .pattern("S ")
                .define('F', ModItems.FLINT_AXE_HEAD)
                .define('P', Items.STRING)
                .define('S', Items.STICK)
                .unlockedBy("has_plant_string", has(ModItems.PLANT_STRING)).save(recipeOutput, "tamerssurvivalmod:flint_axe_from_string");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_SWORD.get())
                .pattern("FP")
                .pattern("S ")
                .define('F', ModItems.FLINT_SWORD_BLADE)
                .define('P', Items.STRING)
                .define('S', Items.STICK)
                .unlockedBy("has_plant_string", has(ModItems.PLANT_STRING)).save(recipeOutput, "tamerssurvivalmod:flint_sword_from_string");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_SHOVEL.get())
                .pattern("FP")
                .pattern("S ")
                .define('F', ModItems.FLINT_SHOVEL_HEAD)
                .define('P', Items.STRING)
                .define('S', Items.STICK)
                .unlockedBy("has_plant_string", has(ModItems.PLANT_STRING)).save(recipeOutput, "tamerssurvivalmod:flint_shovel_from_string");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.FLINT_HOE.get())
                .pattern("FP")
                .pattern("S ")
                .define('F', ModItems.FLINT_HOE_BLADE)
                .define('P', Items.STRING)
                .define('S', Items.STICK)
                .unlockedBy("has_plant_string", has(ModItems.PLANT_STRING)).save(recipeOutput, "tamerssurvivalmod:flint_hoe_from_string");
    }
}
