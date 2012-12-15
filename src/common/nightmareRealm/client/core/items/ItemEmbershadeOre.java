package nightmareRealm.client.core.items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

///from mining and creatures orange
public class ItemEmbershadeOre extends Item
{
	public ItemEmbershadeOre(int id, int spriteIndex)
	{
		super(id);
		this.setIconIndex(spriteIndex);
		this.setItemName("EmbershadeOre");
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
