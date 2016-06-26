package com.danfstuckygmail.harvestmoontracker.animals;

/**
 * Created by Dan on 6/23/2016.
 */
public enum AnimalGroups {
    FARMANIMALS("Farm Animals"), PETS("Pets"), CIRCUSANIMALS("Circus Animals");

    private String name;
    AnimalGroups(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
