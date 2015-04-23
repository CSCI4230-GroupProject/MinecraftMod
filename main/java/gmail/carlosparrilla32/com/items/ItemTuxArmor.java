package gmail.carlosparrilla32.com.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import gmail.carlosparrilla32.com.help.Reference;
import gmail.carlosparrilla32.com.init.ModItems;

public class ItemTuxArmor extends ItemArmor
{	
       public ItemTuxArmor(ArmorMaterial material, int ArmorType, String name) 
	{
		super(material, 0, ArmorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		//setCreativeTab(ModTabs.tabAscension);
	}
       
       @Override
   	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
   	{
    	   if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ModItems.tuxBoots) 
   				&& player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(ModItems.tuxPants) 
   				&& player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(ModItems.tuxPlate) 
   				&& player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(ModItems.tuxHelm))
    	   {
   				player.addPotionEffect(new PotionEffect(Potion.jump.id, 20*20));
    	   }

   	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == ModItems.tuxHelm || stack.getItem() == ModItems.tuxPlate || stack.getItem() == ModItems.tuxBoots)
		{
			return Reference.MODID + ":textures/armor/titanium_layer1.png";
		}
		else if (stack.getItem() == ModItems.tuxPants)
		{
			return Reference.MODID + ":textures/armor/titanium_layer2.png";
		}
		else
		{
			return null;
		}	
	}
}