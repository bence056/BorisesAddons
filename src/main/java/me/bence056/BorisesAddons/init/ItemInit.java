package me.bence056.BorisesAddons.init;

import me.bence056.BorisesAddons.objects.items.ItemBase;
import me.bence056.BorisesAddons.objects.items.ItemBorisDust;
import net.minecraft.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item dust_boris = new ItemBorisDust("dust_boris");

}
