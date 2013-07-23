package com.MultiBiomeDim.world;

import net.minecraft.util.ChunkCoordinates;

public class TutorialPortalPosition1 extends ChunkCoordinates
{
	public long field_85087_d;
	
	final TutorialTeleporter1 field_85088_e;
	
	public TutorialPortalPosition1(TutorialTeleporter1 tutorialTeleporter, int par2, int par3, int par4, long par5)
	{
		super(par2, par3, par4);
		this.field_85088_e = tutorialTeleporter;
		this.field_85087_d = par5;
	}
}