package net.mcreator.mogcraft.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.mogcraft.init.MogcraftModMobEffects;

public class HrtneedlefullPlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MogcraftModMobEffects.HRT_HAPPINESS.get(), 24000, 0, false, false));
	}
}
