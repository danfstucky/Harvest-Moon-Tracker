package com.danfstuckygmail.harvestmoontracker.animals;

/**
 * Created by Dan on 6/23/2016.
 */
public class Circus extends Animal {
    private String location;
    private String recipe;

    public Circus(String type, String name) {
        super(type, name);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }
}
