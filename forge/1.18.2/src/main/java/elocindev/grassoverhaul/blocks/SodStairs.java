package elocindev.grassoverhaul.blocks;

import java.util.function.Supplier;

import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SodStairs extends StairBlock {
    public SodStairs(Supplier<BlockState> state, Properties properties) {
        super(state, properties);
    }
}
