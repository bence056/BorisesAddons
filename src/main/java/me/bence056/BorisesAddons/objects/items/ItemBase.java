package me.bence056.BorisesAddons.objects.items;

import me.bence056.BorisesAddons.Main;
import me.bence056.BorisesAddons.init.ItemInit;
import me.bence056.BorisesAddons.util.CustomTab;
import me.bence056.BorisesAddons.util.interfaces.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(new CustomTab("customtab"));

        ItemInit.ITEMS.add(this);


    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
