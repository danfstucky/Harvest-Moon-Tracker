package com.danfstuckygmail.harvestmoontracker.characters;

/**
 * Created by Dan on 6/17/2016.
 */
public class BachelorData {
    private String type = PeopleEnum.PeopleCategories.BACHELORS.getName();
    private Person[] bachelors;

    public BachelorData() {
        this.bachelors = initializeData();
    }

    public Person[] getBachelors() {
        return bachelors;
    }

    public Person[] initializeData() {
        // Calvin
        Person calvin = new Person(type, "Calvin");
        calvin.setBirthday("Winter 14");
        calvin.setInfo("Calvin the archaeologist can be unlocked as you are working your way to unlock the Yellow Bell. Once unlocked and the Yellow Bell has been chimed, " +
                "he lives at the Oricana Inn. In the mornings you may see him outside the inn playing his guitar, and in the afternoons he goes to the 5th floor of the Garmon Upper Mine." +
               " When you first meet Calvin he will give you an Ancient Tablet that refers to the story of the 5 bells. Rumor has it that if you sell/destroy the tablet, " +
                "Calvin will not accept your marriage proposal.");
        calvin.setBestGifts(new String[]{ "Spinel", "Diamond accessories", "Goddess Pendant", "Goddess Brooch", "Hot Coffee", "Blackberry Cocktail", "Raspberry Cocktail",
        "Apple Cocktail", "Blueberry Cocktail", "Cranberry Cocktail", "Remedy", "Curry Bread", "Curry Buckwheat Noodles" });
        calvin.setGoodGifts(new String[]{ "Pinkcat Flower", "Lavender", "Green Bell Flower", "Shining Tea Leaves", "Shining Cherry", "Shining Mayonnaise", "Shining Egg", "Shining Duck Egg",
                "Royal Jelly", "Rare Ore", "Crystal", "Amber", "Sea Urchin", "Mussel", "Clam", "Boiled Egg", "Coconut Cocktail", "Bodigizer XL" });
        calvin.setBadGifts(new String[]{ "Chocolate Banana", "failed recipes", "Pumpkin Pudding", "Chocolate Pudding", "Banana Pudding", "Pudding" });
        calvin.setRival("Phoebe");
        calvin.setHeartGifts(new String[]{ "Gift: Topaz", "Gift: Diamond", "Date: Brass Bar, 4pm"});

        // Chase
        Person chase = new Person(type, "Chase");
        chase.setBirthday("Spring 23");
        chase.setInfo("Chase lives in the house next to Marimba Farm in Flute Fields. During the day he spends his time at home, but at night he goes to work at Hayden's Brass Bar. " +
                "He will not work at the bar until you have restored the power of fire, for cooking and smithing, by chiming the Red Bell.");
        chase.setBestGifts(new String[]{ "Shining Wheat", "Shining Wheat Flour", "Shining Olive Oil", "Shining Goat Milk", "Shining Goat Cheese", "Shining Goat Butter",
        "Shining Duck Egg", "Shining Egg", "Orange Juice", "Orange Pie", "Orange Cake", "Marmalade", "Orange Ice Cream" });
        chase.setGoodGifts(new String[]{ "Pinkcat Flower", "Pansey", "Shining Salt", "Shining Cherry", "Shining Turnip", "Shining Cucumber", "Shining Tea Leaves", "Shining Potato",
        "Shining Mayonnaise", "Perfect Olive Oil", "Green Tea", "Herb Tea", "Perfect Egg", "Sea Urchin", "Clam", "Mussel", "Oyster", "Cookies", "Strawberry Milk" });
        chase.setBadGifts(new String[]{ "failed recipes", "Pontata Root", "Toadstool", "junk (boots, cans, etc.)", "Common Mushroom" });
        chase.setRival("Maya");
        chase.setHeartGifts(new String[]{ "Gift: Good Salt", "Gift: Orange Cake", "Date: Flue Fields, 4pm" });

        // Gill
        Person gill = new Person(type, "Gill");
        gill.setBirthday("Winter 2");
        gill.setInfo("This saucy-looking fellow is the son of Mayor Hamilton. He left Castanet to try and find a way to solve the island's problem. Gill will return to the island " +
                "after you have chimed the Blue Bell, but you can't actually meet with him until after you have completed the Green Bell. He lives at the mayor's house and spends " +
                "most of his time there.");
        gill.setBestGifts(new String[]{ "Gold", "Royal Jelly", "Gold accessories", "Saphire accessories", "Emerald accessories", "Tomato Risotto", "Tomato Omelet", "Tomato Juice",
                "Ratotullie", "Honeydew Ice Cream", "Napolitan Spaghetti", "Tomato and Sardine Stew", "Tomato and Squid Stew", "Tomato and Saury Stew" });
        gill.setGoodGifts(new String[] { "Pinkcat Flower", "Hyacinth", "Pansey", "Lavender", "Tulip", "Morning Glory", "Sunflower", "Green Bell Flower", "Hibiscus", "Anemone",
                "Snowflake Flower", "Cold Medicine", "Bodigizer", "Coconut", "Shining Mayonnaise", "Shining Honey", "Shining Salt", "Lavender", "Blue Herb", "Black Pearl", "Rare Metal",
                "Shining Milk", "Remedy" });
        gill.setBadGifts(new String[]{ "failed recipes", "Green Pepper", "junk (boots, cans, etc." });
        gill.setRival("Luna");

        // Harvest King
        Person harvest_king = new Person(type, "Harvest King");
        harvest_king.setBirthday("Unknown");
        harvest_king.setInfo("The goal of the game is to chime the 5 bells in order to summon the mighty Harvest King. Once you have completed the main storyline of the game you can choose to marry the King.\n" +
                "The Harvest King is not easy, as he lives on the 45th level of the Garmon Upper Mine. Even if you do choose to marry him, the King is very busy and will not live with you at the farm.\n" +
                "After you finish the main storyline and visit the King, he will unlock a shortcut to his throne at the base of the mountain in Garmon Mine District. Touching the " +
                "glowing words by the entrance to the mines will teleport you all the way to the top of the Garmon Upper Mine.");
        harvest_king.setBestGifts(new String[]{ "Shining Apple", "Shining Grape", "Apple Cocktail", "Grape Cocktail", "Ruby accessories" });
        harvest_king.setGoodGifts(new String[]{ "Shining Milk", "Shining Egg", "Shining Mayonnaise", "Shining Cherry", "Shining Honey", "Anemone", "Olive Cocktail" });
        harvest_king.setBadGifts(new String[]{ "junk (boots, cans, etc.", "failed recipes", "Junk Ore" });
        harvest_king.setRival("None");

        // Jin
        Person jin = new Person(type, "Jin");
        jin.setBirthday("Winter 26");
        jin.setInfo("The town doctor works at Harp Clinic with his assistant Irene. He is not on Castanet until after you ring the Blue Bell and restore the boat service to the land. " +
                "Jin spends most of his time in the clinic.\n" +
                "Jin is easy to befriend. At the clinic you can buy Remedy for 180 G, and it is one of the best gifts to give him. You just have to buy the potion from Irene and " +
                "then walk to the other room to give it to the doctor.");
        jin.setBestGifts(new String[]{ "Shining Honey", "Shining Tea Leaves", "Shining Buckwheat Flour", "Pontata Root", "Royal Jelly", "Cold Medicine", "Bodigizer XL",
                "Remedy", "Green Tea", "Herb Tea", "Herb Bread", "Herb Cookies", "Pickled Vegetables", "Vegetable Juice", "Mint Ice Cream" });
        jin.setGoodGifts(new String[]{ "Hyacinth", "Lavender", "Fugue Mushroom", "Blue Herb", "Oyster", "Perfect Honey", "Perfect Tea Leaves", "Strawberry Milk" });
        jin.setBadGifts(new String[]{ "Raspberry Cocktail", "Coconut Cocktail", "failed recipes", "junk (cans, boots, algea, etc.)" });
        jin.setRival("Anissa");

        // Julius
        Person julius = new Person(type, "Julius");
        julius.setBirthday("Fall 21");
        julius.setInfo("This high-fashion man works at Koto Accessories with Mira. You don't have to do anything special to unlock him, but he will mention how Mira isn't around to " +
        "do any appraisals. You need to go down to Clesta Church and convince Mira to return to working at the shop.");
        julius.setBestGifts(new String[]{ "Shining Pumpkin", "Shining Strawberry", "Rose", "Ruby", "Ruby accessories", "Diamond", "Diamond accessories", "Sapphire",
                "Sapphire accessories", "Amethyst accessories", "Purple Perfume", "Pumpkin Stew", "Pumpkin Cake", "Pumpkin Pie", "Shining Perfume" });
        julius.setGoodGifts(new String[]{ "Perfect Milk", "Shining Tea Leaves", "Perfect Strawberry", "Shining Cherry", "Shining Tomato", "Herb Tea", "Pinkcat Flower", "Hyacinth",
                "Pansey", "Lavender", "Tulip", "Begonia", "Hibiscus", "Sunflower", "Morning Glory", "Green Bell Flower", "Anemone", "Snowflake Flower", "Raspberry Cocktail",
                "Cranberry Cocktail", "Remedy", "Royal Jelly", "Sakura Seashell", "Mussel", "Pearl", "Black Pearl", "Peridot", "Amber", "Topaz", "Crystal", "Opal", "Shining Honey",
                "Cookies", "Perfect Flax Yarn", "Bodigizer XL", "Coconut", "Banana", "Pineapple", "Strawberry Milk" });
        julius.setBadGifts(new String[]{ "Butter", "Junk Ore", "Iron Ore", "Iron", "Copper Ore", "Copper", "Eel", "junk (boots, etc.", "Glass", "failed recipes" });
        julius.setRival("Candace");

        // Luke
        Person luke = new Person(type, "Luke");
        luke.setBirthday("Summer 8");
        luke.setInfo("Luke works at Cornet Carpentry in Garmon Mine District. The first time you meet him will be in the Fugue Forest. In the mornings he will be inside Dale's shop and in the later " +
                "afternoon hours he'll be outside swinging his axe in the air.");
        luke.setBestGifts(new String[]{ "Banana", "Shining Mayonnaise", "Ruby accessories", "Chocolate Banana", "Banana Pudding", "Banana Ice Cream", "Spinach Cake",
                "Spinach Risotto", "Coconut Cocktail", "Seafood Curry", "Vegetable Curry", "Curry Buckwheat Noodles", "Curry Bread", "Chirashi Sushi" });
        luke.setGoodGifts(new String[]{ "Tulip", "Perfect Mayonnaise", "Silver", "Gold", "Rare Metal", "Shining Honey", "Pineapple", "Coconut", "Mussel", "Vegetable Stirfry",
                "Shining Honey", "Shining Spicy Pepper" });
        luke.setBadGifts(new String[]{ "junk", "failed recipes", "Yogurt", "Yogurt Drink", "Junk Ore", "Remedy" });
        luke.setRival("Selena");

        // Owen
        Person owen = new Person(type, "Owen");
        owen.setBirthday("Summer 18");
        owen.setInfo("To meet Owen for the first time, you need to go to the 10th floor of the Garmon Lower Mine, where he'll give you a free Old Hammer. Owen works at " +
                "Ramsey's Cymbol Blacksmith shop. He acts like a big brother to his cousin Chloe. Owen is quite muscular and can be found lifting dumbells in his bedroom " +
                "when he's not working at the shop.");
        owen.setBestGifts(new String[]{ "Shining Rice", "Copper", "Silver", "Gold", "Rare Metal", "Ruby", "Coconut Cocktail", "Apple Cocktail", "Potato Cocktail", "Grape Cocktail",
                "Rice Cocktail", "Buckwheat Cocktail", "Wheat Cocktail", "Boiled Egg", "Seafood Fried Rice", "Mushroom Soup" });
        owen.setGoodGifts(new String[]{ "Sunflower", "Shining Honey", "Shining Cherry", "Shining Lettuce", "Fugue Mushroom", "Clam", "Oyster", "Mussel", "Sea Urchin", "Royal Jelly",
                "Iron", "Copper Ore", "Gold Ore", "Raspberry Cocktail", "Blackberry Cocktail", "Blueberry Cocktail", "Cranberry Cocktail" });
        owen.setBadGifts(new String[]{ "failed recipes", "junk", "Vegetable Juice", "Junk Ore", "Chocolate Banana", "Raspberry Jam", "Cookies" });
        owen.setRival("Kathy");

        // Toby
        Person toby = new Person(type, "Toby");
        toby.setBirthday("Spring 9");
        toby.setInfo("Toby takes a very casual outlook at life, and spends most of his time fishing around Castanet. He lives at the Harmonica Fishery with Ozzie and Paolo, " +
                "and can be found fishing off the dock in the afternoons.");
        toby.setBestGifts(new String[]{ "Cosmos", "Shining Onion", "Shining Tea Leaves", "Shining Buckwheat", "Skull Jellyfish", "Green Tea", "Shining Sashimi", "Shining Sushi",
                "Grilled Tai", "Grilled Eel", "Grilled Swordfish", "Grilled Rock Lobster", "Butter Steamed Mussel", "Butter Steamed Clam", "Onion Bread", "Tuna Donburi",
                "Shining Bouillabaisse", "Steamed Rice Bowl", "Sardines in Oil" });
        toby.setGoodGifts(new String[]{ "Shining Cherry", "Pansey", "Lavender", "Crysathamum", "Morning Glory", "Green Bell Flower", "Snowflake Flower", "Sea Urchin", "Clam",
                "Oyster", "Mussel", "Royal Jelly", "fish (pretty much any kind)", "Sakura Seashell" });
        toby.setBadGifts(new String[]{ "junk", "Coconut", "Banana", "Pineapple", "failed recipes" });
        toby.setRival("Renee");

        // Wizard
        Person wizard = new Person(type, "Wizard");
        wizard.setBirthday("Unknown");
        wizard.setInfo("The Wizard lives in Harmonica Town, where he researches magic spells and looks into the sky using his telescope. He doesn't say much and prefers to keep to himself. " +
                "Wizard doesn't really leave his house so he's easy to find at all times.\n" +
                "As you start unlocking the Green Bell, you will be able to walk into the Wizard's house. Until you start the Green Bell you will find his house door is locked and " +
                "you can not meet him unless you wait up until 2:00 am. During the Green Bell, Wizard gives you specific item requests that he needs to help the Witch. He will not accept " +
                "any gifts until after you have completed his request.");
        wizard.setBestGifts(new String[]{ "Fugue Mushroom", "Hot Coffee", "Shining Coffee Beans", "Shining Ground Coffee", "Coffee Ice Cream", "Shining Tea Leaves", "Pontata Root",
                "Crystal accessories" });
        wizard.setGoodGifts(new String[]{ "Green Tea", "Herb Tea", "Coffee Milk", "Coffee Candy", "Perfect Coffee Beans", "Strawberry Ice Cream", "Mint Ice Cream", "Tea Ice Cream",
                "Crystal", "Aquamarine", "Sapphire", "Shining Cocoa Fruit", "Shining Milk" });
        wizard.setBadGifts(new String[]{ "junk", "failed recipes", "Octopus", "Salted Octopus", "Squid" });
        wizard.setRival("None");

        // Create and return array of bachelors
        return new Person[] { calvin, chase, gill, harvest_king, jin, julius, luke, owen, toby, wizard };
    }
}
