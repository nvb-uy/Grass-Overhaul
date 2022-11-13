package elocindev.grassoverhaul;

import elocindev.grassoverhaul.init.SodBlocks;
import elocindev.grassoverhaul.init.SodItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
// import org.slf4j.Logger;

@Mod(GrassOverhaul.MODID)
public class GrassOverhaul
{
    // private static final Logger LOGGER = LogUtils.getLogger(); // Not being used currently
    public static final String MODID = "sod";
    public static CreativeModeTab TAB_SOD;

    public GrassOverhaul() {	
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        TAB_SOD = new CreativeModeTab("tabsod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SodBlocks.GRASS_SOD_PATCH.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};

        SodBlocks.REGISTRY.register(bus);
		SodItems.REGISTRY.register(bus);
        MinecraftForge.EVENT_BUS.register(this);

    }
}
