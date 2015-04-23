package gmail.carlosparrilla32.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTest extends ModelBase
{
	//fields
	 ModelRenderer lArm;
	 ModelRenderer rArm;
	 ModelRenderer Head;
	 ModelRenderer Sword;
	 ModelRenderer Sword2;
	 ModelRenderer Sword3;
	 ModelRenderer Legs;
	 ModelRenderer Legs2;

	public ModelTest()
	{
	 textureWidth = 64;
	 textureHeight = 32;
	 
	   lArm = new ModelRenderer(this, 0, 0);
	   lArm.addBox(0F, 0F, 0F, 5, 5, 5);
	   lArm.setRotationPoint(0F, 0F, 0F);
	   lArm.setTextureSize(64, 32);
	   lArm.mirror = true;
	   setRotation(lArm, 0F, 0F, 0F);
	   rArm = new ModelRenderer(this, 0, 0);
	   rArm.addBox(-5F, 0F, 0F, 5, 5, 5);
	   rArm.setRotationPoint(-3F, 0F, 0F);
	   rArm.setTextureSize(64, 32);
	   rArm.mirror = true;
	   setRotation(rArm, 0F, 0F, 0F);
	   Head = new ModelRenderer(this, 0, 0);
	   Head.addBox(0F, -5F, 0F, 5, 5, 5);
	   Head.setRotationPoint(-4F, 2F, 3F);
	   Head.setTextureSize(64, 32);
	   Head.mirror = true;
	   setRotation(Head, 0F, 0F, 0F);
	   Sword = new ModelRenderer(this, -2, -2);
	   Sword.addBox(-6F, 0F, 0F, 6, 2, 2);
	   Sword.setRotationPoint(-6F, -3F, 2F);
	   Sword.setTextureSize(64, 32);
	   Sword.mirror = true;
	   setRotation(Sword, 0F, 0F, 0F);
	   Sword2 = new ModelRenderer(this, 0, 0);
	   Sword2.addBox(-1F, -2F, -1F, 2, 8, 2);
	   Sword2.setRotationPoint(-9F, -9F, 3F);
	   Sword2.setTextureSize(64, 32);
	   Sword2.mirror = true;
	   setRotation(Sword2, 0F, 0F, 0F);
	   Sword3 = new ModelRenderer(this, 0, 0);
	   Sword3.addBox(0F, 0F, 0F, 2, 3, 2);
	   Sword3.setRotationPoint(-10F, -1F, 2F);
	   Sword3.setTextureSize(64, 32);
	   Sword3.mirror = true;
	   setRotation(Sword3, 0F, 0F, 0F);
	   Legs = new ModelRenderer(this, 0, 0);
	   Legs.addBox(0F, 0F, 0F, 5, 5, 5);
	   Legs.setRotationPoint(-4F, 5F, 0F);
	   Legs.setTextureSize(64, 32);
	   Legs.mirror = true;
	   setRotation(Legs, 0F, 0F, 0F);
	   Legs2 = new ModelRenderer(this, 0, 0);
	   Legs2.addBox(0F, 0F, 0F, 5, 5, 5);
	   Legs2.setRotationPoint(-4F, 10F, 0F);
	   Legs2.setTextureSize(64, 32);
	   Legs2.mirror = true;
	   setRotation(Legs2, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
	 super.render(entity, f, f1, f2, f3, f4, f5);
	 setRotationAngles(f, f1, f2, f3, f4, f5);
	 lArm.render(f5);
	 rArm.render(f5);
	 Head.render(f5);
	 Sword.render(f5);
	 Sword2.render(f5);
	 Sword3.render(f5);
	 Legs.render(f5);
	 Legs2.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
	 model.rotateAngleX = x;
	 model.rotateAngleY = y;
	 model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
	 super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
	}

}


