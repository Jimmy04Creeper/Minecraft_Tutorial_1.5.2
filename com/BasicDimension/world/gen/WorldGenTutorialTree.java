package com.BasicDimension.world.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ForgeDirection;

import com.BasicDimension.Main;
import com.BasicDimension.blocks.BlockTutorialSapling;

import cpw.mods.fml.common.IWorldGenerator;

public class WorldGenTutorialTree extends WorldGenerator implements IWorldGenerator
{
	/** The minimum height of a generated tree. */
	private final int minTreeHeight;
	/** True if this tree should grow Vines. */
	private final boolean vinesGrow;
	/** The metadata value of the wood to use in tree generation. */
	private final int metaWood;
	/** The metadata value of the leaves to use in tree generation. */
	private final int metaLeaves;
	public WorldGenTutorialTree(boolean par1)
	{
		this(par1, 8, 0, 0, false);
	}
	public WorldGenTutorialTree(boolean par1, int par2, int par3, int par4, boolean par5)
	{
		super(par1);
		this.minTreeHeight = par2;
		this.metaWood = par3;
		this.metaLeaves = par4;
		this.vinesGrow = par5;
	}
	public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
	{
		int l = par2Random.nextInt(3) + this.minTreeHeight;
		boolean flag = true;
		if (par4 >= 1 && par4 + l + 1 <= 256)
		{
			int i1;
			byte b0;
			int j1;
			int k1;
			for (i1 = par4; i1 <= par4 + 1 + l; ++i1)
			{
				b0 = 1;
				if (i1 == par4)
				{
					b0 = 0;
				}
				if (i1 >= par4 + 1 + l - 2)
				{
					b0 = 2;
				}
				for (int l1 = par3 - b0; l1 <= par3 + b0 && flag; ++l1)
				{
					for (j1 = par5 - b0; j1 <= par5 + b0 && flag; ++j1)
					{
						if (i1 >= 0 && i1 < 256)
						{
							k1 = par1World.getBlockId(l1, i1 -1, j1);
							/** Custom grass block **/
							Block block = Main.TutorialGrass;
							if (k1 != 0 && !block.isLeaves(par1World, l1, i1, j1)

									/** Custom grass block **/
									&& k1 != Main.TutorialGrass.blockID
									&& k1 != Block.dirt.blockID
									&& !block.isWood(par1World, l1, i1, j1))
							{
								flag = false;
							}
						}
						else
						{
							flag = false;
						}
					}
				}
			}
			if (!flag)
			{
				return false;
			}
			else
			{
				i1 = par1World.getBlockId(par3, par4 - 1, par5);

				/** Custom grass block **/
				Block soil = Main.TutorialGrass;

				/** Custom Sapling block **/
				boolean isSoil = (soil != null && soil.canSustainPlant(par1World, par3, par4 - 1, par5, ForgeDirection.UP, (BlockTutorialSapling)Main.TutorialSapling));
				if (isSoil && par4 < 256 - l - 1)
				{
					soil.onPlantGrow(par1World, par3, par4 - 1, par5, par3, par4, par5);
					b0 = 3;
					byte b1 = 0;
					int i2;
					int j2;
					int k2;
					for (j1 = par4 - b0 + l; j1 <= par4 + l; ++j1)
					{
						k1 = j1 - (par4 + l);
						i2 = b1 + 1 - k1 / 2;
						for (j2 = par3 - i2; j2 <= par3 + i2; ++j2)
						{
							k2 = j2 - par3;
							for (int l2 = par5 - i2; l2 <= par5 + i2; ++l2)
							{
								int i3 = l2 - par5;
								if (Math.abs(k2) != i2 || Math.abs(i3) != i2 || par2Random.nextInt(2) != 0 && k1 != 0)
								{
									int j3 = par1World.getBlockId(j2, j1, l2);
									Block block = Block.blocksList[j3];
									if (block == null || block.canBeReplacedByLeaves(par1World, j2, j1, l2))
									{
										/** Custom leaf block **/
										this.setBlockAndMetadata(par1World, j2, j1, l2, Main.TutorialLeaf.blockID, this.metaLeaves);
									}
								}
							}
						}
					}
					for (j1 = 0; j1 < l; ++j1)
					{
						k1 = par1World.getBlockId(par3, par4 + j1, par5);
						Block block = Block.blocksList[k1];
						if (k1 == 0 || block == null || block.isLeaves(par1World, par3, par4 + j1, par5))
						{
							/** Custom Log block **/
							this.setBlockAndMetadata(par1World, par3, par4 + j1, par5, Main.TutorialLog.blockID, this.metaWood);
						}
					}
					if (par2Random.nextInt(5) == 0 && l > 5)
					{
						for (j1 = 0; j1 < 2; ++j1)
						{
							for (k1 = 0; k1 < 4; ++k1)
							{
								if (par2Random.nextInt(4 - j1) == 0)
								{
									i2 = par2Random.nextInt(3);
									this.setBlockAndMetadata(par1World, par3 + Direction.offsetX[Direction.rotateOpposite[k1]], par4 + l - 5 + j1, par5 + Direction.offsetZ[Direction.rotateOpposite[k1]], Block.cocoaPlant.blockID, i2 << 2 | k1);
								}
							}
						}
					}
				}
				return true;
			}
		}
		return flag;
	}
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		for(int i = 0; i < 10; i++)
		{
			int xCoord = chunkX + random.nextInt(16);
			int yCoord = random.nextInt(16);
			int zCoord = chunkZ + random.nextInt(16);

			/** Custom WorldGenTutorialTree block **/
			(new WorldGenTutorialTree(false, 9, 0, 0, false)).generate(world, random, xCoord, yCoord, zCoord);
		}
	}
}