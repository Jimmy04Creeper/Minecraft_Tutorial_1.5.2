package com.BasicDimension.world.biomes;

import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.BasicDimension.Main;

public class BiomeGenTutorial1 extends BiomeGenBase
{
	private WorldGenerator UnDeadworldGeneratorBigTree;
	public final Material blockMaterial;
	public BiomeGenTutorial1(int par1)
	{
		super(par1);
		this.blockMaterial = Material.water;
		this.minHeight = 0.1F;
		this.maxHeight = 0.6F;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = ((byte)Main.TutorialGrass.blockID);
		this.fillerBlock = ((byte)Main.TutorialDirt.blockID);
		this.setBiomeName("Tutorial");

		/** this changes the water colour, its set to red now but ggole the java colours **/
		this.waterColorMultiplier = 0xE42D17;
	}
}