
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minekpop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.minekpop.block.PorcosBoxBlock;
import net.mcreator.minekpop.MineKpopMod;

public class MineKpopModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MineKpopMod.MODID);
	public static final RegistryObject<Block> PORCOS_BOX = REGISTRY.register("porcos_box", () -> new PorcosBoxBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
