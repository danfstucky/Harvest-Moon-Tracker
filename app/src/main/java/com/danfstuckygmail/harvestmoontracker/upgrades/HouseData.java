package com.danfstuckygmail.harvestmoontracker.upgrades;


/**
 * Created by Dan on 12/17/2016.
 */

public class HouseData {
    private final String type = UpgradeGroups.HOUSE.getName();
    private Upgrade[] house_upgrades;

    public HouseData() {
        this.house_upgrades = initializeData();
    }

    public Upgrade[] getHouseUpgrades() {
        return house_upgrades;
    }

    public Upgrade[] initializeData() {
        // Level 1 House
        Upgrade level_1 = new Upgrade(type);
        level_1.setInfo("This is the house that you'll start out with. You have one single bed in the corner and a kitchen in the other corner. " +
                "The kitchen is so small that you can only put 3 cooking utensils out at one time. The table in the middle of your house can never " +
                " be relocated, as neither can the kitchen, bed, or nightstand. You can have only 1 wild animal pet.");
        level_1.setLevel("Level 1");
        level_1.addSupply("Cost", "None");
        level_1.addSupply("Lumber", "None");
        level_1.addSupply("Stone", "None");

        // Level 2 House
        Upgrade level_2 = new Upgrade(type);
        level_2.setInfo("The next house size is required for marriage. Your bed will be converted into the double bed necessary for your spouse. " +
                "The kitchen becomes 1 square larger, allowing you to put out 4 cooking utensils. You can also have up to 2 wild animal pets.\n" +
                "\nThe total size of the house is now 9 squares by 17 squares.");
        level_2.setLevel("Level 2");
        level_2.addSupply("Cost", "25,000 G");
        level_2.addSupply("Lumber", "100");
        level_2.addSupply("Stone", "100");

        // Level 3 House
        Upgrade level_3 = new Upgrade(type);
        level_3.setInfo("Now your house is large enough for children to be living in. Your kitchen has been greatly expanded, and you can place " +
                "up to 7 cooking utensils in it. The main room of the house is still only 9x17, but you now have an extra room off to the side.\n\n" +
                "The side room can be accessed by opening a door in the lower-right corner of your main room. The size of the room is a little " +
                "small, but there's plenty of room to store your extra furniture if you wanted to place it out. If you have children then " +
                "Hamilton will put a kids bed in the spare room.");
        level_3.setLevel("Level 3");
        level_3.addSupply("Cost", "50,000 G");
        level_3.addSupply("Lumber", "300");
        level_3.addSupply("Stone", "300");

        // Level 4 House
        Upgrade level_4 = new Upgrade(type);
        level_4.setInfo("The last house upgrade adds a second floor. You will need to have a level 4 house if you want to have the Bear and/or Panda " +
                "wild animal pets. The main room of your house is the same size as the level 3 house, but the second bedroom will have a staircase added " +
                "to it.\n\nThe second floor of your house is where the Bear and Panda will live. No other person will sleep on the second floor " +
                "(both kids share the extra bedroom) so you can decorate it any way you want to.");
        level_4.setLevel("Level 4");
        level_4.addSupply("Cost", "150,000 G");
        level_4.addSupply("Lumber", "600");
        level_4.addSupply("Stone", "600");

        // Create and return array of house upgrades
        return new Upgrade[] { level_1, level_2, level_3, level_4 };
    }
}
