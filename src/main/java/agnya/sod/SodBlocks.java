package agnya.sod;

import agnya.sod.blocks.SodPatch;
import agnya.sod.blocks.SodSlab;
import agnya.sod.blocks.SodStair;
import agnya.sod.blocks.SodBlock;

import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Blocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// materials to do patches, slabs and blocks:
// DIRT, GRASS, PODZOL, MYCELIUM, PATH, CRIMSON NYLIUM, WARPED NYLIUM
public class SodBlocks  {
    // PATCHES
    public static final SodPatch DIRT_SOD_PATCH = new SodPatch(FabricBlockSettings.copyOf(Blocks.DIRT));
    // grass sod patch
    public static final SodPatch GRASS_SOD_PATCH = new SodPatch(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
    // podzol sod patch
    public static final SodPatch PODZOL_SOD_PATCH = new SodPatch(FabricBlockSettings.copyOf(Blocks.PODZOL));
    // mycelium sod patch
    public static final SodPatch MYCELIUM_SOD_PATCH = new SodPatch(FabricBlockSettings.copyOf(Blocks.MYCELIUM));
    // path sod patch
    public static final SodPatch PATH_SOD_PATCH = new SodPatch(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
    // crimson nylium sod patch
    public static final SodPatch CRIMSON_NYLIUM_SOD_PATCH = new SodPatch(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM));
    // warped nylium sod patch
    public static final SodPatch WARPED_NYLIUM_SOD_PATCH = new SodPatch(FabricBlockSettings.copyOf(Blocks.WARPED_NYLIUM));

    // SLABS
    // dirt slab
    public static final SodSlab DIRT_SOD_SLAB = new SodSlab(FabricBlockSettings.copyOf(Blocks.DIRT));
    // grass slab
    public static final SodSlab GRASS_SOD_SLAB = new SodSlab(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
    // podzol slab
    public static final SodSlab PODZOL_SOD_SLAB = new SodSlab(FabricBlockSettings.copyOf(Blocks.PODZOL));
    // mycelium slab
    public static final SodSlab MYCELIUM_SOD_SLAB = new SodSlab(FabricBlockSettings.copyOf(Blocks.MYCELIUM));
    // path slab
    public static final SodSlab PATH_SOD_SLAB = new SodSlab(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
    // crimson nylium slab
    public static final SodSlab CRIMSON_NYLIUM_SOD_SLAB = new SodSlab(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM));
    // warped nylium slab
    public static final SodSlab WARPED_NYLIUM_SOD_SLAB = new SodSlab(FabricBlockSettings.copyOf(Blocks.WARPED_NYLIUM));

    // BLOCKS

    // grass sod block
    public static final SodBlock GRASS_SOD_BLOCK = new SodBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
    // podzol sod block
    public static final SodBlock PODZOL_SOD_BLOCK = new SodBlock(FabricBlockSettings.copyOf(Blocks.PODZOL));
    // mycelium sod block
    public static final SodBlock MYCELIUM_SOD_BLOCK = new SodBlock(FabricBlockSettings.copyOf(Blocks.MYCELIUM));
    // path sod block
    public static final SodBlock PATH_SOD_BLOCK = new SodBlock(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
    // crimson nylium sod block
    public static final SodBlock CRIMSON_NYLIUM_SOD_BLOCK = new SodBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM));
    // warped nylium sod block
    public static final SodBlock WARPED_NYLIUM_SOD_BLOCK = new SodBlock(FabricBlockSettings.copyOf(Blocks.WARPED_NYLIUM));

    // STAIRS
    
    // dirt sod stairs
    public static final SodStair DIRT_SOD_STAIRS = new SodStair(Blocks.DIRT.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DIRT));
    // grass sod stairs
    public static final SodStair GRASS_SOD_STAIRS = new SodStair(GRASS_SOD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
    // podzol sod stairs
    public static final SodStair PODZOL_SOD_STAIRS = new SodStair(PODZOL_SOD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PODZOL));
    // mycelium sod stairs
    public static final SodStair MYCELIUM_SOD_STAIRS = new SodStair(MYCELIUM_SOD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.MYCELIUM));
    // path sod stairs
    public static final SodStair PATH_SOD_STAIRS = new SodStair(PATH_SOD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK));
    // crimson nylium sod stairs
    public static final SodStair CRIMSON_NYLIUM_SOD_STAIRS = new SodStair(CRIMSON_NYLIUM_SOD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.CRIMSON_NYLIUM));
    // warped nylium sod stairs
    public static final SodStair WARPED_NYLIUM_SOD_STAIRS = new SodStair(WARPED_NYLIUM_SOD_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.WARPED_NYLIUM));


    public static void init() {
        // PATCHES
        Registry.register(Registry.BLOCK, new Identifier("sod", "dirt_sod_patch"), DIRT_SOD_PATCH);
        Registry.register(Registry.BLOCK, new Identifier("sod", "grass_sod_patch"), GRASS_SOD_PATCH);
        Registry.register(Registry.BLOCK, new Identifier("sod", "podzol_sod_patch"), PODZOL_SOD_PATCH);
        Registry.register(Registry.BLOCK, new Identifier("sod", "mycelium_sod_patch"), MYCELIUM_SOD_PATCH);
        Registry.register(Registry.BLOCK, new Identifier("sod", "path_sod_patch"), PATH_SOD_PATCH);
        Registry.register(Registry.BLOCK, new Identifier("sod", "crimson_nylium_sod_patch"), CRIMSON_NYLIUM_SOD_PATCH);
        Registry.register(Registry.BLOCK, new Identifier("sod", "warped_nylium_sod_patch"), WARPED_NYLIUM_SOD_PATCH);
        // SLABS
        Registry.register(Registry.BLOCK, new Identifier("sod", "dirt_sod_slab"), DIRT_SOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("sod", "grass_sod_slab"), GRASS_SOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("sod", "podzol_sod_slab"), PODZOL_SOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("sod", "mycelium_sod_slab"), MYCELIUM_SOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("sod", "path_sod_slab"), PATH_SOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("sod", "crimson_nylium_sod_slab"), CRIMSON_NYLIUM_SOD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier("sod", "warped_nylium_sod_slab"), WARPED_NYLIUM_SOD_SLAB);
        // BLOCKS
        Registry.register(Registry.BLOCK, new Identifier("sod", "grass_sod_block"), GRASS_SOD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("sod", "podzol_sod_block"), PODZOL_SOD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("sod", "mycelium_sod_block"), MYCELIUM_SOD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("sod", "path_sod_block"), PATH_SOD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("sod", "crimson_nylium_sod_block"), CRIMSON_NYLIUM_SOD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier("sod", "warped_nylium_sod_block"), WARPED_NYLIUM_SOD_BLOCK);
        // STAIRS
        Registry.register(Registry.BLOCK, new Identifier("sod", "grass_sod_stairs"), GRASS_SOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier("sod", "podzol_sod_stairs"), PODZOL_SOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier("sod", "mycelium_sod_stairs"), MYCELIUM_SOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier("sod", "path_sod_stairs"), PATH_SOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier("sod", "crimson_nylium_sod_stairs"), CRIMSON_NYLIUM_SOD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier("sod", "warped_nylium_sod_stairs"), WARPED_NYLIUM_SOD_STAIRS);

        // BLOCK ITEMSTACKS
        // PATCHES
        Registry.register(Registry.ITEM, new Identifier("sod", "dirt_sod_patch"), new BlockItem(DIRT_SOD_PATCH, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "grass_sod_patch"), new BlockItem(GRASS_SOD_PATCH, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "podzol_sod_patch"), new BlockItem(PODZOL_SOD_PATCH, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "mycelium_sod_patch"), new BlockItem(MYCELIUM_SOD_PATCH, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "path_sod_patch"), new BlockItem(PATH_SOD_PATCH, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "crimson_nylium_sod_patch"), new BlockItem(CRIMSON_NYLIUM_SOD_PATCH, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "warped_nylium_sod_patch"), new BlockItem(WARPED_NYLIUM_SOD_PATCH, new FabricItemSettings().group(SodMod.tabsod)));
        // SLABS
        Registry.register(Registry.ITEM, new Identifier("sod", "dirt_sod_slab"), new BlockItem(DIRT_SOD_SLAB, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "grass_sod_slab"), new BlockItem(GRASS_SOD_SLAB, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "podzol_sod_slab"), new BlockItem(PODZOL_SOD_SLAB, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "mycelium_sod_slab"), new BlockItem(MYCELIUM_SOD_SLAB, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "path_sod_slab"), new BlockItem(PATH_SOD_SLAB, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "crimson_nylium_sod_slab"), new BlockItem(CRIMSON_NYLIUM_SOD_SLAB, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "warped_nylium_sod_slab"), new BlockItem(WARPED_NYLIUM_SOD_SLAB, new FabricItemSettings().group(SodMod.tabsod)));
        // BLOCKS
        Registry.register(Registry.ITEM, new Identifier("sod", "grass_sod_block"), new BlockItem(GRASS_SOD_BLOCK, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "podzol_sod_block"), new BlockItem(PODZOL_SOD_BLOCK, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "mycelium_sod_block"), new BlockItem(MYCELIUM_SOD_BLOCK, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "path_sod_block"), new BlockItem(PATH_SOD_BLOCK, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "crimson_nylium_sod_block"), new BlockItem(CRIMSON_NYLIUM_SOD_BLOCK, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "warped_nylium_sod_block"), new BlockItem(WARPED_NYLIUM_SOD_BLOCK, new FabricItemSettings().group(SodMod.tabsod)));
        // STAIRS
        Registry.register(Registry.ITEM, new Identifier("sod", "grass_sod_stairs"), new BlockItem(GRASS_SOD_STAIRS, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "podzol_sod_stairs"), new BlockItem(PODZOL_SOD_STAIRS, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "mycelium_sod_stairs"), new BlockItem(MYCELIUM_SOD_STAIRS, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "path_sod_stairs"), new BlockItem(PATH_SOD_STAIRS, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "crimson_nylium_sod_stairs"), new BlockItem(CRIMSON_NYLIUM_SOD_STAIRS, new FabricItemSettings().group(SodMod.tabsod)));
        Registry.register(Registry.ITEM, new Identifier("sod", "warped_nylium_sod_stairs"), new BlockItem(WARPED_NYLIUM_SOD_STAIRS, new FabricItemSettings().group(SodMod.tabsod)));
    }
    public static void colorreg() {
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getGrassColor(view, pos), GRASS_SOD_BLOCK);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getGrassColor(view, pos), GRASS_SOD_SLAB);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getGrassColor(view, pos), GRASS_SOD_PATCH);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getGrassColor(view, pos), GRASS_SOD_STAIRS);
        // Register same color provider for block itemstacks
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x72b06a, GRASS_SOD_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x72b06a, GRASS_SOD_SLAB);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x72b06a, GRASS_SOD_PATCH);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x72b06a, GRASS_SOD_STAIRS);
    }
}