
package net.mcreator.minekpop.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RM3Item extends Item {
	public RM3Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
