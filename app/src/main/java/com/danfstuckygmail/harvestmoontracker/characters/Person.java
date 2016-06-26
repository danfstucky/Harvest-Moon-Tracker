package com.danfstuckygmail.harvestmoontracker.characters;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Dan on 6/17/2016.
 */
public class Person {
    private String type;
    private String name;
    private String info;
    private String birthday;
    private String[] bestGifts;
    private String[] goodGifts;
    private String[] badGifts;
    private String rival;
    private String[] heartGifts;

    public Person(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String[] getBestGifts() {
        return bestGifts;
    }

    public void setBestGifts(String[] bestGifts) {
        this.bestGifts = bestGifts;
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

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }

    public String[] getHeartGifts() {
        return heartGifts;
    }

    public void setHeartGifts(String[] heartGifts) {
        this.heartGifts = heartGifts;
    }

    public String bestGiftsDisplay() {
        StringBuilder sb = new StringBuilder();
        int end = bestGifts.length - 1;
        for (int i=0; i<=end; i++) {
            sb.append(bestGifts[i]);
            if (i != end) { sb.append(", "); }
        }
        return sb.toString();
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
