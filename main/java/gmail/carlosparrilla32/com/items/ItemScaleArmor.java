package gmail.carlosparrilla32.com.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import gmail.carlosparrilla32.com.help.Reference;
import gmail.carlosparrilla32.com.init.ModItems;

public class ItemScaleArmor extends ItemArmor
{	
       public ItemScaleArmor(ArmorMaterial material, int ArmorType, String name) 
	{
		super(material, 0, ArmorType);
		setUnlocalizedName(name);
		setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
		//setCreativeTab(ModTabs.tabAscension);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == ModItems.scaleHelm || stack.getItem() == ModItems.scalePlate || stack.getItem() == ModItems.scaleBoots)
		{
			return Reference.MODID + ":textures/armor/titanium_layer1.png";
		}
		else if (stack.getItem() == ModItems.scalePants)
		{
			return Reference.MODID + ":textures/armor/titanium_layer2.png";
		}
		else
		{
			return null;
		}	
	}
}