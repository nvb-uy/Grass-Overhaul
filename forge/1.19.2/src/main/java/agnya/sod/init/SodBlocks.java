package agnya.sod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;
import agnya.sod.blocks.SodBlock;
import agnya.sod.blocks.SodSlab;
import agnya.sod.blocks.SodStairs;
import agnya.sod.blocks.TintableSodBlock;
import agnya.sod.blocks.TintableSodPatch;
import agnya.sod.blocks.TintableSodSlab;
import agnya.sod.blocks.TintableSodStairs;
import agnya.sod.blocks.SodPatch;
import agnya.sod.Sod;

public class SodBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, Sod.MODID);

	public static final RegistryObject<Block> DIRT_SOD_STAIRS = REGISTRY.register("dirt_sod_stairs", () -> new SodStairs(() -> Blocks.DIRT.defaultBlockState(), Properties.of(Material.DIRT).strength(0.6F)));
	public static final RegistryObject<Block> DIRT_SOD_SLAB = REGISTRY.register("dirt_sod_slab", () -> new SodSlab(Properties.of(Material.DIRT).strength(0.6F)));
	public static final RegistryObject<Block> DIRT_SOD_PATCH = REGISTRY.register("dirt_sod_patch", () -> new SodPatch(Properties.of(Material.DIRT).strength(0.6F)));
	
	public static final RegistryObject<Block> GRASS_SOD_BLOCK = REGISTRY.register("grass_sod_block", () -> new TintableSodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> GRASS_SOD_STAIRS = REGISTRY.register("grass_sod_stairs", () -> new TintableSodStairs(() -> GRASS_SOD_BLOCK.get().defaultBlockState(), Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> GRASS_SOD_SLAB = REGISTRY.register("grass_sod_slab", () -> new TintableSodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> GRASS_SOD_PATCH = REGISTRY.register("grass_sod_patch", () -> new TintableSodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> PATH_SOD_BLOCK = REGISTRY.register("path_sod_block", () -> new SodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PATH_SOD_STAIRS = REGISTRY.register("path_sod_stairs", () -> new SodStairs(() -> PATH_SOD_BLOCK.get().defaultBlockState(), Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PATH_SOD_SLAB = REGISTRY.register("path_sod_slab", () -> new SodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PATH_SOD_PATCH = REGISTRY.register("path_sod_patch", () -> new SodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> MYCELIUM_SOD_BLOCK = REGISTRY.register("mycelium_sod_block", () -> new SodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> MYCELIUM_SOD_STAIRS = REGISTRY.register("mycelium_sod_stairs", () -> new SodStairs(() -> MYCELIUM_SOD_BLOCK.get().defaultBlockState(), Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> MYCELIUM_SOD_SLAB = REGISTRY.register("mycelium_sod_slab", () -> new SodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> MYCELIUM_SOD_PATCH = REGISTRY.register("mycelium_sod_patch", () -> new SodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> PODZOL_SOD_BLOCK = REGISTRY.register("podzol_sod_block", () -> new SodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PODZOL_SOD_STAIRS = REGISTRY.register("podzol_sod_stairs", () -> new SodStairs(() -> PODZOL_SOD_BLOCK.get().defaultBlockState(), Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PODZOL_SOD_SLAB = REGISTRY.register("podzol_sod_slab", () -> new SodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PODZOL_SOD_PATCH = REGISTRY.register("podzol_sod_patch", () -> new SodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_BLOCK = REGISTRY.register("crimson_nylium_sod_block",
			() -> new SodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_STAIRS = REGISTRY.register("crimson_nylium_sod_stairs",
			() -> new SodStairs(() -> CRIMSON_NYLIUM_SOD_BLOCK.get().defaultBlockState(), Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_SLAB = REGISTRY.register("crimson_nylium_sod_slab",
			() -> new SodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_PATCH = REGISTRY.register("crimson_nylium_sod_patch",
			() -> new SodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_BLOCK = REGISTRY.register("warped_nylium_sod_block",
			() -> new SodBlock(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_STAIRS = REGISTRY.register("warped_nylium_sod_stairs",
			() -> new SodStairs(() -> WARPED_NYLIUM_SOD_BLOCK.get().defaultBlockState(), Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_SLAB = REGISTRY.register("warped_nylium_sod_slab",
			() -> new SodSlab(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_PATCH = REGISTRY.register("warped_nylium_sod_patch",
			() -> new SodPatch(Properties.of(Material.GRASS).strength(0.6F).sound(SoundType.NYLIUM)));

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			TintableSodBlock.blockColorLoad(event);
			TintableSodStairs.blockColorLoad(event);
			TintableSodSlab.blockColorLoad(event);
			TintableSodPatch.blockColorLoad(event);
		}

		@SubscribeEvent
		public static void itemColorLoad(RegisterColorHandlersEvent.Item event) {
			TintableSodBlock.itemColorLoad(event);
			TintableSodStairs.itemColorLoad(event);
			TintableSodSlab.itemColorLoad(event);
			TintableSodPatch.itemColorLoad(event);
		}
	}
}
