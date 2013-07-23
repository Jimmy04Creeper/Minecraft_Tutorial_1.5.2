package com.MultiBiomeDim.blocks;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTutorialLeaf1 extends BasicModBlock1
{
	public BlockTutorialLeaf1(int par1)
	{
		super(par1, Material.leaves);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setStepSound(soundGrassFootstep);
		this.setHardness(0.2F);
	}

	public boolean isOpaqueCube()
	{
		return false;
	}
	/**
	 * Returns the ID of the items to drop on destruction.
	 */
	public int idDropped(int par1, Random par2Random, int par3)
	{
		return this.blockID;
	}
	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
}