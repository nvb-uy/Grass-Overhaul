package elocindev.grassoverhaul;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GrassOverhaul implements ModInitializer {
	public static final String MODID = "sod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	public static final ItemGroup tabsod = FabricItemGroupBuilder.create(
		new Identifier(MODID, "tabsod"))
		.icon(() -> new ItemStack(GOBlocks.GRASS_SOD_BLOCK))
		.appendItems(stacks -> {
			/*
			stacks.add(new ItemStack(Items.GRASS_BLOCK));
			stacks.add(new ItemStack(GOBlocks.GRASS_SLAB));
			*/
			
			// Sod Blocks

			stacks.add(new ItemStack(Items.DIRT));
			stacks.add(new ItemStack(GOBlocks.DIRT_SOD_STAIRS)); stacks.add(new ItemStack(GOBlocks.DIRT_SOD_SLAB));
			stacks.add(new ItemStack(GOBlocks.DIRT_SOD_PATCH));
			stacks.add(new ItemStack(GOBlocks.GRASS_SOD_BLOCK));
			
			stacks.add(new ItemStack(GOBlocks.GRASS_SOD_STAIRS)); stacks.add(new ItemStack(GOBlocks.GRASS_SOD_SLAB));
			stacks.add(new ItemStack(GOBlocks.GRASS_SOD_PATCH));
			stacks.add(new ItemStack(GOBlocks.PATH_SOD_BLOCK));
			
			stacks.add(new ItemStack(GOBlocks.PATH_SOD_STAIRS)); stacks.add(new ItemStack(GOBlocks.PATH_SOD_SLAB));
			stacks.add(new ItemStack(GOBlocks.PATH_SOD_PATCH));
			stacks.add(new ItemStack(GOBlocks.MYCELIUM_SOD_BLOCK));
			
			stacks.add(new ItemStack(GOBlocks.MYCELIUM_SOD_STAIRS)); stacks.add(new ItemStack(GOBlocks.MYCELIUM_SOD_SLAB));
			stacks.add(new ItemStack(GOBlocks.MYCELIUM_SOD_PATCH));
			stacks.add(new ItemStack(GOBlocks.PODZOL_SOD_BLOCK));
			
			stacks.add(new ItemStack(GOBlocks.PODZOL_SOD_STAIRS)); stacks.add(new ItemStack(GOBlocks.PODZOL_SOD_SLAB));
			stacks.add(new ItemStack(GOBlocks.PODZOL_SOD_PATCH));
			stacks.add(new ItemStack(GOBlocks.CRIMSON_NYLIUM_SOD_BLOCK));
			
			stacks.add(new ItemStack(GOBlocks.CRIMSON_NYLIUM_SOD_STAIRS)); stacks.add(new ItemStack(GOBlocks.CRIMSON_NYLIUM_SOD_SLAB));
			stacks.add(new ItemStack(GOBlocks.CRIMSON_NYLIUM_SOD_PATCH));
			stacks.add(new ItemStack(GOBlocks.WARPED_NYLIUM_SOD_BLOCK));
			
			stacks.add(new ItemStack(GOBlocks.WARPED_NYLIUM_SOD_STAIRS)); stacks.add(new ItemStack(GOBlocks.WARPED_NYLIUM_SOD_SLAB));
			stacks.add(new ItemStack(GOBlocks.WARPED_NYLIUM_SOD_PATCH));
		})
		.build();

	@Override
	public void onInitialize() {
		GOBlocks.init();
	}
}
