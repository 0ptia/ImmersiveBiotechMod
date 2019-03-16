package com.optia.ImmersiveBiotechMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Microinjector extends BlockBase
{
	public Microinjector(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(1.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
}
