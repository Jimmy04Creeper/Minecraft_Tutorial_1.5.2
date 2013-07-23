package com.MultiBiomeDim.world.biomes;

import com.MultiBiomeDim.Main;

import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenTutorial extends BiomeGenBase
{
	private WorldGenerator UnDeadworldGeneratorBigTree;
	public final Material blockMaterial;
	public BiomeGenTutorial(int par1)
	{
		super(par1);
		this.blockMaterial = Material.water;
		this.minHeight = 0.1F;
		this.maxHeight = 0.6F;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = ((byte)Main.TutorialGrass1.blockID);
		this.fillerBlock = ((byte)Main.TutorialDirt1.blockID);
		this.setBiomeName("Tutorial 1");

		/** this changes the water colour, its set to red now but ggole the java colours **/
		this.waterColorMultiplier = 0xE42D17;
	}
}