package com.BasicDimension;

import com.BasicDimension.blocks.BasicModBlock;
import com.BasicDimension.blocks.BlockTutorialFire;
import com.BasicDimension.blocks.BlockTutorialGrass;
import com.BasicDimension.blocks.BlockTutorialLeaf;
import com.BasicDimension.blocks.BlockTutorialLog;
import com.BasicDimension.blocks.BlockTutorialPortal;
import com.BasicDimension.blocks.BlockTutorialSapling;
import com.BasicDimension.events.TutorialEventClass;
import com.BasicDimension.items.ItemPortalPlacer;
import com.BasicDimension.items.ItemTutorialFlintAndSteel;
import com.BasicDimension.lib.BiomeIDs;
import com.BasicDimension.lib.BlockIDs;
import com.BasicDimension.lib.DimensionIDs;
import com.BasicDimension.lib.ItemIDs;
import com.BasicDimension.lib.Names;
import com.BasicDimension.lib.Reference;
import com.BasicDimension.world.WorldProviderTutorial;
import com.BasicDimension.world.biomes.BiomeGenTutorial1;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid=Reference.MODID, name=Reference.MOD_MAME, version=Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Main
{	
	/** Dimension ID **/
	public static int DimID = DimensionIDs.DIMID_1;

	/** Blocks **/
	public static BlockTutorialFire TutorialFire = (BlockTutorialFire)new BlockTutorialFire(BlockIDs.TutorialFireID).setUnlocalizedName(Names.UL_TutorialFire);
	public static BlockTutorialPortal TutorialPortal = (BlockTutorialPortal)new BlockTutorialPortal(BlockIDs.TutorialPortalID).setUnlocalizedName(Names.UL_TutorialPortal);
	public static Block TutorialGrass = new BlockTutorialGrass(BlockIDs.TutorialGrassID).setUnlocalizedName(Names.UL_TutorialGrass);
	public static Block TutorialDirt = new BasicModBlock(BlockIDs.TutorialDirtID, Material.ground).setUnlocalizedName(Names.UL_TutorialDirt);
	public static Block TutorialStone = new BasicModBlock(BlockIDs.TutorialStoneID, Material.rock).setUnlocalizedName(Names.UL_TutorialStone);
	public static Block TutorialLeaf = new BlockTutorialLeaf(BlockIDs.TutorialLeafID).setUnlocalizedName("Leaf");
	public static Block TutorialLog = new BlockTutorialLog(BlockIDs.TutorialLogID).setUnlocalizedName("LogSide");
	public static BlockTutorialSapling TutorialSapling = (BlockTutorialSapling)new BlockTutorialSapling(BlockIDs.TutorialSaplingID, 0).setUnlocalizedName("Tutorial:Sapling");
	
	/** Items **/
	public static Item TutorialFlintAndSteel = new ItemTutorialFlintAndSteel(ItemIDs.TutorialFlintID).setUnlocalizedName(Names.UL_Lighter);
	public static Item TutorialPortalPlacer = new ItemPortalPlacer(ItemIDs.TutorialPortalPlacerID).setUnlocalizedName(Names.UL_PortalPlacer);
	
	/** Biome's **/
	public static final BiomeGenBase TutorialBiome = new BiomeGenTutorial1(BiomeIDs.BiomeID_1);
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		/** Register Blocks **/
		GameRegistry.registerBlock(TutorialFire, "TutorialFire");
		GameRegistry.registerBlock(TutorialPortal, "TutorialPortal");
		GameRegistry.registerBlock(TutorialGrass, "TutorialGrass");
		GameRegistry.registerBlock(TutorialDirt, "TutorialDirt");
		GameRegistry.registerBlock(TutorialStone, "TutorialStone");
		GameRegistry.registerBlock(TutorialLeaf, "TutorialLeaf");
		GameRegistry.registerBlock(TutorialLog, "TutorialLog");
		GameRegistry.registerBlock(TutorialSapling, "TutorialSapling");
		
		/** Register Items **/
		GameRegistry.registerItem(TutorialFlintAndSteel, "TutorialFlintAndSteel");
		GameRegistry.registerItem(TutorialPortalPlacer, "TutorialPortalPlacer");
		
		/** Add In-Game Names **/
		LanguageRegistry.addName(TutorialGrass, Names.TutorialGrass);
		LanguageRegistry.addName(TutorialDirt, Names.TutorialDirt);
		LanguageRegistry.addName(TutorialStone, Names.TutorialStone);
		LanguageRegistry.addName(TutorialFire, Names.TutorialFire);
		LanguageRegistry.addName(TutorialPortal, Names.TutorialPortal);
		LanguageRegistry.addName(TutorialFlintAndSteel, Names.Lighter);
		LanguageRegistry.addName(TutorialPortalPlacer, Names.PortalPlacer);
		LanguageRegistry.addName(TutorialLeaf, Names.TutorialLeaf);
		LanguageRegistry.addName(TutorialLog, Names.TutorialLog);
		LanguageRegistry.addName(TutorialSapling, Names.TutorialSapling);
		
		/**Register WorldProvider for Dimension **/
		DimensionManager.registerProviderType(DimID, WorldProviderTutorial.class, true);
		DimensionManager.registerDimension(DimID, DimID);
		
		/** Event's **/
		MinecraftForge.EVENT_BUS.register(new TutorialEventClass());
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}