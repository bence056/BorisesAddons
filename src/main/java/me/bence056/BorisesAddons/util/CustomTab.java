package me.bence056.BorisesAddons.util;

import me.bence056.BorisesAddons.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CustomTab extends CreativeTabs {

    public CustomTab(String label) {
        super("customtab");

    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ItemInit.dust_boris);
    }

}
