
package net.mcreator.exacraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.exacraft.init.ExacraftModItems;

public class ВардонитAxeItem extends AxeItem {
	public ВардонитAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 9f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ExacraftModItems.VARDONIT.get()));
			}
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
