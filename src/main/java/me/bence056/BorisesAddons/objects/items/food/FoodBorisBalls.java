package me.bence056.BorisesAddons.objects.items.food;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.PotionTypes;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionType;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.asm.transformers.PotionEffectTransformer;

public class FoodBorisBalls extends FoodBase {

    public FoodBorisBalls(String name, int amount, float saturation, boolean isWolfFood) {
        super(name, amount, saturation, isWolfFood);


    }

    @Override
    protected void onFoodEaten(ItemStack foodItem, World world, EntityPlayer player) {
        super.onFoodEaten(foodItem, world, player);
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(8),200, 5));
    }
}
