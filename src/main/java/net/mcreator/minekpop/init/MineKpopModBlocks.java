
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minekpop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.minekpop.block.VanBlock;
import net.mcreator.minekpop.block.TataBlock;
import net.mcreator.minekpop.block.ShookyBlock;
import net.mcreator.minekpop.block.RjBlock;
import net.mcreator.minekpop.block.PorcosBoxBlock;
import net.mcreator.minekpop.block.MangBlock;
import net.mcreator.minekpop.block.KoyaBlock;
import net.mcreator.minekpop.block.CookyBlock;
import net.mcreator.minekpop.block.ChimmyBlock;
import net.mcreator.minekpop.MineKpopMod;

public class MineKpopModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MineKpopMod.MODID);
	public static final RegistryObject<Block> PORCOS_BOX = REGISTRY.register("porcos_box", () -> new PorcosBoxBlock());
	public static final RegistryObject<Block> COOKY = REGISTRY.register("cooky", () -> new CookyBlock());
	public static final RegistryObject<Block> SHOOKY = REGISTRY.register("shooky", () -> new ShookyBlock());
	public static final RegistryObject<Block> TATA = REGISTRY.register("tata", () -> new TataBlock());
	public static final RegistryObject<Block> CHIMMY = REGISTRY.register("chimmy", () -> new ChimmyBlock());
	public static final RegistryObject<Block> RJ = REGISTRY.register("rj", () -> new RjBlock());
	public static final RegistryObject<Block> KOYA = REGISTRY.register("koya", () -> new KoyaBlock());
	public static final RegistryObject<Block> MANG = REGISTRY.register("mang", () -> new MangBlock());
	public static final RegistryObject<Block> VAN = REGISTRY.register("van", () -> new VanBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
