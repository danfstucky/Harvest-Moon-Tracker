package com.danfstuckygmail.harvestmoontracker.characters;

/**
 * Created by Dan on 6/17/2016.
 */
public class VillagerData {
    private String type = PeopleEnum.PeopleCategories.VILLAGERS.getName();
    private Person[] villagers;

    public VillagerData() {
        this.villagers = initializeData();
    }

    public Person[] getVillagers() {
        return villagers;
    }

    public Person[] initializeData() {
        // Barbara
        Person barbara = new Person(type, "Barbara");
        barbara.setBirthday("Summer 23");
        barbara.setInfo("Phoebe's mom is in charge of the general good store, where you can buy makers for your barns and cooking utensils. Her husband Simon works down " +
                "in Harmonica Town at his own photography studio, leaving Barbara to manage the shop in the mountain area.");
        barbara.setBestGifts(new String[]{ "Shining Cherry", "Shining Green Pepper", "Orange Juice", "Vegetable Juice" });
        barbara.setGoodGifts(new String[]{ "Pinkcat Flower", "Hyacinth", "Pansey", "Lavender", "Tulip", "Crysthanamum", "Sunflower", "Snowflake Flower", "Morning Glory",
                "Hibiscus", "Anemone", "Green Bell Flower", "Royal Jelly", "Shining Salt", "Shining Egg", "Shining Mayonnaise", "Cookies", "Perfect Flax Yarn", "Bodigizer XL", "Strawberry Milk" });
        barbara.setBadGifts(new String[]{ "Rubber Boot", "Empty Can", "Algae", "Swim Trunks", "Squid", "Octopus" });

        // Bo
        Person bo = new Person(type, "Bo");
        bo.setBirthday("Fall 2");
        bo.setInfo("Bo is the quieter of Dale's two apprentices. He often has to apologize for Luke's antics. You will help Bo at the beginning of the game in order to access the mine district, " +
                "and again later on when he wants to fix the mine cart that leads to Harmonica Town.");
        bo.setBestGifts(new String[]{ "Shining Honey", "Green Bell Flower", "Mushroom Gratin", "Mushroom Saute", "Mushroom Rice", "Mushroom Doria" });
        bo.setGoodGifts(new String[]{ "Pinkcat Flower", "Hyacinth", "Pansey", "Lavender", "Tulip", "Anemone", "Cosmos", "Sunflower", "Morning Glory", "Hibiscus", "Snowflake Flower", "Eel",
                "Shining Egg", "Shining Mayonnaise", "Perfect Honey", "Strawberry Milk" });
        bo.setBadGifts(new String[]{ "Toadstool", "Algae", "Swim Trucks", "Empty Can", "Rubber Boot", "Choco Banana", "Choco Fondue" });

        // Cain
        Person cain = new Person(type, "Cain");
        cain.setBirthday("Summer 6");
        cain.setInfo("Cain runs the Horn Ranch with his wife Hanna and his daughter Renee. He also manages the horse race mini game. Talk to Cain when he is out at the back gate of the ranch, " +
                "near the windmill, and he'll let you go into the racetrack area to practice racing your horse.");
        cain.setBestGifts(new String[]{ "Shining Egg", "Shining Mayonnaise", "Shining Corn", "Yogurt", "Seafood Stew", "Coconut Cocktail" });
        cain.setGoodGifts(new String[]{ "Sunflower", "Perfect Corn", "Perfect Onion", "Perfect Egg", "Perfect Mayonnaise", "Royal Jelly", "Strawberry Milk" });
        cain.setBadGifts(new String[]{ "Toadstool", "Empty Can", "Rubber Boot", "Algae", "Swim Trunks", "failed cooking recipes" });

        // Chloe
        Person chloe = new Person(type, "Chloe");
        chloe.setBirthday("Summer 27");
        chloe.setInfo("Grandfather Ramsey and Owen are in charge of taking care of Chloe. This active girl seems to be always getting into some sort of mischief. She'll appear the first time as you are " +
                "trying to locate the Red Bell.");
        chloe.setBestGifts(new String[]{ "Tulip", "Sunflower", "Choco Banana", "Strawberry Ice Cream", "Banana Ice Cream", "Choco Ice Cream", "Apple Ice Cream", "Strawberry Milk" });
        chloe.setGoodGifts(new String[]{ "Pinkcat Flower", "Hyacinth", "Pansey", "Lavender", "Morning Glory", "Hibiscus", "Snowflake Flower", "Anemone", "Green Bell Flower", "Cherry Shell", "Pineapple",
                "Banana", "Coconut Juice", "Pineapple Juice", "Blackberry Juice", "Blueberry Juice", "Cranberry Juice", "Cookies" });
        chloe.setBadGifts(new String[]{ "Junk Ore", "failed cooking recipes", "Empty Can", "Algae", "Swim Trunks", "Toadstool" });

        // Colleen
        Person colleen = new Person(type, "Colleen");
        colleen.setBirthday("Winter 12");
        colleen.setInfo("At the Ocarina Inn, Colleen runs the small food shop you can buy snacks and recipes from. Her husband Jake manages the inn's accommodations for its guests, and his mother, " +
                "Yolanda, cooks back in the kitchen. Colleen is Maya's mother.");
        colleen.setBestGifts(new String[]{ "Green Bell Flower", "Rose", "Shining Apple", "Shining Honey", "Apple Cocktail", "Grape Cocktail", "Cookies" });
        colleen.setGoodGifts(new String[]{ "Pinkcat Flower", "Lavender", "Hyacinth", "Sunflower", "Hibiscus", "Snowflake Flower", "Black Pearl", "Yellow Herb", "Perfect Carrot",
                "Shining Egg", "Shining Milk", "Raspberry Cocktail", "Blueberry Cocktail", "Cranberry Cocktail" });
        colleen.setBadGifts(new String[]{ "failed cooking recipes", "Algae", "Empty Can", "Rubber Boot", "Junk Ore", "Swim Trunks" });

        // Craig
        Person craig = new Person(type, "Craig");
        craig.setBirthday("Fall 6");
        craig.setInfo("Down at Marimba Farm, Craig takes care of the crops out behind their farmhouse shop. His wife Ruth runs the shop where you can buy crop seeds, while his children Taylor " +
                "and Anissa hang around the house. Craig is a melancholy character since the land doesn't seem to be well, but once you ring the Yellow Bell, Craig seems to cheer up.");
        craig.setBestGifts(new String[]{ "Shining Corn", "Shining Yam", "Shining Pumpkin", "Shining Eggplant", "Shining Wheat", "Stirfry" });
        craig.setGoodGifts(new String[]{ "Shining Egg", "Raspberry Cocktail", "Coconut Cocktail", "Cranberry Cocktail", "Blackberry Cocktail", "Blueberry Cocktail",
                "Common Mushroom", "Mussels" });
        craig.setBadGifts(new String[]{ "Algae", "Rubber Boot", "Empty Can", "failed cooking recipe", "Swim Trunks", "Strawberry Milk" });

        // Dale
        Person dale = new Person(type, "Dale");
        dale.setBirthday("Summer 14");
        dale.setInfo("The carpenter will upgrade your house if you collect the correct amount of stone material and lumber. He also will sell you furniture for your house. His two " +
                "apprentices, Bo and Luke (yeeeehaaw!), are there to learn how to be carpenters themselves.");
        dale.setBestGifts(new String[]{ "Coconut Cocktail", "Olive Cocktail", "Wheat Cocktail" });
        dale.setGoodGifts(new String[]{ "Anemone", "Shining Egg", "Remedy", "Blueberry Cocktail", "Cranberry Cocktail", "Raspberry Cocktail", "Blackberry Cocktail" });
        dale.setBadGifts(new String[]{ "failed cooking recipes", "Banana Pudding", "Pudding", "Choco Pudding", "Pumpkin Pudding", "Toadstool", "Cookies" });

        // Hamilton
        Person hamilton = new Person(type, "Hamilton");
        hamilton.setBirthday("Spring 13");
        hamilton.setInfo("The mayor, who runs Harmonica Town, lives with his son Gill and spends the days at the Town Hall. Hamilton also runs the seasonal festivals and will visit " +
                "your house to chat with you about each one.");
        hamilton.setBestGifts(new String[]{ "Moondrop Flower", "Shining Potato", "Boiled Potato", "Mashed Potato", "Potato Pancake" });
        hamilton.setGoodGifts(new String[]{ "Sunflower", "Pinkcat Flower", "Hyacinth", "Pansey", "Lavender", "Tulip", "Rose", "Snowflake Flower", "Hibiscus", "Anemone",
                "Green Bell Flower", "Pearl", "Gold", "Shining Egg", "Shining Mayonnaise", "Shining Milk", "Boiled Pumpkin", "Boiled Yam", "Cookies", "Remedy" });
        hamilton.setBadGifts(new String[]{ "cocktail drinks", "Fugue Mushroom" });

        // Hanna
        Person hanna = new Person(type, "Hanna");
        hanna.setBirthday("Winter 4");
        hanna.setInfo("At Horn Ranch, Hanna manages the shops goods. She will sell animals, animal products, and cooking recipes. Hanna and her husband Cain have a daughter named Renee, " +
                "who spends time in front of the shop or inside the animal barn.");
        hanna.setBestGifts(new String[]{ "Sunflower", "Morning Glory", "Shining Egg", "Shining Mayonnaise", "Omelet", "Cheese Omelet", "Strawberry Milk" });
        hanna.setGoodGifts(new String[]{ "Pansey", "Crysthanamum", "Moondrop Flower", "Pearl", "Cherry Shell", "Cookies" });
        hanna.setBadGifts(new String[]{ "Junk Ore", "failed cooking recipes", "Rubber Boot", "Algae", "Empty Can", "Swim Trunks" });

        // Hayden
        Person hayden = new Person(type, "Hayden");
        hayden.setBirthday("Spring 21");
        hayden.setInfo("Armonica Bar is where you'll find this muscular fellow. Hayden is Kathy's father, and opens his shop after 4:00 pm. He is easy to befriend because " +
                "he sells cocktail drinks, which happens to be his favorite type of gift.");
        hayden.setBestGifts(new String[]{ "Mussel", "Clam", "Sea Urchin", "Oyster", "cocktail drinks", "pizza" });
        hayden.setGoodGifts(new String[]{ "Seaweed", "Shining Egg", "Shining Mayonnaise", "Shining Milk", "Perfect Coffee Bean" });
        hayden.setBadGifts(new String[]{ "Empty Can", "Toadstool", "failed cooking recipes", "Algae", "Swim Trunks", "Rubber Boot", "Cookies" });

        // Irene
        Person irene = new Person(type, "Irene");
        irene.setBirthday("Fall 20");
        irene.setInfo("Irene works at the Harp Clinic and helps Jin with the clinic duties. She usually stays behind the counter, where you can buy medicines from her. During the " +
                "New Years Eve Festival you'll find her selling colored herb seeds.");
        irene.setBestGifts(new String[]{ "Lavender", "Pontata Root", "Royal Jelly", "Boiled Pumpkin", "Herb Cookies" });
        irene.setGoodGifts(new String[]{ "Bluemist Flower", "Lily", "Purple Herb", "Shining Egg", "Shining Mayonnaise", "Shining Salt", "Herb Tea", "Green Tea", "other Cookies", "Remedy" });
        irene.setBadGifts(new String[]{ "Junk Ore", "Algae", "Rubber Boot", "Empty Can", "Swim Trunks", "failed cooking recipes", "Fugue Mushroom", "Pink Mushroom" });

        // Jake
        Person jake = new Person(type, "Jake");
        jake.setBirthday("Fall 28");
        jake.setInfo("The innkeeper of the Ocarina Inn is Jake. He doesn't have anything for sale, but you can always find him behind the front desk counter. Colleen, Jake, " +
                "Maya, and Yolanda all live together at the inn.");
        jake.setBestGifts(new String[]{ "fruit cocktails", "Apple Pie", "Apple Ice Cream" });
        jake.setGoodGifts(new String[]{ "Hyacinth", "Lavender", "Green Bell Flower", "Snowflake Flower", "Shining Egg", "Shining Milk", "Perfect Apple", "Perfect Grape",
                "Cookies", "Coconut Cocktail" });
        jake.setBadGifts(new String[]{ "Empty Can", "Algae", "Rubber Boot", "failed cooking recipes", "Bodigizer XL", "Swim Trunks" });

        // Mira
        Person mira = new Person(type, "Mira");
        mira.setBirthday("Fall 10");
        mira.setInfo("At the beginning of the game, Julius will express his concern over the accessory shop owner. He worries that she spends too much time at the church, " +
                "morning her deceased husband. You have to travel to the church and convince her to return to the Garmon Mine shop. Mira can then process the gems and ores you find in the mines.");
        mira.setBestGifts(new String[]{ "Lavender", "Bluemist Flower", "Shining Turnip", "Orange Juice", "Orange Cake", "Orange Candy" });
        mira.setGoodGifts(new String[]{ "Pinkcat Flower", "Hyacinth", "Pansey", "Tulip", "Sunflower", "Morning Glory", "Hibiscus", "Snowflake Flower", "Anemone", "Green Bell Flower",
                "Cherry Shell", "Cranberry Juice", "Raspberry Juice", "Blueberry Juice", "Coconut Juice", "Pineapple Juice", "Cookies", "Perfect Flax Yarn", "Strawberry Milk" });
        mira.setBadGifts(new String[]{ "Empty Can", "Algae", "Swim Trunks", "failed cooking recipes" });

        // Ozzie
        Person ozzie = new Person(type, "Ozzie");
        ozzie.setBirthday("Winter 23");
        ozzie.setInfo("Down on the town's docks, you will find Ozzie and his Harmonica Fishery shop. He will sell different fish each season, plus the ship tickets you'll need to get to " +
                "Toucan Island after you ring the Blue Bell. Ozzie's shop is the only one that opens right at 6:00 am. He is Paolo's father.");
        ozzie.setBestGifts(new String[]{ "Oyster", "Clam", "Mussel", "Sea Urchin", "king fish roasted on a bonfire" });
        ozzie.setGoodGifts(new String[]{ "Seaweed", "fish" });
        ozzie.setBadGifts(new String[]{ "Carrot (any quality)", "Carrot Juice", "Carrot Cake", "failed cooking recipes", "Vegetable Juice" });

        // Paolo
        Person paolo = new Person(type, "Paolo");
        paolo.setBirthday("Winter 20");
        paolo.setInfo("Paolo spends most of his time either inside his dad's Harmonica Fishery shop or out by Telmin Lighthouse. The boy will help you with ringing the Blue Bell. Paolo " +
                "and Chloe are close friends and you may find them playing together during events.");
        paolo.setBestGifts(new String[]{ "Oyster", "Clam", "Mussel", "king fish roasted on a bonfire", "Banana Juice", "Banana Milk", "Choco Banana", "Shining Sashimi" });
        paolo.setGoodGifts(new String[]{ "Sunflower", "fish", "Seaweed", "Boiled Egg" });
        paolo.setBadGifts(new String[]{ "Toadstool", "failed cooking recipes", "Vegetable Juice", "Cheese Omelet" });

        // Pascal
        Person pascal = new Person(type, "Pascal");
        pascal.setBirthday("Winter 3");
        pascal.setInfo("The sea captain doesn't appear in Harmonica Town until after the Blue Bell is chimed and the power of water returns to the land. He lives in the back room of " +
                "Harmonica Fishery, and spends his days at the boat dock. If you bring him a ship ticket from Ozzie's shop, Pascal will take you to Toucan Island.");
        pascal.setBestGifts(new String[]{ "Cosmos", "Oyster", "Sea Urchin" });
        pascal.setGoodGifts(new String[]{ "Hyacinth", "Tulip", "Sunflower", "Hibiscus", "Morning Glory", "Green Bell Flower", "Cherry Shell", "Mussel", "Clam", "Shining Egg", "Shining Milk",
                "Coconut", "Boiled Egg" });
        pascal.setBadGifts(new String[]{ "failed cooking recipes", "Rubber Boot", "Empty Can", "Algae", "Swim Trunks" });

        // Perry
        Person perry = new Person(type, "Perry");
        perry.setBirthday("Spring 20");
        perry.setInfo("Perry is the only inhabitant of the Chelsta Church Grounds, besides the graveyard on the south side of the plaza. He manages the church, although the " + "" +
                "only visitors are Hamilton, Candace, and Mira. In Perry's bedroom you'll find the fresco that is tied to the Purple Bell and the special Wish Trophy for your house.");
        perry.setBestGifts(new String[]{ "Lavender", "Green Bell Flower", "Mushroom Rice", "Green Tea", "Herb Tea", "Herb Bread", "Mint Ice Cream" });
        perry.setGoodGifts(new String[]{ "Pinkcat Flower", "Hyacinth", "Pansey", "Tulip", "Anemone", "Sunflower", "Morning Glory", "Hibiscus", "Snowflake Flower", "Shining Milk",
                "Shining Egg", "Shining Mayonnaise", "Shining Honey", "Blue Herb", "Cookies", "Perfect Flax Yarn", "Bodigizer XL" });
        perry.setBadGifts(new String[]{ "failed cooking recipes", "Clam Saute", "Oyster Saute", "Mussel Saute", "Empty Can", "Algae" });

        // Ramsey
        Person ramsey = new Person(type, "Ramsey");
        ramsey.setBirthday("Spring 5");
        ramsey.setInfo("The person who can upgrade your tools is Ramsey the blacksmith. His shop is in Garmon Mine District. Ramsey can't upgrade your tools until you return the power of fire by chiming the Red Bell.");
        ramsey.setBestGifts(new String[]{ "Shining Turnip", "Green Tea", "Buckwheat Cocktail", "Wheat Cocktail", "Yam Cocktail" });
        ramsey.setGoodGifts(new String[]{ "Pansey", "Shining Egg", "Shining Mayonnaise", "Perfect Turnip", "Remedy", "Gold", "Rare Ore", "Coconut Cocktail", "Perfect Flax Yarn" });
        ramsey.setBadGifts(new String[]{ "Spinach Saute", "Clam Saute", "Oyster Saute", "Mussel Saute", "failed cooking recipes", "Algae", "Empty Can", "Rubber Boot", "Swim Trunks", "Bodigizer XL" });

        // Ruth
        Person ruth = new Person(type, "Ruth");
        ruth.setBirthday("Spring 6");
        ruth.setInfo("Ruth runs the shop at Marimba Farm while her husband Craig goes out to the fields. At the beginning of the game, her daughter Anissa has left to try and find a solution to their land problem, " +
                "but will return after you ring the Yellow Bell. Her son Taylor also runs a seed shop, but you can only buy from him if you use a telephone inside of your house.");
        ruth.setBestGifts(new String[]{ "Bluemist Flower", "Shining Corn", "Shining Eggplant", "Shining Yam", "Shining Pumpkin", "Spinach Cake", "Spinach Risotto" });
        ruth.setGoodGifts(new String[]{ "Pinkcat Flower", "Hyacinth", "Pansey", "Lavender", "Tulip", "Sunflower", "Morning Glory", "Hibiscus", "Snowflake Flower", "Anemone",
                "Green Bell Flower", "Cherry Shell", "Royal Jelly", "Shining Egg", "Shining Salt", "Strawberry Milk" });
        ruth.setBadGifts(new String[]{ "failed cooking recipes", "Algae", "Empty Can", "Swim Trunks", "Rubber Boot" });

        // Samson
        Person samson = new Person(type, "Samson");
        samson.setBirthday("Summer 21");
        samson.setInfo("You can talk to the Toucan Island innkeeper by visiting him by boat, or by calling him with your telephone. Samson is a very relaxed character, but his wife Sue and daughter Selena " +
                "don't see eye-to-eye, which causes him some stress. He is always cheerful towards visitors.");
        samson.setBestGifts(new String[]{ "Hibiscus", "Coconut", "Raspberry Cocktail", "Coconut Cocktail", "Cranberry Cocktail", "Blackberry Cocktail" });
        samson.setGoodGifts(new String[]{ "Sunflower", "Oyster", "Mussel", "Clam", "Pineapple", "Banana", "Raspberry Juice", "Coconut Juice", "Cranberry Juice" });
        samson.setBadGifts(new String[]{ "failed cooking recipes", "Toadstool", "Algae", "Rubber Boot", "Empty Can" });

        // Shelly
        Person shelly = new Person(type, "Shelly");
        shelly.setBirthday("Winter 19");
        shelly.setInfo("Shelly runs the Flute Tailors clothing shop in Harmonica Town with her granddaughter Candace. Her other granddaughter, Luna, lives at the shop but " +
                "doesn't seem to do much sewing. Shelly will upgrade your rucksack if you bring her requested items to the shop.");
        shelly.setBestGifts(new String[]{ "Snowflake Flower", "Shining Turnip", "Green Tea", "Honeydew Pie" });
        shelly.setGoodGifts(new String[]{ "Pincat Flower", "Pansey", "Lavender", "Begonia", "Hyacinth", "Tulip", "Sunflower", "Morning Glory", "Hibiscus", "Anemone", "Green Bell Flower",
                "Cherry Shell", "Shining Egg", "Shining Mayonnaise", "Shining Milk", "Blue Herb", "Shining Salt", "Herb Tea", "Cookies" });
        shelly.setBadGifts(new String[]{ "curry dishes", "Algae", "Kimchi" });

        // Simon
        Person simon = new Person(type, "Simon");
        simon.setBirthday("Winter 8");
        simon.setInfo("Next to the Town Hall, you'll find Simon's Harmonica Photography studio. You can get a free camera from him at the beginning of the game. Simon is married to " +
                "Barbara, and their daughter is Phoebe. Barbara runs her own shop in Garmon Mine District, and Simon hangs out there on Sundays.");
        simon.setBestGifts(new String[]{ "Shining Coffee Beans", "Rare Metal", "Boiled Pumpkin", "Boiled Yam", "Yam Cake", "Cookies" });
        simon.setGoodGifts(new String[]{ "Hyacinth", "Pansey", "Lavender", "Green Bell Flower", "Remedy", "Gold", "Rare Ore", "Shining Egg", "Shining Milk", "Herb Tea", "Bodigizer XL" });
        simon.setBadGifts(new String[]{ "Junk Ore", "Empty Can", "Rubber Boot", "Swim Trunks", "Wheat Cocktail" });

        // Sue
        Person sue = new Person(type, "Sue");
        sue.setBirthday("Spring 27");
        sue.setInfo("Sue is a little protective of her daughter Selena and doesn't want her moving away to be a dancer. When Selena hides away on the boat back to Harmonica Town, " +
                "which you kind of helped out with, it is up to you to patch up the bad feelings between the two islanders.");
        sue.setBestGifts(new String[]{ "Hyacinth", "Pansey", "Hibiscus", "Coconut", "Pineapple Juice", "Coconut Cocktail", "Coconut Juice", "Blackberry Cocktail", "Raspberry Cocktail",
                "Cranberry Cocktail" });
        sue.setGoodGifts(new String[]{ "Pinkcat Flower", "Lavender", "Tulip", "Sunflower", "Morning Glory", "Anemone", "Green Bell Flower", "Cherry Shell", "Pineapple", "Banana",
                "Oyster", "Clam", "fish" });
        sue.setBadGifts(new String[]{"Junk Ore", "failed cooking recipes", "Algae", "Rubber Boot", "Swim Trunks", "Empty Can"  });

        // Taylor
        Person taylor = new Person(type, "Taylor");
        taylor.setBirthday("Summer 19");
        taylor.setInfo("Taylor won't be around until after you ring the Yellow Bell to return the land's strength. You can buy seeds from him that might not be available at Marimba " +
                "Farm, but Taylor's prices are twice as what his mom Ruth charges for the same seeds. Use the telephone in your house to call Taylor and buy seeds.");
        taylor.setBestGifts(new String[]{ "Fugue Mushroom", "Shining Corn", "Choco Banana", "Choco Fondue", "Choco Cake" });
        taylor.setGoodGifts(new String[]{ "Pinkcat Flower", "Hyacinth", "Pansey", "Lavender", "Tulip", "Sunflower", "Morning Glory", "Cosmos", "Hibiscus", "Snowflake Flower",
                "Anemone", "Green Bell Flower", "Royal Jelly", "Boiled Egg", "Strawberry Milk" });
        taylor.setBadGifts(new String[]{ "Junk ore", "Carrot (any quality)", "Carrot Juice", "Carrot Cake", "Algae" });

        // Yolanda
        Person yolanda = new Person(type, "Yolanda");
        yolanda.setBirthday("Summer 10");
        yolanda.setInfo("Jake's mother and Maya's grandmother is the cook for the Ocarina Inn. You'll usually find her in the kitchen. She has tried to teach Maya how to cook but the " +
                "young girl isn't a quick learner. She will find a treasure map for you if you befriend her to 5 hearts.");
        yolanda.setBestGifts(new String[]{ "Shining Egg", "Herb Bread", "Green Tea", "Boiled Pumpkin", "Shining Olive Oil" });
        yolanda.setGoodGifts(new String[]{ "Perfect Egg", "Shining Salt", "Fugue Mushroom", "Herb Tea", "Perfect Olive Oil", "Boiled Egg", "Cookies" });
        yolanda.setBadGifts(new String[]{ "failed cooking recipes", "Algae", "Rubber Boots", "Swim Trunks", "Empty Can" });


        // Create and return array of villagers
        return new Person[] { barbara, bo, cain, chloe, colleen, craig, dale, hamilton, hanna, hayden, irene, jake,
        mira, ozzie, paolo, pascal, perry, ramsey, ruth, samson, shelly, simon, sue, taylor, yolanda };
    }
}
