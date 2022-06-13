package net.twixstixx.tideorigins;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
//import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
//import net.minecraft.block.FlowerBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.twixstixx.tideorigins.block.EmberbloomBlock;
import net.minecraft.entity.effect.StatusEffects;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TideOriginsMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("tideorigins");
	public static final String MOD_ID = "tideorigins";
	//items
	public static final Item HEART_OF_THE_SEA = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON));
	public static final Item SHARD_OF_THE_SEA = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON));
	public static final Item PHOENIX_NECKLACE = new Item(new FabricItemSettings().group(ItemGroup.MISC).rarity(Rarity.UNCOMMON));
	//blocks
	public static final Block EMBERBLOOM = new EmberbloomBlock(StatusEffects.FIRE_RESISTANCE, AbstractBlock.Settings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS).luminance(state -> 7));
	public static final Block FAIRYLIGHT = new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC, MapColor.YELLOW).strength(1.0f).sounds(BlockSoundGroup.SHROOMLIGHT).nonOpaque().luminance(state -> 15));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("TideOrigins loaded!");
		CustomEntityActions.register();
		//itemregistry
		Registry.register(Registry.ITEM, new Identifier("tideorigins", "heart_of_the_sea"), HEART_OF_THE_SEA);
		Registry.register(Registry.ITEM, new Identifier("tideorigins", "shard_of_the_sea"), SHARD_OF_THE_SEA);
		Registry.register(Registry.ITEM, new Identifier("tideorigins", "phoenix_necklace"), PHOENIX_NECKLACE);
		//blockregistry
		Registry.register(Registry.BLOCK, new Identifier("tideorigins", "emberbloom"), EMBERBLOOM);
		Registry.register(Registry.ITEM, new Identifier("tideorigins", "emberbloom"), new BlockItem(EMBERBLOOM, new FabricItemSettings().group(ItemGroup.MISC)));
		Registry.register(Registry.BLOCK, new Identifier("tideorigins", "fairylight"), FAIRYLIGHT);
		Registry.register(Registry.ITEM, new Identifier("tideorigins", "fairylight"), new BlockItem(FAIRYLIGHT, new FabricItemSettings().group(ItemGroup.MISC)));
	}
}
