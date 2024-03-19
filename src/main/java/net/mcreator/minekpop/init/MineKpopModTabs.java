
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minekpop.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.minekpop.MineKpopMod;

public class MineKpopModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MineKpopMod.MODID);
	public static final RegistryObject<CreativeModeTab> MINE_KPOP = REGISTRY.register("mine_kpop",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mine_kpop.mine_kpop")).icon(() -> new ItemStack(MineKpopModItems.LESSERAFIM_LIGHTSTICK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MineKpopModItems.LESSERAFIM_LIGHTSTICK.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_ALBUM.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_ALBUM_2.get());
				tabData.accept(MineKpopModItems.CHAEWON_1.get());
				tabData.accept(MineKpopModItems.CHAEWON_2.get());
				tabData.accept(MineKpopModItems.CHAEWON_3.get());
				tabData.accept(MineKpopModItems.CHAEWON_4.get());
				tabData.accept(MineKpopModItems.CHAEWON_5.get());
				tabData.accept(MineKpopModItems.CHAEWON_FCB_1.get());
				tabData.accept(MineKpopModItems.CHAEWON_FCB_2.get());
				tabData.accept(MineKpopModItems.CHAEWON_FCB_3.get());
				tabData.accept(MineKpopModItems.EUNCHAE_1.get());
				tabData.accept(MineKpopModItems.EUNCHAE_2.get());
				tabData.accept(MineKpopModItems.EUNCHAE_3.get());
				tabData.accept(MineKpopModItems.EUNCHAE_4.get());
				tabData.accept(MineKpopModItems.JUNJIN_1.get());
				tabData.accept(MineKpopModItems.JUNJIN_2.get());
				tabData.accept(MineKpopModItems.JUNJIN_3.get());
				tabData.accept(MineKpopModItems.JUNJIN_4.get());
				tabData.accept(MineKpopModItems.KAZUHA_1.get());
				tabData.accept(MineKpopModItems.KAZUHA_2.get());
				tabData.accept(MineKpopModItems.KAZUHA_3.get());
				tabData.accept(MineKpopModItems.KAZUHA_4.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_1.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_F_1.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_FCB_1.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_FCB_2.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_FCB_3.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_PERFECT_NIGHT.get());
				tabData.accept(MineKpopModItems.SAKURA_1.get());
				tabData.accept(MineKpopModItems.SAKURA_2.get());
				tabData.accept(MineKpopModItems.SAKURA_3.get());
				tabData.accept(MineKpopModItems.SAKURA_4.get());
				tabData.accept(MineKpopModItems.CHAEWON_LAKERS.get());
				tabData.accept(MineKpopModItems.CHAEWON_RABBIT.get());
				tabData.accept(MineKpopModItems.CHAEWON_6.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_2.get());
			})

					.build());
}
