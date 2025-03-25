package fr.honyzey.powerofunivers.block;

import fr.honyzey.powerofunivers.PowerOfUnivers;
import fr.honyzey.powerofunivers.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(PowerOfUnivers.MOD_ID);



    // Liste des blocks

    // Ore Of Univers
    public static final DeferredBlock<Block> ORE_OF_UNIVERS = registerBlock("ore_of_univers",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            )
    );

    // Deepslate Ore Of Univers
    public static final DeferredBlock<Block> DEEPSLATE_ORE_OF_UNIVERS = registerBlock("deepslate_ore_of_univers",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.DEEPSLATE)
            )
    );

    // Nether Ore Of Univers
    public static final DeferredBlock<Block> NETHER_ORE_OF_UNIVERS = registerBlock("nether_ore_of_univers",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.NETHER_ORE)
            )
    );

    // End Ore Of Univers
    public static final DeferredBlock<Block> END_ORE_OF_UNIVERS = registerBlock("end_ore_of_univers",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.STONE)
            )
    );



    // Méthodes de registre
    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()
        )
        );
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
