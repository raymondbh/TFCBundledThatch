package org.rbh.tfcbt;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by rbh on 19.11.2014.
 */

@Mod(modid="tfcbt", name="TFCBundledThatch", version="0.1.0", dependencies = "after:TerraFirmaCraft")
public class TFCBundledThatch
{
    @Instance("TFCBundledThatch")
    public static TFCBundledThatch instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {BTBlocks.init(); }

    @EventHandler
    public void load(FMLInitializationEvent event) { BTRecipes.init(); }
}
