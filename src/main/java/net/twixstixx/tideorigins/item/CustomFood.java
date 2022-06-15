package net.twixstixx.tideorigins.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponent.Builder;

public class CustomFood {
    public static final FoodComponent HEARTFRUIT = (new Builder()).hunger(2).saturationModifier(0.2F).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 50, 1), 1.0F).build();
}