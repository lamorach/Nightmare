package net.minecraft.src;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

@SideOnly(Side.CLIENT)
public enum EnumOS
{
    LINUX,
    SOLARIS,
    WINDOWS,
    MACOS,
    UNKNOWN;
}
