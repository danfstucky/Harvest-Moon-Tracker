package com.danfstuckygmail.harvestmoontracker.crops;

/**
 * Created by Dan on 7/10/2016.
 */
public class FallCropData {
    private final String season = CropSeasonEnum.FALL.getSeason();
    private Crop[] fall_crops;

    public FallCropData() {
        this.fall_crops = initializeData();
    }

    public Crop[] getFallCrops() {
        return fall_crops;
    }

    public Crop[] initializeData() {
        // Carrot
        Crop carrot = new Crop("Carrot", season);
        carrot.setSeeds("30 G at Marimba Farm, Lv 1");
        carrot.setDays("5 to 6 days");
        carrot.setRegrows("No");
        carrot.setSales(new String[]{ "180 G", "220 G", "260 G", "380 G" });

        // Eggplant
        Crop eggplant = new Crop("Eggplant", season);
        eggplant.setSeeds("80 G at Marimba Farm, Lv 1");
        eggplant.setDays("5 days");
        eggplant.setRegrows("Yes");
        eggplant.setSales(new String[]{ "130 G", "150 G", "180 G", "270 G" });

        // Grape
        Crop grape = new Crop("Grape", season);
        grape.setSeeds("30 G at Marimba Farm, Lv 2");
        grape.setDays("5 days");
        grape.setRegrows("No");
        grape.setSales(new String[]{ "120 G", "140 G", "160 G", "290 G" });

        // Pepper
        Crop pepper = new Crop("Pepper", season);
        pepper.setSeeds("100 G at Marimba Farm, Lv 3");
        pepper.setDays("5 to 6 days");
        pepper.setRegrows("Yes");
        pepper.setSales(new String[]{ "160 G", "190 G", "220 G", "320 G" });

        // Pumpkin
        Crop pumpkin = new Crop("Pumpkin", season);
        pumpkin.setSeeds("90 G at Marimba Farm, Lv 1");
        pumpkin.setDays("6 to 10 days");
        pumpkin.setRegrows("Yes");
        pumpkin.setSales(new String[]{ "150 G", "180 G", "210 G", "310 G" });

        // Rice
        Crop rice = new Crop("Rice", season);
        rice.setSeeds("30 G at Marimba Farm, Lv 3");
        rice.setDays("5 days");
        rice.setRegrows("No");
        rice.setSales(new String[]{ "210 G", "250 G", "290 G", "400 G" });

        // Spinach
        Crop spinach = new Crop("Spinach", season);
        spinach.setSeeds("30 G at Marimba Farm, Lv 1");
        spinach.setDays("5 days");
        spinach.setRegrows("No");
        spinach.setSales(new String[]{ "180 G", "220 G", "270 G", "400 G" });

        // Yam
        Crop yam = new Crop("Yam", season);
        yam.setSeeds("90 G at Marimba Farm, Lv 1");
        yam.setDays("5 to 8 days");
        yam.setRegrows("Yes");
        yam.setSales(new String[]{ "130 G", "160 G", "180 G", "260 G" });

        // Purple Herb
        Crop purple_herb = new Crop("Purple Herb", season);
        purple_herb.setSeeds("20 G at Marimba Farm, Lv 2");
        purple_herb.setDays("3 to 5 days");
        purple_herb.setRegrows("No");
        purple_herb.setSales(new String[]{ "30 G", "30 G", "30 G", "30 G" });

        // Red Herb
        Crop red_herb = new Crop("Red Herb", season);
        red_herb.setSeeds("20 G at Marimba Farm, Lv 2");
        red_herb.setDays("3 to 5 days");
        red_herb.setRegrows("No");
        red_herb.setSales(new String[]{ "50 G", "50 G", "50 G", "50 G" });

        // Bluemist Flower
        Crop bluemist_flower = new Crop("Bluemist Flower", season);
        bluemist_flower.setSeeds("50 G at Marimba Farm, Lv 3");
        bluemist_flower.setDays("3 to 7 days");
        bluemist_flower.setRegrows("No");
        bluemist_flower.setSales(new String[]{ "39 G", "390 G", "390 G", "390 G" });

        // Cosmos
        Crop cosmos = new Crop("Cosmos", season);
        cosmos.setSeeds("20 G at Marimba Farm, Lv 1");
        cosmos.setDays("3 days");
        cosmos.setRegrows("No");
        cosmos.setSales(new String[]{ "100 G", "100 G", "100 G", "100 G" });

        // Crystanthemum
        Crop crystanthemum = new Crop("Crystanthemum", season);
        crystanthemum.setSeeds("20 G at Marimba Farm, Lv 4");
        crystanthemum.setDays("3 to 5 days");
        crystanthemum.setRegrows("No");
        crystanthemum.setSales(new String[]{ "90 G", "90 G", "90 G", "90 G" });

        // Moondrop Flower
        Crop moondrop = new Crop("Moondrop Flower", season);
        moondrop.setSeeds("20 G at Marimba Farm, Lv 4");
        moondrop.setDays("3 days");
        moondrop.setRegrows("No");
        moondrop.setSales(new String[]{ "120 G", "120 G", "120 G", "120 G" });

        // Rose
        Crop rose = new Crop("Rose", season);
        rose.setSeeds("30 G at Marimba Farm, Lv 4");
        rose.setDays("3 to 5 days");
        rose.setRegrows("No");
        rose.setSales(new String[]{ "220 G", "220 G", "220 G", "220 G" });

        return new Crop[] { carrot, eggplant, grape, pepper, pumpkin, rice, spinach, yam, purple_herb, red_herb, bluemist_flower,
            cosmos, crystanthemum, moondrop, rose };
    }
}
