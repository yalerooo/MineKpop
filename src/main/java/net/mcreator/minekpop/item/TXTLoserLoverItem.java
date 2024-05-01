
package net.mcreator.minekpop.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class TXTLoserLoverItem extends RecordItem {
	public TXTLoserLoverItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mine_kpop:loser")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 4280);
	}
}
