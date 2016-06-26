package com.danfstuckygmail.harvestmoontracker.animals;

/**
 * Created by Dan on 6/23/2016.
 */
public class Pet extends Animal {
    private String season;
    private String location;
    private String speed;
    private String[] goodGifts;
    private String[] badGifts;

    public Pet(String type, String name) {
        super(type, name);
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String[] getGoodGifts() {
        return goodGifts;
    }

    public void setGoodGifts(String[] goodGifts) {
        this.goodGifts = goodGifts;
    }

    public String[] getBadGifts() {
        return badGifts;
    }

    public void setBadGifts(String[] badGifts) {
        this.badGifts = badGifts;
    }


    public String goodGiftsDisplay() {
        StringBuilder sb = new StringBuilder();
        int end = goodGifts.length - 1;
        for (int i=0; i<=end; i++) {
            sb.append(goodGifts[i]);
            if (i != end) { sb.append(", "); }
        }
        return sb.toString();
    }

    public String badGiftsDisplay() {
        StringBuilder sb = new StringBuilder();
        int end = badGifts.length - 1;
        for (int i=0; i<=end; i++) {
            sb.append(badGifts[i]);
            if (i != end) { sb.append(", "); }
        }
        return sb.toString();
    }
}
