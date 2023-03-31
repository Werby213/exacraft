
package net.mcreator.exacraft.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

public class Exrecord1Item extends RecordItem {
	public Exrecord1Item() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("exacraft:in_the_hall_of_the_mountain_king")), new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE), 3);
	}
}
