package com.chillywilly.halloween;

import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import software.bernie.geckolib.renderer.GeoBlockRenderer;

public final class HalloweenBulbasaurRenderer extends GeoBlockRenderer<HalloweenBulbasaurBlockEntity> {
    public HalloweenBulbasaurRenderer(BlockEntityRendererFactory.Context context) {
        super(context, new HalloweenBulbasaurModel());
    }
}
