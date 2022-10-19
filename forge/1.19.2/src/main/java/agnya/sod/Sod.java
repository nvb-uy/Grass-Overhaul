package agnya.sod;

// import com.mojang.logging.LogUtils;

import agnya.sod.init.SodBlocks;
import agnya.sod.init.SodItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
// import org.slf4j.Logger;

@Mod("sod")
public class Sod
{
    // private static final Logger LOGGER = LogUtils.getLogger(); // Not being used currently
    public static String MODID = "sod";
    public static CreativeModeTab TAB_SOD;

    public Sod() {	
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
