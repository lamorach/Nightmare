package net.minecraft.src;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@SideOnly(Side.CLIENT)
public class TexturePackFolder extends TexturePackImplementation
{
    public TexturePackFolder(String par1Str, File par2File)
    {
        super(par1Str, par2File, par2File.getName());
    }

    /**
     * Gives a texture resource as InputStream.
     */
    public InputStream getResourceAsStream(String par1Str)
    {
        try
        {
            File var2 = new File(this.texturePackFile, par1Str.substring(1));

            if (var2.exists())
            {
                return new BufferedInputStream(new FileInputStream(var2));
            }
        }
        catch (IOException var3)
        {
            ;
        }

        return super.getResourceAsStream(par1Str);
    }
}
