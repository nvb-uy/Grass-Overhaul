package elocindev.grassoverhaul.init;

import elocindev.grassoverhaul.GrassOverhaul;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ItemGroup {
    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GrassOverhaul.MODID);

    public static final RegistryObject<CreativeModeTab> TABSOD = REGISTRY.register("tabsod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(SodItems.GRASS_SOD_BLOCK.get()))
                    .title(Component.translatable("itemGroup.grassoverhaul.tabsod"))
                    .displayItems((param, tab) -> {
                        tab.accept(SodItems.DIRT_SOD_STAIRS.get());
                        tab.accept(SodItems.DIRT_SOD_SLAB.get());
                        tab.accept(SodItems.DIRT_SOD_PATCH.get());
                        tab.accept(SodItems.GRASS_SOD_BLOCK.get());
                        tab.accept(SodItems.GRASS_SOD_STAIRS.get());
                        tab.accept(SodItems.GRASS_SOD_SLAB.get());
                        tab.accept(SodItems.GRASS_SOD_PATCH.get());
                        tab.accept(SodItems.PATH_SOD_BLOCK.get());
                        tab.accept(SodItems.PATH_SOD_STAIRS.get());
                        tab.accept(SodItems.PATH_SOD_SLAB.get());
                        tab.accept(SodItems.PATH_SOD_PATCH.get());
                        tab.accept(SodItems.MYCELIUM_SOD_BLOCK.get());
                        tab.accept(SodItems.MYCELIUM_SOD_STAIRS.get());
                        tab.accept(SodItems.MYCELIUM_SOD_SLAB.get());
                        tab.accept(SodItems.MYCELIUM_SOD_PATCH.get());
                        tab.accept(SodItems.PODZOL_SOD_BLOCK.get());
                        tab.accept(SodItems.PODZOL_SOD_STAIRS.get());
                        tab.accept(SodItems.PODZOL_SOD_SLAB.get());
                        tab.accept(SodItems.PODZOL_SOD_PATCH.get());
                        tab.accept(SodItems.CRIMSON_NYLIUM_SOD_BLOCK.get());
                        tab.accept(SodItems.CRIMSON_NYLIUM_SOD_STAIRS.get());
                        tab.accept(SodItems.CRIMSON_NYLIUM_SOD_SLAB.get());
                        tab.accept(SodItems.CRIMSON_NYLIUM_SOD_PATCH.get());
                        tab.accept(SodItems.WARPED_NYLIUM_SOD_BLOCK.get());
                        tab.accept(SodItems.WARPED_NYLIUM_SOD_STAIRS.get());
                        tab.accept(SodItems.WARPED_NYLIUM_SOD_SLAB.get());
                        tab.accept(SodItems.WARPED_NYLIUM_SOD_PATCH.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }
}
