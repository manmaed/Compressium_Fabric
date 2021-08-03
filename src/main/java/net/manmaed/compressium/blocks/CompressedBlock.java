package net.manmaed.compressium.blocks;

import net.manmaed.compressium.Compressium;
import net.manmaed.compressium.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.*;
import java.util.function.Supplier;

/**
 * Created by manmaed on 31/07/2021.
 */
public class CompressedBlock <T extends Block> {

    private final Map<Integer, T> blocks;
    public static final List<CompressedBlock<?>> listofblocks = new ArrayList<>();
    public static final ArrayList<CompressedBlock<?>> regblocks = new ArrayList<>();

    public CompressedBlock(String name, Supplier<T> blockSupplier) {
        this.blocks = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            String blockName = name + "_" + (i + 1);
            T block = blockSupplier.get();
            blocks.put(i + 1, block);
            Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, blockName), block);
            Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, blockName), new BlockItem(block, new Item.Settings().group(Compressium.ITEM_GROUP)));
        }
        listofblocks.add(this);
    }

    public Collection<T> getBlocks() {
        return blocks.values();
    }
    public Optional<T> getBlock(int compressedlevel) {
        return Optional.ofNullable(blocks.get(compressedlevel));
    }
}
