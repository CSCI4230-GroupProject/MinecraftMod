package gmail.carlosparrilla32.com.items;

import gmail.carlosparrilla32.com.help.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTestPoisonSword extends ItemSword
{
	public final ToolMaterial toolMaterial;
	
	public ItemTestPoisonSword(ToolMaterial EnumToolMaterial)
	{
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		//setCreativeTab(ModTabs.tabAscension);
	}
	public boolean hitEntity(ItemStack stack, EntityLivingBase enemy, EntityLivingBase player)
	{
		stack.damageItem(1, player);
		
		enemy.addPotionEffect(new PotionEffect(Potion.poison.id, 20*30, 1));
		
		return true;
	}

	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}

