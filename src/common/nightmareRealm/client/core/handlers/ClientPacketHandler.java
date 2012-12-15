package nightmareRealm.client.core.handlers;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.src.EntityPlayer;
import net.minecraft.src.INetworkManager;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Packet250CustomPayload;
import cpw.mods.fml.common.asm.SideOnly;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

@SideOnly(Side.CLIENT)
public class ClientPacketHandler implements IPacketHandler
{
@Override
public void onPacketData(INetworkManager manager, Packet250CustomPayload payload, Player player)
{
	DataInputStream data = new DataInputStream(new ByteArrayInputStream(payload.data)); //Handles incoming data
}

}