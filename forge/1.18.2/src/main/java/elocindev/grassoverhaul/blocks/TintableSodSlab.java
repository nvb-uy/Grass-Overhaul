package elocindev.grassoverhaul.blocks;

import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.GrassColor;
import elocindev.grassoverhaul.init.SodBlocks;
import net.minecraft.client.renderer.BiomeColors;

public class TintableSodSlab extends SodSlab {
    public TintableSodSlab(Properties p_49795_) {
        super(p_49795_);
    }

	@OnlyIn(Dist.CLIENT)
	public static void blockColorLoad(ColorHandlerEvent.Block event) {
		event.getBlockColors().register((bs, world, pos, index) -> {
			return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5D, 1.0D);
		}, SodBlocks.GRASS_SOD_SLAB.get());
	}

	@OnlyIn(Dist.CLIENT)
	public static void itemColorLoad(ColorHandlerEvent.Item event) {
		event.getItemColors().register((stack, index) -> {
			return GrassColor.get(0.5D, 1.0D);
		}, SodBlocks.GRASS_SOD_SLAB.get());
	}
}
