
package net.mcreator.exacraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.exacraft.init.ExacraftModItems;

public class ПластальPickaxeItem extends PickaxeItem {
	public ПластальPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1500;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 1.5f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 14;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ExacraftModItems.PLASTAL_INGOT.get()));
			}
		}, 1, -2.5f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
	}
}
