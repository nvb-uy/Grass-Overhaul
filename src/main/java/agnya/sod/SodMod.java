package agnya.sod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SodMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("sod");

	public static final ItemGroup tabsod = FabricItemGroupBuilder.create(
		new Identifier("sod", "tabsod"))
		.icon(() -> new ItemStack(SodBlocks.GRASS_SOD_BLOCK))
		.appendItems(stacks -> {
			stacks.add(new ItemStack(Items.DIRT));
			stacks.add(new ItemStack(SodBlocks.DIRT_SOD_SLAB));
			stacks.add(new ItemStack(SodBlocks.DIRT_SOD_PATCH));
			stacks.add(new ItemStack(SodBlocks.GRASS_SOD_BLOCK));
			stacks.add(new ItemStack(SodBlocks.GRASS_SOD_SLAB));
			stacks.add(new ItemStack(SodBlocks.GRASS_SOD_PATCH));
			stacks.add(new ItemStack(SodBlocks.PATH_SOD_BLOCK));
			stacks.add(new ItemStack(SodBlocks.PATH_SOD_SLAB));
			stacks.add(new ItemStack(SodBlocks.PATH_SOD_PATCH));
			stacks.add(new ItemStack(SodBlocks.MYCELIUM_SOD_BLOCK));
			stacks.add(new ItemStack(SodBlocks.MYCELIUM_SOD_SLAB));
			stacks.add(new ItemStack(SodBlocks.MYCELIUM_SOD_PATCH));
			stacks.add(new ItemStack(SodBlocks.PODZOL_SOD_BLOCK));
			stacks.add(new ItemStack(SodBlocks.PODZOL_SOD_SLAB));
			stacks.add(new ItemStack(SodBlocks.PODZOL_SOD_PATCH));
			stacks.add(new ItemStack(SodBlocks.CRIMSON_NYLIUM_SOD_BLOCK));
			stacks.add(new ItemStack(SodBlocks.CRIMSON_NYLIUM_SOD_SLAB));
			stacks.add(new ItemStack(SodBlocks.CRIMSON_NYLIUM_SOD_PATCH));
			stacks.add(new ItemStack(SodBlocks.WARPED_NYLIUM_SOD_BLOCK));
			stacks.add(new ItemStack(SodBlocks.WARPED_NYLIUM_SOD_SLAB));
			stacks.add(new ItemStack(SodBlocks.WARPED_NYLIUM_SOD_PATCH));
		})
		.build();

	@Override
	public void onInitialize() {
		SodBlocks.init();
	}
}
