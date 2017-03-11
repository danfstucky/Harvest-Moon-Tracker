package com.danfstuckygmail.harvestmoontracker.upgrades;

import java.util.HashMap;

/**
 * Created by Dan on 12/17/2016.
 */

public class Upgrade {
    private String group;
    private String info;
    private HashMap<String, String> supplies;
    private String level;

    public Upgrade(String group) {
        this.group = group;
        supplies = new HashMap<>();
    }

    public String getGroup() {
        return group;
    }

    public String getLevel() { return level; }

    public void setLevel(String level) { this.level = level; }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public HashMap<String, String> getSupplies() {
        return supplies;
    }

    public String getCost() {
        return supplies.get("Cost");
    }

    public String getLumber() {
        return supplies.get("Lumber");
    }

    public String getStone() {
        return supplies.get("Stone");
    }

    public void addSupply(String level, String value){
        supplies.put(level, value);
    }

}
