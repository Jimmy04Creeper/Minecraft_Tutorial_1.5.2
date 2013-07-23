package com.BasicDimension.blocks;

import java.util.Random;

import com.BasicDimension.Main;
import com.BasicDimension.lib.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class BasicModBlock extends Block
{

    Block BlockID;
    public static Material blockMaterial;
    
    public BasicModBlock(int par1, Material material) 
    {
            super(par1, material);
            this.blockMaterial = material;
            setCreativeTab(CreativeTabs.tabBlock);
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
            return blockID;
    }


    public int quantityDropped(Random random)
    {
            return 1;
    }

    @Override
    public void registerIcons(IconRegister iconRegister)
    {
            blockIcon = iconRegister.registerIcon(Reference.MODID.toLowerCase() + ":" + this.getUnlocalizedName().substring(5));
    }

   @Override
    public boolean canSustainLeaves(World world, int x, int y, int z)
    {
            if(blockID == Main.TutorialDirt.blockID)
            {
                    return true;
            }
            if(blockID == Main.TutorialGrass.blockID)
            {
                    return true;
            }
            else
                    return false;
    }
}