package net.interesting.tutorialmod.item;

import net.interesting.tutorialmod.TutorialMod;
import net.interesting.tutorialmod.block.ModBlocks;
import net.interesting.tutorialmod.block.custom.SoundBlock;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.SAPPHIRE.get()))
                .title(Component.translatable("creativetab.tutorial_tab"))
                .displayItems((itemDisplayParameters, output) -> {
                    output.accept(Moditems.SAPPHIRE.get());
                    output.accept(Moditems.RAW_SAPPHIRE.get());

                    output.accept(Moditems.METAL_DETECTOR.get());

                    output.accept(Items.BELL);

                    output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                    output.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());

                    output.accept(ModBlocks.SAPPHIRE_ORE.get());
                    output.accept(ModBlocks.DEEPSLATE_SAPPHIRE_ORE.get());
                    output.accept(ModBlocks.NETHER_SAPPHIRE_ORE.get());
                    output.accept(ModBlocks.END_STONE_SAPPHIRE_ORE.get());

                    output.accept(ModBlocks.SOUND_BLOCK.get());

                })
                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
