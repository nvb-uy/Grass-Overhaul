package elocindev.grassoverhaul.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;
import elocindev.grassoverhaul.GrassOverhaul;
import elocindev.grassoverhaul.blocks.SodBlock;
import elocindev.grassoverhaul.blocks.SodPatch;
import elocindev.grassoverhaul.blocks.SodSlab;
import elocindev.grassoverhaul.blocks.SodStairs;
import elocindev.grassoverhaul.blocks.TintableSodBlock;
import elocindev.grassoverhaul.blocks.TintableSodPatch;
import elocindev.grassoverhaul.blocks.TintableSodSlab;
import elocindev.grassoverhaul.blocks.TintableSodStairs;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SodBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GrassOverhaul.MODID);

	public static final RegistryObject<Block> DIRT_SOD_STAIRS = REGISTRY.register("dirt_sod_stairs", () -> new SodStairs(() -> Blocks.DIRT.defaultBlockState(), Properties.copy(Blocks.DIRT).strength(0.6F)));
	public static final RegistryObject<Block> DIRT_SOD_SLAB = REGISTRY.register("dirt_sod_slab", () -> new SodSlab(Properties.copy(Blocks.DIRT).strength(0.6F)));
	public static final RegistryObject<Block> DIRT_SOD_PATCH = REGISTRY.register("dirt_sod_patch", () -> new SodPatch(Properties.copy(Blocks.DIRT).strength(0.6F).dynamicShape()));
	
	public static final RegistryObject<Block> GRASS_SOD_BLOCK = REGISTRY.register("grass_sod_block", () -> new TintableSodBlock(Properties.copy(Blocks.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> GRASS_SOD_STAIRS = REGISTRY.register("grass_sod_stairs", () -> new TintableSodStairs(() -> GRASS_SOD_BLOCK.get().defaultBlockState(), Properties.copy(Blocks.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> GRASS_SOD_SLAB = REGISTRY.register("grass_sod_slab", () -> new TintableSodSlab(Properties.copy(Blocks.GRASS).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> GRASS_SOD_PATCH = REGISTRY.register("grass_sod_patch", () -> new TintableSodPatch(Properties.copy(Blocks.GRASS).strength(0.6F).sound(SoundType.GRASS).dynamicShape()));
	
	public static final RegistryObject<Block> PATH_SOD_BLOCK = REGISTRY.register("path_sod_block", () -> new SodBlock(Properties.copy(Blocks.DIRT_PATH).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PATH_SOD_STAIRS = REGISTRY.register("path_sod_stairs", () -> new SodStairs(() -> PATH_SOD_BLOCK.get().defaultBlockState(), Properties.copy(Blocks.DIRT_PATH).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PATH_SOD_SLAB = REGISTRY.register("path_sod_slab", () -> new SodSlab(Properties.copy(Blocks.DIRT_PATH).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PATH_SOD_PATCH = REGISTRY.register("path_sod_patch", () -> new SodPatch(Properties.copy(Blocks.DIRT_PATH).strength(0.6F).sound(SoundType.GRASS).dynamicShape()));
	
	public static final RegistryObject<Block> MYCELIUM_SOD_BLOCK = REGISTRY.register("mycelium_sod_block", () -> new SodBlock(Properties.copy(Blocks.MYCELIUM).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> MYCELIUM_SOD_STAIRS = REGISTRY.register("mycelium_sod_stairs", () -> new SodStairs(() -> MYCELIUM_SOD_BLOCK.get().defaultBlockState(), Properties.copy(Blocks.MYCELIUM).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> MYCELIUM_SOD_SLAB = REGISTRY.register("mycelium_sod_slab", () -> new SodSlab(Properties.copy(Blocks.MYCELIUM).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> MYCELIUM_SOD_PATCH = REGISTRY.register("mycelium_sod_patch", () -> new SodPatch(Properties.copy(Blocks.MYCELIUM).strength(0.6F).sound(SoundType.GRASS).dynamicShape()));
	
	public static final RegistryObject<Block> PODZOL_SOD_BLOCK = REGISTRY.register("podzol_sod_block", () -> new SodBlock(Properties.copy(Blocks.PODZOL).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PODZOL_SOD_STAIRS = REGISTRY.register("podzol_sod_stairs", () -> new SodStairs(() -> PODZOL_SOD_BLOCK.get().defaultBlockState(), Properties.copy(Blocks.PODZOL).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PODZOL_SOD_SLAB = REGISTRY.register("podzol_sod_slab", () -> new SodSlab(Properties.copy(Blocks.PODZOL).strength(0.6F).sound(SoundType.GRASS)));
	public static final RegistryObject<Block> PODZOL_SOD_PATCH = REGISTRY.register("podzol_sod_patch", () -> new SodPatch(Properties.copy(Blocks.PODZOL).strength(0.6F).sound(SoundType.GRASS).dynamicShape()));
	
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_BLOCK = REGISTRY.register("crimson_nylium_sod_block",
			() -> new SodBlock(Properties.copy(Blocks.CRIMSON_NYLIUM).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_STAIRS = REGISTRY.register("crimson_nylium_sod_stairs",
			() -> new SodStairs(() -> CRIMSON_NYLIUM_SOD_BLOCK.get().defaultBlockState(), Properties.copy(Blocks.CRIMSON_NYLIUM).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_SLAB = REGISTRY.register("crimson_nylium_sod_slab",
			() -> new SodSlab(Properties.copy(Blocks.CRIMSON_NYLIUM).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> CRIMSON_NYLIUM_SOD_PATCH = REGISTRY.register("crimson_nylium_sod_patch",
			() -> new SodPatch(Properties.copy(Blocks.CRIMSON_NYLIUM).strength(0.6F).sound(SoundType.NYLIUM).dynamicShape()));
	
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_BLOCK = REGISTRY.register("warped_nylium_sod_block",
			() -> new SodBlock(Properties.copy(Blocks.WARPED_NYLIUM).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_STAIRS = REGISTRY.register("warped_nylium_sod_stairs",
			() -> new SodStairs(() -> WARPED_NYLIUM_SOD_BLOCK.get().defaultBlockState(), Properties.copy(Blocks.WARPED_NYLIUM).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_SLAB = REGISTRY.register("warped_nylium_sod_slab",
			() -> new SodSlab(Properties.copy(Blocks.WARPED_NYLIUM).strength(0.6F).sound(SoundType.NYLIUM)));
	public static final RegistryObject<Block> WARPED_NYLIUM_SOD_PATCH = REGISTRY.register("warped_nylium_sod_patch",
			() -> new SodPatch(Properties.copy(Blocks.WARPED_NYLIUM).strength(0.6F).sound(SoundType.NYLIUM).dynamicShape()));

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
