package com.danfstuckygmail.harvestmoontracker.characters;

/**
 * Created by Dan on 6/17/2016.
 */
public class BacheloretteData {
    private String type = PeopleEnum.PeopleCategories.BACHELORETTES.getName();
    private Person[] bachelorettes;

    public BacheloretteData() {
        this.bachelorettes = initializeData();
    }

    public Person[] getBachelorettes() {
        return bachelorettes;
    }

    public Person[] initializeData() {
        // Anissa
        Person anissa = new Person(type, "Anissa");
        anissa.setBirthday("Fall 16");
        anissa.setInfo("This lovely lady helps her parents Ruth and Craig over at Marimba Farm. She will not be available until after you have chimed the Yellow Bell and restored the " +
                "power of earth to Castanet. After she returns, you can find her inside the farm shop most of the time.");
        anissa.setBestGifts(new String[]{ "Blue Herb", "Pontata Root", "Lavender", "Hibiscus", "Bluemist Flower", "Hyacinth", "Opal", "Herb Tea", "Strawberry Milk", "Pickled Vegetables",
                "Bajirikos Spaghetti", "Cranberry Juice", "Yogurt", "Stamina Drink", "Cold Medicine", "Mint Candy" });
        anissa.setGoodGifts(new String[]{ "Pinkcat Flower", "Pansey", "Tulip", "Sunflower", "Morning Glory", "Snowflake Flower", "Anemone", "Hibiscus", "Snowflake Flower", "Shining Turnip",
                "Shining Tea Leaves", "Shining Cucumber", "salt", "Blueberry", "Raspberry", "Sakura Seashell", "Royal Jelly", "Raspberry Juice", "Coconut Juice", "Blueberry Juice",
                "Blackberry Juice", "Remedy", "Pineapple Juice" });
        anissa.setBadGifts(new String[]{ "Sushi", "junk (cans, boots, etc." });
        anissa.setRival("Jin");

        // Candace
        Person candace = new Person(type, "Candace");
        candace.setBirthday("Winter 7");
        candace.setInfo("All dressed in blue, Candace is a very shy girl who works with her sister Luna and grandma Shelly at Flute Tailor. Most of her time is spent inside the shop. " +
                "On Sundays when she is not working, you can find her in and around the Chelsta Church between 11:00 am and 6:00 pm.");
        candace.setBestGifts(new String[]{ "Snowflake Flower", "Shining Silk", "Shining Flax Thread", "Shining Silk Thread", "Herb Tea", "Green Tea", "Mint Ice Cream", "Mint Candy", "Herb Cookies" });
        candace.setGoodGifts(new String[]{ "Pinkcat Flower", "Hyacinth", "Pansey", "Lavender", "Tulip", "Sunflower", "Morning Glory", "Hibiscus", "Bluemist Flower", "Anemone",
                "Snowflake Flower", "Perfect Strawberry", "Shining Mayonnaise", "Blue Herb", "Black Pearl", "Pearl", "Sakura Seashell" });
        candace.setBadGifts(new String[]{ "Junk Ore", "cocktail drinks" });
        candace.setRival("Julius");

        // Harvest Goddess
        Person harvest_goddess = new Person(type, "Harvest Goddess");
        harvest_goddess.setBirthday("Unknown");
        harvest_goddess.setInfo("The Goddess watches over the divine tree at the Goddess Pond, but now the tree has wilted and she is in need of help to revive it. " +
                "Once you finish the main plot of the game and revive the tree, you can give the Goddess gifts and eventually ask her to marry you.\n" +
                "The Harvest Goddess only has events at 4 hearts and 7 hearts.");
        harvest_goddess.setBestGifts(new String[]{ "Royal Jelly", "Shining Honey" });
        harvest_goddess.setGoodGifts(new String[]{ "Moondrop Flower", "Pinkcat Flower", "Hyacinth", "Pansey", "Lavender", "Tulips", "Sunflower", "Morning Glory", "Hibiscus",
                "Bluemist Flower", "Snowflake Flower", "Perfect Honey", "Shining Apple", "Shining Cherry", "Shining Orange", "Shining Olive", "Shining Grape", "Shining Egg" });
        harvest_goddess.setBadGifts(new String[]{ "Toadstool", "failed dishes" });
        harvest_goddess.setRival("None");

        // Kathy
        Person kathy = new Person(type, "Kathy");
        kathy.setBirthday("Summer 03");
        kathy.setInfo("Kathy helps her father, Hayden, with his Brass Bar in Harmonica Town. She waits tables and brings the customers the drinks they order. Since the bar " +
                "does not open until 4:00 pm, you can usually find her outside the bar's doors or at Flute Tailor if the weather is bad.");
        kathy.setBestGifts(new String[]{ "Shining Coffee Beans", "Shining Carrot", "Shining Cheese", "Cheese Risotto", "Shining Olive Oil", "Cheese Fondue", "Carrot Juice",
                "Grape Cocktail", "Rice Cocktail", "Wheat Cocktail", "Cheese Omelette", "Pizza", "Vegetable Pizza", "Seafood Pizza", "Paella" });
        kathy.setGoodGifts(new String[]{ "other cocktail drinks", "Coconut", "Hibiscus", "Anemone", "Perfect Grape", "Shining Mayonnaise", "Perfect Olive Oil", "Perfect Cheese",
                "Good Cheese", "Perfect Carrot", "Good Carrot", "Sea Urchin", "Mussells", "Shining Perfume", "Coconut Cocktail", "Pineapple Juice", "Perfect Flax Yarn" });
        kathy.setBadGifts(new String[]{ "Toadstool", "Chocolate Banana", "Mushroom dishes", "pudding dishes", "failed recipes" });
        kathy.setRival("Owen");

        // Luna
        Person luna = new Person(type, "Luna");
        luna.setBirthday("Spring 25");
        luna.setInfo("Candace's little sister, Luna, arrive on Castanet with their grandma after you complete the Blue Bell. She is much more outgoing than her sister and " +
                "sometimes she may seem to be a little rude.\n" +
                "Luna has grown quite a bit from Tree of Tranquility and is now the same height as all of the other girls.");
        luna.setBestGifts(new String[]{ "Shining Strawberry", "Shining Cocoa", "Pinkcat Flower", "Shining Flax Yarn", "Diamond", "Pumpkin Pie", "Pumpkin Cake", "Pumpkin Croquette",
                "Pumpkin Pudding", "Boiled Pumpkin", "Yam Cake", "Raspberry Pie", "Apple Pie", "Blueberry Pie", "Blackberry Pie" });
        luna.setGoodGifts(new String[]{ "Hyacinth", "Pansey", "Lavender", "Tulip", "Morning Glory", "Bluemist Flower", "Rose", "Hibiscus", "Snowflake Flower", "Anemone",
                "Snowflake Flower", "Perfect Pumpkin", "Shining Pumpkin", "Shining Wool Yarn", "colored Flax Yarn", "Chocolate", "Sakura Seashell", "Lavender", "Snowflake Flower",
                "Tulip", "Rose", "Perfect Cocoa", "Shining Mayonnaise", "Shining Honey", "Shining Wheat Flour", "Good Flax Yarn", "Shining Milk", "Cookies" });
        luna.setBadGifts(new String[]{ "junk items (cans, boots, etc.", "Fugue Mushroom", "Seafood Curry", "Buckwheat Curry", "Glass" });
        luna.setRival("Gill");

        // Maya
        Person maya = new Person(type, "Maya");
        maya.setBirthday("Fall 24");
        maya.setInfo("Maya helps her parents, Jake and Colleen, run the Orcaria Inn in Harmonica Town. She loves to eat and always is asking if you've been eating enough. Unfortunately Maya " +
                "isn't a very good cook herself, but her grandma Yolanda has been tutoring her in the culinary arts.");
        maya.setBestGifts(new String[]{ "Baked Yam", "Yam Cake", "Yam Cake", "Boiled Yam", "Yam Ice Cream", "Choco Banana", "Shining Honey", "Apple Pie", "Pumpkin Pie", "Cherry Pie",
                "Chocolate Pie", "Blueberry Pie", "Chestnut Pie", "Raspberry Pie", "Chestnut Rice", "Pumpkin Cake", "Chocolate Cake" });
        maya.setGoodGifts(new String[]{ "Pinkcat Flower", "Pansey", "Shining Tea Leaves", "Chocolate", "Shining Buckwheat Flour", "Honeydew Juice", "Coconut", "Banana", "Oyster",
                "Mussell", "Sea Urchin", "Pineapple", "Strawberry Jam", "Grape Jam", "Orange Marmalade", "Apple Jam", "Raspberry Juice", "Orange Juice", "Pudding", "Riceball",
                "Blueberry Ice Cream", "Hot Chocolate", "Hot Coffee", "Strawberry Milk" });
        maya.setBadGifts(new String[]{ "Toadstool", "failed recipes", "junk", "Pie Dough" });
        maya.setRival("Chase");

        // Phoebe
        Person phoebe = new Person(type, "Phoebe");
        phoebe.setBirthday("Spring 17");
        phoebe.setInfo("The daughter of Barbara and Simon, this inventor likes to spend time looking around the Garmon Upper Mine or in her room working on different projects. " +
                "You have to chime the Red Bell before you can go into Garmon Upper Mine and unlock her on floor 5.");
        phoebe.setBestGifts(new String[]{ "Shining Tea Leaves", "Shining Rice", "Shining Mayonnaise", "Rare Ore", "Rare Metal", "Diamond", "Royal Jelly", "Tempura Buckwheat",
                "Zaru Soba", "Buckwheat Chaff", "Buckwheat Pancakes", "Super Stay Awake" });
        phoebe.setGoodGifts(new String[]{ "Pontata Root", "Fugue Mushroom", "Iron", "Copper", "Silver", "Gold", "Perfect Mayonnaise", "Jade", "Perfect Tea Leaves", "Yellow Wonderful" });
        phoebe.setBadGifts(new String[]{ "Sea Urchin", "Sakura Seashell", "Oyster", "Clam Saute", "Mussell Saute", "Oyster Saute", "Clams in Butter" });
        phoebe.setRival("Calvin");

        // Renee
        Person renee = new Person(type, "Renee");
        renee.setBirthday("Fall 5");
        renee.setInfo("Renee likes to work at her parent's Horn Ranch, where she takes care of the various animals they have. She also has an interest in fishing, and will " +
                "spend her Wednesdays fishing off the bridge in Flute Fields.");
        renee.setBestGifts(new String[]{ "Sunflower", "Shining Strawberry", "Shining Sugarcane", "Shining Egg", "Shining Ostrich Egg", "Shining Mayonnaise", "Shining Milk",
                "Shining Goat Milk", "Royal Jelly", "Hot Milk", "Hot Chocolate", "Salmon Cream Stew", "Salted King Salmon", "Paella", "Strawberry Ice Cream",
                "Strawberry Milk", "Yellow Perfume", "Shining Perfume", "Shining Sushi", "Shining Sashimi", "Seafood Stew", "Shortcake" });
        renee.setGoodGifts(new String[]{ "Pinkcat Flower", "Hyacinth", "Pansey", "Lavender", "Tulip", "Morning Glory", "Rose", "Chrysanthemum", "Moondrop Flower", "Hibiscus",
                "Bluemist Flower", "Snowflake Flower", "Anemone", "Snowflake Flower", "Shining Turnip", "Shining Cherry", "Yellow Herb", "Sea Urchin", "Sakura Seashell",
                "Perfect Egg", "Perfect Mayonnaise", "Boiled Egg", "Herb Tea", "Bonito", "Rock Lobster", "Cookies" });
        renee.setBadGifts(new String[]{ "junk", "Toadstool", "Junk Ore", "failed recipes" });
        renee.setRival("Toby");

        // Selena
        Person selena = new Person(type, "Selena");
        selena.setBirthday("Summer 26");
        selena.setInfo("Once you ring the Blue Bell and gain access to Pascal's boat, you can take it to Toucan Island where you'll meet Selena. She'll stow away on the " +
                "boat when you return to Castanet and gets a job at Hayden's bar, where she becomes a dancer like she's always dreamed.");
        selena.setBestGifts(new String[]{ "Coconut", "Hibiscus", "Lily", "Black Pearl", "Ruby", "Olive Cocktail", "Coconut Cocktail", "Wheat Cocktail. Shining Perfume",
                "South Sea Omelette Rice", "South Sea Fried Rice", "Shining Sushi", "Steamed Clam with Butter" });
        selena.setGoodGifts(new String[]{ "Rose", "Pineapple", "Banana", "Sea Urchin", "Oyster", "Clam", "Pearl", "Sakura Seashell", "Pineapple Juice", "Coconut Juice", "Shining Spicy Pepper" });
        selena.setBadGifts(new String[]{ "Crawfish", "Toadstool", "Junk Ore", "junk" });
        selena.setRival("Luke");

        // Witch
        Person witch = new Person(type, "Witch");
        witch.setBirthday("Unknown");
        witch.setInfo("The magic caster lives in the very depths of Fugue Forest. A wayward spell from the Wizard has trapped her in an unsightly form, and you have to restore " +
                "her body during the task of chiming the Green Bell. Witch is easy to befriend; on your way to her house you have to go through Fugue Forest, where you'll find " +
                "a Fugue Mushroom each day to give to her.");
        witch.setBestGifts(new String[]{ "Fugue Mushroom", "Pontata Root", "Blackberry Pie", "Blackberry Jam", "Blackberry Ice Cream", "Blackberry Cocktail", "Strawberry Milk" });
        witch.setGoodGifts(new String[]{ "Blackberry", "Blackberry Juice", "Black Pearl", "Chocolate Banana", "Cherry Jam", "Cherry Ice Cream" });
        witch.setBadGifts(new String[]{ "Carrot", "junk", "ores" });
        witch.setRival("None");

        // Create and return array of bachelorettes
        return new Person[] { anissa, candace, harvest_goddess, kathy, luna, maya, phoebe, renee, selena, witch };
    }
}
