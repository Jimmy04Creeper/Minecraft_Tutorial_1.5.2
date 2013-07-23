package com.MultiBiomeDim.lib;

import net.minecraft.block.Block;

public class NamesMulti 
{
	private static int blockID;
	
	/** ALL NAMES **/    //UL = UnlocalizedName
	public static final String UL_TutorialFire = "TutorialFire_0";
	public static final String UL_TutorialPortal = "TutorialPortal";
	public static final String UL_TutorialGrass = "TutorialGrass";
	public static final String UL_TutorialDirt = "Dirt";
	public static final String UL_TutorialStone = "Stone";
	public static final String UL_Lighter = "Lighter";
	public static final String UL_PortalPlacer = "PortalPlacer";
	public static final String UL_TutorialLeaf = "Leaf";
	public static final String UL_TutorialLog = "LogSide0";
	public static final String UL_TutorialSapling = "Sapling0";
	
	/** IN GAME NAMES **/
	public static final String TutorialFire = "Tutorial Fire 1";
	public static final String TutorialPortal = "Tutorial Portal 1";
	public static final String TutorialGrass = "Tutorial Grass 1";
	public static final String TutorialDirt = "Tutorial Dirt 1";
	public static final String TutorialStone = "Tutoral Stone 1";
	public static final String Lighter = "Tutorial Lighter 1";
	public static final String PortalPlacer = "Portal Placer 1";
	public static final String TutorialLeaf = "Tutorial Leaf 1";
	public static final String TutorialLog = "Tutorial Log 1";
	public static final String TutorialSapling = "Tutorial Sapling 1";

	/** gets the In game name **/
	public static String getGameName()
	{
		if(blockID == 2000)
		{
			return NamesMulti.TutorialFire;
		}
		if(blockID == 2001)
		{
			return NamesMulti.TutorialPortal;
		}
		if(blockID == 200)
		{
			return NamesMulti.TutorialGrass;
		}
		if(blockID == 201)
		{
			return NamesMulti.TutorialDirt;
		}
		if(blockID == 202)
		{
			return NamesMulti.TutorialStone;
		}
		return null;
	}
}
