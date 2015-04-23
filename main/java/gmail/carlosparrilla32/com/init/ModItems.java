package gmail.carlosparrilla32.com.init;

import gmail.carlosparrilla32.com.help.RegisterHelper;
import gmail.carlosparrilla32.com.items.ItemGrassArmor;
import gmail.carlosparrilla32.com.items.ItemHappyFeetArmor;
import gmail.carlosparrilla32.com.items.ItemLeatherArmor;
import gmail.carlosparrilla32.com.items.ItemScaleArmor;
import gmail.carlosparrilla32.com.items.ItemTestAxe;
import gmail.carlosparrilla32.com.items.ItemTestPickaxe;
import gmail.carlosparrilla32.com.items.ItemTestPoisonSword;
import gmail.carlosparrilla32.com.items.ItemTestSword;
import gmail.carlosparrilla32.com.items.ItemTuxArmor;
import gmail.carlosparrilla32.com.items.ItemWoodArmor;
import gmail.carlosparrilla32.com.items.TestItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static Item enchantedWood = new TestItem().setUnlocalizedName("enchantedWood");
	public static Item scales = new TestItem().setUnlocalizedName("scales");
	public static Item claws = new TestItem().setUnlocalizedName("claws");
	public static Item betterLeather = new TestItem().setUnlocalizedName("betterLeather");
	

	static Item.ToolMaterial magicWood = EnumHelper.addToolMaterial("magicWood", 2, 512, 2.0F, 2.0F, 14);
	static Item.ToolMaterial snakeScales = EnumHelper.addToolMaterial("SnakeScales", 2, 512, 2.0F, 2.0F, 14);
	static Item.ToolMaterial wolfClaws = EnumHelper.addToolMaterial("wolfClaws", 2, 512, 2.0F, 2.0F, 14);
	static Item.ToolMaterial imporvedLeather = EnumHelper.addToolMaterial("improvedLeather", 2, 512, 2.0F, 2.0F, 14);
	static Item.ToolMaterial poisonCoatedMetal = EnumHelper.addToolMaterial("poisonCoatedMetal", 2, 512, 2.0F, 2.0F, 14);
	
	
	public static Item woodSword = new ItemTestSword(magicWood).setUnlocalizedName("woodSword");
	public static Item woodAxe = new ItemTestAxe(magicWood).setUnlocalizedName("WoodAxe");
	
	public static Item scaleSword = new ItemTestSword(snakeScales).setUnlocalizedName("scaleSword");
	public static Item scalePick = new ItemTestPickaxe(snakeScales).setUnlocalizedName("scalePick");
	
	public static Item clawSword = new ItemTestSword(wolfClaws).setUnlocalizedName("clawSword");
	public static Item clawPick = new ItemTestPickaxe(wolfClaws).setUnlocalizedName("clawPick");
	
	public static Item poisonSword = new ItemTestPoisonSword(poisonCoatedMetal).setUnlocalizedName("poisonSword");
	
	static ArmorMaterial AMagicWood = EnumHelper.addArmorMaterial("AMagicWood", 20, new int[]{3, 7, 5, 2}, 14);
	static ArmorMaterial ASnakeScales = EnumHelper.addArmorMaterial("ASnakeScales", 20, new int[]{3, 7, 5, 2}, 14);
	static ArmorMaterial AWolfClaws = EnumHelper.addArmorMaterial("AWolfClaws", 20, new int[]{3, 7, 5, 2}, 14);
	static ArmorMaterial AImprovedLeather = EnumHelper.addArmorMaterial("AImprovedLeather", 20, new int[]{3, 7, 5, 2}, 14);
	static ArmorMaterial AGrass = EnumHelper.addArmorMaterial("AGrass", 20, new int[]{3, 7, 5, 2}, 14);
	static ArmorMaterial APenguinHide = EnumHelper.addArmorMaterial("APenguinHide", 20, new int[]{3, 7, 5, 2}, 14);
	
    public static Item woodHelm = new ItemWoodArmor(AMagicWood, 0, "woodHelm");
	public static Item woodPlate = new ItemWoodArmor(AMagicWood, 1, "woodPlate");
	public static Item woodPants = new ItemWoodArmor(AMagicWood, 2, "woodPants");
	public static Item woodBoots = new ItemWoodArmor(AMagicWood, 3, "woodBoots");
	
	public static Item scaleHelm = new ItemScaleArmor(ASnakeScales, 0, "scaleHelm");
	public static Item scalePlate = new ItemScaleArmor(ASnakeScales, 1, "scalePlate");
	public static Item scalePants = new ItemScaleArmor(ASnakeScales, 2, "scalePants");
	public static Item scaleBoots = new ItemScaleArmor(ASnakeScales, 3, "scaleBoots");
	
	public static Item betterLeatherHelm = new ItemLeatherArmor(AImprovedLeather, 0, "betterLeatherHelm");
	public static Item betterLeatherPlate = new ItemLeatherArmor(AImprovedLeather, 1, "betterLeatherPlate");
	public static Item betterLeatherPants = new ItemLeatherArmor(AImprovedLeather, 2, "betterLeatherPants");
	public static Item betterLeatherBoots = new ItemLeatherArmor(AImprovedLeather, 3, "betterLeatherBoots");
	
	public static Item grassHelm = new ItemGrassArmor(AGrass, 0, "grassHelm");
	public static Item grassPlate = new ItemGrassArmor(AGrass, 1, "grassPlate");
	public static Item grassPants = new ItemGrassArmor(AGrass, 2, "grassPants");
	public static Item grassBoots = new ItemGrassArmor(AGrass, 3, "grassBoots");
	
	public static Item tuxHelm = new ItemTuxArmor(APenguinHide, 0, "tuxHelm");
	public static Item tuxPlate = new ItemTuxArmor(APenguinHide, 1, "tuxPlate");
	public static Item tuxPants = new ItemTuxArmor(APenguinHide, 2, "tuxPants");
	public static Item tuxBoots = new ItemTuxArmor(APenguinHide, 3, "tuxBoots");
	
	public static Item happyFeetBoots = new ItemHappyFeetArmor(APenguinHide, 3, "happyFeetBoots");
	
	public static void init()
	{
		RegisterHelper.registerItem(enchantedWood);
		RegisterHelper.registerItem(scales);
		RegisterHelper.registerItem(claws);
		RegisterHelper.registerItem(betterLeather);
		
		RegisterHelper.registerItem(woodSword);
		RegisterHelper.registerItem(woodAxe);
		
		RegisterHelper.registerItem(scaleSword);
		RegisterHelper.registerItem(scalePick);
		
		RegisterHelper.registerItem(clawSword);
		RegisterHelper.registerItem(clawPick);
		
		RegisterHelper.registerItem(poisonSword);
		
		RegisterHelper.registerItem(woodHelm);
		RegisterHelper.registerItem(woodPlate);
		RegisterHelper.registerItem(woodPants);
		RegisterHelper.registerItem(woodBoots);
		
		RegisterHelper.registerItem(scaleHelm);
		RegisterHelper.registerItem(scalePlate);
		RegisterHelper.registerItem(scalePants);
		RegisterHelper.registerItem(scaleBoots);
		
		RegisterHelper.registerItem(betterLeatherHelm);
		RegisterHelper.registerItem(betterLeatherPlate);
		RegisterHelper.registerItem(betterLeatherPants);
		RegisterHelper.registerItem(betterLeatherBoots);
		
		RegisterHelper.registerItem(grassHelm);
		RegisterHelper.registerItem(grassPlate);
		RegisterHelper.registerItem(grassPants);
		RegisterHelper.registerItem(grassBoots);
		
		RegisterHelper.registerItem(tuxHelm);
		RegisterHelper.registerItem(tuxPlate);
		RegisterHelper.registerItem(tuxPants);
		RegisterHelper.registerItem(tuxBoots);
		
		RegisterHelper.registerItem(happyFeetBoots);
		
		
	}

}
