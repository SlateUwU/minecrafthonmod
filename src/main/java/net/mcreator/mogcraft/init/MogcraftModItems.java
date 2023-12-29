
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mogcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mogcraft.item.HrtneedlevialItem;
import net.mcreator.mogcraft.item.HrtneedlefullItem;
import net.mcreator.mogcraft.item.HRTNeedleItem;
import net.mcreator.mogcraft.MogcraftMod;

public class MogcraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MogcraftMod.MODID);
	public static final RegistryObject<Item> HRTNEEDLEFULL = REGISTRY.register("hrtneedlefull", () -> new HrtneedlefullItem());
	public static final RegistryObject<Item> HRT_NEEDLE = REGISTRY.register("hrt_needle", () -> new HRTNeedleItem());
	public static final RegistryObject<Item> HRTNEEDLEVIAL = REGISTRY.register("hrtneedlevial", () -> new HrtneedlevialItem());
}
