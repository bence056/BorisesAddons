package me.bence056.BorisesAddons.util.conditions;

import com.google.gson.JsonObject;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.fml.common.Loader;

import java.util.function.BooleanSupplier;

public class ConditionAnimaniaLoaded implements IConditionFactory {


    @Override
    public BooleanSupplier parse(JsonContext context, JsonObject json) {
        ConditionHandler.isAnimaniaLoaded = Loader.isModLoaded("animania");
        return () -> ConditionHandler.isAnimaniaLoaded;
    }
}
