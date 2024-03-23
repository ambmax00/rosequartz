package com.simea.rosequartz.init;

import com.simea.rosequartz.Rosequartz;
import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Rosequartz.MODID);
	
	public static final RegistryObject<BlockItem> ROSEQUARTZ_BRICKS_ITEM = ITEMS.register("rosequartz_bricks", 
			() -> new BlockItem(BlockInit.ROSEQUARTZ_BRICKS.get(), 
					new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> ROSEQUARTZ_BLOCK_ITEM = ITEMS.register("rosequartz_block", 
			() -> new BlockItem(BlockInit.ROSEQUARTZ_BLOCK.get(), 
					new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> ROSEQUARTZ_STAIRS_ITEM = ITEMS.register("rosequartz_stairs", 
			() -> new BlockItem(BlockInit.ROSEQUARTZ_STAIRS.get(), 
					new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> ROSEQUARTZ_BRICK_STAIRS_ITEM = ITEMS.register("rosequartz_brick_stairs", 
			() -> new BlockItem(BlockInit.ROSEQUARTZ_BRICK_STAIRS.get(), 
					new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> ROSEQUARTZ_SLAB_ITEM = ITEMS.register("rosequartz_slab", 
			() -> new BlockItem(BlockInit.ROSEQUARTZ_SLAB.get(), 
					new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> ROSEQUARTZ_PILLAR_ITEM = ITEMS.register("rosequartz_pillar", 
			() -> new BlockItem(BlockInit.ROSEQUARTZ_PILLAR.get(), 
					new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> CHISELED_ROSEQUARTZ_BLOCK_ITEM = ITEMS.register("chiseled_rosequartz_block", 
			() -> new BlockItem(BlockInit.CHISELED_ROSEQUARTZ_BLOCK.get(), 
					new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> ROSEQUARTZ_WALL_ITEM = ITEMS.register("rosequartz_wall", 
			() -> new BlockItem(BlockInit.ROSEQUARTZ_WALL.get(), 
					new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> ROSEQUARTZ_BRICK_WALL_ITEM = ITEMS.register("rosequartz_brick_wall", 
			() -> new BlockItem(BlockInit.ROSEQUARTZ_BRICK_WALL.get(), 
					new Item.Properties()
			));
}