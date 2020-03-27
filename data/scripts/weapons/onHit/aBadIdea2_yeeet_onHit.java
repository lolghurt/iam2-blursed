package data.scripts.weapons.onHit;

import com.fs.starfarer.api.Global;
import com.fs.starfarer.api.combat.CombatEngineAPI;
import com.fs.starfarer.api.combat.CombatEntityAPI;
import com.fs.starfarer.api.combat.DamagingProjectileAPI;
import com.fs.starfarer.api.combat.OnHitEffectPlugin;
import com.fs.starfarer.api.combat.ShipAPI;
import org.lazywizard.lazylib.MathUtils;
import org.lazywizard.lazylib.VectorUtils;
import org.lazywizard.lazylib.combat.CombatUtils;
import org.lwjgl.util.vector.Vector2f;

public class aBadIdea2_yeeet_onHit implements OnHitEffectPlugin {

	public void onHit(DamagingProjectileAPI projectile, CombatEntityAPI target,
					  Vector2f point, boolean shieldHit, CombatEngineAPI engine) {
		  if (target instanceof ShipAPI && ((ShipAPI) target).getParentStation()!=null) {
            target = ((ShipAPI) target).getParentStation(); }
          float forceToApply = projectile.getDamageAmount()*50f;
                                                        //change this modifier

        CombatUtils.applyForce(target, VectorUtils.getAngle(projectile.getLocation(),target.getLocation()), forceToApply);
        float rotateSpeedToApply = projectile.getDamageAmount()*1f;
                                                        //change this modifier
          target.setAngularVelocity(
                target.getAngularVelocity()+
                rotateSpeedToApply*MathUtils.getShortestRotation(projectile.getFacing(), VectorUtils.getFacing(VectorUtils.getDirectionalVector(projectile.getLocation(),target.getLocation())))/90f
        );
        Global.getSoundPlayer().playSound("aBadIdea2_yeet", 1f, 1f, target.getLocation(), target.getVelocity());

	}
}
