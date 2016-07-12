package com.danfstuckygmail.harvestmoontracker.crops;

/**
 * Created by Dan on 7/10/2016.
 */
public class WinterCropData {
    private final String season = CropSeasonEnum.WINTER.getSeason();
    private Crop[] winter_crops;

    public WinterCropData() {
        this.winter_crops = initializeData();
    }

    public Crop[] getWinterCrops() {
        return winter_crops;
    }

    public Crop[] initializeData() {
        // Buckwheat
        Crop buckwheat = new Crop("Buckwheat", season);
        buckwheat.setSeeds("30 G at Marimba Farm");
        buckwheat.setDays("5 days");
        buckwheat.setRegrows("No");
        buckwheat.setSales(new String[]{ "190 G", "220 G", "240 G", "340 G" });

        // Yellow Herb
        Crop yellow_herb = new Crop("Yellow Herb", season);
        yellow_herb.setSeeds("20 G at Toucan Inn");
        yellow_herb.setDays("3 to 5 days");
        yellow_herb.setRegrows("No");
        yellow_herb.setSales(new String[]{ "40 G", "40 G", "40 G", "40 G" });

        // Anemone
        Crop anemone = new Crop("Anemone", season);
        anemone.setSeeds("20 G at Marimba Farm");
        anemone.setDays("3 to 5 days");
        anemone.setRegrows("No");
        anemone.setSales(new String[]{ "110 G", "110 G", "110 G", "110 G" });

        // Green Bell Flower
        Crop green_bell = new Crop("Green Bell Flower", season);
        green_bell.setSeeds("20 G at Toucan Inn");
        green_bell.setDays("3 days");
        green_bell.setRegrows("No");
        green_bell.setSales(new String[]{ "110 G", "110 G", "110 G", "110 G" });

        // Snowdrop Flower
        Crop snowdrop = new Crop("Snowdrop Flower", season);
        snowdrop.setSeeds("20 G at Marimba Farm");
        snowdrop.setDays("3 to 5 days");
        snowdrop.setRegrows("No");
        snowdrop.setSales(new String[]{ "150 G", "150 G", "150 G", "150 G" });


        return new Crop[] { buckwheat, yellow_herb, anemone, green_bell, snowdrop };
    }
}
