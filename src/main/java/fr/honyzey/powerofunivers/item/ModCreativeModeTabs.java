package fr.honyzey.powerofunivers.item;

import fr.honyzey.powerofunivers.PowerOfUnivers;
import fr.honyzey.powerofunivers.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PowerOfUnivers.MOD_ID);



    public static final Supplier<CreativeModeTab> TAB_OF_UNIVERS = CREATIVE_MODE_TABS.register("tab_of_univers",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.DEEPSLATE_ORE_OF_UNIVERS.get()))
                    .title(Component.translatable("creativetab.powerofunivers.tab_of_univers"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.INGOT_OF_UNIVERS);
                        output.accept(ModItems.RAW_OF_UNIVERS);

                        output.accept(ModBlocks.ORE_OF_UNIVERS);
                        output.accept(ModBlocks.DEEPSLATE_ORE_OF_UNIVERS);
                        output.accept(ModBlocks.NETHER_ORE_OF_UNIVERS);
                        output.accept(ModBlocks.END_ORE_OF_UNIVERS);
                    }).build()
    );



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
