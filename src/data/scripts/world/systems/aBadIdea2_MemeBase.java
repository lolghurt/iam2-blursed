package data.scripts.world.systems;

import com.fs.starfarer.api.campaign.*;
import com.fs.starfarer.api.campaign.econ.MarketAPI;
import com.fs.starfarer.api.impl.campaign.econ.impl.HeavyIndustry;
import com.fs.starfarer.api.impl.campaign.ids.*;
import com.fs.starfarer.api.impl.campaign.procgen.NebulaEditor;
//import com.fs.starfarer.api.impl.campaign.procgen.StarSystemGenerator;
//import com.fs.starfarer.api.impl.campaign.procgen.themes.SalvageSpecialAssigner;
import com.fs.starfarer.api.impl.campaign.procgen.StarAge;
import com.fs.starfarer.api.impl.campaign.terrain.HyperspaceTerrainPlugin;
import com.fs.starfarer.api.impl.campaign.terrain.EventHorizonPlugin;
import com.fs.starfarer.api.util.Misc;
import data.utils.aBadIdea2.aBadIdea2Util;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

//import static com.fs.starfarer.api.impl.campaign.terrain.DebrisFieldTerrainPlugin.DebrisFieldParams;
//import static com.fs.starfarer.api.impl.campaign.terrain.DebrisFieldTerrainPlugin.DebrisFieldSource;
import static data.scripts.world.aBadIdea2_WorldGen.addMarketplace;

public class aBadIdea2_MemeBase {
    public void generate(SectorAPI sector) {
        //create a star system
        StarSystemAPI system = sector.createStarSystem("Ischys");
        //set its location
        system.getLocation().set(20000f, -14200f);
        //set background image
        system.setBackgroundTextureFilename("graphics/backgrounds/background5.jpg");

        //the star
        PlanetAPI pg_Star = system.initStar("aBadIdea2_Ischys", StarTypes.BLACK_HOLE, 500f, 600f, -10f, 1f, 5f);
        //background light color
        system.setLightColor(new Color(228, 180, 255));

        //attempt to make an event horizon
        SectorEntityToken ischysEventHorizon = system.addTerrain(Terrain.EVENT_HORIZON, new EventHorizonPlugin.CoronaParams(1000f, 500f, pg_Star, -20f, 1f, 5f));
        ischysEventHorizon.setCircularOrbit(pg_Star, 0, 0, 365);

        //make asteroid belt surround it
        system.addAsteroidBelt(pg_Star, 200, 2200f, 500f, 180, 360, Terrain.ASTEROID_BELT, "");


        //a new planet for people
        PlanetAPI fat_dab = system.addPlanet("aBadIdea2_planet_fat_dab", pg_Star, aBadIdea2Util.getStarSystemsString("planet_name_fat_dab"), "jungle", 215, 250f, 7000f, 135f);

        //a new market for planet
        MarketAPI fat_dabMarket = addMarketplace("aBadIdea2_philpocalypse", fat_dab, null
                , fat_dab.getName(), 7,
                new ArrayList<>(
                        Arrays.asList(
                                Conditions.POPULATION_7,
                                Conditions.JUNGLE,
                                Conditions.DARK,
                                Conditions.FARMLAND_BOUNTIFUL,
                                Conditions.ORGANICS_ABUNDANT,
                                Conditions.RUINS_VAST,
                                Conditions.HIGH_GRAVITY
                        )),
                new ArrayList<>(
                        Arrays.asList(
                                Submarkets.GENERIC_MILITARY,
                                Submarkets.SUBMARKET_BLACK,
                                Submarkets.SUBMARKET_OPEN,
                                Submarkets.SUBMARKET_STORAGE
                        )),
                new ArrayList<>(
                        Arrays.asList(
                                Industries.POPULATION,
                                Industries.MEGAPORT,
                                Industries.STARFORTRESS,
                                Industries.FARMING,
                                Industries.PATROLHQ,
                                Industries.ORBITALWORKS,
                                Industries.WAYSTATION,
                                Industries.TECHMINING,
                                Industries.HEAVYBATTERIES,
                                Industries.MINING
                        )),
                0.3f,
                true,
                true);
        //make a custom description which is specified in descriptions.csv
        fat_dab.setCustomDescriptionId("aBadIdea2_planet_fat_dab");
        //give the orbital works a gamma core
        fat_dabMarket.getIndustry(Industries.ORBITALWORKS).setAICoreId(Commodities.BETA_CORE);
        //and give it a nanoforge
        ((HeavyIndustry) fat_dabMarket.getIndustry(Industries.ORBITALWORKS)).setNanoforge(new SpecialItemData(Items.CORRUPTED_NANOFORGE, null));

        PlanetAPI aBadIdea2_planet_shrinkage = system.addPlanet("aBadIdea2_planet_shrinkage", pg_Star, aBadIdea2Util.getStarSystemsString("planet_name_shrinkage"), "cryovolcanic", 90, 90, 3500f, 30);

        MarketAPI aBadIdea2_planet_shrinkageMarket = addMarketplace("aBadIdea2_philpocalypse", aBadIdea2_planet_shrinkage, null
                , aBadIdea2_planet_shrinkage.getName(), 5,
                new ArrayList<>(
                        Arrays.asList(
                                Conditions.POPULATION_5,
                                Conditions.ORE_RICH,
                                Conditions.RARE_ORE_ABUNDANT,
                                Conditions.DARK,
                                Conditions.EXTREME_TECTONIC_ACTIVITY,
                                Conditions.VERY_COLD,
                                Conditions.LOW_GRAVITY
                        )),
                new ArrayList<>(
                        Arrays.asList(
                                Submarkets.SUBMARKET_BLACK,
                                Submarkets.SUBMARKET_OPEN,
                                Submarkets.SUBMARKET_STORAGE
                        )),
                new ArrayList<>(
                        Arrays.asList(
                                Industries.POPULATION,
                                Industries.SPACEPORT,
                                Industries.BATTLESTATION,
                                Industries.HIGHCOMMAND,
                                Industries.MINING,
                                Industries.LIGHTINDUSTRY
                        )),
                0.3f,
                false,
                true);
        aBadIdea2_planet_shrinkage.setCustomDescriptionId("aBadIdea2_planet_shrinkage");
        aBadIdea2_planet_shrinkageMarket.getIndustry(Industries.HIGHCOMMAND).setAICoreId(Commodities.BETA_CORE);


        PlanetAPI meatball = system.addPlanet("aBadIdea2_meatball", pg_Star, "Spicy Meatball", "lava", 110, 90, 1250f, 15f);
        Misc.initConditionMarket(meatball);
        meatball.getMarket().addCondition(Conditions.EXTREME_WEATHER);
        meatball.getMarket().addCondition(Conditions.POOR_LIGHT);
        meatball.getMarket().addCondition(Conditions.EXTREME_TECTONIC_ACTIVITY);
        meatball.getMarket().addCondition(Conditions.VERY_HOT);
        meatball.getMarket().addCondition(Conditions.RARE_ORE_ULTRARICH);
        meatball.getMarket().addCondition(Conditions.ORE_ULTRARICH);
        meatball.getMarket().addCondition(Conditions.RUINS_VAST);
        meatball.setCustomDescriptionId("aBadIdea2_planet_meatball");


        PlanetAPI fartcloud = system.addPlanet("aBadIdea2_fartcloud", pg_Star, "Garlic", "gas_giant", 110, 350, 12000f, 15f);
        Misc.initConditionMarket(fartcloud);
        fartcloud.getMarket().addCondition(Conditions.EXTREME_WEATHER);
        fartcloud.getMarket().addCondition(Conditions.HIGH_GRAVITY);
        fartcloud.getMarket().addCondition(Conditions.VERY_COLD);
        fartcloud.getMarket().addCondition(Conditions.VOLATILES_ABUNDANT);
        fartcloud.getMarket().addCondition(Conditions.ORGANICS_ABUNDANT);
        fartcloud.getMarket().addCondition(Conditions.DARK);
        fartcloud.getMarket().addCondition(Conditions.IRRADIATED);
        fartcloud.getMarket().addCondition(Conditions.DENSE_ATMOSPHERE);
        fartcloud.getMarket().addCondition(Conditions.TOXIC_ATMOSPHERE);
        fartcloud.setCustomDescriptionId("aBadIdea2_planet_fartcloud");

        // generates hyperspace destinations for in-system jump points
        system.autogenerateHyperspaceJumpPoints(true, true);

        //custom entities
        SectorEntityToken aBadIdea2_relay = system.addCustomEntity("aBadIdea2_Ischys_relay", "Ischyss Buoy", "nav_buoy", "aBadIdea2_philpocalypse");
        aBadIdea2_relay.setCircularOrbit(pg_Star, 90f, 6000f, 20f);
        SectorEntityToken aBadIdea2_buoy = system.addCustomEntity("aBadIdea2_Ischys_relay", "Ischys Array", "sensor_array", "aBadIdea2_philpocalypse");
        aBadIdea2_buoy.setCircularOrbit(pg_Star, 180f, 5750f, 15f);
        SectorEntityToken aBadIdea2_array = system.addCustomEntity("aBadIdea2_Ischys_relay", "Ischys Relay", "comm_relay", "aBadIdea2_philpocalypse");
        aBadIdea2_array.setCircularOrbit(pg_Star, 270f, 5500f, 10f);

        //nebula
        SectorEntityToken aBadIdea2_Nebula = Misc.addNebulaFromPNG("data/campaign/terrain/nebula_test.png", 0, 0, system, "terrain", "nebula_amber", 4, 4, StarAge.AVERAGE);
/*
        // Debris
        DebrisFieldParams params = new DebrisFieldParams(
                150f, // field radius - should not go above 1000 for performance reasons
                1f, // density, visual - affects number of debris pieces
                10000000f, // duration in days
                0f); // days the field will keep generating glowing pieces
        params.source = DebrisFieldSource.MIXED;
        params.baseSalvageXP = 500; // base XP for scavenging in field
        SectorEntityToken debris = Misc.addDebrisField(system, params, StarSystemGenerator.random);
        SalvageSpecialAssigner.assignSpecialForDebrisField(debris);

        // makes the debris field always visible on map/sensors and not give any xp or notification on being discovered
        debris.setSensorProfile(null);
        debris.setDiscoverable(null);

        // makes it discoverable and give 200 xp on being found
        // sets the range at which it can be detected (as a sensor contact) to 2000 units
        // commented out.
        debris.setDiscoverable(true);
        debris.setDiscoveryXP(200f);
        debris.setSensorProfile(1f);
        debris.getDetectedRangeMod().modifyFlat("gen", 2000);

        debris.setCircularOrbit(pg_Star, 45 + 10, 1600, 250);*/
        //Finally cleans up hyperspace
        cleanup(system);

    }

    //Learning from Tart scripts
    //Clean nearby Nebula
    private void cleanup(StarSystemAPI system) {
        HyperspaceTerrainPlugin plugin = (HyperspaceTerrainPlugin) Misc.getHyperspaceTerrain().getPlugin();
        NebulaEditor editor = new NebulaEditor(plugin);
        float minRadius = plugin.getTileSize() * 2f;

        float radius = system.getMaxRadiusInHyperspace();
        editor.clearArc(system.getLocation().x, system.getLocation().y, 0, radius + minRadius * 0.5f, 0, 360f);
        editor.clearArc(system.getLocation().x, system.getLocation().y, 0, radius + minRadius, 0, 360f, 0.25f);
    }
}
