package fr.honyzey.powerofunivers.item;

import fr.honyzey.powerofunivers.PowerOfUnivers;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PowerOfUnivers.MOD_ID);



    // Liste des items

    // Ingot Of Univers
    public static final DeferredItem<Item> INGOT_OF_UNIVERS = ITEMS.register("ingot_of_univers",
            () -> new Item(new Item.Properties()
            )
    );

    // Raw Of Univers
    public static final DeferredItem<Item> RAW_OF_UNIVERS = ITEMS.register("raw_of_univers",
            () -> new Item(new Item.Properties()
            )
    );



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
