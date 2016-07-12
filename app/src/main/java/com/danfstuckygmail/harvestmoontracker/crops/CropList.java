package com.danfstuckygmail.harvestmoontracker.crops;

/**
 * Created by Dan on 7/10/2016.
 */
public class CropList {

    private static CropList singleton;
    private Crop[] spring_crops_list;
    private Crop[] summer_crops_list;
    private Crop[] fall_crops_list;
    private Crop[] winter_crops_list;

    private CropList() {
        this.spring_crops_list = new SpringCropData().getSpringCrops();
        this.summer_crops_list = new SummerCropData().getSummerCrops();
        this.fall_crops_list = new FallCropData().getFallCrops();
        this.winter_crops_list = new WinterCropData().getWinterCrops();
    }

    public static CropList instance() {
        if (singleton == null) {
            singleton = new CropList();
        }
        return singleton;
    }

    public Crop[] getSpringCrops() {
        return this.spring_crops_list;
    }

    public Crop[] getSummerCrops() {
        return summer_crops_list;
    }

    public Crop[] getFallCrops() {
        return fall_crops_list;
    }

    public Crop[] getWinterCrops() {
        return winter_crops_list;
    }

    public Crop findCrop(CropSeasonEnum season, String name) {
        Crop[] searchList;
        if (season == CropSeasonEnum.SPRING) {
            searchList = spring_crops_list;
        } else if (season == CropSeasonEnum.SUMMER){
            searchList = summer_crops_list;
        } else if (season == CropSeasonEnum.FALL){
            searchList = fall_crops_list;
        } else {
            searchList = winter_crops_list;
        }
        for (Crop crop : searchList) {
            if (crop.getName().equals(name)) {
                return crop;
            }
        }
        return spring_crops_list[0];
    }
}
