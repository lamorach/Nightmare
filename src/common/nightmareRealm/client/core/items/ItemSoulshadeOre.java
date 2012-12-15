package nightmareRealm.client.core.items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

///from mining red
public class ItemSoulshadeOre extends Item
{
	public ItemSoulshadeOre(int id, int spriteIndex)
	{
		super(id);
		this.setIconIndex(spriteIndex);
		this.setItemName("SoulshadeOre");
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	@SideOnly(Side.CLIENT)
	public int getItemIconFromDamge(int i)
	{
		return 0;
	}
	
	@Override
	public String getTextureFile()
	{
		return "/nmGFX/items.png";
	
	}

}
