package elocindev.grassoverhaul;

import elocindev.grassoverhaul.blocks.SodBlock;
import elocindev.grassoverhaul.blocks.SodPatch;
import elocindev.grassoverhaul.blocks.SodSlab;
import elocindev.grassoverhaul.blocks.SodStair;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class GOBlocks  {
    // Non-Sod Blocks (TODO: Implement them later)
    // GRASS
    // public static final SodSlab GRASS_SLAB = new SodSlab(FabricBlockSettings.copy(Blocks.GRASS_BLOCK));
    

    // Sod Blocks
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
    public static final Block DIRT_SOD_STAIRS = new SodStair(Blocks.DIRT);
    // grass sod stairs
    public static final Block GRASS_SOD_STAIRS = new SodStair(GRASS_SOD_BLOCK);
    // podzol sod stairs
    public static final Block PODZOL_SOD_STAIRS = new SodStair(PODZOL_SOD_BLOCK);
    // mycelium sod stairs
    public static final Block MYCELIUM_SOD_STAIRS = new SodStair(MYCELIUM_SOD_BLOCK);
    // path sod stairs
    public static final Block PATH_SOD_STAIRS = new SodStair(PATH_SOD_BLOCK);
    // crimson nylium sod stairs
    public static final Block CRIMSON_NYLIUM_SOD_STAIRS = new SodStair(CRIMSON_NYLIUM_SOD_BLOCK);
    // warped nylium sod stairs
    public static final Block WARPED_NYLIUM_SOD_STAIRS = new SodStair(WARPED_NYLIUM_SOD_BLOCK);

    public static void blockReg(String MODID) {
        Block GOBlocks[] = {GRASS_SOD_BLOCK, GRASS_SOD_SLAB, GRASS_SOD_PATCH, GRASS_SOD_STAIRS, PODZOL_SOD_BLOCK, PODZOL_SOD_SLAB, PODZOL_SOD_PATCH, PODZOL_SOD_STAIRS, MYCELIUM_SOD_BLOCK, MYCELIUM_SOD_SLAB, MYCELIUM_SOD_PATCH, MYCELIUM_SOD_STAIRS, PATH_SOD_BLOCK, PATH_SOD_SLAB, PATH_SOD_PATCH, PATH_SOD_STAIRS, CRIMSON_NYLIUM_SOD_BLOCK, CRIMSON_NYLIUM_SOD_SLAB, CRIMSON_NYLIUM_SOD_PATCH, CRIMSON_NYLIUM_SOD_STAIRS, WARPED_NYLIUM_SOD_BLOCK, WARPED_NYLIUM_SOD_SLAB, WARPED_NYLIUM_SOD_PATCH, WARPED_NYLIUM_SOD_STAIRS};
        String BlocksID[] = {"grass_sod_block", "grass_sod_slab", "grass_sod_patch", "grass_sod_stairs", "podzol_sod_block", "podzol_sod_slab", "podzol_sod_patch", "podzol_sod_stairs", "mycelium_sod_block", "mycelium_sod_slab", "mycelium_sod_patch", "mycelium_sod_stairs", "path_sod_block", "path_sod_slab", "path_sod_patch", "path_sod_stairs", "crimson_nylium_sod_block", "crimson_nylium_sod_slab", "crimson_nylium_sod_patch", "crimson_nylium_sod_stairs", "warped_nylium_sod_block", "warped_nylium_sod_slab", "warped_nylium_sod_patch", "warped_nylium_sod_stairs"};

        for (int i = 0; i < GOBlocks.length; i++) {
            Registry.register(Registry.BLOCK, new Identifier(MODID, BlocksID[i]), GOBlocks[i]);
        }
    }

    public static void init() {
        blockReg(GrassOverhaul.MODID);
        
        // BLOCK ITEMSTACKS
        // Non-Sod Blocks (TODO: Implement them later)
        // GRASS
        /*
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "grass_slab"), new BlockItem(GRASS_SLAB, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        */


        // Sod Blocks
        // PATCHES
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "dirt_sod_patch"), new BlockItem(DIRT_SOD_PATCH, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "grass_sod_patch"), new BlockItem(GRASS_SOD_PATCH, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "podzol_sod_patch"), new BlockItem(PODZOL_SOD_PATCH, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "mycelium_sod_patch"), new BlockItem(MYCELIUM_SOD_PATCH, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "path_sod_patch"), new BlockItem(PATH_SOD_PATCH, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "crimson_nylium_sod_patch"), new BlockItem(CRIMSON_NYLIUM_SOD_PATCH, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "warped_nylium_sod_patch"), new BlockItem(WARPED_NYLIUM_SOD_PATCH, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        // SLABS
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "dirt_sod_slab"), new BlockItem(DIRT_SOD_SLAB, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "grass_sod_slab"), new BlockItem(GRASS_SOD_SLAB, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "podzol_sod_slab"), new BlockItem(PODZOL_SOD_SLAB, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "mycelium_sod_slab"), new BlockItem(MYCELIUM_SOD_SLAB, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "path_sod_slab"), new BlockItem(PATH_SOD_SLAB, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "crimson_nylium_sod_slab"), new BlockItem(CRIMSON_NYLIUM_SOD_SLAB, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "warped_nylium_sod_slab"), new BlockItem(WARPED_NYLIUM_SOD_SLAB, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        // BLOCKS
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "grass_sod_block"), new BlockItem(GRASS_SOD_BLOCK, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "podzol_sod_block"), new BlockItem(PODZOL_SOD_BLOCK, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "mycelium_sod_block"), new BlockItem(MYCELIUM_SOD_BLOCK, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "path_sod_block"), new BlockItem(PATH_SOD_BLOCK, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "crimson_nylium_sod_block"), new BlockItem(CRIMSON_NYLIUM_SOD_BLOCK, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "warped_nylium_sod_block"), new BlockItem(WARPED_NYLIUM_SOD_BLOCK, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        // STAIRS
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "dirt_sod_stairs"), new BlockItem(DIRT_SOD_STAIRS, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "grass_sod_stairs"), new BlockItem(GRASS_SOD_STAIRS, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "podzol_sod_stairs"), new BlockItem(PODZOL_SOD_STAIRS, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "mycelium_sod_stairs"), new BlockItem(MYCELIUM_SOD_STAIRS, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "path_sod_stairs"), new BlockItem(PATH_SOD_STAIRS, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "crimson_nylium_sod_stairs"), new BlockItem(CRIMSON_NYLIUM_SOD_STAIRS, new FabricItemSettings().group(GrassOverhaul.tabsod)));
        Registry.register(Registry.ITEM, new Identifier(GrassOverhaul.MODID, "warped_nylium_sod_stairs"), new BlockItem(WARPED_NYLIUM_SOD_STAIRS, new FabricItemSettings().group(GrassOverhaul.tabsod)));
    }
    public static void colorreg() {
        Block TintedBlocks[] = {GRASS_SOD_BLOCK, GRASS_SOD_SLAB, GRASS_SOD_PATCH, GRASS_SOD_STAIRS};
        
        for (int i = 0; i < TintedBlocks.length; i++) {
            ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getGrassColor(view, pos), TintedBlocks[i]);
            ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x72b06a, TintedBlocks[i]);
        }
    }
}