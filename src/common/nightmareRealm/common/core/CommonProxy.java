package nightmareRealm.common.core;

import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.TileEntity;
import net.minecraft.src.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import nightmareRealm.client.core.items.ItemSoulshadeOre;
import nightmareRealm.common.nightmareRealm;


public class CommonProxy implements IGuiHandler{

	public void registerRenderInformation() //Client side texture registering
	{
		
	}
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{ //For GUI's
		return null;
	}
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{ //For GUI's
		return null;
	}
	public void registerTiles()
	{ //For registering TileEntities
		
	}
	public void registerBlocks()
	{ //For registering Blocks
	}
	public void addNames()
	{ //For adding Item's ingame names
		
	}
	public void addRecipes()
	{ //For adding your Item's recipes
		
	}
	
}

