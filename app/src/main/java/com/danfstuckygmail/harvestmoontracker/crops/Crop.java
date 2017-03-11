package com.danfstuckygmail.harvestmoontracker.crops;

/**
 * Created by Dan on 7/10/2016.
 */
public class Crop {
    private String name;
    private String season;
    private String seeds;
    private String days;
    private String regrows;
    private String[] sales;

    public Crop(String name, String season) {
        this.name = name;
        this.season = season;
        sales = new String[4];
    }

    public String getName() {
        return this.name;
    }

    public String getSeeds() {
        return seeds;
    }

    public void setSeeds(String seeds) {
        this.seeds = seeds;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getRegrows() {
        return regrows;
    }

    public void setRegrows(String regrows) {
        this.regrows = regrows;
    }

    // Sales are ordered in array as Decent, Good, Perfect, Shining
    public String[] getSales() {
        return sales;
    }

    public void setSales(String[] sales) {
        this.sales = sales;
    }
}
