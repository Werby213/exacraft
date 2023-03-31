
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.exacraft.block.BlockOfSteelBlock;
import net.mcreator.exacraft.ExacraftMod;

public class ExacraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ExacraftMod.MODID);
	public static final RegistryObject<Block> BLOCK_OF_STEEL = REGISTRY.register("block_of_steel", () -> new BlockOfSteelBlock());
}
