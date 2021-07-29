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

/**
 * Created by manmaed on 29/07/2021.
 */
public class ComBlocks {

    //BASIC Blocks - as in ones you will have tones of
    public static Block andesite;
    public static Block diorite;
    public static Block granite;
    public static Block cobblestone;
    public static Block stone;
    public static Block sand; //Falling Entity
    public static Block redsand; //Falling Entity
    public static Block gravel; //Falling Entity
    public static Block netherrack;
    public static Block dirt;
    public static Block endstone;
    public static Block snow;
    public static Block soulsand;
    public static Block obsidian;
    /*public static Block honey;*/

    //Ores
    public static Block netherite;
    public static Block coal;
    public static Block lapis;
    public static Block iron;
    public static Block gold;
    public static Block diamond;
    public static Block emerald;
    public static Block redstone;
    public static Block clay;
    public static Block quartz;


    public static void load() {
        andesite = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));
        diorite = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));
        granite = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));
        cobblestone = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.5f,6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));
        stone = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.5f,6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));
        sand = new FallingBlock(FabricBlockSettings.of(Material.AGGREGATE).requiresTool().strength(0.5f).sounds(BlockSoundGroup.SAND).breakByTool(FabricToolTags.SHOVELS));
        redsand = new FallingBlock(FabricBlockSettings.of(Material.AGGREGATE).requiresTool().strength(0.5f).sounds(BlockSoundGroup.SAND).breakByTool(FabricToolTags.SHOVELS));
        gravel = new Block(FabricBlockSettings.of(Material.AGGREGATE).requiresTool().strength(0.6f).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.SHOVELS));
        netherrack = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(0.4f).sounds(BlockSoundGroup.NETHERRACK).breakByTool(FabricToolTags.PICKAXES));
        dirt = new Block(FabricBlockSettings.of(Material.SOIL).requiresTool().strength(2.0f).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.SHOVELS));
        endstone = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0f, 9.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));
        snow = new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).requiresTool().strength(0.2f).sounds(BlockSoundGroup.SNOW).breakByTool(FabricToolTags.SHOVELS));
        soulsand = new Block(FabricBlockSettings.of(Material.AGGREGATE).requiresTool().strength(0.5f).sounds(BlockSoundGroup.SOUL_SAND).breakByTool(FabricToolTags.SHOVELS).velocityMultiplier(0.4F));
        obsidian = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));
        /*honey = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));*/

        //Ores
        netherite = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(50.0F, 1200.0F).sounds(BlockSoundGroup.NETHERITE).breakByTool(FabricToolTags.PICKAXES));
        coal = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));
        lapis = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0f, 3.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES));
        iron = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES));
        gold = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES));
        diamond = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES));
        emerald = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES));
        redstone = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL).breakByTool(FabricToolTags.PICKAXES));
        clay = new Block(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).requiresTool().strength(0.6f).sounds(BlockSoundGroup.GRAVEL).breakByTool(FabricToolTags.SHOVELS));
        quartz = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(0.8f).sounds(BlockSoundGroup.STONE).breakByTool(FabricToolTags.PICKAXES));

        compress();


    }

    private static void compress() {
        for (int i = 1; i < 9; i++) {
            /*makeBlocks();*/
            makeBlocks(andesite, "andesite_" + i);
            makeBlocks(diorite, "diorite_" + i);
            makeBlocks(granite, "granite_" + i);
            makeBlocks(cobblestone, "cobblestone_" + i);
            makeBlocks(stone,"stone_" + i);
            makeBlocks(sand, "sand_" + i); //Falling Entity
            makeBlocks(redsand, "redsand_" + i); //Falling Entity
            makeBlocks(gravel, "gravel_" + i); //Falling Entity
            makeBlocks(netherrack, "netherrack_" + i);
            makeBlocks(dirt, "dirt_" + i);
            makeBlocks(endstone, "endstone_" + i);
            makeBlocks(snow, "snow_" + i);
            makeBlocks(soulsand, "soulsand_" + i);
            makeBlocks(obsidian, "obsidian_" + i);
            /*makeBlocks(honey);*/

            //Ores
            makeBlocks(netherite, "netherite_" + i);
            makeBlocks(coal, "coal_" + i);
            makeBlocks(lapis,"lapis_" + i);
            makeBlocks(iron, "iron_" + i);
            makeBlocks(gold, "gold_" + i);
            makeBlocks(diamond, "diamond_" + i);
            makeBlocks(emerald, "emerald_" + i);
            makeBlocks(redstone, "redstone_" + i);
            makeBlocks(clay, "clay_" + i);
            makeBlocks(quartz,"quartz_" + i);
        }
    }

    private static void makeBlocks(Block block, String blockName) {
        Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, blockName), block);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, blockName), new BlockItem(block, new Item.Settings().group(Compressium.ITEM_GROUP)));
    }
}
