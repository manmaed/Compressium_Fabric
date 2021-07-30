package net.manmaed.compressium.blocks;

import com.mojang.datafixers.types.templates.Tag;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.manmaed.compressium.Compressium;
import net.manmaed.compressium.util.Reference;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ToolItem;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/**
 * Created by manmaed on 29/07/2021.
 */
public class ComBlocks {

    //BASIC Blocks - as in ones you will have tones of
    public static CompressedBlock<Block> andesite;
    public static CompressedBlock<Block> diorite;
    public static CompressedBlock<Block> granite;
    public static CompressedBlock<Block> cobblestone;
    public static CompressedBlock<Block> stone;
    public static CompressedBlock<Block> sand; //Falling Entity
    public static CompressedBlock<Block> redsand; //Falling Entity
    public static CompressedBlock<Block> gravel; //Falling Entity
    public static CompressedBlock<Block> netherrack;
    public static CompressedBlock<Block> dirt;
    public static CompressedBlock<Block> endstone;
    public static CompressedBlock<Block> snow;
    public static CompressedBlock<Block> soulsand;
    public static CompressedBlock<Block> obsidian;
    /*public static Block honey;*/

    //Ores
    public static CompressedBlock<Block> netherite;
    public static CompressedBlock<Block> coal;
    public static CompressedBlock<Block> lapis;
    public static CompressedBlock<Block> iron;
    public static CompressedBlock<Block> gold;
    public static CompressedBlock<Block> diamond;
    public static CompressedBlock<Block> emerald;
    public static CompressedBlock<Block> redstone;
    public static CompressedBlock<Block> clay;
    public static CompressedBlock<Block> quartz;


    public static void load() {
        andesite = new CompressedBlock<>("andesite", () -> new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES)));
        diorite = new CompressedBlock<>("diorite", () -> new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES)));
        granite = new CompressedBlock<>("granite", () -> new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES)));
        cobblestone = new CompressedBlock<>("cobblestone", () -> new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.5f,6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES)));
        stone = new CompressedBlock<>("stone", () -> new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5f,6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES)));
        sand = new CompressedBlock<>("sand", () -> new FallingBlock(FabricBlockSettings.of(Material.AGGREGATE).requiresTool().strength(0.5f).sounds(BlockSoundGroup.SAND).breakByTool(FabricToolTags.SHOVELS)));
        redsand = new CompressedBlock<>("redsand", () -> new FallingBlock(FabricBlockSettings.of(Material.AGGREGATE).requiresTool().strength(0.5f).sounds(BlockSoundGroup.SAND).breakByTool(FabricToolTags.SHOVELS)));
        gravel = new CompressedBlock<>("gravel", () -> new Block(FabricBlockSettings.of(Material.AGGREGATE).requiresTool().strength(0.6f).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.SHOVELS)));
        netherrack = new CompressedBlock<>("netherrack", () -> new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(0.4f).sounds(BlockSoundGroup.NETHERRACK).breakByTool(FabricToolTags.PICKAXES)));
        dirt = new CompressedBlock<>("dirt", () -> new Block(FabricBlockSettings.of(Material.SOIL).requiresTool().strength(2.0f).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.SHOVELS)));
        endstone = new CompressedBlock<>("endstone", () -> new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 9.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES)));
        snow = new CompressedBlock<>("snow", () -> new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).requiresTool().strength(0.2f).sounds(BlockSoundGroup.SNOW).breakByTool(FabricToolTags.SHOVELS)));
        soulsand = new CompressedBlock<>("soulsand", () -> new Block(FabricBlockSettings.of(Material.AGGREGATE).requiresTool().strength(0.5f).sounds(BlockSoundGroup.SOUL_SAND).breakByTool(FabricToolTags.SHOVELS).velocityMultiplier(0.4F)));
        obsidian = new CompressedBlock<>("obsidian", () -> new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES)));
        /*honey = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));*/

        //Ores
        netherite = new CompressedBlock<>("netherite", () -> new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(50.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE).breakByTool(FabricToolTags.PICKAXES)));
        coal = new CompressedBlock<>("coal", () -> new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES)));
        lapis = new CompressedBlock<>("lapis", () -> new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0f, 3.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES)));
        iron = new CompressedBlock<>("iron", () -> new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES)));
        gold = new CompressedBlock<>("gold", () -> new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES)));
        diamond = new CompressedBlock<>("diamond", () -> new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES)));
        emerald = new CompressedBlock<>("emerald", () -> new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES)));
        redstone = new CompressedBlock<>("redstone", () -> new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES)));
        clay = new CompressedBlock<>("clay", () -> new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().strength(0.6f).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.SHOVELS)));
        quartz = new CompressedBlock<>("quartz", () -> new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(0.8f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES)));

    }

    public static class CompressedBlock<T extends Block> {

        private final Map<Integer, T> blocks;

        public CompressedBlock(String name, Supplier<T> blockSupplier) {
            this.blocks = new HashMap<>();
            for (int i = 0; i < 9; i++) {
                String blockName = name + "_" + (i + 1);
                T block = blockSupplier.get();
                blocks.put(i + 1, block);
                Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, blockName), block);
                Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, blockName), new BlockItem(block, new Item.Settings().group(Compressium.ITEM_GROUP)));
            }
        }

        public Optional<T> getBlock(int teir) {
            return Optional.ofNullable(blocks.get(teir));
        }
    }

}
