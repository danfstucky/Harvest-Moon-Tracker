package com.danfstuckygmail.harvestmoontracker.crops;

/**
 * Created by Dan on 7/10/2016.
 */
public class SummerCropData {
    private final String season = CropSeasonEnum.SUMMER.getSeason();
    private Crop[] summer_crops;

    public SummerCropData() {
        this.summer_crops = initializeData();
    }

    public Crop[] getSummerCrops() {
        return summer_crops;
    }

    public Crop[] initializeData() {
        // Corn
        Crop corn = new Crop("Corn", season);
        corn.setSeeds("100 G at Marimba Farm, Lv 2");
        corn.setDays("5 to 9 days");
        corn.setRegrows("Yes");
        corn.setSales(new String[]{ "160 G", "1900 G", "210 G", "310 G" });

        // Cucumber
        Crop cucumber = new Crop("Cucumber", season);
        cucumber.setSeeds("30 G at Marimba Farm, Lv 1");
        cucumber.setDays("5 days");
        cucumber.setRegrows("No");
        cucumber.setSales(new String[]{ "160 G", "190 G", "220 G", "330 G" });

        // Honeydew
        Crop honeydew = new Crop("Honeydew", season);
        honeydew.setSeeds("40 G at Marimba Farm, Lv 4");
        honeydew.setDays("5 to 9 days");
        honeydew.setRegrows("No");
        honeydew.setSales(new String[]{ "250 G", "300 G", "450 G", "640 G" });

        // Onion
        Crop onion = new Crop("Onion", season);
        onion.setSeeds("30 G at Marimba Farm, Lv 1");
        onion.setDays("5 days");
        onion.setRegrows("No");
        onion.setSales(new String[]{ "170 G", "200 G", "230 G", "340 G" });

        // Sugarcane
        Crop sugarcane = new Crop("Sugarcane", season);
        sugarcane.setSeeds("40 G at Marimba Farm, Lv 1");
        sugarcane.setDays("5 days");
        sugarcane.setRegrows("No");
        sugarcane.setSales(new String[]{ "160 G", "190 G", "220 G", "330 G" });

        // Tea Leaves
        Crop tea_leaves = new Crop("Tea Leaves", season);
        tea_leaves.setSeeds("50 G at Marimba Farm, Lv 1");
        tea_leaves.setDays("3 days");
        tea_leaves.setRegrows("No");
        tea_leaves.setSales(new String[]{ "170 G", "200 G", "230 G", "360 G" });

        // Tomato
        Crop tomato = new Crop("Tomato", season);
        tomato.setSeeds("100 G at Marimba Farm, Lv 1");
        tomato.setDays("5 to 7 days");
        tomato.setRegrows("Yes");
        tomato.setSales(new String[]{ "160 G", "190 G", "210 G", "320 G" });

        // Watermelon
        Crop watermelon = new Crop("Watermelon", season);
        watermelon.setSeeds("30 G at Marimba Farm, Lv 1");
        watermelon.setDays("5 to 7 days");
        watermelon.setRegrows("No");
        watermelon.setSales(new String[]{ "210 G", "250 G", "290 G", "410 G" });

        // Blue Herb
        Crop blue_herb = new Crop("Blue Herb", season);
        blue_herb.setSeeds("20 G at Marimba Farm, Lv 1");
        blue_herb.setDays("3 to 5 days");
        blue_herb.setRegrows("No");
        blue_herb.setSales(new String[]{ "30 G", "30 G", "30 G", "30 G" });

        // Green Herb
        Crop green_herb = new Crop("Green Herb", season);
        green_herb.setSeeds("20 G at Marimba Farm, Lv 1");
        green_herb.setDays("3 to 5 days");
        green_herb.setRegrows("No");
        green_herb.setSales(new String[]{ "30 G", "30 G", "30 G", "30 G" });

        // Begonia
        Crop begonia = new Crop("Begonia", season);
        begonia.setSeeds("40 G at Marimba Farm, Lv 3");
        begonia.setDays("3 to 5 days");
        begonia.setRegrows("No");
        begonia.setSales(new String[]{ "110 G", "110 G", "110 G", "110 G" });

        // Hibiscus
        Crop hibiscus = new Crop("Hibiscus", season);
        hibiscus.setSeeds("40 G Toucan Inn");
        hibiscus.setDays("3 to 5 days");
        hibiscus.setRegrows("No");
        hibiscus.setSales(new String[]{ "210 G", "210 G", "210 G", "210 G" });

        // Lily
        Crop lily = new Crop("Lily", season);
        lily.setSeeds("20 G at Marimba Farm, Lv 1");
        lily.setDays("3 to 5 days");
        lily.setRegrows("No");
        lily.setSales(new String[]{ "140 G", "140 G", "140 G", "140 G" });

        // Morning Glory
        Crop morning_glory= new Crop("Morning Glory", season);
        morning_glory.setSeeds("20 G at Marimba Farm");
        morning_glory.setDays("3 to 5 days");
        morning_glory.setRegrows("No");
        morning_glory.setSales(new String[]{ "120 G", "120 G", "120 G", "120 G" });


        return new Crop[] { corn, cucumber, honeydew, onion, sugarcane, tea_leaves, tomato, watermelon, blue_herb, green_herb,
            begonia, hibiscus, lily, morning_glory };
    }
}
