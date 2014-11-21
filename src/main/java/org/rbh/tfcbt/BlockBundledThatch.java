package org.rbh.tfcbt;


import com.bioxx.tfc.Blocks.BlockTerra;
import com.bioxx.tfc.Core.TFCTabs;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;


/**
 * Created by rbh on 19.11.2014.
 */
public class BlockBundledThatch extends BlockTerra
{
    public IIcon sideIcon;
    public IIcon innerIcon;
    public IIcon rotatedSideIcon;

    public BlockBundledThatch()
    {
        super(Material.grass);
        this.setCreativeTab(TFCTabs.TFCBuilding);
        this.setBlockBounds(0f, 0, 0f, 1f, 1, 1f);
        this.lightOpacity = 255;
        this.setBlockName("BundledThatch");
        this.setHardness(1);
        this.setStepSound(Block.soundTypeGrass);
        this.setCreativeTab(TFCTabs.TFCBuilding);
        //this.setUnlocalizedName("Bundled Thatch");
    }

    /**@Override
    public void registerBlockIcons(IIconRegister reg)
    {
        this.blockIcon = reg.registerIcon("tfcbt:Bundled Thatch");
    }**/



    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side)
    {
        if (side == 0 || side == 1)
            return innerIcon;
        return sideIcon;
    }

    @Override
    public void registerBlockIcons(IIconRegister reg)
    {
       sideIcon = reg.registerIcon("tfcbt" + ":" + "Bundled Thatch");
       innerIcon = reg.registerIcon("tfcbt" + ":" + "Bundled Thatch Top");
       rotatedSideIcon = reg.registerIcon("tfcbt" + ":" + "Bundled Thatch Side");
    }
}
