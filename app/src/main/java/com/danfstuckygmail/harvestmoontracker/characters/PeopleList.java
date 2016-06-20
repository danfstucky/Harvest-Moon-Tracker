package com.danfstuckygmail.harvestmoontracker.characters;


/**
 * Created by Dan on 6/17/2016.
 */
public class PeopleList {
    private static PeopleList singleton;
    private Person[] bachelors_list;
    private Person[] bachelorettes_list;
    private Person[] villagers_list;

    private PeopleList() {
        this.bachelors_list = new BachelorData().getBachelors();
        this.bachelorettes_list = new BacheloretteData().getBachelorettes();
        this.villagers_list = new VillagerData().getVillagers();
        System.out.println("Created People list.");
    }

    public static PeopleList instance() {
        if (singleton == null) {
            singleton = new PeopleList();
        }
        return singleton;
    }

    public Person[] getBachelors() {
        return this.bachelors_list;
    }

    public Person[] getBachelorettes() {
        return this.bachelorettes_list;
    }

    public Person[] getVillagers() {
        return this.villagers_list;
    }

    public Person findPerson(PeopleEnum.PeopleCategories type, String name) {
        Person[] searchList;
        if (type == PeopleEnum.PeopleCategories.BACHELORS) {
            searchList = bachelors_list;
        } else if (type == PeopleEnum.PeopleCategories.BACHELORETTES){
            searchList = bachelorettes_list;
        } else {
            searchList = villagers_list;
        }
        for (Person person : searchList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return bachelors_list[0];
    }
}
