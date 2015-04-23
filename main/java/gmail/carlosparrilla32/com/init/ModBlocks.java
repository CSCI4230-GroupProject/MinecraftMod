package gmail.carlosparrilla32.com.init;

import gmail.carlosparrilla32.com.blocks.BlockUraniumOre;
import gmail.carlosparrilla32.com.help.RegisterHelper;
import net.minecraft.block.Block;




public class ModBlocks 
{
	public static Block uraniumOre = new BlockUraniumOre();
	
	public static void init()
	{
		RegisterHelper.registerBlock(uraniumOre);
	}

}
