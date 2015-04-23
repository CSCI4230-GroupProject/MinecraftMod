package gmail.carlosparrilla32.com.entity;

//start of imports
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
//end of imports


//This needs to extend EntityCreature
public class EntityTest extends EntityCreature
{
      

	//constructor for the class
      public EntityTest(World par1World) 
      {
              super(par1World);

              //The below means if possible, it will avoid water. False if you want it to walk in water
              this.getNavigator().setAvoidsWater(true);


              //This is the hitbox size. I believe it starts in the center and grows outwards
              this.setSize(1.5F, 0.9F);


              //can it withstand fire true for yes false for no 
              this.isImmuneToFire = false;

		   //not sure
              float var2 = 0.25F;



//Now, we have the AI. Each number in the addTask is a priority. 0 is the highest, the largest is lowest. Therefore if an action needs to come first have it have a lower number. Only one task can happen at a time therefore order is important

//There are tons of tasks you can add. Use the online forge to search for more

//all actions will be(# is the priority): 
		//this.task.addTask(#, new action(parameters usually this, and a number)
              //Swimming should ALWAYS be first. Otherwise if your mob falls in water. So do NOT change this one.
              this.tasks.addTask(0, new EntityAISwimming(this));


              //mob run away when you punch it. Mob needs some type of leg for this to work
              this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));


              //makes the mob walk around. Without it, it'd just stand still. Mob must have legs of some sort.
              this.tasks.addTask(5, new EntityAIWander(this, var2));


              //This makes the mob watch the nearest player, the second parameter is distance it begins to watch
              this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));


              // makes it look around when it's not looking at a player or wandering. The idle of the mob
              this.tasks.addTask(7, new EntityAILookIdle(this));
      }


      //This is REQUIRED. Turns on all previous tasked defined. If it's false, none of the above takes effect.
      public boolean isAIEnabled() 
      {
              return true;
      }
      
     
//Need Health, need to look up the correct way to do this. (MAY NOT BE RIGHT)
     protected void applyEntityAttributes()
     {
  	   super.applyEntityAttributes();
  	   getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.2D);
  	   getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(0.8D);
     }
      


      //Sound of the Mob 
      protected String getLivingSound() 
      {
              return "mob.glog.say";
      }
      

      //Sound of Mob when hurt
      protected String getHurtSound() 
      {
              return "mob.glog.say";
      }
      

      //Sound it makes when it Dies
      protected String getDeathSound() 
      {
              return "mob.glog.death";
      }


      //sound the feet make  
      protected void playStepSound(int par1, int par2, int par3, int par4) 
      {
              this.worldObj.playSoundAtEntity(this, "mob.glog.step", 0.15F,  1.0F);
      }
      
      
      //This is required regardless of if your animal can breed or not. Set to null if it can't breed. All mob need this in the code. So don’t forget to add or you will get errors
      public EntityAgeable createChild(EntityAgeable var1) 
      {
              return null;
      }
}


//More task (actions) can be added. There will be a list in forge to see what actions can be added. Don’t forget the swimming AI must come first.