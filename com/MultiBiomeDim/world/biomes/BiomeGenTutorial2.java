package com.MultiBiomeDim.world.biomes;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.BasicDimension.Main;

public class BiomeGenTutorial2 extends BiomeGenBase
{
	public final Material blockMaterial;
	
	public BiomeGenTutorial2(int par1)
	{
		super(par1);
		this.blockMaterial = Material.water;
		this.minHeight = 0.1F;
		this.maxHeight = 0.6F;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = ((byte)Block.stoneBrick.blockID);
		this.fillerBlock = ((byte)Block.sandStone.blockID);
		this.setBiomeName("Tutorial 2");

		/** this changes the water colour, its set to red now but ggole the java colours **/
		this.waterColorMultiplier = 0xE42D17;
	}
}