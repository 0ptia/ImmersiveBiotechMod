package com.optia.ImmersiveBiotechMod.blocks.slots;

import com.optia.ImmersiveBiotechMod.blocks.TileEntityMicrocentrifuge;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotMicrocentrifugeFuel extends Slot
{
	public SlotMicrocentrifugeFuel(IInventory inventory, int index, int x, int y)
	{
		super(inventory, index, x, y);
	}
	@Override
	public boolean isItemValid(ItemStack stack) 
	{
		return TileEntityMicrocentrifuge.isItemFuel(stack);
	}
	@Override
	public int getItemStackLimit(ItemStack stack)
	{
		return super.getItemStackLimit(stack);
	}
}
