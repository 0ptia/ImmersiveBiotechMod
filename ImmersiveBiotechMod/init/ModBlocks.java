package com.optia.ImmersiveBiotechMod.init;

import java.util.ArrayList;
import java.util.List;

import com.optia.ImmersiveBiotechMod.blocks.BlockBase;
import com.optia.ImmersiveBiotechMod.blocks.Microcentrifuge;
import com.optia.ImmersiveBiotechMod.blocks.Ultracentrifuge;
import com.optia.ImmersiveBiotechMod.blocks.Gelblockmold;
import com.optia.ImmersiveBiotechMod.blocks.Electrophoresischamber;
import com.optia.ImmersiveBiotechMod.blocks.Thermocycler;
import com.optia.ImmersiveBiotechMod.blocks.Electroporator;
import com.optia.ImmersiveBiotechMod.blocks.Cellincubator;
import com.optia.ImmersiveBiotechMod.blocks.Microinjector;
import com.optia.ImmersiveBiotechMod.blocks.Microscope;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block MICROCENTRIFUGE = new Microcentrifuge("microcentrifuge", Material.IRON);
	public static final Block ULTRACENTRIFUGE = new Ultracentrifuge("ultracentrifuge", Material.IRON);
	public static final Block GEL_BLOCK_MOLD = new Gelblockmold("gel_block_mold", Material.ICE);
	public static final Block ELECTROPHORESIS_CHAMBER = new Electrophoresischamber("electrophoresis_chamber", Material.ICE);
	public static final Block THERMOCYCLER = new Thermocycler("thermocycler", Material.IRON);
	public static final Block ELECTROPORATOR = new Electroporator("electroporator", Material.IRON);
	public static final Block CELL_INCUBATOR = new Cellincubator("cell_incubator", Material.IRON);
	public static final Block MICROINJECTOR = new Microinjector("microinjector", Material.IRON);
	public static final Block MICROSCOPE = new Microinjector("microscope", Material.IRON);
	
}
