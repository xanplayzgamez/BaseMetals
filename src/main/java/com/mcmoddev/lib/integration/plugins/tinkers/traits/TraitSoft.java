/**
 * 
 */
package com.mcmoddev.lib.integration.plugins.tinkers.traits;

import javax.annotation.Nonnull;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import slimeknights.tconstruct.library.traits.AbstractTrait;
// import slimeknights.tconstruct.library.utils.ToolHelper;

/**
 * @author Daniel Hazelton &lt;dshadowwolf@gmail.com&gt;
 *
 */
public class TraitSoft extends AbstractTrait {

	public TraitSoft() {
		super("soft", 0xffffff);
	}

	@Override
	public int onToolDamage(@Nonnull final ItemStack tool, @Nonnull final int damage, @Nonnull int newDamage, @Nonnull final EntityLivingBase entity) {
		newDamage += (int) (damage * 1.25f);
		return super.onToolDamage(tool, damage, newDamage, entity);
	}
}
