package fr.looobay.chocobo.items;

import fr.looobay.chocobo.main;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class creative {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, main.MODID);

    public static final RegistryObject<CreativeModeTab> CHOCOBO_TAB = CREATIVE_MODE_TABS.register("chocobo_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(items.BAKED_GOLD_GYSAHL.get() /*permet d'avoir l'item en icone*/))
                    .title(Component.translatable("creativetab.chocobo_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(items.BAKED_GOLD_GYSAHL.get());
                        pOutput.accept(items.BAKED_PICKED_GOLD_GYSAHL.get());
                        pOutput.accept(items.RAW_PICKED_GOLD_GYSAHL.get());
                        pOutput.accept(items.CHOCOBO_STEW.get());
                        pOutput.accept(items.STUFFED_GOLD_GYSAHL.get());
                        pOutput.accept(items.CHOCOBO_BURGER.get());
                        pOutput.accept(items.GYSAHL_CAKE_SLICE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
