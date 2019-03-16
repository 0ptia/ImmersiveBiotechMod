package com.optia.ImmersiveBiotechMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class Gelblockmold extends BlockBase
{
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

}
