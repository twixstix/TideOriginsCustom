
package net.twixstixx.tideorigins.powers;

import io.github.apace100.apoli.Apoli;
import io.github.apace100.apoli.power.factory.action.ActionFactory;
import io.github.apace100.calio.data.SerializableData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.AnvilScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.SimpleNamedScreenHandlerFactory;
import net.minecraft.stat.Stats;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class AnvilAction {
    private static final Text TITLE = new TranslatableText("container.repair");

    public static void action(SerializableData.Instance data, Entity entity) {
        if (!(entity instanceof PlayerEntity player)) return;

        player.openHandledScreen(new SimpleNamedScreenHandlerFactory((syncId, inventory, _player) ->
            new AnvilScreenHandler(syncId, inventory, ScreenHandlerContext.create(_player.world, _player.getBlockPos())), TITLE));
            

        player.incrementStat(Stats.INTERACT_WITH_ANVIL);
    }

    public static ActionFactory<Entity> createFactory() {
        return new ActionFactory<>(Apoli.identifier("anvil"),
                new SerializableData(),
                AnvilAction::action
        );
    }
    
}
