package gmail.carlosparrilla32.com.init;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import gmail.carlosparrilla32.com.Main;
import gmail.carlosparrilla32.com.help.Reference;
import gmail.carlosparrilla32.com.help.RegisterHelper;
import gmail.carlosparrilla32.com.entity.EntityTest;

public class ModEntities 
{
	static int startEntityID;
	static int i;
	
	public static void init()
	{
		registerModEntity(EntityTest.class, "Test");
	}

	public static void registerModProjectile(Class entityClass, String name)
	{
		EntityRegistry.registerModEntity(entityClass, name, ++startEntityID, Reference.MODID, 64, 10, true);
		System.out.println("Registering mod projectile " + name + " with ID = " + startEntityID);
	}
	
	public static void registerModEntity(Class entityClass, String name)
	{
                EntityRegistry.registerModEntity(entityClass, name, ++startEntityID, Reference.MODID, 80, 3, false);
                System.out.println("Registering mod entity " + name + " with ID = " + startEntityID);
	}
	
	public static void registerModEntityEgg(Class entityClass, String name, int primary, int secondary)
	{	
		registerModEntity(entityClass, name);
		
		if (i == 0)
		{
			registerSpawnEgg(name, primary, secondary);
			++i;
		}
	}
	
	public static void registerSpawnEgg(String name, int primary, int secondary)
	{
		
	}
	
	public static int getUniqueEntityId()
    {
    	do
    	{
    		startEntityID++;
    	}
    	while (EntityList.getStringFromID(startEntityID) != null);

    	return startEntityID;
    }


}
