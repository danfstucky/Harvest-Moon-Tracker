package com.danfstuckygmail.harvestmoontracker.animals;

/**
 * Created by Dan on 6/23/2016.
 */
public class PetData {
    private String type = AnimalGroups.PETS.getName();
    private Pet[] pets;

    public PetData() {
        this.pets = initializeData();
    }

    public Pet[] getPets() {
        return pets;
    }

    public Pet[] initializeData() {
        // Beagle and Black Shiba
        Pet beagle = new Pet(type, "Small Dogs");
        beagle.setSeason("The Beagle is available during the Spring and Summer. The Black Shiba is available during the Fall and Winter.");
        beagle.setLocation("Down the staircase that leads to the graveyard near Celesta Church, next to the mine cart.");
        beagle.setSpeed("Normal walking. Finds mushrooms every 60 minutes.");
        beagle.setGoodGifts(new String[]{ "Hot Milk", "Milk", "Pumpkin", "Yam", "Gold", "Rare Metal", "Roasted Chestnut", "Wheat", "Wheat Flour", "Olive Oil", "Boiled Pumpkin", "Boiled Yam" });
        beagle.setBadGifts(new String[]{ "Onion", "Cocoa", "Squid", "colored Herbs", "Curry Powder" });

        // Collie
        Pet collie = new Pet(type, "Collie");
        beagle.setSeason("All Year");
        beagle.setLocation("On the roof of the Town Hall. Take the path behind the school building and walk onto the roof.");
        beagle.setSpeed("Normal Walking. Finds mushrooms every 80 minutes.");
        beagle.setGoodGifts(new String[]{ "Milk", "Yam", "Pumpkin", "Old Boot", "Wheat", "Wheat Flour", "Olive Oil", "Ground Coffee", "Rice" });
        beagle.setBadGifts(new String[]{ "Cocoa", "Curry", "Chili Pepper", "Onion" });

        // Pyrenees
        Pet pyrenees = new Pet(type, "Pyrenees");
        pyrenees.setSeason("All Year");
        pyrenees.setLocation("Celesta Church Grounds.");
        pyrenees.setSpeed("Normal walking. Finds mushrooms every 2 hours.");
        pyrenees.setGoodGifts(new String[]{ "Milk (Good, Perfect, & Shining)", "Shining Pumpkin", "Shining Yam", "Shining Rice", "Shining Cornmeal" });
        pyrenees.setBadGifts(new String[]{ "Onion", "Cocoa" });

        // Bears
        Pet bears = new Pet(type, "Bears");
        bears.setSeason("The Bear is only available during the Spring, Summer, and Fall (it hibernates in Winter). The Panda is available all year long.");
        bears.setLocation("The Bear is right outside the path that leads to the Goddess Spring in the Garmon Mine district. The Panda is behind the Inn on Toucan Island.");
        bears.setSpeed("Normal walking. Finds mushrooms every 80 minutes.");
        bears.setGoodGifts(new String[]{ "Honey", "Milk", "Potato", "Yam", "jams", "Pumpkin", "Wheat" });
        bears.setBadGifts(new String[]{ "herbs", "Curry Powder", "Squid", "Onion", "Chestnut", "Cocoa", "Red Chili" });

        // Cats
        Pet cats = new Pet(type, "Cats");
        cats.setSeason("All Year");
        cats.setLocation("The Black Cat can be found in Celesta Church Grounds, the Orange Cat is up the staircase above Oricana Inn, and the White Cat is at the Lighthouse.");
        cats.setSpeed("Normal walking. Finds herbs every 90 minutes.");
        cats.setGoodGifts(new String[]{ "Tuna", "Shining Fish Meuniere", "Shining Sashimi", "Shining Herb Grilled Fish", "King Salmon", "Salted Sanma", "Nijimas", "Mabal", "Carp", "etc." });
        cats.setBadGifts(new String[]{ "Squid", "Octopus" });

        // Rabbits
        Pet rabbits = new Pet(type, "Rabbits");
        rabbits.setSeason("The White Rabbit is available during Spring and Summer, while the Black Rabbit is around during Fall and Winter.");
        rabbits.setLocation("Next to the waterwheel in Flute Fields, just down the path leading to the river's edge.");
        rabbits.setSpeed("Normal walking. Finds herbs every 60 minutes.");
        rabbits.setGoodGifts(new String[]{ "Blackberry", "Blueberry", "Raspberry", "Pontata Root", "Carrot", "Cabbage", "Buckwheat", "Apple", "Pumpkin", "Yam", "Corn" });
        rabbits.setBadGifts(new String[]{ "Cocoa", "Grilled Herb Fish", "Curry Powder" });

        // Baby Boar
        Pet boar = new Pet(type, "Baby Boar");
        boar.setSeason("All Year");
        boar.setLocation("Horn Ranch.");
        boar.setSpeed("Normal Walking. Finds mushrooms every 70 minutes.");
        boar.setGoodGifts(new String[]{ "colored herbs", "wild berries", "Mushroom", "chestnut", "banana", "potato" });
        boar.setBadGifts(new String[]{ "Curry", "Oyster", "Mussel", "Cocoa", "Cherry Shell" });

        // Weasels
        Pet weasels = new Pet(type, "Weasels");
        weasels.setSeason("The brown colored weasel will appear in the Spring and Summer seasons, while the white colored weasel will be in the Fall and Winter.");
        weasels.setLocation("In the swamp outside of Witch's house, at the end of Fugue Forest.");
        weasels.setSpeed("Normal walking. Finds mushrooms every 70 minutes.");
        weasels.setGoodGifts(new String[]{ "Mushroom", "fish", "Orange", "Cherry", "Grape", "Shining Strawberry", "Perfect Strawberry", "Pontata Root", "Perfect Corn", "Shining Corn" });
        weasels.setBadGifts(new String[]{ "Curry" });

        // Squirrel
        Pet squirrel = new Pet(type, "Squirrel");
        squirrel.setSeason("All Year");
        squirrel.setLocation("To the left of the path that leads between Horn Ranch and Marimba Farm, in the Flute Fields.");
        squirrel.setSpeed("Normal Walking. Finds mushrooms every 90 minutes.");
        squirrel.setGoodGifts(new String[]{ "wild herbs", "Mushroom", "Shining Cherry", "Shining Pumpkin", "Shining Grape", "Shining Orange", "Shining Sugarcane", "Raspberry",
                "Blackberry", "Cranberry" });
        squirrel.setBadGifts(new String[]{ "Curry" });

        // Frog
        Pet frog = new Pet(type, "Frog");
        frog.setSeason("Spring, Summer, and Fall. Rainy days only");
        frog.setLocation("On the path leading towards the bank of the river, next to the waterwheel in Flute Fields.");
        frog.setSpeed("Slow walking. Finds herbs every 70 minutes.");
        frog.setGoodGifts(new String[]{ "fish", "Wheat", "Wheat Flour", "Sushi", "Sashimi", "Grilled Herb Fish", "Olive Oil", "Rice", "Buckwheat Flour" });
        frog.setBadGifts(new String[]{ "milk", "eggs", "cheese", "mayonnaise", "Kimchi", "Seafood Curry" });

        // Monkey
        Pet monkey = new Pet(type, "Monkey");
        monkey.setSeason("Winter");
        monkey.setLocation("Walk from your farm area to Garmon Mine district. As soon as you cross the bridge, head down the path towards the waterfall.");
        monkey.setSpeed("Slow walking. Finds herbs every 40 minutes.");
        monkey.setGoodGifts(new String[]{ "fish", "herbs", "mushrooms", "Banana", "Shining Yam", "Shining Apple", "Shining Corn", "Shining Strawberry",
                "Shining Honeydew", "Shining Sugarcane", "Shining Watermelon", "Coconut", "Coconut Cocktail", "Good Honey", "Raspberry Cocktail", "Blackberry Cocktail", "Cranberry Cocktail" });
        monkey.setBadGifts(new String[]{ "Toadstook", "Curry", "Curry Powder", "Flax", "Chili Pepper", "Pie Dough", "Kimchi", "Silk" });

        // Raccoon
        Pet raccoon = new Pet(type, "Raccoon");
        raccoon.setSeason("All Year");
        raccoon.setLocation("In the swamp outside of Witch's house, at the end of Fugue Forest.");
        raccoon.setSpeed("Slow Walking. Finds herbs every 40 minutes.");
        raccoon.setGoodGifts(new String[]{ "herbs", "Mushroom", "Apple (Good or higher)", "Shining Corn", "Perfect Corn", "Perfect Strawberry", "Perfect Honeydew", "Perfect Sugarcane",
                "Perfect Watermelon", "Shining Chestnut" });
        raccoon.setBadGifts(new String[]{ "Curry" });

        // Penguin
        Pet penguin = new Pet(type, "Penguin");
        penguin.setSeason("All Year");
        penguin.setLocation("Take the boat to Toucan Island. As soon as you get off the boat, walk south and you'll come across a hard-to-find rocky path. Walk to the end of the path to find the penguin.");
        penguin.setSpeed("Somewhat-normal walking. Finds herbs every 60 minutes. The penguin will start out keeping up with your run speed, but it will slowly fall behind");
        penguin.setGoodGifts(new String[]{ "fish", "shells", "Sea Urchin" });
        penguin.setBadGifts(new String[]{ "ores", "jewels" });

        // Cub & Baby Panda
        Pet cub = new Pet(type, "Bear Cubs");
        cub.setSeason("The Cub can be found during Spring, Summer, and Fall (it hibernates in Winter). The Baby Panda is available all year long.");
        cub.setLocation("The Cub can be found next to the entrance to the Goddess Spring in Garmon Mine District. The Baby Panda is located on Toucan Island, behind the Inn and past the adult Panda.");
        cub.setSpeed("Normal walking. Finds mushrooms every 60 minutes.");
        cub.setGoodGifts(new String[]{ "wild herbs", "Honey (any quality)", "Royal Jelly", "fish", "Apples", "Raspberry Jam", "Blackberry Jam", "Coconut", "Rice", "Tea Leaves", "Wheat",
                "Olive", "Cornmeal", "Olive Oil", "Buckwheat Flour" });
        cub.setBadGifts(new String[]{ "curry", "Chocolate Fondue" });

        // Duck
        Pet duck = new Pet(type, "Duck");
        duck.setSeason("Winter");
        duck.setLocation("Walk from your farm area to Garmon Mine district. Before you cross the bridge, head down the path towards the waterfall.");
        duck.setSpeed("Slow walking. Finds herbs every 9 hours.");
        duck.setGoodGifts(new String[]{ "fish", "Cherry Shell", "Chestnut", "Sashimi" });
        duck.setBadGifts(new String[]{ "Kimchi", "Seafood Pizza", "Curry Powder", "ore", "jewels" });

        // Turtle
        Pet turtle = new Pet(type, "Turtle");
        turtle.setSeason("All Year");
        turtle.setLocation("In the swamp outside of Witch's house, at the end of Fugue Forest.");
        turtle.setSpeed("Slow walking. Finds herbs every 20 minutes.");
        turtle.setGoodGifts(new String[]{ "fish", "Shining Sushi", "Shining Sashimi", "Shining Wheat", "Shining Buckwheat", "Shining Rice", "Shining Ground Coffee",
                "Shining Cornmeal", "Shining Wheat Flour", "Shining Olive Oil" });
        turtle.setBadGifts(new String[]{ "Curry" });

        // Snake
        Pet snake = new Pet(type, "Snake");
        snake.setSeason("Spring, Summer, Fall");
        snake.setLocation("Outside the entrance to the mines in Garmon Mine district");
        snake.setSpeed("Slow walking. Finds herbs every 80 minutes.");
        snake.setGoodGifts(new String[]{ "fish", "Shining Sushi", "Shining Sashimi", "Shining Egg", "Shining Apple", "Shining Wheat", "Shining Buckwheat Flour", "Herb Grilled Fish" });
        snake.setBadGifts(new String[]{ "Curry Powder", "all ores", "all jewels", "perfume" });

        return new Pet[]{ beagle, pyrenees, bears, cats, rabbits, boar, weasels, squirrel, frog, monkey, raccoon, penguin, cub, duck, turtle, snake };
    }
}
