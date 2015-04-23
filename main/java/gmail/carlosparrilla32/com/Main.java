package gmail.carlosparrilla32.com;

import net.minecraft.entity.EntityCreature;
import net.minecraft.world.biome.BiomeGenBase;
import gmail.carlosparrilla32.com.crafting.Recipies;
import gmail.carlosparrilla32.com.entity.EntityTest;
import gmail.carlosparrilla32.com.help.Reference;
import gmail.carlosparrilla32.com.help.RegisterHelper;
import gmail.carlosparrilla32.com.init.ModBlocks;
import gmail.carlosparrilla32.com.init.ModEntities;
import gmail.carlosparrilla32.com.init.ModItems;
import gmail.carlosparrilla32.generation.TestWorldGeneration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)


public class Main
{
	public static EntityCreature mobName = new EntityTest(null);

	TestWorldGeneration eventWorldGen = new TestWorldGeneration();

	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		ModItems.init();
		ModBlocks.init();
		GameRegistry.registerWorldGenerator(this.eventWorldGen, 0);
		//ModEntities.init();
	}
	
	@Mod.EventHandler
	public void Init(FMLInitializationEvent event)
	{
		RegisterHelper.registerRenderInformation();
		RegisterHelper.registerMob(mobName, BiomeGenBase.plains);
		Recipies.init();
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
