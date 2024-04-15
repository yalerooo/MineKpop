
package net.mcreator.minekpop.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class V1Item extends Item {
	public V1Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
