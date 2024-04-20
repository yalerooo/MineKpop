
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
import net.mcreator.minekpop.block.LeSserafimAlbum1TBlock;
import net.mcreator.minekpop.block.LeSserafimAlbum1PBlock;
import net.mcreator.minekpop.block.LSAlbum2TBlock;
import net.mcreator.minekpop.block.LSAlbum2PBlock;
import net.mcreator.minekpop.block.KoyaBlock;
import net.mcreator.minekpop.block.CookyBlock;
import net.mcreator.minekpop.block.ChimmyBlock;
import net.mcreator.minekpop.block.BTSYNTBlock;
import net.mcreator.minekpop.block.BTSNPBlock;
import net.mcreator.minekpop.block.BTSAlbum1TBlock;
import net.mcreator.minekpop.block.BTSAlbum1PBlock;
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
	public static final RegistryObject<Block> LE_SSERAFIM_ALBUM_1_T = REGISTRY.register("le_sserafim_album_1_t", () -> new LeSserafimAlbum1TBlock());
	public static final RegistryObject<Block> LE_SSERAFIM_ALBUM_1_P = REGISTRY.register("le_sserafim_album_1_p", () -> new LeSserafimAlbum1PBlock());
	public static final RegistryObject<Block> LS_ALBUM_2_T = REGISTRY.register("ls_album_2_t", () -> new LSAlbum2TBlock());
	public static final RegistryObject<Block> LS_ALBUM_2_P = REGISTRY.register("ls_album_2_p", () -> new LSAlbum2PBlock());
	public static final RegistryObject<Block> BTS_ALBUM_1_T = REGISTRY.register("bts_album_1_t", () -> new BTSAlbum1TBlock());
	public static final RegistryObject<Block> BTS_ALBUM_1_P = REGISTRY.register("bts_album_1_p", () -> new BTSAlbum1PBlock());
	public static final RegistryObject<Block> BTSYNT = REGISTRY.register("btsynt", () -> new BTSYNTBlock());
	public static final RegistryObject<Block> BTSNP = REGISTRY.register("btsnp", () -> new BTSNPBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
