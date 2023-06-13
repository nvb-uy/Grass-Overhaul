package elocindev.grassoverhaul;

import elocindev.grassoverhaul.init.SodBlocks;
import elocindev.grassoverhaul.init.SodItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
// import org.slf4j.Logger;

@Mod(GrassOverhaul.MODID)
public class GrassOverhaul
{
    // private static final Logger LOGGER = LogUtils.getLogger(); // Not being used currently
    public static final String MODID = "grassoverhaul";

    public GrassOverhaul() {	
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        SodBlocks.REGISTRY.register(bus);
		SodItems.REGISTRY.register(bus);
        MinecraftForge.EVENT_BUS.register(this);

    }
}
