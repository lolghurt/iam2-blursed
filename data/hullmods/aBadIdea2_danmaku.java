package data.hullmods;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI.HullSize;

public class aBadIdea2_danmaku extends BaseHullMod {

	public static final float DAMAGE_MULT = 75f;
	public static final float SPAM_MULT = 400f;
	public static final float FLUX_MULT = 80f;


	public void applyEffectsBeforeShipCreation(HullSize hullSize, MutableShipStatsAPI stats, String id) {

			stats.getEnergyWeaponDamageMult().modifyMult(id, 1f - (DAMAGE_MULT*0.01f));
			stats.getBallisticWeaponDamageMult().modifyMult(id, 1f - (DAMAGE_MULT*0.01f));
			stats.getMissileWeaponDamageMult().modifyMult(id, 1f - (DAMAGE_MULT*0.01f));

			stats.getEnergyWeaponFluxCostMod().modifyMult(id, 1f-(FLUX_MULT*0.01f));
			stats.getBallisticWeaponFluxCostMod().modifyMult(id, 1f-(FLUX_MULT*0.01f));
			stats.getMissileWeaponFluxCostMod().modifyMult(id, 1f-(FLUX_MULT*0.01f));

			stats.getMissileRoFMult().modifyMult(id, 1f+(SPAM_MULT*0.01f));
			stats.getBallisticRoFMult().modifyMult(id, 1f+(SPAM_MULT*0.01f));
			stats.getEnergyRoFMult().modifyMult(id, 1f+(SPAM_MULT*0.01f));

			stats.getBallisticAmmoBonus().modifyMult(id, 1f+(SPAM_MULT*0.01f));
			stats.getEnergyAmmoBonus().modifyMult(id, 1f+(SPAM_MULT*0.01f));
			stats.getMissileAmmoBonus().modifyMult(id, 1f+(SPAM_MULT*0.01f));

	}

	public String getDescriptionParam(int index, HullSize hullSize) {
		if (index == 0) return "" + (int) SPAM_MULT + "%";
		if (index == 1) return "" + (int) SPAM_MULT + "%";
		if (index == 2) return "" + (int) FLUX_MULT + "%";
		if (index == 3) return "" + (int) DAMAGE_MULT + "%";
		return null;
	}
}