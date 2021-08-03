package net.manmaed.compressium;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.manmaed.compressium.blocks.ComBlocks;
import net.manmaed.compressium.util.Reference;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

/**
 * Created by manmaed on 29/07/2021.
 */
public class Compressium implements ModInitializer {
    //TODO: Make Tab icon to CobbleStone_1
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier(Reference.MOD_ID, "itemgroup")).icon(() -> new ItemStack(ComBlocks.cobblestone.getBlock(1).orElse(Blocks.COBBLESTONE))).build();

    @Override
    public void onInitialize() {
        ComBlocks.load();
    }
}
