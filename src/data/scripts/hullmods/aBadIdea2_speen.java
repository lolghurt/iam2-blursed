package data.scripts.hullmods;

import com.fs.starfarer.api.combat.BaseHullMod;
import com.fs.starfarer.api.combat.MutableShipStatsAPI;
import com.fs.starfarer.api.combat.ShipAPI;
import com.fs.starfarer.api.combat.ShipAPI.HullSize;
import com.fs.starfarer.api.util.Misc;

public class aBadIdea2_speen extends BaseHullMod {

    @Override //All you need is this to be honest. The framework will do everything on its own.
    public void applyEffectsAfterShipCreation(ShipAPI ship, String id) {
                if (ship.getVariant().hasHullMod("CHM_commission")) {
                    ship.getVariant().removeMod("CHM_commission");
                }
				// This is to remove the unnecessary dummy hull mod. Unless the player want it... but nah!
    }

	public static final float SPEEN = 1000f;
	public void applyEffectsBeforeShipCreation(HullSize hullSize, MutableShipStatsAPI stats, String id) {
		stats.getMaxTurnRate().modifyPercent(id, SPEEN);
	}
}
