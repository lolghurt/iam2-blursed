package data.utils.aBadIdea2;

import com.fs.starfarer.api.Global;

public class aBadIdea2Util {
    private static final String aBadIdea2_SHIP_SYSTEM = "shipSystem";
    private static final String aBadIdea2_STAR_SYSTEMS = "starSystems";
    private static final String aBadIdea2_HULL_MOD = "hullMod";

    public static String getString(String category, String id) {
        return Global.getSettings().getString(category, id);
    }

    public static String getShipSystemString(String id) {
        return getString(aBadIdea2_SHIP_SYSTEM, id);
    }

    public static String getStarSystemsString(String id) {
        return getString(aBadIdea2_STAR_SYSTEMS, id);
    }

    public static String getHullModString(String id) {
        return getString(aBadIdea2_HULL_MOD, id);
    }
}
