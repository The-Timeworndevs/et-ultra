package net.timeworndevs.et_ultra.common;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.timeworndevs.et_ultra.init.EtUltraRegistry;

public class CommonItemRegistry {

    public static BlockItem TEST_BLOCK;

    public static void register() {
        TEST_BLOCK = EtUltraRegistry.register("test_block", new BlockItem(CommonBlockRegistry.TEST_BLOCK, new Item.Properties()));
    }
}
