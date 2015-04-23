package gmail.carlosparrilla32.com.help;

import gmail.carlosparrilla32.com.entity.EntityTest;
import gmail.carlosparrilla32.models.ModelTest;
import gmail.carlosparrilla32.render.RenderTest;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.Item;
import net.minecraft.world.biome.BiomeGenBase;

public class RegisterHelper
{
	static int IDName = 12;
	
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, Reference.MODID + block.getUnlocalizedName().substring(5));
	}

	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, Reference.MODID + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenderInformation() 
	{
		//we pass the EntityName.class and RenderName(new ModelName(), ?)
		RenderingRegistry.registerEntityRenderingHandler(EntityTest.class,
				new RenderTest(new ModelTest(), 0.5F));
	}
	
	public static void registerMob(EntityCreature mob, BiomeGenBase biome) 
	{
		
		//Register the mob and adds name, id, and mod name, number? number? false?
		EntityRegistry.registerModEntity(EntityTest.class, "MobName", IDName,
					Reference.MODID, 80, 3, false);
		
		//Add the ability to spawn in the game. Pass the mobs Entity class, probability to spawn, min amount and max amount, its type which is create and where it will spawn.
		EntityRegistry.addSpawn(EntityTest.class, 100, 5, 15,		EnumCreatureType.creature, biome);

		}
}

