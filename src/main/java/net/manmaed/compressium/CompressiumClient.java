package net.manmaed.compressium;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;
import net.manmaed.compressium.blocks.ComBlocks;
import net.manmaed.compressium.blocks.CompressedBlock;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

/**
 * Created by manmaed on 29/07/2021.
 */
public class CompressiumClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        for (CompressedBlock<?> blocks : CompressedBlock.listofblocks) {
            for (Block block : blocks.getBlocks()) {
                BlockRenderLayerMapImpl.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
            }
        }
    }
}