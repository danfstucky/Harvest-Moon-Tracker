package com.danfstuckygmail.harvestmoontracker.upgrades;


/**
 * Created by Dan on 12/17/2016.
 */

public class BarnData {
    private final String type = UpgradeGroups.BARN.getName();
    private Upgrade[] barn_upgrades;

    public BarnData() {
        this.barn_upgrades = initializeData();
    }

    public Upgrade[] getBarnUpgrades() {
        return barn_upgrades;
    }

    public Upgrade[] initializeData() {
        // Level 1 Barn
        Upgrade level_1 = new Upgrade(type);
        level_1.setInfo("At the start of the game your barn can hold up to 3 livestock animals.");
        level_1.setLevel("Level 1");
        level_1.addSupply("Cost", "None");
        level_1.addSupply("Lumber", "None");
        level_1.addSupply("Stone", "None");

        // Level 2 Barn
        Upgrade level_2 = new Upgrade(type);
        level_2.setInfo("The medium barn can hold 5 livestock animals. All barn sizes can only have 3 different animal species at a time.");
        level_2.setLevel("Level 2");
        level_2.addSupply("Cost", "30,000 G");
        level_2.addSupply("Lumber", "40");
        level_2.addSupply("Stone", "50");

        // Level 3 Barn
        Upgrade level_3 = new Upgrade(type);
        level_3.setInfo("The large barn can hold 8 livestock animals. All barn sizes can only have 3 different animal species at a time.");
        level_3.setLevel("Level 3");
        level_3.addSupply("Cost", "60,000 G");
        level_3.addSupply("Lumber", "100");
        level_3.addSupply("Stone", "50");

        // Create and return array of barn upgrades
        return new Upgrade[] { level_1, level_2, level_3 };
    }
}
