package data.scripts;

import com.fs.starfarer.api.BaseModPlugin;
import com.fs.starfarer.api.Global;
import data.scripts.world.aBadIdea2_WorldGen;
import exerelin.campaign.SectorManager;

import static com.fs.starfarer.api.Global.getSettings;

public class aBadIdea2_ModPlugin extends BaseModPlugin {
    @Override
    public void onNewGame() {
        boolean sanity1 = getSettings().getModManager().isModEnabled("new_galactic_order");
        boolean sanity2 = getSettings().getModManager().isModEnabled("aria");
        //Nex compatibility setting, if there is no nex or corvus mode(Nex), just generate the system
        boolean haveNexerelin = Global.getSettings().getModManager().isModEnabled("nexerelin");
        if (!haveNexerelin || SectorManager.getCorvusMode()) {
            if(!sanity1 && !sanity2) {
                new aBadIdea2_WorldGen().generate(Global.getSector());
            }
        }
    }
}
