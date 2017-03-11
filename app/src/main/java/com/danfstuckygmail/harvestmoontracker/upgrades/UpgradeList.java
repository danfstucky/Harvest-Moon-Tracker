package com.danfstuckygmail.harvestmoontracker.upgrades;

/**
 * Created by Dan on 12/17/2016.
 */

public class UpgradeList {
    private static UpgradeList singleton;
    private Upgrade[] house_upgrades;
    private Upgrade[] barn_upgrades;
    private Upgrade[] coop_upgrades;

    private UpgradeList() {
        this.house_upgrades = new HouseData().getHouseUpgrades();
        this.barn_upgrades = new BarnData().getBarnUpgrades();
        this.coop_upgrades = new CoopData().getCoopUpgrades();
    }

    public static UpgradeList instance() {
        if (singleton == null) {
            singleton = new UpgradeList();
        }
        return singleton;
    }

    public Upgrade[] getHouseUpgrades() {
        return house_upgrades;
    }

    public Upgrade[] getBarnUpgrades() {
        return barn_upgrades;
    }

    public Upgrade[] getCoopUpgrades() {
        return coop_upgrades;
    }

    public Upgrade findUpgrade(String type, String level) {
        switch(type) {
            case "House Upgrades":
                return getUpgrade(house_upgrades, level);
            case "Barn Upgrades":
                return getUpgrade(barn_upgrades, level);
            default:
                return getUpgrade(coop_upgrades, level);
        }
    }

    private Upgrade getUpgrade(Upgrade[] list, String level) {
        for (Upgrade upgrade : list) {
            if (upgrade.getLevel().equals(level)) {
                return upgrade;
            }
        }
        return list[0];
    }
}
