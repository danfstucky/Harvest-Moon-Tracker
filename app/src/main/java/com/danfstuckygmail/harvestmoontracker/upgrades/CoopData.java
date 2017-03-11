package com.danfstuckygmail.harvestmoontracker.upgrades;

/**
 * Created by Dan on 3/11/2017.
 */

public class CoopData {
    private final String type = UpgradeGroups.COOP.getName();
    private Upgrade[] coop_upgrades;

    public CoopData() {
        this.coop_upgrades = initializeData();
    }

    public Upgrade[] getCoopUpgrades() {
        return coop_upgrades;
    }

    public Upgrade[] initializeData() {
        // Level 1 Coop
        Upgrade level_1 = new Upgrade(type);
        level_1.setInfo("At the start, your contains 4 beds for chickens and ducks.");
        level_1.setLevel("Level 1");
        level_1.addSupply("Cost", "None");
        level_1.addSupply("Lumber", "None");
        level_1.addSupply("Stone", "None");

        // Level 2 Coop
        Upgrade level_2 = new Upgrade(type);
        level_2.setInfo("The medium coop has 8 beds for chickens and ducks.");
        level_2.setLevel("Level 2");
        level_2.addSupply("Cost", "Unknown");
        level_2.addSupply("Lumber", "Unknown");
        level_2.addSupply("Stone", "Unknown");

        // Level 3 Coop
        Upgrade level_3 = new Upgrade(type);
        level_3.setInfo("The large coop adds 4 beds for silkworms in addition to the 8 poultry beds.");
        level_3.setLevel("Level 3");
        level_3.addSupply("Cost", "45,000 G");
        level_3.addSupply("Lumber", "50");
        level_3.addSupply("Stone", "50");

        // Create and return array of coop upgrades
        return new Upgrade[] { level_1, level_2, level_3 };
    }
}
