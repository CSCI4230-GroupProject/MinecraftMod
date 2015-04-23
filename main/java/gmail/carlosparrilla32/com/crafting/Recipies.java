package gmail.carlosparrilla32.com.crafting;

import gmail.carlosparrilla32.com.init.ModBlocks;
import gmail.carlosparrilla32.com.init.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class Recipies 
{
	public static void init()
	{

		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodSword), new Object[] {"A", "A", "B", 'A', ModItems.enchantedWood, 'B', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodAxe), new Object[] {"AAA", " B ", " B ", 'A', ModItems.enchantedWood, 'B', Items.stick});
		
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodHelm), new Object[] {"AAA", "A A", "   ", 'A', ModItems.enchantedWood});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodPlate), new Object[] {"A A", "AAA", "A A", 'A', ModItems.enchantedWood});
		GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodPants), new Object[] {"AA", "AA", "AA", 'A', ModItems.enchantedWood});
		//GameRegistry.addShapedRecipe(new ItemStack(ModItems.woodBoots), new Object[] {"AA", "   ", "   ", 'A', ModItems.enchantedWood});
		//GameRegistry.addShapelessRecipe(new ItemStack(Blocks.torch), new Object[] {new ItemStack(Items.stick), ModItems.enrichedUranium});
		//GameRegistry.addSmelting(ModBlocks.uraniumOre, new ItemStack(ModItems.enrichedUranium), 0.8F);

	}

}
