package com.danfstuckygmail.harvestmoontracker.expandableList;

import com.danfstuckygmail.harvestmoontracker.expandableList.Child;

import java.util.ArrayList;

/**
 * Created by Dan on 6/15/2016.
 */
public class Group {
    private String group_name;
    private int image;
    private ArrayList<Child> people = new ArrayList<Child>();

    public Group(String group_name){
        this.group_name = group_name;
    }

    public String getGroupName() {
        return group_name;
    }

    public ArrayList<Child> getPeople() {
        return people;
    }

    public void setGroupNames(ArrayList<Child> people) {
        this.people = people;
    }
}
