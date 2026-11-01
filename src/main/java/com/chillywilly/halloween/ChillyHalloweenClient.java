package com.chillywilly.halloween;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;

public final class ChillyHalloweenClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockEntityRendererRegistry.register(
            ChillyHalloween.BULBASAUR_BLOCK_ENTITY, HalloweenBulbasaurRenderer::new);
    }
}
