package com.optia.ImmersiveBiotechMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Gelblockmold extends BlockBase
{
	public static final AxisAlignedBB GELBLOCKMOLD_AABB = new AxisAlignedBB(0.375D, 0, 0.375D, 0.625D, 0.125D, 0.625D);
	
	public Gelblockmold(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(0.5F);
		setResistance(2.5F);
		setHarvestLevel("pickaxe", 1);
		setLightOpacity(1);
		//setBlockUnbreakable();
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) 
	{
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) 
	{
		return GELBLOCKMOLD_AABB;
	}
}
