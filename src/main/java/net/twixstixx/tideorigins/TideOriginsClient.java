package net.twixstixx.tideorigins;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class TideOriginsClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(TideOriginsMod.EMBERBLOOM, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(TideOriginsMod.HEARTFRUIT_BUSH, RenderLayer.getCutout());
    }

}