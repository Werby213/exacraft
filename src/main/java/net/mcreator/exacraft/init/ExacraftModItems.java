
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

import net.mcreator.exacraft.item.ЭлектронитDustItem;
import net.mcreator.exacraft.item.УранIngotItem;
import net.mcreator.exacraft.item.ТорийItem;
import net.mcreator.exacraft.item.ТитанIngotItem;
import net.mcreator.exacraft.item.СвинецIngotItem;
import net.mcreator.exacraft.item.РубинItem;
import net.mcreator.exacraft.item.ПластальSwordItem;
import net.mcreator.exacraft.item.ПластальShovelItem;
import net.mcreator.exacraft.item.ПластальPickaxeItem;
import net.mcreator.exacraft.item.ПластальIngotItem;
import net.mcreator.exacraft.item.ПластальHoeItem;
import net.mcreator.exacraft.item.ПластальAxeItem;
import net.mcreator.exacraft.item.ПластальArmorItem;
import net.mcreator.exacraft.item.ОсмийItem;
import net.mcreator.exacraft.item.ОсмийIngotItem;
import net.mcreator.exacraft.item.ВардонитSwordItem;
import net.mcreator.exacraft.item.ВардонитShovelItem;
import net.mcreator.exacraft.item.ВардонитPickaxeItem;
import net.mcreator.exacraft.item.ВардонитItem;
import net.mcreator.exacraft.item.ВардонитHoeItem;
import net.mcreator.exacraft.item.ВардонитAxeItem;
import net.mcreator.exacraft.item.ВардонитArmorItem;
import net.mcreator.exacraft.item.АлюминийIngotItem;
import net.mcreator.exacraft.item.SteelIngotItem;
import net.mcreator.exacraft.item.Overworld_ecItem;
import net.mcreator.exacraft.item.NickelIngotItem;
import net.mcreator.exacraft.item.LeadIngotItem;
import net.mcreator.exacraft.item.Exrecord1Item;
import net.mcreator.exacraft.ExacraftMod;

public class ExacraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ExacraftMod.MODID);
	public static final RegistryObject<Item> STEEL_INGOT = REGISTRY.register("steel_ingot", () -> new SteelIngotItem());
	public static final RegistryObject<Item> BLOCK_OF_STEEL = block(ExacraftModBlocks.BLOCK_OF_STEEL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> EXRECORD_1 = REGISTRY.register("exrecord_1", () -> new Exrecord1Item());
	public static final RegistryObject<Item> PLASTAL_ARMOR_HELMET = REGISTRY.register("plastal_armor_helmet", () -> new ПластальArmorItem.Helmet());
	public static final RegistryObject<Item> PLASTAL_ARMOR_CHESTPLATE = REGISTRY.register("plastal_armor_chestplate", () -> new ПластальArmorItem.Chestplate());
	public static final RegistryObject<Item> PLASTAL_ARMOR_LEGGINGS = REGISTRY.register("plastal_armor_leggings", () -> new ПластальArmorItem.Leggings());
	public static final RegistryObject<Item> PLASTAL_ARMOR_BOOTS = REGISTRY.register("plastal_armor_boots", () -> new ПластальArmorItem.Boots());
	public static final RegistryObject<Item> VARDONIT_ARMOR_HELMET = REGISTRY.register("vardonit_armor_helmet", () -> new ВардонитArmorItem.Helmet());
	public static final RegistryObject<Item> VARDONIT_ARMOR_CHESTPLATE = REGISTRY.register("vardonit_armor_chestplate", () -> new ВардонитArmorItem.Chestplate());
	public static final RegistryObject<Item> VARDONIT_ARMOR_LEGGINGS = REGISTRY.register("vardonit_armor_leggings", () -> new ВардонитArmorItem.Leggings());
	public static final RegistryObject<Item> VARDONIT_ARMOR_BOOTS = REGISTRY.register("vardonit_armor_boots", () -> new ВардонитArmorItem.Boots());
	public static final RegistryObject<Item> OVERWORLD_EC_ORE = block(ExacraftModBlocks.OVERWORLD_EC_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OVERWORLD_EC_BLOCK = block(ExacraftModBlocks.OVERWORLD_EC_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> URAN_ORE = block(ExacraftModBlocks.URAN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> URAN_BLOCK = block(ExacraftModBlocks.URAN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TORII_ORE = block(ExacraftModBlocks.TORII_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TORII_BLOCK = block(ExacraftModBlocks.TORII_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBIN_ORE = block(ExacraftModBlocks.RUBIN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> RUBIN_BLOCK = block(ExacraftModBlocks.RUBIN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALIUMINII_ORE = block(ExacraftModBlocks.ALIUMINII_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ALIUMINII_BLOCK = block(ExacraftModBlocks.ALIUMINII_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SVINIETS_ORE = block(ExacraftModBlocks.SVINIETS_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SVINIETS_BLOCK = block(ExacraftModBlocks.SVINIETS_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LEAD_ORE = block(ExacraftModBlocks.LEAD_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> LEAD_BLOCK = block(ExacraftModBlocks.LEAD_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NICKEL_ORE = block(ExacraftModBlocks.NICKEL_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NICKEL_BLOCK = block(ExacraftModBlocks.NICKEL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TITAN_ORE = block(ExacraftModBlocks.TITAN_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> TITAN_BLOCK = block(ExacraftModBlocks.TITAN_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ELIEKTRONIT_ORE = block(ExacraftModBlocks.ELIEKTRONIT_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ELIEKTRONIT_BLOCK = block(ExacraftModBlocks.ELIEKTRONIT_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VARDONIT_ORE = block(ExacraftModBlocks.VARDONIT_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> VARDONIT_BLOCK = block(ExacraftModBlocks.VARDONIT_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> PLASTAL_BLOCK = block(ExacraftModBlocks.PLASTAL_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OVERWORLD_EC = REGISTRY.register("overworld_ec", () -> new Overworld_ecItem());
	public static final RegistryObject<Item> URAN_INGOT = REGISTRY.register("uran_ingot", () -> new УранIngotItem());
	public static final RegistryObject<Item> TORII = REGISTRY.register("torii", () -> new ТорийItem());
	public static final RegistryObject<Item> RUBIN = REGISTRY.register("rubin", () -> new РубинItem());
	public static final RegistryObject<Item> ALIUMINII_INGOT = REGISTRY.register("aliuminii_ingot", () -> new АлюминийIngotItem());
	public static final RegistryObject<Item> OSMII = REGISTRY.register("osmii", () -> new ОсмийItem());
	public static final RegistryObject<Item> OSMII_INGOT = REGISTRY.register("osmii_ingot", () -> new ОсмийIngotItem());
	public static final RegistryObject<Item> SVINIETS_INGOT = REGISTRY.register("sviniets_ingot", () -> new СвинецIngotItem());
	public static final RegistryObject<Item> LEAD_INGOT = REGISTRY.register("lead_ingot", () -> new LeadIngotItem());
	public static final RegistryObject<Item> NICKEL_INGOT = REGISTRY.register("nickel_ingot", () -> new NickelIngotItem());
	public static final RegistryObject<Item> TITAN_INGOT = REGISTRY.register("titan_ingot", () -> new ТитанIngotItem());
	public static final RegistryObject<Item> ELIEKTRONIT_DUST = REGISTRY.register("eliektronit_dust", () -> new ЭлектронитDustItem());
	public static final RegistryObject<Item> VARDONIT = REGISTRY.register("vardonit", () -> new ВардонитItem());
	public static final RegistryObject<Item> PLASTAL_INGOT = REGISTRY.register("plastal_ingot", () -> new ПластальIngotItem());
	public static final RegistryObject<Item> VARDONIT_AXE = REGISTRY.register("vardonit_axe", () -> new ВардонитAxeItem());
	public static final RegistryObject<Item> VARDONIT_PICKAXE = REGISTRY.register("vardonit_pickaxe", () -> new ВардонитPickaxeItem());
	public static final RegistryObject<Item> VARDONIT_SWORD = REGISTRY.register("vardonit_sword", () -> new ВардонитSwordItem());
	public static final RegistryObject<Item> VARDONIT_SHOVEL = REGISTRY.register("vardonit_shovel", () -> new ВардонитShovelItem());
	public static final RegistryObject<Item> VARDONIT_HOE = REGISTRY.register("vardonit_hoe", () -> new ВардонитHoeItem());
	public static final RegistryObject<Item> PLASTAL_PICKAXE = REGISTRY.register("plastal_pickaxe", () -> new ПластальPickaxeItem());
	public static final RegistryObject<Item> PLASTAL_AXE = REGISTRY.register("plastal_axe", () -> new ПластальAxeItem());
	public static final RegistryObject<Item> PLASTAL_SWORD = REGISTRY.register("plastal_sword", () -> new ПластальSwordItem());
	public static final RegistryObject<Item> PLASTAL_SHOVEL = REGISTRY.register("plastal_shovel", () -> new ПластальShovelItem());
	public static final RegistryObject<Item> PLASTAL_HOE = REGISTRY.register("plastal_hoe", () -> new ПластальHoeItem());
	public static final RegistryObject<Item> OSMII_ORE = block(ExacraftModBlocks.OSMII_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> OSMII_BLOCK = block(ExacraftModBlocks.OSMII_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
