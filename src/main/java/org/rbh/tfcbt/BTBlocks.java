package org.rbh.tfcbt;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;


/**
 * Created by rbh on 19.11.2014.
 */
public class BTBlocks
{
    public static Block BundledThatch;

    public static void init()
    {
        BundledThatch = new BlockBundledThatch();

        GameRegistry.registerBlock(BundledThatch, com.bioxx.tfc.Items.ItemBlocks.ItemTerraBlock.class, "BundledThatch" );

        Blocks.fire.setFireInfo(BundledThatch, 20, 20);
    }
}
