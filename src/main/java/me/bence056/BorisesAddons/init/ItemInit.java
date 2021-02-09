package me.bence056.BorisesAddons.init;

import me.bence056.BorisesAddons.objects.items.ItemBase;
import me.bence056.BorisesAddons.objects.items.ItemBorisDust;
import me.bence056.BorisesAddons.objects.items.food.FoodBase;
import me.bence056.BorisesAddons.objects.items.food.FoodBorisBalls;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Items:

    public static final Item dust_boris = new ItemBorisDust("dust_boris");

    //Food:

    public static final Item balls_boris = new FoodBorisBalls("balls_boris", 20, 60, false);

}
