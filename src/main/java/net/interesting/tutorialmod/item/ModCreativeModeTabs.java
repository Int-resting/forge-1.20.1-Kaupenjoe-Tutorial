package net.interesting.tutorialmod.item;

import net.interesting.tutorialmod.TutorialMod;
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

                    output.accept(Items.BELL);
                })
                .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}