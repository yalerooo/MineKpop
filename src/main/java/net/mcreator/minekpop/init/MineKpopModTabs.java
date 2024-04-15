
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
				tabData.accept(MineKpopModItems.G_IDLE_LIGHTSTICK.get());
				tabData.accept(MineKpopModItems.TXT_LIGHTSTICK.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_ALBUM.get());
				tabData.accept(MineKpopModItems.LE_SSERAFIM_ALBUM_2.get());
				tabData.accept(MineKpopModItems.STRAY_KIDS_5_STARS.get());
				tabData.accept(MineKpopModItems.STRAY_KIDS_MAX_IDENT.get());
				tabData.accept(MineKpopModItems.BTS_LOVE_YOURSELF.get());
				tabData.accept(MineKpopModItems.BTS_YOU_NEVER_WALK_ALONE.get());
				tabData.accept(MineKpopModItems.G_IDLE_IFEEL_1.get());
				tabData.accept(MineKpopModItems.G_IDLE_IFEEL_2.get());
				tabData.accept(MineKpopModItems.TXT_BLUE_HOUR.get());
				tabData.accept(MineKpopModItems.TXT_THE_DREAM_CHAPTER_STAR.get());
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
				tabData.accept(MineKpopModItems.MINNIE_1.get());
				tabData.accept(MineKpopModItems.MINNIE_2.get());
				tabData.accept(MineKpopModItems.MINNIE_3.get());
				tabData.accept(MineKpopModItems.MINNIE_4.get());
				tabData.accept(MineKpopModItems.MINNIE_5.get());
				tabData.accept(MineKpopModItems.MIYEON_1.get());
				tabData.accept(MineKpopModItems.MIYEON_2.get());
				tabData.accept(MineKpopModItems.MIYEON_3.get());
				tabData.accept(MineKpopModItems.MIYEON_4.get());
				tabData.accept(MineKpopModItems.SHUHUA_1.get());
				tabData.accept(MineKpopModItems.SHUHUA_2.get());
				tabData.accept(MineKpopModItems.SHUHUA_3.get());
				tabData.accept(MineKpopModItems.SHUHUA_4.get());
				tabData.accept(MineKpopModItems.SOOJIN_1.get());
				tabData.accept(MineKpopModItems.SOOJIN_2.get());
				tabData.accept(MineKpopModItems.SOOJIN_3.get());
				tabData.accept(MineKpopModItems.SOOJIN_4.get());
				tabData.accept(MineKpopModItems.SOYEON_1.get());
				tabData.accept(MineKpopModItems.SOYEON_2.get());
				tabData.accept(MineKpopModItems.SOYEON_3.get());
				tabData.accept(MineKpopModItems.SOYEON_4.get());
				tabData.accept(MineKpopModItems.SOYEON_5.get());
				tabData.accept(MineKpopModItems.SOYEON_6.get());
				tabData.accept(MineKpopModItems.YUQI_1.get());
				tabData.accept(MineKpopModItems.YUQI_2.get());
				tabData.accept(MineKpopModItems.YUQI_3.get());
				tabData.accept(MineKpopModItems.YUQI_4.get());
				tabData.accept(MineKpopModItems.YUQI_5.get());
				tabData.accept(MineKpopModItems.G_IDLE_1.get());
				tabData.accept(MineKpopModItems.G_IDLE_2.get());
				tabData.accept(MineKpopModItems.G_IDLE_3.get());
				tabData.accept(MineKpopModItems.G_IDLE_4.get());
				tabData.accept(MineKpopModItems.G_IDLE_5.get());
				tabData.accept(MineKpopModItems.G_IDLE_6.get());
				tabData.accept(MineKpopModItems.G_IDLE_7.get());
				tabData.accept(MineKpopModItems.BEOMGYU_1.get());
				tabData.accept(MineKpopModItems.BEOMGYU_2.get());
				tabData.accept(MineKpopModItems.BEOMGYU_3.get());
				tabData.accept(MineKpopModItems.BEOMGYU_4.get());
				tabData.accept(MineKpopModItems.BEOMGYU_5.get());
				tabData.accept(MineKpopModItems.HUENING_KAI_1.get());
				tabData.accept(MineKpopModItems.HUENING_KAI_2.get());
				tabData.accept(MineKpopModItems.HUENING_KAI_3.get());
				tabData.accept(MineKpopModItems.HUENING_KAI_4.get());
				tabData.accept(MineKpopModItems.HUENING_KAI_5.get());
				tabData.accept(MineKpopModItems.SOOBIN_1.get());
				tabData.accept(MineKpopModItems.SOOBIN_2.get());
				tabData.accept(MineKpopModItems.SOOBIN_3.get());
				tabData.accept(MineKpopModItems.SOOBIN_4.get());
				tabData.accept(MineKpopModItems.SOOBIN_5.get());
				tabData.accept(MineKpopModItems.TAEHYUN_1.get());
				tabData.accept(MineKpopModItems.TAEHYUN_2.get());
				tabData.accept(MineKpopModItems.TAEHYUN_3.get());
				tabData.accept(MineKpopModItems.TAEHYUN_4.get());
				tabData.accept(MineKpopModItems.TAEHYUN_5.get());
				tabData.accept(MineKpopModItems.YEONJUN_1.get());
				tabData.accept(MineKpopModItems.YEONJUN_2.get());
				tabData.accept(MineKpopModItems.YEONJUN_3.get());
				tabData.accept(MineKpopModItems.YEONJUN_4.get());
				tabData.accept(MineKpopModItems.YEONJUN_5.get());
				tabData.accept(MineKpopModItems.TXT_1.get());
				tabData.accept(MineKpopModItems.TXT_2.get());
				tabData.accept(MineKpopModItems.TXT_3.get());
				tabData.accept(MineKpopModItems.TXT_4.get());
				tabData.accept(MineKpopModItems.TXT_5.get());
				tabData.accept(MineKpopModItems.TXT_6.get());
				tabData.accept(MineKpopModItems.TXT_7.get());
				tabData.accept(MineKpopModItems.TXT_8.get());
				tabData.accept(MineKpopModItems.TXT_9.get());
				tabData.accept(MineKpopModItems.SMART_LE_SERAFIM.get());
				tabData.accept(MineKpopModItems.EASY_LE_SSERAFIM.get());
				tabData.accept(MineKpopModItems.NOCELESTIAL_LE_SSERAFIM.get());
				tabData.accept(MineKpopModItems.FIRE_IN_THE_BELLY_LE_SSERAFIM.get());
				tabData.accept(MineKpopModItems.UNFORGIVEN_LE_SSERAFIM.get());
				tabData.accept(MineKpopModItems.PERFECT_NIGHT_LE_SSERAFIM.get());
				tabData.accept(MineKpopModItems.ANTIFRAGILE_LE_SSERAFIM.get());
				tabData.accept(MineKpopModItems.EVEPSYCHETHEBLUEBEARDSWIFE.get());
				tabData.accept(MineKpopModItems.QUEENCARD_G_IDLE.get());
				tabData.accept(MineKpopModItems.FATEGIDLE.get());
				tabData.accept(MineKpopModItems.LADY_GIDLE.get());
				tabData.accept(MineKpopModItems.WIFEGIDLE.get());
				tabData.accept(MineKpopModItems.I_WANT_THAT_GIDLE.get());
				tabData.accept(MineKpopModItems.EYES_ROLL_GIDLE.get());
				tabData.accept(MineKpopModItems.LOVE_SONG_TXT.get());
				tabData.accept(MineKpopModItems.SLUMP_SKZ.get());
				tabData.accept(MineKpopModItems.SILENT_CRY_SKZ.get());
				tabData.accept(MineKpopModItems.CHEESE_SKZ.get());
				tabData.accept(MineKpopModItems.HELLEVATOR_SKZ.get());
				tabData.accept(MineKpopModItems.TOMBO_YGIDEL.get());
				tabData.accept(MineKpopModItems.NXDEGIDLE.get());
				tabData.accept(MineKpopModItems.IVE_IAM.get());
				tabData.accept(MineKpopModItems.DRAMA_AESPA.get());
				tabData.accept(MineKpopModItems.QUEEN_ZIO_P_ARK.get());
				tabData.accept(MineKpopModBlocks.PORCOS_BOX.get().asItem());
				tabData.accept(MineKpopModItems.LALALA_SKZ.get());
				tabData.accept(MineKpopModItems.SOCIAL_PATH_SKZ.get());
				tabData.accept(MineKpopModItems.GODS_NEW_JEANS.get());
				tabData.accept(MineKpopModItems.SUPER_SHY_NEW_JEANS.get());
				tabData.accept(MineKpopModItems.MAGNETIC_ILLIT.get());
				tabData.accept(MineKpopModItems.IDOL_YOASOBI.get());
				tabData.accept(MineKpopModItems.SINGWAB_B_KOMANCHI.get());
				tabData.accept(MineKpopModItems.STARTTRAIN.get());
			})

					.build());
}
