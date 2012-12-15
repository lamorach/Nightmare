package nightmareRealm.client.core.items;


import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemSword;

public class ItemNightshadeSword extends ItemSword
{
	 public ItemNightshadeSword(int itemID, EnumToolMaterial toolMaterial)
	 {
	  super(itemID, toolMaterial);
	  this.setCreativeTab(CreativeTabs.tabCombat);
	 }
	 public String getTextureFile()
	 {
	  return "/nmGFX/items.png";
	 }

}
