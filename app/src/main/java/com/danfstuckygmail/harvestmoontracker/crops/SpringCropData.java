package com.danfstuckygmail.harvestmoontracker.crops;

/**
 * Created by Dan on 7/10/2016.
 */
public class SpringCropData {
    private final String season = CropSeasonEnum.SPRING.getSeason();
    private Crop[] spring_crops;

    public SpringCropData() {
        this.spring_crops = initializeData();
    }

    public Crop[] getSpringCrops() {
        return spring_crops;
    }

    public Crop[] initializeData() {
        // Cabbage
        Crop cabbage = new Crop("Cabbage", season);
        cabbage.setSeeds("30 G at Marimba Farm");
        cabbage.setDays("5 to 7 days");
        cabbage.setRegrows("No");
        cabbage.setSales(new String[]{ "190 G", "220 G", "250 G", "390 G" });

        // Chili Pepper
        Crop chili_pepper = new Crop("Chili Pepper", season);
        chili_pepper.setSeeds("40 G at Toucan Inn");
        chili_pepper.setDays("5 days");
        chili_pepper.setRegrows("No");
        chili_pepper.setSales(new String[]{ "160 G", "190 G", "210 G", "330 G" });

        // Cocoa Fruit
        Crop cocoa_fruit = new Crop("Cocoa Fruit", season);
        cocoa_fruit.setSeeds("140 G at Toucan Inn");
        cocoa_fruit.setDays("5 to 8 days");
        cocoa_fruit.setRegrows("Yes");
        cocoa_fruit.setSales(new String[]{ "140 G", "160 G", "180 G", "270 G" });

        // Flax
        Crop flax = new Crop("Flax", season);
        flax.setSeeds("30 G at Marimba Farm");
        flax.setDays("5 to 6 days");
        flax.setRegrows("No");
        flax.setSales(new String[]{ "110 G", "170 G", "220 G", "330 G" });

        // Lettuce
        Crop lettuce = new Crop("Lettuce", season);
        lettuce.setSeeds("40 G at Marimba Farm");
        lettuce.setDays("5 days");
        lettuce.setRegrows("No");
        lettuce.setSales(new String[]{ "220 G", "250 G", "280 G", "390 G" });

        // Potato
        Crop potato = new Crop("Potato", season);
        potato.setSeeds("30 G at Marimba Farm");
        potato.setDays("5 to 6 days");
        potato.setRegrows("No");
        potato.setSales(new String[]{ "190 G", "220 G", "240 G", "360 G" });

        // Strawberry
        Crop strawberry = new Crop("Strawberry", season);
        strawberry.setSeeds("110 G at Marimba Farm");
        strawberry.setDays("6 to 7 days");
        strawberry.setRegrows("Yes");
        strawberry.setSales(new String[]{ "180 G", "220 G", "270 G", "410 G" });

        // Turnip
        Crop turnip = new Crop("Turnip", season);
        turnip.setSeeds("30 G at Marimba Farm");
        turnip.setDays("5 to 6 days");
        turnip.setRegrows("No");
        turnip.setSales(new String[]{ "170 G", "200 G", "230 G", "340 G" });

        // Wheat
        Crop wheat = new Crop("Wheat", season);
        wheat.setSeeds("80 G at Marimba Farm");
        wheat.setDays("5 to 7 days");
        wheat.setRegrows("Yes");
        wheat.setSales(new String[]{ "130 G", "150 G", "170 G", "260 G" });

        // Hyacinth
        Crop hyacinth = new Crop("Hyacinth", season);
        hyacinth.setSeeds("20 G at Marimba Farm");
        hyacinth.setDays("3 to 5 days");
        hyacinth.setRegrows("No");
        hyacinth.setSales(new String[]{ "120 G", "120 G", "120 G", "120 G" });

        // Lavender
        Crop lavender = new Crop("Lavender", season);
        lavender.setSeeds("20 G at Marimba Farm");
        lavender.setDays("3 to 5 days");
        lavender.setRegrows("No");
        lavender.setSales(new String[]{ "100 G", "100 G", "100 G", "100 G" });

        // Pansy
        Crop pansy = new Crop("Pansy", season);
        pansy.setSeeds("20 G at Marimba Farm");
        pansy.setDays("3 to 5 days");
        pansy.setRegrows("No");
        pansy.setSales(new String[]{ "90 G", "90 G", "90 G", "90 G" });

        // Pinkcat Flower
        Crop pinkcat = new Crop("Pinkcat Flower", season);
        pinkcat.setSeeds("20 G at Marimba Farm");
        pinkcat.setDays("3 to 5 days");
        pinkcat.setRegrows("No");
        pinkcat.setSales(new String[]{ "120 G", "120 G", "120 G", "120 G" });

        // Tulip
        Crop tulip = new Crop("Tulip", season);
        tulip.setSeeds("20 G at Marimba Farm");
        tulip.setDays("3 to 5 days");
        tulip.setRegrows("No");
        tulip.setSales(new String[]{ "110 G", "110 G", "110 G", "110 G" });

        return new Crop[] { cabbage, chili_pepper, cocoa_fruit, flax, lettuce, potato, strawberry, turnip, wheat,
            hyacinth, lavender, pansy, pinkcat, tulip };
    }
}
