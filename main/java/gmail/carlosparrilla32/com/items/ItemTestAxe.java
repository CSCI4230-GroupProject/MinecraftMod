package gmail.carlosparrilla32.com.items;

import gmail.carlosparrilla32.com.help.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemAxe;

public class ItemTestAxe extends ItemAxe
{
	public final ToolMaterial toolMaterial;
	
	public ItemTestAxe(ToolMaterial EnumToolMaterial)
	{
		super(EnumToolMaterial);
		toolMaterial = EnumToolMaterial;
		//setCreativeTab(ModTabs.tabAscension);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.itemIcon = par1IconRegister.registerIcon(Reference.MODID + ":" + getUnlocalizedName().substring(5));
	}
}