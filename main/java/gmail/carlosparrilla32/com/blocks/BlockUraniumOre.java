package gmail.carlosparrilla32.com.blocks;

import gmail.carlosparrilla32.com.help.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockUraniumOre extends Block
{
        public BlockUraniumOre()
        {
                super(Material.iron);
                setCreativeTab(CreativeTabs.tabBlock);
                setBlockName("UraniumOre");
        		setBlockTextureName(Reference.MODID + ":" + "uraniumOre");
        		setStepSound(soundTypeStone);
      		  	setHardness(2.5F);
      		  	setResistance(10.0F);
      		  	setHarvestLevel("pickaxe", 3);

        		

        }
}

