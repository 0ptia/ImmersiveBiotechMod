package com.optia.ImmersiveBiotechMod.util.handlers;

import com.optia.ImmersiveBiotechMod.blocks.TileEntityMicrocentrifuge;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntityMicrocentrifuge.class, "Microcentrifuge");
	}
}
