
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minekpop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.minekpop.MineKpopMod;

public class MineKpopModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, MineKpopMod.MODID);
	public static final RegistryObject<SoundEvent> OPENING = REGISTRY.register("opening", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "opening")));
	public static final RegistryObject<SoundEvent> OPENING2 = REGISTRY.register("opening2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "opening2")));
}
