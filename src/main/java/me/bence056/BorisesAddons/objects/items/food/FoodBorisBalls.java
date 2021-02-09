package me.bence056.BorisesAddons.objects.items.food;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class FoodBorisBalls extends FoodBase {

    public FoodBorisBalls(String name, int amount, float saturation, boolean isWolfFood) {
        super(name, amount, saturation, isWolfFood);


    }

    @Override
    protected void onFoodEaten(ItemStack foodItem, World world, EntityPlayer player) {
        super.onFoodEaten(foodItem, world, player);
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(8),200, 5));
    }

    @Override
    public boolean itemInteractionForEntity(ItemStack stack, EntityPlayer player, EntityLivingBase target, EnumHand hand) {

        World world = player.getEntityWorld();
        if(world.isRemote) {
            if(true/*target instanceof EntityPlayer*/) { //TODO
                try{

                    player.sendMessage(new TextComponentString("\u00A75Don't put Boris's balls under someone's nose..."));
                    player.playSound(SoundEvents.ENTITY_HORSE_BREATHE, 10, 1);
                    target.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 100, 5));
                    stack.shrink(1);

                }catch (Exception ex) {
                    System.out.println("Something happened - " + ex.getStackTrace());
                }
            }
        }

        return super.itemInteractionForEntity(stack, player, target, hand);
    }
}
