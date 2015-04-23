package gmail.carlosparrilla32.com.items;

import gmail.carlosparrilla32.com.help.Reference;
import gmail.carlosparrilla32.com.init.ModItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemHappyFeetArmor extends ItemArmor
{
	public ItemHappyFeetArmor(ArmorMaterial material, int ArmorType, String name) 
	{
		super(material, 0, ArmorType);
		setUnlocalizedName(name);
    	setTextureName(Reference.MODID + ":" + getUnlocalizedName().substring(5));
    	//setCreativeTab(ModTabs.tabAscension);
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack)
	{
		if (player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(ModItems.happyFeetBoots))
		{
			player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 20*1));
		}
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if (stack.getItem() == ModItems.betterLeatherHelm || stack.getItem() == ModItems.betterLeatherPlate || stack.getItem() == ModItems.betterLeatherBoots)
		{
			return Reference.MODID + ":textures/armor/titanium_layer1.png";
		}
		else if (stack.getItem() == ModItems.betterLeatherPants)
		{
			return Reference.MODID + ":textures/armor/titanium_layer2.png";
		}
		else
		{
			return null;
		}	
	}
}
