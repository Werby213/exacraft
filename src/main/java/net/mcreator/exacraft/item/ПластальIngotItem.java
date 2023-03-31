
package net.mcreator.exacraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ПластальIngotItem extends Item {
	public ПластальIngotItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS).stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("\u0421\u043C\u0435\u0441\u044C \u043F\u043B\u0430\u0441\u0442\u0438\u043A\u0430 \u0438 \u0441\u0442\u0430\u043B\u0438."));
	}
}
