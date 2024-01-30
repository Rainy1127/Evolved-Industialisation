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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
