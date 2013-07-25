package com.MultiBiomeDim.world.biomes;

import java.util.Random;

import com.MultiBiomeDim.Main;
import com.MultiBiomeDim.world.gen.WorldGenTutorialForestTree1;
import com.MultiBiomeDim.world.gen.WorldGenTutorialHugeTree1;
import com.MultiBiomeDim.world.gen.WorldGenTutorialTree1;

import net.minecraft.block.material.Material;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenTutorial1 extends BiomeGenBase
{
	public final Material blockMaterial;
	
	public BiomeGenTutorial1(int par1)
	{
		super(par1);
		this.blockMaterial = Material.water;
		this.minHeight = 0.1F;
		this.maxHeight = 0.6F;
		this.spawnableMonsterList.clear();
		this.spawnableCreatureList.clear();
		this.topBlock = ((byte)Main.TutorialGrass1.blockID);
		this.fillerBlock = ((byte)Main.TutorialDirt1.blockID);
		this.setBiomeName("Tutorial");

		/** this changes the water colour, its set to red now but ggole the java colours **/
		this.waterColorMultiplier = 0xE42D17;
	}
}