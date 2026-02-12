package net.talssaleh.tamersslowprogmod.item;

import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.talssaleh.tamersslowprogmod.TamersSlowProgressionMod;

import java.util.List;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TamersSlowProgressionMod.MOD_ID);

    // Misc items (i.e. ingredients, etc.)

    public static final DeferredItem<Item> PLANT_FIBERS = ITEMS.register("plant_fibers",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PLANT_STRING = ITEMS.register("plant_string",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLINT_SHARD = ITEMS.register("flint_shard",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLINT_PICKAXE_HEAD = ITEMS.register("flint_pickaxe_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLINT_AXE_HEAD = ITEMS.register("flint_axe_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLINT_SWORD_BLADE = ITEMS.register("flint_sword_blade",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLINT_SHOVEL_HEAD = ITEMS.register("flint_shovel_head",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> FLINT_HOE_BLADE = ITEMS.register("flint_hoe_blade",
            () -> new Item(new Item.Properties()));

    // Tools

    public static final DeferredItem<PickaxeItem> FLINT_PICKAXE = ITEMS.register("flint_pickaxe",
            () -> new PickaxeItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.FLINT, 1.0f, -2.8f))));

    public static final DeferredItem<AxeItem> FLINT_AXE = ITEMS.register("flint_axe",
            () -> new AxeItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.FLINT, 6, -3.2f))));

    public static final DeferredItem<ShovelItem> FLINT_SHOVEL = ITEMS.register("flint_shovel",
            () -> new ShovelItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.FLINT, 1.5f, -3.0f))));

    public static final DeferredItem<HoeItem> FLINT_HOE = ITEMS.register("flint_hoe",
            () -> new HoeItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.FLINT, 0f, -3.0f))));

    // Weapons

    public static final DeferredItem<SwordItem> FLINT_SWORD = ITEMS.register("flint_sword",
            () -> new SwordItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.FLINT, 5, -2.4f))));

    // Knives (Weapon and tool)

    public static final DeferredItem<SwordItem> FLINT_KNIFE = ITEMS.register("flint_knife",
            () -> new SwordItem(ModToolTiers.FLINT, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.FLINT, 3, -2.4f))));

    // // // Items Lists

    // All Items

    public static final List<DeferredItem<Item>> ALL_ITEMS = List.of(
            FLINT_SHARD,
            PLANT_FIBERS,
            PLANT_STRING,
            FLINT_PICKAXE_HEAD,
            FLINT_AXE_HEAD,
            FLINT_SWORD_BLADE,
            FLINT_SHOVEL_HEAD,
            FLINT_HOE_BLADE
    );

    public static final List<DeferredItem<Item>> INGREDIENTS = List.of(
            FLINT_SHARD,
            PLANT_FIBERS,
            PLANT_STRING,
            FLINT_PICKAXE_HEAD,
            FLINT_AXE_HEAD,
            FLINT_SWORD_BLADE,
            FLINT_SHOVEL_HEAD,
            FLINT_HOE_BLADE
    );

    public static final List<DeferredItem<?>> TOOLS_AND_WEAPONS = List.of(
            FLINT_PICKAXE,
            FLINT_AXE,
            FLINT_SHOVEL,
            FLINT_HOE,
            FLINT_SWORD,
            FLINT_KNIFE
    );


    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);

    }

}
