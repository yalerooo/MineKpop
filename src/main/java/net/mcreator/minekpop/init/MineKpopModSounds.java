
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
	public static final RegistryObject<SoundEvent> EASY = REGISTRY.register("easy", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "easy")));
	public static final RegistryObject<SoundEvent> EASY1 = REGISTRY.register("easy1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "easy1")));
	public static final RegistryObject<SoundEvent> EASY3 = REGISTRY.register("easy3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "easy3")));
	public static final RegistryObject<SoundEvent> NOCELESTIAL = REGISTRY.register("nocelestial", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "nocelestial")));
	public static final RegistryObject<SoundEvent> FIREINTHEBELLY = REGISTRY.register("fireinthebelly", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "fireinthebelly")));
	public static final RegistryObject<SoundEvent> UNFORGIVEN = REGISTRY.register("unforgiven", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "unforgiven")));
	public static final RegistryObject<SoundEvent> UNFORGIVEN2 = REGISTRY.register("unforgiven2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "unforgiven2")));
	public static final RegistryObject<SoundEvent> PERFECT = REGISTRY.register("perfect", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "perfect")));
	public static final RegistryObject<SoundEvent> ANTIFRAGILE = REGISTRY.register("antifragile", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "antifragile")));
	public static final RegistryObject<SoundEvent> EVE = REGISTRY.register("eve", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "eve")));
	public static final RegistryObject<SoundEvent> QUEENCARD = REGISTRY.register("queencard", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("mine_kpop", "queencard")));
}
