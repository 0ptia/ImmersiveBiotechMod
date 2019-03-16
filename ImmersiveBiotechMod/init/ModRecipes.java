package com.optia.ImmersiveBiotechMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	
	public static void init() 
	{
		GameRegistry.addSmelting(Blocks.LEAVES, new ItemStack(ModItems.BIOPLASTIC, 10), 1.5f);
		GameRegistry.addSmelting(Items.WHEAT_SEEDS, new ItemStack(ModItems.ISOPROPANOL, 10), 1.5f);
		GameRegistry.addSmelting(Items.POTIONITEM, new ItemStack(ModItems.BOILED_WATER_BOTTLE, 1), 1.5f);
	}

}
