package com.danfstuckygmail.harvestmoontracker.animals;

import java.util.HashMap;

/**
 * Created by Dan on 6/23/2016.
 */
public class Farm extends Animal {
    private String produces;
    private String pregnancy;
    private String lifespan;
    private HashMap<String, String[]> sales;

    public Farm(String type, String name) {
        super(type, name);
        sales = new HashMap<>();
    }

    public String getProduces() {
        return produces;
    }

    public void setProduces(String produces) {
        this.produces = produces;
    }

    public String getPregnancy() {
        return pregnancy;
    }

    public void setPregnancy(String pregnancy) {
        this.pregnancy = pregnancy;
    }

    public String getLifespan() {
        return lifespan;
    }

    public void setLifespan(String lifespan) {
        this.lifespan = lifespan;
    }

    public HashMap<String, String[]> getSales() {
        return sales;
    }

    public void addSale(String sale, String[] value){
        sales.put(sale, value);
    }
}
