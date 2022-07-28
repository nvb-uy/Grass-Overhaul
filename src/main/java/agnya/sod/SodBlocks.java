package agnya.sod;

import agnya.sod.blocks.SodPatch;
import agnya.sod.blocks.SodSlab;
import agnya.sod.blocks.SodBlock;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

// materials to do patches, slabs and blocks:
// DIRT, GRASS, PODZOL, MYCELIUM, PATH, CRIMSON NYLIUM, WARPED NYLIUM
public class SodBlocks  {
    // PATCHES
    public static final SodPatch DIRT_SOD_PATCH = new SodPatch(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // grass sod patch
    public static final SodPatch GRASS_SOD_PATCH = new SodPatch(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // podzol sod patch
    public static final SodPatch PODZOL_SOD_PATCH = new SodPatch(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // mycelium sod patch
    public static final SodPatch MYCELIUM_SOD_PATCH = new SodPatch(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // path sod patch
    public static final SodPatch PATH_SOD_PATCH = new SodPatch(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // crimson nylium sod patch
    public static final SodPatch CRIMSON_NYLIUM_SOD_PATCH = new SodPatch(FabricBlockSettings.of(Material.STONE).strength(1.5f));
    // warped nylium sod patch
    public static final SodPatch WARPED_NYLIUM_SOD_PATCH = new SodPatch(FabricBlockSettings.of(Material.STONE).strength(1.5f));

    // SLABS
    // dirt slab
    public static final SodSlab DIRT_SOD_SLAB = new SodSlab(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // grass slab
    public static final SodSlab GRASS_SOD_SLAB = new SodSlab(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // podzol slab
    public static final SodSlab PODZOL_SOD_SLAB = new SodSlab(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // mycelium slab
    public static final SodSlab MYCELIUM_SOD_SLAB = new SodSlab(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // path slab
    public static final SodSlab PATH_SOD_SLAB = new SodSlab(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // crimson nylium slab
    public static final SodSlab CRIMSON_NYLIUM_SOD_SLAB = new SodSlab(FabricBlockSettings.of(Material.STONE).strength(1.5f));
    // warped nylium slab
    public static final SodSlab WARPED_NYLIUM_SOD_SLAB = new SodSlab(FabricBlockSettings.of(Material.STONE).strength(1.5f));

    // BLOCKS

    // grass sod block
    public static final SodBlock GRASS_SOD_BLOCK = new SodBlock(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // podzol sod block
    public static final SodBlock PODZOL_SOD_BLOCK = new SodBlock(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // mycelium sod block
    public static final SodBlock MYCELIUM_SOD_BLOCK = new SodBlock(FabricBlockSettings.copyOf(Blocks.MYCELIUM));
    // path sod block
    public static final SodBlock PATH_SOD_BLOCK = new SodBlock(FabricBlockSettings.of(Material.SOIL).strength(1.5f));
    // crimson nylium sod block
    public static final SodBlock CRIMSON_NYLIUM_SOD_BLOCK = new SodBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f));
    // warped nylium sod block
    public static final SodBlock WARPED_NYLIUM_SOD_BLOCK = new SodBlock(FabricBlockSettings.of(Material.STONE).strength(1.5f));

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


        // TINTS
        // register colorprovider for block with grass tint
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getFoliageColor(view, pos), GRASS_SOD_BLOCK);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getFoliageColor(view, pos), GRASS_SOD_SLAB);
        ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> BiomeColors.getFoliageColor(view, pos), GRASS_SOD_PATCH);
        // Register same color provider for block itemstacks
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x52784F, GRASS_SOD_BLOCK);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x52784F, GRASS_SOD_SLAB);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0x52784F, GRASS_SOD_PATCH);
    }
}