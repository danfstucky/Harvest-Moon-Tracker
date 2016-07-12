package com.danfstuckygmail.harvestmoontracker.story;

import java.util.HashMap;

/**
 * Created by Dan on 7/9/2016.
 */

//  MAKE THIS A SINGLETON!
public class BellData {
    private HashMap<String, String> bells = new HashMap<>();
    private static BellData singleton;

    private BellData() {
        initializeData();
    }

    public static BellData instance() {
        if (singleton == null) {
            singleton = new BellData();
        }
        return singleton;
    }

    public String getBellInfo(String bell_color) {
        return bells.get(bell_color);
    }

    private void initializeData() {
        bells.put("red_bell",
                "If you've ever reached the bottom of the Garmon Lower Mine, you would find Owen smashing away at a large boulder. Return to the 10th floor after you've met up with the " +
                        "Goddess and you'll see that Owen has destroyed the rock. Walk through the path to discover the red bell pedestal, but the bell is missing!\n\n" +
                        "Return to the top of the mine and go talk to Ramsey. The old man thinks that Chloe might know something about it.\n\n" +
                        "As you are walking past Barbara's general store on a sunny day, you'll find Bo counting to 10. He and Chloe are playing together outside. Finn then spots the Red Bell! " +
                        "It is simply sitting on the ground a little ways away. As you run to get the bell, Chloe runs up and kicks the bell into the air!\n\n" +
                        "Chloe's pretty strong for a little girl and the bell ends up landing, and getting stuck, in the chimney of Ramsey's shop.\n\n" +
                        "Back inside the Blacksmith's shop, the bell is wedges in too tightly for Ramsey to get it unstuck. He suggests that a lot of ore on the fire, as weak as it is already, " +
                        "might be able to make enough smoke to push the bell out of the chimney. Ramsey and Chloe ask you to go collect an Iron Ore, Copper Ore, Silver Ore, and Gold Ore.\n\n" +
                        "You do not have to ask Mira to process the ore. Just find the ore by smashing rocks in the Garmon Lower Mine and hand them over to Ramsey.\n\n" +
                        "Once all 4 pieces of ore are collected, Ramsey puts them on the fire. The amount of smoke that comes out is enough to dislodge the bell and it shoots up into the air. " +
                        "After you catch the bell, return to the 10th floor of the mine to place it in the pedestal. You'll discover the red Harvest Sprite, Alan.\n\n" +
                        "After Alan rings the Red Bell, the strength of fire will return to Castanet. Ringing the Red Bell also opens up the deeper parts of the Garmon Lower Mine, " +
                        "which you can access by going down the stairs that appear behind the bell's pedestal on the 10th floor. You also can now go down the dark hallway that leads to the " +
                        "Garmon Upper Mine, which you'll find to the right of the Garmon Lower Mine entrance.\n\n" +
                        "Now that the fire has returned to the land, Ramsey can upgrade your tools but only if you have the appropriate funds and ore.\n\n" +
                        "You can also now use the hot spring on your farm!"
        );

        bells.put("yellow_bell",
                "You can find the Yellow Bell if you walk from your farm to the beach in your Farmland, just south of the bridge that leads to the Flute Fields. The two of you spot the " +
                        "bell half-buried in sand. Unfortunately Collin is so weak that he can't be of much help, but manages to make fun of Finn before he fades away.\n\n" +
                        "Return to the Goddess Pond and show the Yellow Bell to the Goddess. Collin's strength can be restored if you bathe the bell in collected moonlight. " +
                        "There are 3 spots in the land where the moon rays merge together, and if you put the bell in the light it should restore Collin's power.\n\n" +
                        "The moon light will only appear between 6:00 pm and midnight, but first you have to find the moon light stones!\n\n" +
                        "Walk back to the Garmon Mine area and walk up the staircase that lead up past Ramsey's shop. At the top of the staircase you'll unlock Calvin, who says he's " +
                        "exploring strange stones that he found written about on a lithograph. The stone he found on the ground is one of the moon light stones you're looking for! " +
                        "Calvin gives you the ancient lithograph to help you with your search and then he leaves.\n\n" +
                        "Note: At this point you've met Calvin, but you have not officially unlocked him. Calvin will begin to live at the Orcarina Inn after you ring the Yellow Bell.\n\n" +
                        "To recharge the bell with the moon light, take the bell out of your rucksack and press A when you holding the bell in the middle of the moon light. The bell " +
                        "will absorb the rays and Collin will be a little bit stronger. Now you have to find the other 2 spots.\n\n" +
                        "The other moon light spots are fairly easy to find. One is on the hillside that leads down to Horn Ranch in Flute Fields, and the other is below the Lighthouse " +
                        "in Harmonica Town. Just take the Yellow Bell and place it in the light. Once you have all 3 done, Collin's power will be recharged.\n\n" +
                        "You're not done yet! Now that you have the bell it needs to be hung from its bell pedestal in Flute Fields. The gate leading to the pedestal is to the " +
                        "right of the Marimba Farm store. Unfortunately the path to the pedestal is locked by a gate.\n\n" +
                        "Go inside Marimba Farm and talk with Ruth. She complains about her useless husband, and wishes that they had some crops to ship. If you can grow some crops for her, " +
                        "maybe she can be of some help.\n\n" +
                        "Ruth tells you that she needs you to grow 10 of any of the following crops:\n" +
                        "Spring - Good Lettuce\n" +
                        "Summer - Good Tomato\n" +
                        "Fall - Good Pumpkin\n" +
                        "Winter - Good Buckwheat\n\n" +
                        "You don't have to grow 10 of each crop, just 10 of which ever one you can grow in the season that you currently are in. Any quality of Good, Perfect, " +
                        "or Shining will do. You can also mix and match the crops, such as bringing her 5 Good Lettuce in Spring and then 5 Good Tomatoes in Summer.\n\n" +
                        "Bring Ruth the 10 vegetable she's requested and ask her about the pedestal again. She thinks there might be one out where her useless husband works in the field. " +
                        "She'll unlock the field gate for you.\n\n" +
                        "At the end of the path you'll find the Yellow Bell frame. Place the bell in its holder and ask Collin to ring it. Now the power of the earth has returned to Castanet.\n\n" +
                        "If you return to Marimba Farm the next day, Anissa will have returned from her travels. Her brother Taylor has also returned from his short seed shopping " +
                        "trip and will let you know by visiting your house in the morning."
        );

        bells.put("blue_bell",
                "Upstairs in the windmill on Horn Ranch you'll find another pedestal, but the green bell is missing. Where is Daren? Finn thinks maybe Witch might have an idea on what " +
                        "to do next. She lives in Fugue Forest.\n\n" +
                        "If you go to the forest entrance you'll discover that the gate is locked! Go back to Horn Ranch and talk to Hanna. She doesn't know why the gate would be " +
                        "locked when it didn't use to be locked, so she sends her husband out to investigate.\n\n" +
                        "Return back to the forest entrance and you'll find Cain looking at the lock. He doesn't have the key, but he believes Dale has it.\n\n" +
                        "Walk to the carpentry shop in the Garmon Mine District and talk to Dale. He did indeed lock the door to the forest and hands over the key.\n\n" +
                        "Use the key on the door in order to pass through the gate. You also need to have your Axe in your Rucksack before you can enter the forest.\n\n" +
                        "The path through the forest is a series of randomly generated screens. There's about 12 random tree areas you have to pass through. As you walk into each area, " +
                        "search for a small path that leads away from where you are. Sometimes the path can be hidden behind a tree on the north-side of the screen. There are no dead ends, " +
                        "so keep searching if you don't see the path right away.\n\n" +
                        "At the end of the forest you'll find the Witch's house. When you go inside there's nothing there but a pink frog! Maybe Wizard knows something about this, so " +
                        "head back to Harmonica Town.\n\n" +
                        "Wizard knows all about the pink frog in Fugue Forest. It's actually Witch! The Witch had tried to cast a spell to restore the divine tree. Even after Wizard " +
                        "had warned her not to do it, she went ahead and had some unfortunate results. She's stuck as a little froggie for the moment. Wizard can restore her but he needs a " +
                        "few ingredients; a Hibiscus flower, Perfect Butter, and Good Cornmeal. The Hibiscus can only be found on the island to the south, which requires a boat to travel there.\n\n" +
                        "Go to the Fishery and talk to Ozzie. Boats have not arrived in Harmonica Town for quite some time, due to the fact that the Lighthouse is broken. The water " +
                        "aqueduct that flows through town is needed to run the light on top of the lighthouse. Ozzie suggest that you go talk to Paolo, who is inside the Lighthouse.\n\n" +
                        "Paolo will tell you about the Lighthouse. He will also give you the key to the aqueduct gate that keeps the Watery Cave protected. There is also a strange, " +
                        "cryptic map behind him on the wall.\n\n" +
                        "The aqueduct gate is on the level between Wizard's house and Choral Clinic. Use the key on the gate to open it. Inside the Watery Cave you'll " +
                        "find the Blue Bell on its pedestal!\n\n" +
                        "Ask Ben to ring his bell, but no matter how much he pleads, the bell will not ring. Has it forgotten how to sound? Finn thinks the Goddess might know something.\n\n" +
                        "Back at the pond, Goddess says someone who knows about the Watery Cave might be the person who can help with the Blue Bell. Head back to Paolo, who mentions " +
                        "that he heard from his dad that the town itself can help tune the bell. Paolo will point out the strange map on the wall that you saw before.\n\n" +
                        "Oh, but something is missing... Paolo does some more drawing on the map. It looks like the two of you will use the town's aqueduct system to help " +
                        "tune the bell. You just have to collect a few pieces:\n\n" +
                        "Duck Egg:\n" +
                        "You can buy a Duckling from Horn Ranch for 800 G. The Duckling will take 7 days to mature into a Duck. The adult Duck will lay an egg every 2 days, and the " +
                        "quality of the Duck Egg won't matter for this task.\n" +
                        "Horn Ranch won't sell duck eggs at their shop until after you ring the Green Bell, so you must produce the egg from your own farm.\n\n" +
                        "Black Pearl:\n" +
                        "Near the Blue Bell's pedestal is a staircase down into the Watery Cave mine. On level 25 you might see a Black Pearl on the ground for you to pick up. " +
                        "The Black Pearl shines, so it is easy to spot on the dark cave floor.\n\n" +
                        "5 Fish:\n" +
                        "You just need a total of 5 fish. Any kind of fish will do, and they don't have to be all of the same species. You can buy fish from Ozzie's Fishery shop " +
                        "or catch them yourself.\n\n" +
                        "A Windy Day:\n" +
                        "There's no way to control this one, but most of the days on Castanet have some sort of breeze blowing. If you want to confirm, buy a television set from Barbara " +
                        "at her shop in Garmon Mine District and then watch Elli's daily weather report. She'll tell you the next day's sunshine and wind report.\n\n" +
                        "After you have all of the components necessary, talk to Paolo when he is standing outside the lighthouse. Tell him you have all the parts and then he " +
                        "will freeze time (of sorts) so you can walk around town and set up the contraption.\n\n" +
                        "The 5 fish need to go into the pool of water that is up the stairs to the left of the Orcarina Inn, the Black Pearl needs to go on the scale on the " +
                        "right-side of the inn's door, and the Duck Egg needs to be placed on the roof of Hamilton's house. You will see small green arrows indicating where things need to go.\n\n" +
                        "When putting in the 5 fish into the pond, remember you are placing them in one at a time and not the entire stack of fish at once.\n\n" +
                        "After you have the pieces in place, talk to Paolo at the lighthouse to start the process. The egg will roll down Hamilton's roof, bounce off a tent, " +
                        "land in the aqueduct, roll down to the scale, which shoots the pearl up into the air and off the wind sock. The pearl will land in the school of fish, " +
                        "who become startled and swim down the aqueduct, landing on a series of piano keys which plays a little tune.\n\n" +
                        "Success! Now head back down to the Watery Cave, where the bell rings out and returns the power of water to the land. You can now catch new kinds of " +
                        "fish and travel by boat to Toucan Island. You'll also unlock the mayor's son, Gill."
        );

        bells.put("green_bell",
                "Now that the water bell has been rung, you can start collecting the pieces necessary for locating the wind bell.\n\n" +
                        "Recap:\n" +
                        "Find the bell pedestal on the top floor of the windmill at Horn Ranch\n" +
                        "Unlock the Forest by talking to Hanna, Cain, and then Dale\n" +
                        "Visit Witch's hut in the Forest\n" +
                        "Talk to Wizard in town, who wants you to collect 3 ingredients\n\n" +
                        "The 3 ingredients Wizard needs for his spell are:\n\n" +

                        "Perfect Butter:\n" +
                        "First you'll need a cow, but since Cain gives you one for free at the beginning of the game this shouldn't be a problem. If you take good care of " +
                        "your cow, eventually you will get Perfect Milk from it. To transform the milk into butter, buy the Butter Maker from Barbara's General Store for 3800 G. " +
                        "The maker will be inside your barn. You just have to put the milk in the maker to produce butter.\n" +
                        "You can also buy Perfect Butter from the Spring 28 Animal Festival. Go to Hanna's booth to buy it for 740 G. Perfect Sheep Butter will also work instead of " +
                        "Perfect Butter.\n\n" +

                        "Good Cornmeal:\n" +
                        "During the Summer season grow corn on your farm. You can buy the seeds from Taylor's telephone shop for 200 G per bag. To unlock Taylor, buy a telephone from " +
                        "Barbara's shop and place it in your house. Good quality is only one step up from Decent, so you won't really need any fertilizer.\n" +
                        "After you grow a piece of Good, Perfect, or Shining Corn, go to the waterwheel in Flute Fields. The wheel is just right after the bridge, and there will be a " +
                        "door on the left-side of the building. Once inside, you'll find a bucket where you can grind various items like Corn, Wheat, and Buckwheat. If you place your " +
                        "Good Corn in the grinder you will create Cornmeal. On rainy days the quality of items produced will decrease at the Waterwheel; your Good Corn may " +
                        "turn into Decent Cornmeal.\n" +
                        "If you have upgraded Marimba Farm to level 2 by shipping at least 30,000 G worth of crops, Ruth will have Decent Corn for sale year round for 320 G. " +
                        "Once her shop upgrades to level 3 (ship at least 80,000 G worth of crops) she will have Good Corn for 380 G.\n" +
                        "Since using the Waterwheel on rainy days will decrease the quality of items processed, you can increase the quality by using the wheel during snowstorm weather. " +
                        "The Decent Corn you buy from Ruth's shop will become Good Cornmeal during these days.\n" +
                        "Wizard will accept Perfect or Shining Cornmeal as well.\n\n" +

                        "Hibiscus:\n" +
                        "Before you can take the boat to Toucan Island, you need to buy a Boat Ticket from Ozzie for 400 G. Give the ticket to Pascal out on the dock. The captain will take you to the island.\n" +
                        "On the island you'll find the Pineapple Inn. Watch the scene of Selena fighting with her parents. Samson apologizes to you for having to watch his family's disagreement. He used to " +
                        "be able to sell Hibiscus but he can't with all this fighting going on.\n" +
                        "Talk to Selena out on the beach and watch her dance! You can't spend all day at Toucan Island, " +
                        "so talk to Pascal to return back to Harmonica Town without the required flower.\n" +
                        "After you get off the boat you'll discover a stowaway! Selena had snuck aboard the boat and is delighted to finally be somewhere else other than her little island. " +
                        "She runs off to explore Harmonica Town.\n" +
                        "You'll find Selena at Hayden's Brass Bar, where she has gotten a job as an entertainment dancer. Selena does feel bad about the fight with her mom, and gives you a " +
                        "letter to take back to Sue.\n" +
                        "Buy another 400 G boat ticket and head back to Toucan Island. Give the letter to Sue and Samson. They are relieved that their daughter is fine and that she'll visit " +
                        "on her days off from working at the bar. Samson will reward you with a Hibiscus flower, and the seeds will now be for sale at his shop for 40 G a bag.\n\n" +
                        "Bring the 3 ingredients back to Wizard. The two of you travel to Witch's hut and after a few magic words, Witch is turned back to normal. She is glad to be " +
                        "back to normal, but then suddenly turns on the Wizard! Witch is angry that he had taken so long to turn her back from a frog. Wizard tried to explain that he warned her " +
                        "about the spell, but she still kicks him out of her house. You, the Wiz, and Finn all escape her house but Finn remembers that you are suppose to ask her about the Green Bell.\n\n" +
                        "After she learns that you weren't really with the Wizard, Witch is a little easier to talk to. She thinks for a moment, and says she does have something green in her " +
                        "collection of items. Witch takes a look around and pulls out several green items until she finds the bell.\n\n" +
                        "Return the bell to the frame inside the windmill on Horn Ranch, and ask Daren to ring it. After the Harvest Sprite rings his bell the power of wind returns to Castanet.\n\n" +
                        "Once Daren leaves to go to the Goddess' Spring, Gill makes an appearance. He's surprised that you, were able to get the Green Bell to ring. " +
                        "Gill thanks you for helping out, and tells you to ask him if you have any questions."
        );

        bells.put("purple_bell",
                "The Harvest Goddess hints that the Purple Bell's pedestal is somewhere high. You know it's not in the lighthouse, so the other high place on Castanet is the Celesta Church.\n\n" +
                        "Go to the church and ask Perry if he's heard of any stories about the church. He says that around 2:00 am at night there is a strange voice that is heard " +
                        "crying somewhere in the building.\n\n" +
                        "Return to the church around 2 o'clock in the morning and you'll bump into Perry as he is running out of the church! Something has scared him off. " +
                        "Check out the door to the right of the alter.\n\n" +
                        "It looks like you've found Edge and the Purple Bell! The strange voice Perry was talking about was Edge's crying. Edge can't ask the bell to ring " +
                        "because the bell's power is run by people's wishes. No one goes to the Wishing Shrine anymore, so the bell won't ring. The Whishing Strine can be " +
                        "found through the door on the left-side of the alter.\n\n" +
                        "The painting on the wall doesn't seem to be anything special. Finn tries to make a wish of his own but the fresco doesn't appear to actually grant any wishes. " +
                        "It's best to ask the Goddess.\n\n" +
                        "The Harvest Goddess says the shrine was a gift to Edge to help him with his loneliness. The bell's spirit is tied to Edge's heart, and so it won't ring if the " +
                        "people don't the shrine their wishes. Since everyone is too busy to go to the shrine themselves, Goddess suggests you talk to everyone in Castanet to " +
                        "hear their wish and then go talk to the Wishing Shrine for them.\n\n" +
                        "In order to hear other people's wishes, you have to raise their friendship up to at least 3 hearts. When you talk to the person he or she will tell you " +
                        "what their wish is.\n\n" +
                        "Once you've heard a wish, return to the Wishing Shrine at the church between 6am and 6pm. Press A in front of the picture and you'll get a list of all the " +
                        "villagers you know. People who have told you their wish will have a red-colored clover next to their names. Select the person, you'll earn a mark on the " +
                        "top-half of the shrine painting, and the clover icon will turn green so you can't select them a second time.\n\n" +
                        "You have to fill in all 10 marks on the wall, so you need to listen to 10 people's wishes.\n\n" +
                        "When you've finished filling in the mural's dots, return to Edge and talk to him. Now he's so happy that he is still crying! Once the Purple Bell rings out, " +
                        "return to the Goddess' Pond.\n\n" +
                        "You can continue to collect wishes from the villagers. Once you have all of the wishes for every character in your game you'll be rewarded with the wish trophy for your house."
        );
    }
}
