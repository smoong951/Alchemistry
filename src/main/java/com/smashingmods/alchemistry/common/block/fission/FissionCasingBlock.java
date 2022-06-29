package com.smashingmods.alchemistry.common.block.fission;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;

public class FissionCasingBlock extends Block {

    public FissionCasingBlock() {
        super(Properties.of(Material.METAL).strength(2.0f));
    }
}