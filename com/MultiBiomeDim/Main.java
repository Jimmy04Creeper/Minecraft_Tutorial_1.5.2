package com.MultiBiomeDim;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import com.BasicDimension.world.biomes.BiomeGenTutorial1;
import com.MultiBiomeDim.blocks.BasicModBlock1;
import com.MultiBiomeDim.blocks.BlockTutorialFire1;
import com.MultiBiomeDim.blocks.BlockTutorialGrass1;
import com.MultiBiomeDim.blocks.BlockTutorialLeaf1;
import com.MultiBiomeDim.blocks.BlockTutorialLog1;
import com.MultiBiomeDim.blocks.BlockTutorialPortal1;
import com.MultiBiomeDim.blocks.BlockTutorialSapling1;
import com.MultiBiomeDim.items.ItemPortalPlacer1;
import com.MultiBiomeDim.items.ItemTutorialFlintAndSteel1;
import com.MultiBiomeDim.lib.BiomeIDsMulti;
import com.MultiBiomeDim.lib.BlockIDsMulti;
import com.MultiBiomeDim.lib.DimensionIDsMulti;
import com.MultiBiomeDim.lib.ItemIDsMulti;
import com.MultiBiomeDim.lib.NamesMulti;
import com.MultiBiomeDim.lib.ReferenceMulti;
import com.MultiBiomeDim.world.WorldProviderTutorial1;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=ReferenceMulti.MODID, name=ReferenceMulti.MOD_MAME, version=ReferenceMulti.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Main
{	
	/** Dimension ID **/
	public static int DimID = DimensionIDsMulti.DIMID_2;

	/** Blocks **/
	public static BlockTutorialFire1 TutorialFire1 = (BlockTutorialFire1)new BlockTutorialFire1(BlockIDsMulti.TutorialFireID).setUnlocalizedName(NamesMulti.UL_TutorialFire);
	public static BlockTutorialPortal1 TutorialPortal1 = (BlockTutorialPortal1)new BlockTutorialPortal1(BlockIDsMulti.TutorialPortalID).setUnlocalizedName(NamesMulti.UL_TutorialPortal);
	public static BlockTutorialSapling1 TutorialSapling1 = (BlockTutorialSapling1)new BlockTutorialSapling1(BlockIDsMulti.TutorialSaplingID, 0).setUnlocalizedName("Tutorial:Sapling");
	public static Block TutorialGrass1 = new BlockTutorialGrass1(BlockIDsMulti.TutorialGrassID).setUnlocalizedName(NamesMulti.UL_TutorialGrass);
	public static Block TutorialDirt1 = new BasicModBlock1(BlockIDsMulti.TutorialDirtID, Material.ground).setUnlocalizedName(NamesMulti.UL_TutorialDirt);
	public static Block TutorialStone1 = new BasicModBlock1(BlockIDsMulti.TutorialStoneID, Material.rock).setUnlocalizedName(NamesMulti.UL_TutorialStone);
	public static Block TutorialLeaf1 = new BlockTutorialLeaf1(BlockIDsMulti.TutorialLeafID).setUnlocalizedName("Leaf");
	public static Block TutorialLog1 = new BlockTutorialLog1(BlockIDsMulti.TutorialLogID).setUnlocalizedName("LogSide");
	
	/** Items **/
	public static Item TutorialFlintAndSteel1 = new ItemTutorialFlintAndSteel1(ItemIDsMulti.TutorialFlintID).setUnlocalizedName(NamesMulti.UL_Lighter);
	public static Item TutorialPortalPlacer1 = new ItemPortalPlacer1(ItemIDsMulti.TutorialPortalPlacerID).setUnlocalizedName(NamesMulti.UL_PortalPlacer);
	
	/** Biome's **/
	public static final BiomeGenBase TutorialBiome1 = new BiomeGenTutorial1(BiomeIDsMulti.BiomeID_1);
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		/** Register Blocks **/
		GameRegistry.registerBlock(TutorialFire1, "TutorialFire");
		GameRegistry.registerBlock(TutorialPortal1, "TutorialPortal");
		GameRegistry.registerBlock(TutorialGrass1, "TutorialGrass");
		GameRegistry.registerBlock(TutorialDirt1, "TutorialDirt");
		GameRegistry.registerBlock(TutorialStone1, "TutorialStone");
		GameRegistry.registerBlock(TutorialLeaf1, "TutorialLeaf");
		GameRegistry.registerBlock(TutorialLog1, "TutorialLog");
		GameRegistry.registerBlock(TutorialSapling1, "TutorialSapling");
		
		/** Register Items **/
		GameRegistry.registerItem(TutorialFlintAndSteel1, "TutorialFlintAndSteel");
		GameRegistry.registerItem(TutorialPortalPlacer1, "TutorialPortalPlacer");
		
		/** Add In-Game Names **/
		LanguageRegistry.addName(TutorialGrass1, NamesMulti.TutorialGrass);
		LanguageRegistry.addName(TutorialDirt1, NamesMulti.TutorialDirt);
		LanguageRegistry.addName(TutorialStone1, NamesMulti.TutorialStone);
		LanguageRegistry.addName(TutorialFire1, NamesMulti.TutorialFire);
		LanguageRegistry.addName(TutorialPortal1, NamesMulti.TutorialPortal);
		LanguageRegistry.addName(TutorialFlintAndSteel1, NamesMulti.Lighter);
		LanguageRegistry.addName(TutorialPortalPlacer1, NamesMulti.PortalPlacer);
		LanguageRegistry.addName(TutorialLeaf1, NamesMulti.TutorialLeaf);
		LanguageRegistry.addName(TutorialLog1, NamesMulti.TutorialLog);
		LanguageRegistry.addName(TutorialSapling1, NamesMulti.TutorialSapling);
		
		/**Register WorldProvider for Dimension **/
		DimensionManager.registerProviderType(DimID, WorldProviderTutorial1.class, true);
		DimensionManager.registerDimension(DimID, DimID);
		
		/** Event's **/
		//MinecraftForge.EVENT_BUS.register(new TutorialEventClass1());
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}