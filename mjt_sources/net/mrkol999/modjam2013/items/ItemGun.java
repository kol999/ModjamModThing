package net.mrkol999.modjam2013.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemGun extends Item //remember how all this stuff work in new forge.
{
	public ItemGun(int par1)
	{
		super(par1);
		this.setMaxStackSize(1);
		this.setCreativeTab(CreativeTabs.tabCombat); // epic combat gun is in the epic combat tab is creative
		this.setNoRepair();
		this.setUnlocalizedName("aquagun");
	}
}