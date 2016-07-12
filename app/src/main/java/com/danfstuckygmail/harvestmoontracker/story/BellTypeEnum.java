package com.danfstuckygmail.harvestmoontracker.story;

/**
 * Created by Dan on 7/9/2016.
 */
public enum BellTypeEnum {
    RED("red_bell"), YELLOW("yellow_bell"), BLUE("blue_bell"), GREEN("green_bell"), PURPLE("purple_bell");
    private String color;

    BellTypeEnum(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
