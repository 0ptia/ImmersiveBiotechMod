package optia.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import optia.mod.objects.blocks.BlockBase;

public class BlockInit 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block TEST = new BlockBase("test", Material.ROCK);
}
