package net.timeworndevs.et_ultra.common;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.world.level.block.Block;
import net.timeworndevs.et_ultra.init.EtUltraRegistry;

public class CommonBlockRegistry {

    public static Block TEST_BLOCK;

    public static void register() {
        TEST_BLOCK = EtUltraRegistry.register("test_block", new Block(FabricBlockSettings.of()));
    }
}
