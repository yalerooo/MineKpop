
package net.mcreator.minekpop.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class SmartLeSerafimItem extends RecordItem {
	public SmartLeSerafimItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("mine_kpop:easy1")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 4320);
	}
}
