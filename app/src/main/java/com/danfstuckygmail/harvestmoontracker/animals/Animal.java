package com.danfstuckygmail.harvestmoontracker.animals;

/**
 * Created by Dan on 6/23/2016.
 */
public class Animal {
    private String type;
    private String name;
    private String info;


    public Animal(String type, String name) {
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


}
