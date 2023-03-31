
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.exacraft.world.features.ores.ЭлектронитOreFeature;
import net.mcreator.exacraft.world.features.ores.УранOreFeature;
import net.mcreator.exacraft.world.features.ores.ТорийOreFeature;
import net.mcreator.exacraft.world.features.ores.ТитанOreFeature;
import net.mcreator.exacraft.world.features.ores.СвинецOreFeature;
import net.mcreator.exacraft.world.features.ores.РубинOreFeature;
import net.mcreator.exacraft.world.features.ores.ОсмийOreFeature;
import net.mcreator.exacraft.world.features.ores.ВардонитOreFeature;
import net.mcreator.exacraft.world.features.ores.АлюминийOreFeature;
import net.mcreator.exacraft.world.features.ores.Overworld_ecOreFeature;
import net.mcreator.exacraft.world.features.ores.NickelOreFeature;
import net.mcreator.exacraft.world.features.ores.LeadOreFeature;
import net.mcreator.exacraft.ExacraftMod;

@Mod.EventBusSubscriber
public class ExacraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ExacraftMod.MODID);
	public static final RegistryObject<Feature<?>> OVERWORLD_EC_ORE = REGISTRY.register("overworld_ec_ore", Overworld_ecOreFeature::feature);
	public static final RegistryObject<Feature<?>> URAN_ORE = REGISTRY.register("uran_ore", УранOreFeature::feature);
	public static final RegistryObject<Feature<?>> TORII_ORE = REGISTRY.register("torii_ore", ТорийOreFeature::feature);
	public static final RegistryObject<Feature<?>> RUBIN_ORE = REGISTRY.register("rubin_ore", РубинOreFeature::feature);
	public static final RegistryObject<Feature<?>> ALIUMINII_ORE = REGISTRY.register("aliuminii_ore", АлюминийOreFeature::feature);
	public static final RegistryObject<Feature<?>> SVINIETS_ORE = REGISTRY.register("sviniets_ore", СвинецOreFeature::feature);
	public static final RegistryObject<Feature<?>> LEAD_ORE = REGISTRY.register("lead_ore", LeadOreFeature::feature);
	public static final RegistryObject<Feature<?>> NICKEL_ORE = REGISTRY.register("nickel_ore", NickelOreFeature::feature);
	public static final RegistryObject<Feature<?>> TITAN_ORE = REGISTRY.register("titan_ore", ТитанOreFeature::feature);
	public static final RegistryObject<Feature<?>> ELIEKTRONIT_ORE = REGISTRY.register("eliektronit_ore", ЭлектронитOreFeature::feature);
	public static final RegistryObject<Feature<?>> VARDONIT_ORE = REGISTRY.register("vardonit_ore", ВардонитOreFeature::feature);
	public static final RegistryObject<Feature<?>> OSMII_ORE = REGISTRY.register("osmii_ore", ОсмийOreFeature::feature);
}
