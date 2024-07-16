package fr.looobay.chocobo.items;

import fr.looobay.chocobo.items.custom.*;
import fr.looobay.chocobo.lib;
import fr.looobay.chocobo.main;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;

public class items {

    public static final RegistryObject<Item> BAKED_GOLD_GYSAHL = lib.ITEMS.register("baked_gold_gysahl",
            () -> new baked_gold_gysahl(new Item.Properties()));

    public static final RegistryObject<Item> RAW_PICKED_GOLD_GYSAHL = lib.ITEMS.register("raw_pickled_gold_gysahl",
            () -> new raw_pickled_gold_gysahl(new Item.Properties().food(new FoodProperties.Builder().alwaysEat()
                    .nutrition(2).saturationMod(1.5f)
                    .build())));

    public static final RegistryObject<Item> BAKED_PICKED_GOLD_GYSAHL = lib.ITEMS.register("baked_pickled_gold_gysahl",
            () -> new raw_pickled_gold_gysahl(new Item.Properties().food(new FoodProperties.Builder().alwaysEat()
                    .nutrition(3).saturationMod(1.5f)
                    .build())));

    public static final RegistryObject<Item> CHOCOBO_STEW = lib.ITEMS.register("chocobo_stew",
            () -> new chocobo_stew(new Item.Properties().food(new FoodProperties.Builder().alwaysEat()
                    .nutrition(5).saturationMod(1.5f)
                    .build())));

    public static final RegistryObject<Item> STUFFED_GOLD_GYSAHL = lib.ITEMS.register("stuffed_gold_gysahl",
            () -> new stuffed_gold_gysahl(new Item.Properties().food(new FoodProperties.Builder().alwaysEat()
                    .nutrition(6).saturationMod(1.5f)
                    .build())));
    public static final RegistryObject<Item> CHOCOBO_BURGER = lib.ITEMS.register("chocobo_burger",
            () -> new chocobo_burger(new Item.Properties().food(new FoodProperties.Builder().alwaysEat()
                    .nutrition(10).saturationMod(1f)
                    .build())));

    public static final RegistryObject<Item> GYSAHL_CAKE_SLICE = lib.ITEMS.register("gysahl_cake_slice",
            () -> new Item(new Item.Properties().food(new FoodProperties.Builder().alwaysEat()
                    .nutrition(8).saturationMod(1f)
                    .build())));

    public static void register(IEventBus eventBus){
        lib.ITEMS.register(eventBus);
    }
}
