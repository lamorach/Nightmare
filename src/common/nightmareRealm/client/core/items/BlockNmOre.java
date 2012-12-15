package nightmareRealm.client.core.items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.World;
import nightmareRealm.common.nightmareRealm;

import java.util.Random;

public class BlockNmOre extends Block
{
	public BlockNmOre(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
	public int idDropped(int par1, Random par2Random, int par3)
    {
        return this.blockID == nightmareRealm.SoulshadeBlock.blockID ? nightmareRealm.SoulshadeOre.shiftedIndex : (this.blockID == nightmareRealm.NightshadeBlock.blockID ? nightmareRealm.NightshadeOre.shiftedIndex :  (this.blockID == nightmareRealm.EmbershadeBlock.blockID ? nightmareRealm.EmbershadeOre.shiftedIndex : this.blockID));
    }
    

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return  1;
    }

    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int par1, Random par2Random)
    {
        if (par1 > 0 && this.blockID != this.idDropped(0, par2Random, par1))
        {
            int var3 = par2Random.nextInt(par1 + 2) - 1;

            if (var3 < 0)
            {
                var3 = 0;
            }

            return this.quantityDropped(par2Random) * (var3 + 1);
        }
        else
        {
            return this.quantityDropped(par2Random);
        }
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        super.dropBlockAsItemWithChance(par1World, par2, par3, par4, par5, par6, par7);

        if (this.idDropped(par5, par1World.rand, par7) != this.blockID)
        {
            int var8 = 0;

            if (this.blockID == nightmareRealm.NightshadeBlock.blockID)
            {
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 0, 2);
            }
            else if (this.blockID == nightmareRealm.SoulshadeBlock.blockID)
            {
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
            else if (this.blockID == nightmareRealm.EmbershadeBlock.blockID)
            {
                var8 = MathHelper.getRandomIntegerInRange(par1World.rand, 3, 7);
            }
          

            this.dropXpOnBlockBreak(par1World, par2, par3, par4, var8);
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return  0;
    }
}




