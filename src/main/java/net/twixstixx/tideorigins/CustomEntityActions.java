
package net.twixstixx.tideorigins;

import net.twixstixx.tideorigins.powers.AnvilAction;

import io.github.apace100.apoli.power.factory.action.ActionFactory;
import io.github.apace100.apoli.registry.ApoliRegistries;

import net.minecraft.util.registry.Registry;
import net.minecraft.entity.Entity;

public class CustomEntityActions {
    public static void register() {
        register(AnvilAction.createFactory());
    }

    private static void register(ActionFactory<Entity> actionFactory) {
        Registry.register(ApoliRegistries.ENTITY_ACTION, actionFactory.getSerializerId(), actionFactory);
    }
}


