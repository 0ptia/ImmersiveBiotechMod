package com.optia.ImmersiveBiotechMod.proxy;

import net.minecraft.item.Item;
import com.optia.ImmersiveBiotechMod.util.handlers.GuiHandlerRegistry;
import com.optia.ImmersiveBiotechMod.Main;
import com.optia.ImmersiveBiotechMod.blocks.Microcentrifuge;
import com.optia.ImmersiveBiotechMod.blocks.TileInventoryMicrocentrifuge;
import com.optia.ImmersiveBiotechMod.util.handlers.GuiHandler;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy 
{
	public static Block blockInventoryAdvanced;  // this holds the unique instance of your block
	  public static ItemBlock itemBlockInventoryAdvanced; // this holds the unique instance of the ItemBlock corresponding to your block

		public static void preInitCommon()
		{
	    // each instance of your block should have two names:
	    // 1) a registry name that is used to uniquely identify this block.  Should be unique within your mod.  use lower case.
	    // 2) an 'unlocalised name' that is used to retrieve the text name of your block in the player's language.  For example-
	    //    the unlocalised name might be "water", which is printed on the user's screen as "Wasser" in German or
	    //    "aqua" in Italian.
	    //
	    //    Multiple blocks can have the same unlocalised name - for example
	    //  +----RegistryName----+---UnlocalisedName----+
	    //  |  flowing_water     +       water          |
	    //  |  stationary_water  +       water          |
	    //  +--------------------+----------------------+
	    //
			blockInventoryAdvanced = new Microcentrifuge().setUnlocalizedName("Microcentrifuge_unlocalised_name");
	    blockInventoryAdvanced.setRegistryName("Microcentrifuge_registry_name");
			ForgeRegistries.BLOCKS.register(blockInventoryAdvanced);

	    // We also need to create and register an ItemBlock for this block otherwise it won't appear in the inventory
	    itemBlockInventoryAdvanced = new ItemBlock(blockInventoryAdvanced);
	    itemBlockInventoryAdvanced.setRegistryName(blockInventoryAdvanced.getRegistryName());
	    ForgeRegistries.ITEMS.register(itemBlockInventoryAdvanced);

	    // Each of your tile entities needs to be registered with a name that is unique to your mod.
			GameRegistry.registerTileEntity(TileInventoryMicrocentrifuge.class, "Microcentrifuge_tile_entity");

			// You need to register a GUIHandler for the container.  However there can be only one handler per mod, so for the purposes
			//   of this project, we create a single GuiHandlerRegistry for all examples.
			// We register this GuiHandlerRegistry with the NetworkRegistry, and then tell the GuiHandlerRegistry about
			//   each example's GuiHandler, in this case GuiHandlerMBE31, so that when it gets a request from NetworkRegistry,
			//   it passes the request on to the correct example's GuiHandler.
			NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, GuiHandlerRegistry.getInstance());
			GuiHandlerRegistry.getInstance().registerGuiHandler(new GuiHandler(), GuiHandler.getGuiID());
		}

		public static void initCommon()
		{
		}

		public static void postInitCommon()
		{
		}
	public void registerItemRenderer(Item item, int meta, String id){}
}
