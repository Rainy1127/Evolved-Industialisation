package net.indevo.evolved_industrialisation.item;

import net.indevo.evolved_industrialisation.Evolved_Industrialisation;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Evolved_Industrialisation.MOD_ID);

    public static final RegistryObject<Item> METAL_MOLD_TEMPLATE = ITEMS.register("metal_mold_template",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_MOLD_PLATE = ITEMS.register("metal_mold_plate",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_MOLD_ROD = ITEMS.register("metal_mold_rod",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_MOLD_GEAR = ITEMS.register("metal_mold_gear",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_MOLD_WIRE = ITEMS.register("metal_mold_wire",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_MOLD_BULLET = ITEMS.register("metal_mold_bullet",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_MOLD_PACKING = ITEMS.register("metal_mold_packing",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_MOLD_UNPACKING = ITEMS.register("metal_mold_unpacking",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_MOLD_COIN = ITEMS.register("metal_mold_coin",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_MOLD_INGOT = ITEMS.register("metal_mold_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> METAL_MOLD_NUGGET = ITEMS.register("metal_mold_nugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
