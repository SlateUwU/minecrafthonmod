
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mogcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mogcraft.MogcraftMod;

public class MogcraftModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MogcraftMod.MODID);
	public static final RegistryObject<CreativeModeTab> TESTING = REGISTRY.register("testing",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mogcraft.testing")).icon(() -> new ItemStack(Blocks.MANGROVE_PROPAGULE)).displayItems((parameters, tabData) -> {
				tabData.accept(MogcraftModItems.HRT_NEEDLE.get());
				tabData.accept(MogcraftModItems.HRTNEEDLEVIAL.get());
			}).withSearchBar().build());
}
