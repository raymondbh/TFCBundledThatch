package org.rbh.tfcbt;

import com.bioxx.tfc.TFCBlocks;
import com.bioxx.tfc.TFCItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

/**
 * Created by rbh on 19.11.2014.
 */
public class BTRecipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(BTBlocks.BundledThatch, 1), new Object[]{"PT", "TP", Character.valueOf('P'), new ItemStack(TFCItems.Straw, 1), Character.valueOf('T'), new ItemStack(TFCBlocks.Thatch, 1)});
    }
}
