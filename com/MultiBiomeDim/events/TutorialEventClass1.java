package com.MultiBiomeDim.events;

import java.awt.Event;
import java.util.ArrayList;
import java.util.Random;

import com.MultiBiomeDim.Main;
import com.MultiBiomeDim.blocks.BlockTutorialSapling1;

import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.BonemealEvent;

public class TutorialEventClass1
{
	private int BlockID;
	/** Used to make the sapling grow the tree **/
	@ForgeSubscribe
	public void bonemealUsed(BonemealEvent event)
	{
		if(event.world.getBlockId(event.X, event.Y, event.Z) == Main.TutorialSapling1.blockID)
		{
			((BlockTutorialSapling1)Main.TutorialSapling1).growTree(event.world, event.X, event.Y, event.Z, event.world.rand);
		}
	}
}