package com.chillywilly.halloween;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public final class ChillyHalloween implements ModInitializer {
    public static final String ID = "chilly_halloween";
    public static final Identifier BULBASAUR_ID = Identifier.of(ID, "bulbasaur_halloween");

    public static final Block BULBASAUR = Registry.register(
        Registries.BLOCK, BULBASAUR_ID,
        new HalloweenBulbasaurBlock(AbstractBlock.Settings.create()
            .strength(0.5f).sounds(BlockSoundGroup.WOOL).nonOpaque())
    );

    public static final Item BULBASAUR_ITEM = Registry.register(
        Registries.ITEM, BULBASAUR_ID, new BlockItem(BULBASAUR, new Item.Settings())
    );

    public static final BlockEntityType<HalloweenBulbasaurBlockEntity> BULBASAUR_BLOCK_ENTITY =
        Registry.register(Registries.BLOCK_ENTITY_TYPE, BULBASAUR_ID,
            FabricBlockEntityTypeBuilder.create(HalloweenBulbasaurBlockEntity::new, BULBASAUR).build());

    @Override
    public void onInitialize() {
        // En GeckoLib 4.7.3 la inicializacion de la libreria es automatica.
    }
}
