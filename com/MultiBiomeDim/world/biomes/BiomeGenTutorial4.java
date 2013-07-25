package com.MultiBiomeDim.world.biomes;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.BasicDimension.Main;

public class BiomeGenTutorial4 extends BiomeGenBase
{
	private WorldGenerator UnDeadworldGeneratorBigTree;
	public final Material blockMaterial;
	public BiomeGenTutorial4(int par1)
	{
		super(par1);
		this.blockMaterial = Material.water;
		this.minHeight = 0.1F;
		this.maxHeight = 1.5F;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = ((byte)Block.oreDiamond.blockID);
		this.fillerBlock = ((byte)Block.blockDiamond.blockID);
		this.setBiomeName("Tutorial 4");

		/** this changes the water colour, its set to red now but ggole the java colours **/
		this.waterColorMultiplier = 0xE42D17;
	}
}