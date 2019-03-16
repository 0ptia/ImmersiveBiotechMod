package com.optia.ImmersiveBiotechMod.util.handlers;

import com.optia.ImmersiveBiotechMod.blocks.ContainerMicrocentrifuge;
import com.optia.ImmersiveBiotechMod.blocks.GuiMicrocentrifuge;
import com.optia.ImmersiveBiotechMod.blocks.TileEntityMicrocentrifuge;
import com.optia.ImmersiveBiotechMod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_MICROCENTRIFUGE) return new ContainerMicrocentrifuge(player.inventory, (TileEntityMicrocentrifuge)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		if(ID == Reference.GUI_MICROCENTRIFUGE) return new GuiMicrocentrifuge(player.inventory, (TileEntityMicrocentrifuge)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
}
