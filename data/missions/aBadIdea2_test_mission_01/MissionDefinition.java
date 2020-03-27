package data.missions.aBadIdea2_test_mission_01;

import com.fs.starfarer.api.combat.BattleObjectiveAPI;
import com.fs.starfarer.api.fleet.FleetGoal;
import com.fs.starfarer.api.fleet.FleetMemberType;
import com.fs.starfarer.api.mission.FleetSide;
import com.fs.starfarer.api.mission.MissionDefinitionAPI;
import com.fs.starfarer.api.mission.MissionDefinitionPlugin;

public class MissionDefinition implements MissionDefinitionPlugin {

	public void defineMission(MissionDefinitionAPI api) {

		// Set up the fleets
		api.initFleet(FleetSide.PLAYER, "ISS", FleetGoal.ATTACK, false);
		api.initFleet(FleetSide.ENEMY, "ISS", FleetGoal.ATTACK, true);

		// Set a blurb for each fleet
		api.setFleetTagline(FleetSide.PLAYER, "A memorable one-liner describing the player's fleet");
		api.setFleetTagline(FleetSide.ENEMY, "Another one liner, for the enemy fleet");
		
		// These show up as items in the bulleted list under 
		// "Tactical Objectives" on the mission detail screen
		api.addBriefingItem("These are hints to the player");
		api.addBriefingItem("As to how to approach the mission");
		api.addBriefingItem("Don't add more than 4 - they won't fit on the mission detail screen");
		
		// Set up the player's fleet
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_pilum_dreadnought_Standard", FleetMemberType.SHIP, "ISS Black Star", true);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_aluben_the_destroyer_godlike", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_atlas_as_fuck_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_buffalo_EVIL_variant", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_daehremmah_Elite", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_dnund_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_elttuhs_standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_gust_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_hammerhead_curved_Elite", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_hivecon_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_houoh_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_HyperHyperion_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_long_apogee_Balanced", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_onslaught_lgbt_Elite", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_paragon_lowtech_phase_Blaster", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_paragon_pather_Raider", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_phase_lobster_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_renilRATS_ratty", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_tpchound_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_long_atlas_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_long_drover_Strike", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_midline_odyssey_Balanced", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_bananahammer_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_Drovest_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_pilum_capital_Artillery", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_pilum_cruiser_Artillery", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_pilum_destroyer_Artillery", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_pilum_frigate_Artillery", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_atlas_tanker_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_atlas_crew_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_bettergon_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_destlobster_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_super_tempest_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_hegdehog_PD", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.PLAYER, "aBadIdea2_hownd_Standard", FleetMemberType.SHIP, false);
		
		// Set up the enemy fleet
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_aluben_the_destroyer_godlike", FleetMemberType.SHIP, "ISS Black Star", true);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_atlas_as_fuck_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_buffalo_EVIL_variant", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_daehremmah_Elite", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_dnund_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_elttuhs_standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_gust_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_hammerhead_curved_Elite", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_hivecon_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_houoh_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_HyperHyperion_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_long_apogee_Balanced", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_onslaught_lgbt_Elite", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_paragon_lowtech_phase_Blaster", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_paragon_pather_Raider", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_phase_lobster_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_renilRATS_ratty", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_tpchound_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_long_atlas_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_long_drover_Strike", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_midline_odyssey_Balanced", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_bananahammer_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_Drovest_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_pilum_capital_Artillery", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_pilum_cruiser_Artillery", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_pilum_destroyer_Artillery", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_pilum_frigate_Artillery", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_atlas_tanker_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_atlas_crew_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_bettergon_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_destlobster_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_super_tempest_Standard", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_hegdehog_PD", FleetMemberType.SHIP, false);
		api.addToFleet(FleetSide.ENEMY, "aBadIdea2_hownd_Standard", FleetMemberType.SHIP, false);
		
		
		// Set up the map.
		float width = 20000f;
		float height = 12000f;
		api.initMap((float)-width/2f, (float)width/2f, (float)-height/2f, (float)height/2f);
		
		float minX = -width/2;
		float minY = -height/2;
		
		// All the addXXX methods take a pair of coordinates followed by data for
		// whatever object is being added.
		
		// Add two big nebula clouds
		api.addNebula(minX + width * 0.66f, minY + height * 0.5f, 2000);
		api.addNebula(minX + width * 0.25f, minY + height * 0.6f, 1000);
		api.addNebula(minX + width * 0.25f, minY + height * 0.4f, 1000);
		
		// And a few random ones to spice up the playing field.
		// A similar approach can be used to randomize everything
		// else, including fleet composition.
		for (int i = 0; i < 5; i++) {
			float x = (float) Math.random() * width - width/2;
			float y = (float) Math.random() * height - height/2;
			float radius = 100f + (float) Math.random() * 400f; 
			api.addNebula(x, y, radius);
		}
		
		// Add objectives. These can be captured by each side
		// and provide stat bonuses and extra command points to
		// bring in reinforcements.
		// Reinforcements only matter for large fleets - in this
		// case, assuming a 100 command point battle size,
		// both fleets will be able to deploy fully right away.
		api.addObjective(minX + width * 0.25f, minY + height * 0.5f, 
						 "sensor_array", BattleObjectiveAPI.Importance.NORMAL);
		api.addObjective(minX + width * 0.75f, minY + height * 0.5f,
						 "comm_relay", BattleObjectiveAPI.Importance.NORMAL);
		api.addObjective(minX + width * 0.33f, minY + height * 0.25f, 
						 "nav_buoy", BattleObjectiveAPI.Importance.NORMAL);
		api.addObjective(minX + width * 0.66f, minY + height * 0.75f, 
						 "nav_buoy", BattleObjectiveAPI.Importance.NORMAL);
		

		api.addAsteroidField(-(minY + height), minY + height, -45, 2000f,
								20f, 70f, 100);

		api.addPlanet(minX + width * 0.8f, minY + height * 0.8f, 300f, "jungle", 300f);
	}

}






