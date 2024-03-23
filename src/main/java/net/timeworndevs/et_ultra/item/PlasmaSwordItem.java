package net.timeworndevs.et_ultra.item;

import com.google.common.collect.Multimap;
import earth.terrarium.botarium.common.energy.base.BotariumEnergyItem;
import earth.terrarium.botarium.common.energy.impl.WrappedItemEnergyContainer;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class PlasmaSwordItem extends Item implements BotariumEnergyItem<WrappedItemEnergyContainer> {
    public PlasmaSwordItem(Properties properties) {
        super(properties);
    }

    @Override
    public WrappedItemEnergyContainer getEnergyStorage(ItemStack holder) {
        return new WrappedItemEnergyContainer();
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(ItemStack stack, EquipmentSlot slot) {
        return super.getAttributeModifiers(stack, slot);
    }
}
