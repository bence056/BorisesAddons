package me.bence056.BorisesAddons;

import me.bence056.BorisesAddons.proxies.CommonProxy;
import me.bence056.BorisesAddons.util.conditions.ConditionEnderioLoaded;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, version = Main.VERSION, name = Main.MODNAME)
public class Main {

    public static final String MODID = "borises_addons";
    public static final String MODNAME = "Boris's addons";
    public static final String VERSION = "1.0.0";

    @Mod.Instance
    public static Main main;

    @SidedProxy(serverSide = "me.bence056.BorisesAddons.proxies.CommonProxy", clientSide = "me.bence056.BorisesAddons.proxies.ClientProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {}

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event) {}

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        ConditionEnderioLoaded.isEnderioLoaded = Loader.isModLoaded("enderio");
    }

}
