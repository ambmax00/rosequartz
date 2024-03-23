package com.simea.rosequartz.init;

import com.simea.rosequartz.Rosequartz;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Rosequartz.MODID);
	
	public static final RegistryObject<Block> ROSEQUARTZ_BRICKS = BLOCKS.register("rosequartz_bricks", 
			() -> new Block(BlockBehaviour.Properties
					.copy(Blocks.QUARTZ_BRICKS)
					.mapColor(MapColor.COLOR_PINK)
			)
		);
	
	public static final RegistryObject<Block> ROSEQUARTZ_BLOCK = BLOCKS.register("rosequartz_block", 
			() -> new Block(BlockBehaviour.Properties
					.copy(Blocks.QUARTZ_BLOCK)
					.mapColor(MapColor.COLOR_PINK)
			)
		);
	
	public static final RegistryObject<Block> ROSEQUARTZ_STAIRS = BLOCKS.register("rosequartz_stairs", 
			() -> new StairBlock(
					() -> ROSEQUARTZ_BLOCK.get().defaultBlockState(), 
					BlockBehaviour.Properties
						.copy(Blocks.QUARTZ_BLOCK)
						.mapColor(MapColor.COLOR_PINK)
				)
		);
	
	public static final RegistryObject<Block> ROSEQUARTZ_BRICK_STAIRS = BLOCKS.register("rosequartz_brick_stairs", 
			() -> new StairBlock(
					() -> ROSEQUARTZ_BRICKS.get().defaultBlockState(), 
					BlockBehaviour.Properties
						.copy(Blocks.QUARTZ_BLOCK)
						.mapColor(MapColor.COLOR_PINK)
				)
		);
	
	public static final RegistryObject<Block> ROSEQUARTZ_SLAB = BLOCKS.register("rosequartz_slab", 
			() -> new SlabBlock(BlockBehaviour.Properties
						.copy(Blocks.QUARTZ_BLOCK)
						.mapColor(MapColor.COLOR_PINK)
				)
		);
	
	public static final RegistryObject<Block> ROSEQUARTZ_PILLAR = BLOCKS.register("rosequartz_pillar", 
			() -> new RotatedPillarBlock(BlockBehaviour.Properties
						.copy(Blocks.QUARTZ_BLOCK)
						.mapColor(MapColor.COLOR_PINK)
				)
		);
	
	public static final RegistryObject<Block> CHISELED_ROSEQUARTZ_BLOCK = BLOCKS.register("chiseled_rosequartz_block", 
			() -> new RotatedPillarBlock(BlockBehaviour.Properties
						.copy(Blocks.QUARTZ_BLOCK)
						.mapColor(MapColor.COLOR_PINK)
				)
		);
	
	public static final RegistryObject<Block> ROSEQUARTZ_WALL = BLOCKS.register("rosequartz_wall", 
			() -> new WallBlock(BlockBehaviour.Properties
						.copy(Blocks.IRON_BLOCK)
						.mapColor(MapColor.COLOR_PINK)
				)
		);
	
	public static final RegistryObject<Block> ROSEQUARTZ_BRICK_WALL = BLOCKS.register("rosequartz_brick_wall", 
			() -> new WallBlock(BlockBehaviour.Properties
						.copy(Blocks.IRON_BLOCK)
						.mapColor(MapColor.COLOR_PINK)
				)
		);
}
