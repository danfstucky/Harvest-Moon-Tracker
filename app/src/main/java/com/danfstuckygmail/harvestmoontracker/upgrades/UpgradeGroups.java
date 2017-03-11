package com.danfstuckygmail.harvestmoontracker.upgrades;

/**
 * Created by Dan on 12/17/2016.
 */

public enum UpgradeGroups {
    HOUSE("House Upgrades"), BARN("Barn Upgrades"), COOP("Coop Upgrades");

    private String name;
    UpgradeGroups(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
