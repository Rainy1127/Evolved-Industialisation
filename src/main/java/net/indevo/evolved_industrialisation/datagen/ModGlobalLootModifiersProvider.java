package net.indevo.evolved_industrialisation.datagen;

import net.indevo.evolved_industrialisation.Evolved_Industrialisation;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.GlobalLootModifierProvider;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {

    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, Evolved_Industrialisation.MOD_ID);
    }

    @Override
    protected void start() {

    }
}
