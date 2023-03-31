
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.exacraft.world.inventory.SmelterMenu;
import net.mcreator.exacraft.ExacraftMod;

public class ExacraftModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ExacraftMod.MODID);
	public static final RegistryObject<MenuType<SmelterMenu>> SMELTER = REGISTRY.register("smelter", () -> IForgeMenuType.create(SmelterMenu::new));
}
