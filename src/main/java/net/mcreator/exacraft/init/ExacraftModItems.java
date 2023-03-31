
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.exacraft.item.SteelIngotItem;
import net.mcreator.exacraft.item.Exrecord1Item;
import net.mcreator.exacraft.ExacraftMod;

public class ExacraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExacraftMod.MODID);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> BLOCK_OF_STEEL = block(ExacraftModBlocks.BLOCK_OF_STEEL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EXRECORD_1 = REGISTRY.register("exrecord_1", () -> new Exrecord1Item());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
