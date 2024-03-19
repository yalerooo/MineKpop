
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
				tabData.accept(MineKpopModItems.STRAY_KIDS_LIGHTSTICK.get());
				tabData.accept(MineKpopModItems.BTS_LIGHTSTICK.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_ALBUM.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_ALBUM_2.get());
				tabData.accept(MineKpopModItems.STRAY_KIDS_5_STARS.get());
				tabData.accept(MineKpopModItems.STRAY_KIDS_MAX_IDENT.get());
				tabData.accept(MineKpopModItems.BTS_LOVE_YOURSELF.get());
				tabData.accept(MineKpopModItems.BTS_YOU_NEVER_WALK_ALONE.get());
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
				tabData.accept(MineKpopModItems.CHAN_1.get());
				tabData.accept(MineKpopModItems.CHAN_2.get());
				tabData.accept(MineKpopModItems.CHAN_3.get());
				tabData.accept(MineKpopModItems.CHAN_4.get());
				tabData.accept(MineKpopModItems.CHANGBIN_1.get());
				tabData.accept(MineKpopModItems.CHANGBIN_2.get());
				tabData.accept(MineKpopModItems.CHANGBIN_3.get());
				tabData.accept(MineKpopModItems.CHANGBIN_4.get());
				tabData.accept(MineKpopModItems.FELIX_1.get());
				tabData.accept(MineKpopModItems.FELIX_2.get());
				tabData.accept(MineKpopModItems.FELIX_3.get());
				tabData.accept(MineKpopModItems.FELIX_4.get());
				tabData.accept(MineKpopModItems.HAN_1.get());
				tabData.accept(MineKpopModItems.HAN_2.get());
				tabData.accept(MineKpopModItems.HAN_3.get());
				tabData.accept(MineKpopModItems.HAN_4.get());
				tabData.accept(MineKpopModItems.HYUNJIN_1.get());
				tabData.accept(MineKpopModItems.HYUNJIN_2.get());
				tabData.accept(MineKpopModItems.HYUNJIN_3.get());
				tabData.accept(MineKpopModItems.HYUNJIN_4.get());
				tabData.accept(MineKpopModItems.IN_1.get());
				tabData.accept(MineKpopModItems.IN_2.get());
				tabData.accept(MineKpopModItems.IN_3.get());
				tabData.accept(MineKpopModItems.IN_4.get());
				tabData.accept(MineKpopModItems.LEE_KNOW_1.get());
				tabData.accept(MineKpopModItems.LEE_KNOW_2.get());
				tabData.accept(MineKpopModItems.LEE_KNOW_3.get());
				tabData.accept(MineKpopModItems.LEE_KNOW_4.get());
				tabData.accept(MineKpopModItems.SEUNGMIN_1.get());
				tabData.accept(MineKpopModItems.SEUNGMIN_2.get());
				tabData.accept(MineKpopModItems.SEUNGMIN_3.get());
				tabData.accept(MineKpopModItems.SEUNGMIN_4.get());
				tabData.accept(MineKpopModItems.STRAY_KIDS_1.get());
				tabData.accept(MineKpopModItems.STRAY_KIDS_2.get());
				tabData.accept(MineKpopModItems.J_HOPE_1.get());
				tabData.accept(MineKpopModItems.J_HOPE_2.get());
				tabData.accept(MineKpopModItems.J_HOPE_3.get());
				tabData.accept(MineKpopModItems.J_HOPE_4.get());
				tabData.accept(MineKpopModItems.JIMIN_1.get());
				tabData.accept(MineKpopModItems.JIMIN_2.get());
				tabData.accept(MineKpopModItems.JIMIN_3.get());
				tabData.accept(MineKpopModItems.JIMIN_4.get());
				tabData.accept(MineKpopModItems.JIMIN_5.get());
				tabData.accept(MineKpopModItems.JIN_1.get());
				tabData.accept(MineKpopModItems.JIN_2.get());
				tabData.accept(MineKpopModItems.JIN_3.get());
				tabData.accept(MineKpopModItems.JIN_4.get());
				tabData.accept(MineKpopModItems.JUNG_KOOK_1.get());
				tabData.accept(MineKpopModItems.JUNG_KOOK_2.get());
				tabData.accept(MineKpopModItems.JUNG_KOOK_3.get());
				tabData.accept(MineKpopModItems.JUNG_KOOK_4.get());
				tabData.accept(MineKpopModItems.JUNG_KOOK_5.get());
				tabData.accept(MineKpopModItems.RM_1.get());
				tabData.accept(MineKpopModItems.RM_2.get());
				tabData.accept(MineKpopModItems.RM_3.get());
				tabData.accept(MineKpopModItems.RM_4.get());
				tabData.accept(MineKpopModItems.SUGA_1.get());
				tabData.accept(MineKpopModItems.SUGA_2.get());
				tabData.accept(MineKpopModItems.SUGA_3.get());
				tabData.accept(MineKpopModItems.SUGA_4.get());
				tabData.accept(MineKpopModItems.SUGA_5.get());
				tabData.accept(MineKpopModItems.V_1.get());
				tabData.accept(MineKpopModItems.V_2.get());
				tabData.accept(MineKpopModItems.V_3.get());
				tabData.accept(MineKpopModItems.V_4.get());
				tabData.accept(MineKpopModItems.BTS_1.get());
				tabData.accept(MineKpopModItems.BTS_2.get());
				tabData.accept(MineKpopModItems.BT_21.get());
			})

					.build());
}
