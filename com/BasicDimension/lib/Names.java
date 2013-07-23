package com.BasicDimension.lib;

import net.minecraft.block.Block;

public class Names 
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
	public static final String TutorialFire = "Tutorial Fire";
	public static final String TutorialPortal = "Tutorial Portal";
	public static final String TutorialGrass = "Tutorial Grass";
	public static final String TutorialDirt = "Tutorial Dirt";
	public static final String TutorialStone = "Tutoral Stone";
	public static final String Lighter = "Tutorial Lighter";
	public static final String PortalPlacer = "Portal Placer";
	public static final String TutorialLeaf = "Tutorial Leaf";
	public static final String TutorialLog = "Tutorial Log";
	public static final String TutorialSapling = "Tutorial Sapling";

	/** gets the In game name **/
	public static String getGameName()
	{
		if(blockID == 2000)
		{
			return Names.TutorialFire;
		}
		if(blockID == 2001)
		{
			return Names.TutorialPortal;
		}
		if(blockID == 200)
		{
			return Names.TutorialGrass;
		}
		if(blockID == 201)
		{
			return Names.TutorialDirt;
		}
		if(blockID == 202)
		{
			return Names.TutorialStone;
		}
		return null;
	}
}
