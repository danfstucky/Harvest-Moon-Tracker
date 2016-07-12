package com.danfstuckygmail.harvestmoontracker.crops;

/**
 * Created by Dan on 7/10/2016.
 */
public enum CropSeasonEnum {

    SPRING("Spring"), SUMMER("Summer"), FALL("Fall"), WINTER("Winter");

    private String season;

    CropSeasonEnum(String season) {
        this.season = season;
    }

    public String getSeason() {
        return season;
    }
}
