package fr.looobay.chocobo;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class lib {

    // Cette fonction permet de créer un block item
    public static <T extends Block> RegistryObject<Item> registerBlockItem (String name, RegistryObject<T> block){
        return ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    // Cette fonction permet de créer un block
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    // Permet d'enregistrer un item
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, main.MODID);

    // Permet d'enregistrer un block
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, main.MODID);
}
