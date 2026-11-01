package com.chillywilly.halloween;

import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public final class HalloweenBulbasaurModel extends GeoModel<HalloweenBulbasaurBlockEntity> {
    @Override
    public Identifier getModelResource(HalloweenBulbasaurBlockEntity animatable) {
        return Identifier.of(ChillyHalloween.ID, "geo/bulbasaur_halloween.geo.json");
    }

    @Override
    public Identifier getTextureResource(HalloweenBulbasaurBlockEntity animatable) {
        return Identifier.of(ChillyHalloween.ID, "textures/block/bulbasaur_halloween.png");
    }

    @Override
    public Identifier getAnimationResource(HalloweenBulbasaurBlockEntity animatable) {
        return Identifier.of(ChillyHalloween.ID, "animations/bulbasaur_halloween.animation.json");
    }
}
