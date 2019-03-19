package com.optia.ImmersiveBiotechMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Electrophoresischamber extends BlockBase
{
	public static final AxisAlignedBB ELECTROPHORESIS_CHAMBER_AABB = new AxisAlignedBB(0.25D, 0, 0.375D, 0.75D, 0.125D, 0.6875D);
	
	public Electrophoresischamber(String name, Material material) 
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
		return ELECTROPHORESIS_CHAMBER_AABB;
	}
}
