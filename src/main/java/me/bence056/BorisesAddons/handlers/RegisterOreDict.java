package me.bence056.BorisesAddons.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class RegisterOreDict {

    public static void RegisterAll() {
        OreDictionary.registerOre("basicRawMeat", Items.BEEF);
        OreDictionary.registerOre("basicRawMeat", Items.CHICKEN);
        OreDictionary.registerOre("basicRawMeat", Items.MUTTON);
        OreDictionary.registerOre("basicRawMeat", Items.RABBIT);
        OreDictionary.registerOre("basicRawMeat", Items.PORKCHOP);
        OreDictionary.registerOre("basicRawMeat", Items.FISH);
        OreDictionary.registerOre("basicRawMeat", new ItemStack(Items.FISH, 1, 1));

    }

}
