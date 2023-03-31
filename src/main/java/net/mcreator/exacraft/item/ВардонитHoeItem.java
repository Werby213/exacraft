
package net.mcreator.exacraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.exacraft.init.ExacraftModItems;

public class ВардонитHoeItem extends HoeItem {
	public ВардонитHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 8.5f;
			}

			public float getAttackDamageBonus() {
				return 1f;
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
		}, 0, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
