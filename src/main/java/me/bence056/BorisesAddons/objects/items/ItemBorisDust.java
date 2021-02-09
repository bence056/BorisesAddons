package me.bence056.BorisesAddons.objects.items;

import me.bence056.BorisesAddons.util.conditions.ConditionEnderioLoaded;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.CooldownTracker;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemBorisDust extends ItemBase{

    private boolean isGlowing = false;

    public ItemBorisDust(String name) {
        super(name);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {

        if(world.isRemote) {
            isGlowing = !isGlowing;
            player.setGlowing(isGlowing);
            player.sendMessage(new TextComponentString("\u00A75Praise the lord - This is an ancient item from Boris's asshole. - Handle carefully"));
            player.getCooldownTracker().setCooldown(this, 20);
            player.rotationPitch = -90f;
            return new ActionResult<ItemStack>(EnumActionResult.PASS, player.getHeldItem(hand));
        }

        return new ActionResult<ItemStack>(EnumActionResult.PASS, player.getHeldItem(hand));


    }
}
