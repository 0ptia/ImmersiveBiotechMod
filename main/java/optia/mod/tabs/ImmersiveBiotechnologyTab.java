package optia.mod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import optia.mod.init.ItemInit;

public class ImmersiveBiotechnologyTab extends CreativeTabs
{
	public ImmersiveBiotechnologyTab(String label) { super("immersivebiotechnologytab");
	this.setBackgroundImageName("creativetab.png"); }
	public ItemStack getTabIconItem( ) { return new ItemStack(ItemInit.SCRAPER);}
}
