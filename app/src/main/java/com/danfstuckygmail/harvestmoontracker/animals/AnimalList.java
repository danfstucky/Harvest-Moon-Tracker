package com.danfstuckygmail.harvestmoontracker.animals;


/**
 * Created by Dan on 6/23/2016.
 */
public class AnimalList {
    private static AnimalList singleton;
    private Farm[] farm_list;
    private Pet[] pet_list;
    private Circus[] circus_list;

    private AnimalList() {
        this.farm_list = new FarmData().getFarmAnimals();
        this.pet_list = new PetData().getPets();
        this.circus_list = new CircusData().getCircusAnimals();
    }

    public static AnimalList instance() {
        if (singleton == null) {
            singleton = new AnimalList();
        }
        return singleton;
    }

    public Farm[] getFarmAnimals() {
        return farm_list;
    }

    public Animal[] getPets() {
        return pet_list;
    }

    public Animal[] getCircusAnimals() {
        return circus_list;
    }

    public Farm findFarmAnimal(String name) {
        for (Farm animal : farm_list) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return farm_list[0];
    }

    public Pet findPet(String name) {
        for (Pet animal : pet_list) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return pet_list[0];
    }

    public Circus findCircusAnimal(String name) {
        for (Circus animal : circus_list) {
            if (animal.getName().equals(name)) {
                return animal;
            }
        }
        return circus_list[0];
    }
}
