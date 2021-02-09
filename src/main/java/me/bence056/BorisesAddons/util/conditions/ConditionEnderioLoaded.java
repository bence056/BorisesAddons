package me.bence056.BorisesAddons.util.conditions;

import com.google.gson.JsonObject;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.fml.common.Loader;

import java.util.function.BooleanSupplier;

public class ConditionEnderioLoaded implements IConditionFactory {

    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        return () -> Loader.isModLoaded("enderio");
    }
}

//https://forums.minecraftforge.net/topic/69446-1122-json-recipe-condition-could-not-find-iconditionfactory/