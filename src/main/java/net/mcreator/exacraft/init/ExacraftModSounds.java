
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.exacraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.exacraft.ExacraftMod;

public class ExacraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ExacraftMod.MODID);
	public static final RegistryObject<SoundEvent> IN_THE_HALL_OF_THE_MOUNTAIN_KING = REGISTRY.register("in_the_hall_of_the_mountain_king", () -> new SoundEvent(new ResourceLocation("exacraft", "in_the_hall_of_the_mountain_king")));
}
