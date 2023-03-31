
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.exacraft.block.ЭлектронитOreBlock;
import net.mcreator.exacraft.block.ЭлектронитBlockBlock;
import net.mcreator.exacraft.block.УранOreBlock;
import net.mcreator.exacraft.block.УранBlockBlock;
import net.mcreator.exacraft.block.ТорийOreBlock;
import net.mcreator.exacraft.block.ТорийBlockBlock;
import net.mcreator.exacraft.block.ТитанOreBlock;
import net.mcreator.exacraft.block.ТитанBlockBlock;
import net.mcreator.exacraft.block.СвинецOreBlock;
import net.mcreator.exacraft.block.СвинецBlockBlock;
import net.mcreator.exacraft.block.РубинOreBlock;
import net.mcreator.exacraft.block.РубинBlockBlock;
import net.mcreator.exacraft.block.ПластальBlockBlock;
import net.mcreator.exacraft.block.ОсмийOreBlock;
import net.mcreator.exacraft.block.ОсмийBlockBlock;
import net.mcreator.exacraft.block.ВардонитOreBlock;
import net.mcreator.exacraft.block.ВардонитBlockBlock;
import net.mcreator.exacraft.block.АлюминийOreBlock;
import net.mcreator.exacraft.block.АлюминийBlockBlock;
import net.mcreator.exacraft.block.Overworld_ecOreBlock;
import net.mcreator.exacraft.block.Overworld_ecBlockBlock;
import net.mcreator.exacraft.block.NickelOreBlock;
import net.mcreator.exacraft.block.NickelBlockBlock;
import net.mcreator.exacraft.block.LeadOreBlock;
import net.mcreator.exacraft.block.LeadBlockBlock;
import net.mcreator.exacraft.block.BlockOfSteelBlock;
import net.mcreator.exacraft.ExacraftMod;

public class ExacraftModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ExacraftMod.MODID);
	public static final RegistryObject<Block> BLOCK_OF_STEEL = REGISTRY.register("block_of_steel", () -> new BlockOfSteelBlock());
	public static final RegistryObject<Block> OVERWORLD_EC_ORE = REGISTRY.register("overworld_ec_ore", () -> new Overworld_ecOreBlock());
	public static final RegistryObject<Block> OVERWORLD_EC_BLOCK = REGISTRY.register("overworld_ec_block", () -> new Overworld_ecBlockBlock());
	public static final RegistryObject<Block> URAN_ORE = REGISTRY.register("uran_ore", () -> new УранOreBlock());
	public static final RegistryObject<Block> URAN_BLOCK = REGISTRY.register("uran_block", () -> new УранBlockBlock());
	public static final RegistryObject<Block> TORII_ORE = REGISTRY.register("torii_ore", () -> new ТорийOreBlock());
	public static final RegistryObject<Block> TORII_BLOCK = REGISTRY.register("torii_block", () -> new ТорийBlockBlock());
	public static final RegistryObject<Block> RUBIN_ORE = REGISTRY.register("rubin_ore", () -> new РубинOreBlock());
	public static final RegistryObject<Block> RUBIN_BLOCK = REGISTRY.register("rubin_block", () -> new РубинBlockBlock());
	public static final RegistryObject<Block> ALIUMINII_ORE = REGISTRY.register("aliuminii_ore", () -> new АлюминийOreBlock());
	public static final RegistryObject<Block> ALIUMINII_BLOCK = REGISTRY.register("aliuminii_block", () -> new АлюминийBlockBlock());
	public static final RegistryObject<Block> SVINIETS_ORE = REGISTRY.register("sviniets_ore", () -> new СвинецOreBlock());
	public static final RegistryObject<Block> SVINIETS_BLOCK = REGISTRY.register("sviniets_block", () -> new СвинецBlockBlock());
	public static final RegistryObject<Block> LEAD_ORE = REGISTRY.register("lead_ore", () -> new LeadOreBlock());
	public static final RegistryObject<Block> LEAD_BLOCK = REGISTRY.register("lead_block", () -> new LeadBlockBlock());
	public static final RegistryObject<Block> NICKEL_ORE = REGISTRY.register("nickel_ore", () -> new NickelOreBlock());
	public static final RegistryObject<Block> NICKEL_BLOCK = REGISTRY.register("nickel_block", () -> new NickelBlockBlock());
	public static final RegistryObject<Block> TITAN_ORE = REGISTRY.register("titan_ore", () -> new ТитанOreBlock());
	public static final RegistryObject<Block> TITAN_BLOCK = REGISTRY.register("titan_block", () -> new ТитанBlockBlock());
	public static final RegistryObject<Block> ELIEKTRONIT_ORE = REGISTRY.register("eliektronit_ore", () -> new ЭлектронитOreBlock());
	public static final RegistryObject<Block> ELIEKTRONIT_BLOCK = REGISTRY.register("eliektronit_block", () -> new ЭлектронитBlockBlock());
	public static final RegistryObject<Block> VARDONIT_ORE = REGISTRY.register("vardonit_ore", () -> new ВардонитOreBlock());
	public static final RegistryObject<Block> VARDONIT_BLOCK = REGISTRY.register("vardonit_block", () -> new ВардонитBlockBlock());
	public static final RegistryObject<Block> PLASTAL_BLOCK = REGISTRY.register("plastal_block", () -> new ПластальBlockBlock());
	public static final RegistryObject<Block> OSMII_ORE = REGISTRY.register("osmii_ore", () -> new ОсмийOreBlock());
	public static final RegistryObject<Block> OSMII_BLOCK = REGISTRY.register("osmii_block", () -> new ОсмийBlockBlock());
}
