package gmail.carlosparrilla32.render;

//what needs to be imported
import gmail.carlosparrilla32.com.help.Reference;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
//end of imports


//needs to extends RenderLiving 
public class RenderTest extends RenderLiving{
	

	//location for the texture for the mob
	protected ResourceLocation nameTexture = new ResourceLocation(Reference.MODID + ":textures/models/TestModel1.png");


	
	//constructor for Rendering the mob
	public RenderTest(ModelBase model, float shadowSize) 
	{
		super(model, shadowSize);
		//call function to set the location of the texture
		setEntityTexture();
	}


	//the getter user within the game to get the texture of the mob
	@Override
	protected ResourceLocation getEntityTexture(Entity name) 
	{
		// TODO Auto-generated method stub
		return nameTexture; //return the texture location
	}
	

	//the setter for the location of the texture for the mob
	protected void setEntityTexture()
	{
		//saves the location of the texture
		nameTexture = new ResourceLocation("carlosparrilla32_test:textures/models/Test.png");
	}

	
	
}
