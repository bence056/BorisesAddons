package me.bence056.BorisesAddons.objects.items.food;

import me.bence056.BorisesAddons.Main;
import me.bence056.BorisesAddons.init.ItemInit;
import me.bence056.BorisesAddons.util.CustomTab;
import me.bence056.BorisesAddons.util.interfaces.IHasModel;
import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements IHasModel {

    public FoodBase(String name, int amount, float saturation, boolean isWolfFood) {

        super(amount, saturation, isWolfFood);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.mainTab);

        ItemInit.ITEMS.add(this);

    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
