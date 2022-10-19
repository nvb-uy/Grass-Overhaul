package agnya.sod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
// import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;
// import net.minecraft.client.renderer.ItemBlockRenderTypes;
// import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import agnya.sod.blocks.SodBlock;
import agnya.sod.blocks.SodSlab;
import agnya.sod.blocks.TintableSodBlock;
import agnya.sod.blocks.TintableSodPatch;
import agnya.sod.blocks.TintableSodSlab;
import agnya.sod.blocks.SodPatch;
import agnya.sod.Sod;

public class SodBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Sod.MODID);
	public static final RegistryObject<Block> DIRT_SOD_SLAB = REGISTRY.register("dirt_sod_slab", () -> new SodSlab(Properties.of(Material.DIRT).strength(0.6F)));
	public static final RegistryObject<Block> DIRT_SOD_PATCH = REGISTRY.register("dirt_sod_patch", () -> new SodPatch(Properties.of(Material.DIRT).strength(0.6F)));
	public static final RegistryObject<Block> GRASS_SOD_BLOCK = REGISTRY.register("grass_sod_block", () -> new TintableSodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> GRASS_SOD_SLAB = REGISTRY.register("grass_sod_slab", () -> new TintableSodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> GRASS_SOD_PATCH = REGISTRY.register("grass_sod_patch", () -> new TintableSodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PATH_SOD_BLOCK = REGISTRY.register("path_sod_block", () -> new SodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PATH_SOD_SLAB = REGISTRY.register("path_sod_slab", () -> new SodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PATH_SOD_PATCH = REGISTRY.register("path_sod_patch", () -> new SodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> MYCELIUM_SOD_BLOCK = REGISTRY.register("mycelium_sod_block", () -> new SodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> MYCELIUM_SOD_SLAB = REGISTRY.register("mycelium_sod_slab", () -> new SodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> MYCELIUM_SOD_PATCH = REGISTRY.register("mycelium_sod_patch", () -> new SodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PODZOL_SOD_BLOCK = REGISTRY.register("podzol_sod_block", () -> new SodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PODZOL_SOD_SLAB = REGISTRY.register("podzol_sod_slab", () -> new SodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PODZOL_SOD_PATCH = REGISTRY.register("podzol_sod_patch", () -> new SodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_BLOCK = REGISTRY.register("crimson_nylium_sod_block",
			() -> new SodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_SLAB = REGISTRY.register("crimson_nylium_sod_slab",
			() -> new SodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_PATCH = REGISTRY.register("crimson_nylium_sod_patch",
			() -> new SodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_BLOCK = REGISTRY.register("warped_nylium_sod_block",
			() -> new SodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_SLAB = REGISTRY.register("warped_nylium_sod_slab",
			() -> new SodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_PATCH = REGISTRY.register("warped_nylium_sod_patch",
			() -> new SodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
/*
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			// Register render types for all slabs and patches (dirt, grass, path, mycelium, podzol, crimson nylium, warped nylium)
			ItemBlockRenderTypes.setRenderLayer(DIRT_SOD_SLAB.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(DIRT_SOD_PATCH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(GRASS_SOD_SLAB.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(GRASS_SOD_PATCH.get(), renderType -> renderType == RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(PATH_SOD_SLAB.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(PATH_SOD_PATCH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(MYCELIUM_SOD_SLAB.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(MYCELIUM_SOD_PATCH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(PODZOL_SOD_SLAB.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(PODZOL_SOD_PATCH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(CRIMSON_NYLIUM_SOD_SLAB.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(CRIMSON_NYLIUM_SOD_PATCH.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(WARPED_NYLIUM_SOD_SLAB.get(), RenderType.cutout());
			ItemBlockRenderTypes.setRenderLayer(WARPED_NYLIUM_SOD_PATCH.get(), RenderType.cutout());
		}*/

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			TintableSodBlock.blockColorLoad(event);
			TintableSodSlab.blockColorLoad(event);
			TintableSodPatch.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(ColorHandlerEvent.Item event) {
			TintableSodBlock.itemColorLoad(event);
			TintableSodSlab.itemColorLoad(event);
			TintableSodPatch.itemColorLoad(event);
		}
	}
}
