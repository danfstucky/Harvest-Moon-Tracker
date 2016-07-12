package com.danfstuckygmail.harvestmoontracker.animals;

/**
 * Created by Dan on 6/23/2016.
 */
public class FarmData {
    private final String type = AnimalGroups.FARMANIMALS.getName();
    private Farm[] farm_animals;

    public FarmData() {
        this.farm_animals = initializeData();
    }

    public Farm[] getFarmAnimals() {
        return farm_animals;
    }

    public Farm[] initializeData() {
        // Cow
        Farm cow = new Farm(type, "Cow");
        cow.setInfo("Cows are your simplest livestock animal. They will produce Milk once a day.\n" +
                "You can take the milk and convert it into Cheese or Butter. The maker machines are sold by Barbara at her General Store. Cheese and Butter sell for the same amount " +
                "of profit.");
        cow.setProduces("Milk daily");
        cow.setPregnancy("14 days, adult in 15 days");
        cow.setLifespan("2 and a half years");
        cow.addSale("Milk", new String[]{ "170 G", "260 G", "340 G", "510 G" });
        cow.addSale("Butter", new String[]{ "190 G", "280 G", "370 G", "560 G" });
        cow.addSale("Cheese", new String[]{ "190 G", "280 G", "370 G", "560 G" });

        // Sheep
        Farm sheep = new Farm(type, "Sheep");
        sheep.setInfo("The sheep produces two different kind of products. Wool can be collected with the Clippers, and Milk by using the Milker. Even if the sheep doesn't have any wool, " +
                "you can still ride it around Castanet.\nSheep are the only livestock animal that produce two different types of items. You can also take the Wool, change it to Yarn, " +
                "and then dye the Yarn with the Dyepot in your kitchen. It is good to ship the dyed Yarn if you are stuck with Decent quality, but you'll loose money if you dye yarn that is higher than Decent.\n" +
                "You can buy the Yarn Maker at Barbara's General Store for 4500 G after you upgrade your Coop or Barn to level 3. The Dyepot is 3600 G and can also be found at Barbara's shop.");
        sheep.setProduces("Wool and Milk every 4 days");
        sheep.setPregnancy("7 days, adult in 15 days");
        sheep.setLifespan("2 years");
        sheep.addSale("Sheep Milk", new String[]{ "120 G", "210 G", "290 G", "460 G" });
        sheep.addSale("Sheep Butter", new String[]{ "130 G", "230 G", "320 G", "510 G" });
        sheep.addSale("Sheep Cheese", new String[]{ "130 G", "230 G", "320 G", "510 G" });
        sheep.addSale("Wool", new String[]{ "620 G", "920 G", "1220 G", "1820 G" });
        sheep.addSale("Yarn", new String[]{ "680 G", "1010 G", "1340 G", "2000 G" });

        // Horse
        Farm horse = new Farm(type, "Horse");
        horse.setInfo("Horses are the fastest riding livestock animal you can have. It is good to have a horse for travel if you haven't found all 3 of Theodore's circus friends.\n" +
                "The only money you'll earn from Horses is if you breed and sell the offspring. The Horse Miracle Potion costs 1200 G.");
        horse.setProduces("Nothing");
        horse.setPregnancy("14 days, adult in 15 days");
        horse.setLifespan("3 years");

        // Goat
        Farm goat = new Farm(type, "Goat");
        goat.setInfo("Just like cows, goats will produce milk every day. Goats are faster runners than cows though, and they're just cuter!");
        goat.setProduces("Milk");
        goat.setPregnancy("7 days, adult in 15 days");
        goat.setLifespan("2 and a half years");
        goat.addSale("Goat Milk", new String[]{ "140 G", "230 G", "310 G", "480 G" });
        goat.addSale("Goat Butter", new String[]{ "150 G", "250 G", "340 G", "530 G" });
        goat.addSale("Goat Cheese", new String[]{ "150 G", "250 G", "340 G", "530 G" });

        // Ostrich
        Farm ostrich = new Farm(type, "Ostrich");
        ostrich.setInfo("The ostrich is a large bird that won't fit in your poultry barn. Instead it takes up room in your livestock barn, and lays 1 egg every 7 days! " +
                "Ostriches run faster than goats, but not as fast as horses.");
        ostrich.setProduces("Egg");
        ostrich.setPregnancy("14 days, adult in 15 days");
        ostrich.setLifespan("3 years");
        ostrich.addSale("Ostrich Egg", new String[]{ "350 G", "530 G", "700 G", "1050 G" });
        ostrich.addSale("Ostrichonaise", new String[]{ "450 G", "450 G", "450 G", "450 G" });

        // Chicken
        Farm chicken = new Farm(type, "Chicken");
        chicken.setInfo("You can purchase chicks from Horn Ranch for 1000 G a piece. An alternative way to obtain chicks at the start of the game is to buy the Incubator " +
                "machine from Barbara for 1000 G, and then just buy a Decent Egg from Horn Ranch for 100 G. Put the Decent Egg in the Incubator and after 7 " +
                "days you'll have a chick.\nThe adult birds also need to be fed Bird Feed every day. " +
                "If they aren't fed then they will not lay any eggs. The birds will only lay eggs if they are inside the poultry barn so make sure you bring " +
                "them back inside when you are ready to go to bed for the night.\n\n" +
                "You can convert the eggs into Mayonnaise by upgrading your barn to level 2 and then you can buy the Mayonnaise Maker from Barbara for 3000 G. Any quality of " +
                "chicken egg you place in the maker will result in the same quality of mayo.");
        chicken.setProduces("Egg daily");
        chicken.setPregnancy("7 days to hatch, adult in 7 days");
        chicken.setLifespan("2 years");
        chicken.addSale("Chicken Egg", new String[]{ "50 G", "80 G", "100 G", "150 G" });
        chicken.addSale("Mayonnaise", new String[]{ "80 G", "100 G", "130 G", "190 G" });

        // Duck
        Farm duck = new Farm(type, "Duck");
        duck.setInfo("You can purchase ducklings from Horn Ranch for 800 G a piece. An alternative way to obtain ducklings at the start of the game is to buy the Incubator " +
                "machine from Barbara for 1000 G, and then just buy a Decent Duck Egg from Horn Ranch for 100 G. Put the Decent Egg in the Incubator and after 7 " +
                "days you'll have a duckling. You can't buy a Decent Duck Egg until the ranch upgrades to level 2.\nThe adult birds also need to be fed Bird Feed every day. " +
                "If they aren't fed then they will not lay any eggs. The birds will only lay eggs if they are inside the poultry barn so make sure you bring " +
                "them back inside when you are ready to go to bed for the night.\n\n" +
                "You can convert the eggs into Duck Mayonnaise by upgrading your barn to level 2 and then you can buy the Mayonnaise Maker from Barbara for 3000 G. Duck eggs " +
                "will lose their quality when converted into mayonnaise! Only change Decent, Good, and Perfect Duck Eggs into Duck Mayonnaise.");
        duck.setProduces("Egg every two days");
        duck.setPregnancy("7 days to hatch, adult in 7 days");
        duck.setLifespan("2 years");
        duck.addSale("Duck Egg", new String[]{ "80 G", "120 G", "160 G", "240 G" });
        duck.addSale("Duck Mayo", new String[]{ "140 G", "140 G", "140 G", "140 G" });

        // Silkworm
        Farm silkworm = new Farm(type, "Silkworm");
        silkworm.setInfo("Silkworms can only be purchased from Hannah at Horn Ranch after you have upgraded your poultry barn to level 3. A level 3 barn from Dale will cost you 50 Material Stone, 50 Lumber, and 45,000 G.\n" +
                "\n" +
                "Once your barn has been upgrade, you can buy the adult worms at Horn Ranch for 4000 G a piece. You can only hold 4 Silkworms in your barn and there is no way to increase that number.\n" +
                "\n" +
                "Each day you'll had to hand feed each worm some of the Bird Feed. You can raise their affection by petting them on the head, but you can not pick them up like in Tree of Tranquility. They will never leave the barn.");
        silkworm.setProduces("One silk every 4 days");
        silkworm.setPregnancy("None");
        silkworm.setLifespan("1 and a half years");
        silkworm.addSale("Silk", new String[]{ "660 G", "990 G", "1320 G", "1980 G" });
        silkworm.addSale("Silk Yarn", new String[]{ "735 G", "1090 G", "1450 G", "2180 G" });


        // Create and return array of bachelors
        return new Farm[] { cow, sheep, horse, goat, ostrich, chicken, duck, silkworm };
    }
}
