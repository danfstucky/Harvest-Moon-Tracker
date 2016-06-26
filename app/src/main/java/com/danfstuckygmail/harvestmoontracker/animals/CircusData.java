package com.danfstuckygmail.harvestmoontracker.animals;

/**
 * Created by Dan on 6/23/2016.
 */
public class CircusData {
    private String type = AnimalGroups.CIRCUSANIMALS.getName();
    private Circus[] circus;

    public CircusData() {
        this.circus = initializeData();
    }

    public Circus[] getCircusAnimals() {
        return circus;
    }

    public Circus[] initializeData() {
        // Giraffe
        Circus giraffe = new Circus(type, "Giraffe");
        giraffe.setInfo("The first exotic animal you need to find is Eunice the giraffe. Theodore feels that he is somewhere near, but by something tall. Head down to " +
                "the lighthouse in Harmonica Town and blow your Animal Whistle. The shy creature will pop his head from out from behind the building. " +
                "Fin suggests in order to earn its trust, you should bring him a Good Herb Grilled Fish.");
        giraffe.setLocation("Lighthouse");
        giraffe.setRecipe("Herb Grilled Fish\n" +
                "You can make this recipe by combining a wild herb and up to 4 fish using the Oven kitchen utensil. The combined 5 (or fewer) ingredients must total " +
                "a shipping price of over 250 G but less than 600 G. Some suggestions are:\n\n" +
                "Purple Herb (30 G) + Catfish (106 G) + Catfish (106 G) + Catfish (106 G) = 348 G\n" +
                "Green Herb (30 G) + Halibut (125 G) + Rockfish (75 G) + Rockfish (75 G) = 305 G\n" +
                "Yellow Herb (40 G) + Eel (198 G) + Masu Trout (109 G) = 347 G");

        // Elephant
        Circus elephant = new Circus(type, "Elephant");
        elephant.setInfo("The next animal you have to find is the Elephant, Trunks. Theodore believes the large fellow is somewhere near a forest. Blow your whistle when " +
                "you are near the entrance of Fugue Forest and you'll find the packaderm.");
        elephant.setLocation("Fugue Forest Entrance");
        elephant.setRecipe("Bread\n" +
                "You can make it with your Oven and some Wheat Flour, Milk, and Butter. You can get the Milk from your own cow, or buy Decent Milk from Horn Ranch for 340 G. " +
                "You can also buy Decent Butter from the ranch for 380 G, or make it yourself by purchasing the Butter Maker from Barbara for 3800 G.\n" +
                "The Wheat Flour is a little tougher to get. First you'll need to upgrade Marimba Farm to level 2 by shipping 30,000 G worth of crops that you have produced " +
                "on your farm. Ruth will then have Decent Wheat (260 G) and Good Wheat (300 G) for sale at her shop. For the Bread you can use either quality of Wheat. " +
                "Buy some and then go to the Water Wheel next to the bridge in Flute Fields. Go through the door on the left-side of the building and you'll find a place " +
                "you can grind your Wheat into Wheat Flour.\n\n" +
                "Combine all 3 ingredients with the Oven utensil and you'll make the Bread. Give it to Trunks and then return to Theodore.");

        // Hippo
        Circus hippo = new Circus(type, "Hippo");
        hippo.setInfo("The last lost animal is Humphrey the Hippopotamus. Theodore mentions that Humphrey likes swamps, so the area around Witch's house would be " +
                "perfect for him. You have to use the whistle after you cross both of the foot bridges. Humphrey will be in the swampy stream that is on the left-side of Witch's house.");
        hippo.setLocation("Next to Witch's house");
        hippo.setRecipe("Vegetable Pizza\n" +
        "You have to collect several ingredients together:\n" +
                "Pie Dough: You can make this by combining Wheat Flour and Butter in the Knife Set cooking utensil, or buy it from Oricana Inn for 990 G.\n" +
                "Cheese: You can use any cheese produced on your farm or you can buy some cheap Decent Cheese for 380 G at Horn Ranch.\n" +
                "Vegetables: You will need 3 vegetables for this recipe; a Potato, Tomato, and Pepper. Potatoes grow in the Spring, Tomatoes in the Summer, and Peppers in the Fall. " +
                "You can either grow these yourself from seed or buy them from Marimba Farm, depending on what level the store is.\n" +
                "If you couldn't get a Potato during Spring, you can get a Perfect Potato from Yukimaro the Snowman during the Winter season.\n\n" +
                "Once you have all 5 ingredients, use the Oven utensil to make the Vegetable Pizza for Humphrey.");

        return new Circus[]{ giraffe, elephant, hippo };
    }
}
