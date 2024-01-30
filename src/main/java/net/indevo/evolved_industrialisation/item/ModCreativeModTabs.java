package net.indevo.evolved_industrialisation.item;

import net.indevo.evolved_industrialisation.Evolved_Industrialisation;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Evolved_Industrialisation.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EVOLVED_INDUSTRIALISATION = CREATIVE_MODE_TABS.register("evolved_industrialisation",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.METAL_MOLD_TEMPLATE.get()))
                    .title(Component.translatable("creativetab.evolved_industrialisation"))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.METAL_MOLD_TEMPLATE.get());
                        pOutput.accept(ModItems.METAL_MOLD_PLATE.get());
                        pOutput.accept(ModItems.METAL_MOLD_ROD.get());
                        pOutput.accept(ModItems.METAL_MOLD_GEAR.get());
                        pOutput.accept(ModItems.METAL_MOLD_WIRE.get());
                        pOutput.accept(ModItems.METAL_MOLD_BULLET.get());
                        pOutput.accept(ModItems.METAL_MOLD_PACKING.get());
                        pOutput.accept(ModItems.METAL_MOLD_UNPACKING.get());
                        pOutput.accept(ModItems.METAL_MOLD_COIN.get());
                        pOutput.accept(ModItems.METAL_MOLD_INGOT.get());
                        pOutput.accept(ModItems.METAL_MOLD_NUGGET.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
