
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mogcraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.mogcraft.potion.HRTHappinessMobEffect;
import net.mcreator.mogcraft.MogcraftMod;

public class MogcraftModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, MogcraftMod.MODID);
	public static final RegistryObject<MobEffect> HRT_HAPPINESS = REGISTRY.register("hrt_happiness", () -> new HRTHappinessMobEffect());
}
