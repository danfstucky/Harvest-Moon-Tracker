package com.danfstuckygmail.harvestmoontracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.danfstuckygmail.harvestmoontracker.animals.*;
import com.danfstuckygmail.harvestmoontracker.expandableList.*;

import java.util.ArrayList;

public class AnimalsActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_ANIMALS = 1;
    private static final String ACTIVITY_TYPE = "ANIMALS";
    private ExpandableListAdapter expAdapter;
    private ArrayList<Group> expListItems;
    private ExpandableListView expandList;
    private AnimalList animalList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);

        expandList = (ExpandableListView) findViewById(R.id.animal_exp_list);
        expListItems = setAnimalGroups();
        expAdapter = new ExpandableListAdapter(AnimalsActivity.this, expListItems);
        expandList.setAdapter(expAdapter);

        // Set on click listener for children items
        expandList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String parent_selection = expListItems.get(groupPosition).getGroupName();
                String child_selection = expListItems.get(groupPosition).getPeople().get(childPosition).getName();
                Toast.makeText(getApplicationContext(), "Selected " + child_selection, Toast.LENGTH_SHORT).show();

                buildAnimalIntent(parent_selection, child_selection);
                return false;
            }
        });
    }

    private ArrayList<Group> setAnimalGroups() {

        animalList = AnimalList.instance();

        ArrayList<Group> list = new ArrayList<Group>();
        for (AnimalGroups group_name : AnimalGroups.values()) {
            Group group = new Group(group_name.getName());

            ArrayList<Child> ch_list = new ArrayList<Child>();
            if (group_name == AnimalGroups.FARMANIMALS) {
                for (Animal animal : animalList.getFarmAnimals()) {
                    Child child = new Child(AnimalsActivity.this, animal.getName(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            else if (group_name == AnimalGroups.PETS) {
                for (Animal animal : animalList.getPets()) {
                    Child child = new Child(AnimalsActivity.this, animal.getName(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            else if (group_name == AnimalGroups.CIRCUSANIMALS) {
                for (Animal animal : animalList.getCircusAnimals()) {
                    Child child = new Child(AnimalsActivity.this, animal.getName(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            group.setGroupNames(ch_list);
            list.add(group);
        }
        return list;
    }

    private void buildAnimalIntent(String animal_group, String child_selection) {
        Intent intent;
        switch(animal_group) {
            case "Farm Animals":
                intent = new Intent(getBaseContext(), FarmAnimalActivity.class);
                break;
            case "Pets":
                intent = new Intent(getBaseContext(), PetActivity.class);
                break;
            case "Circus Animals":
                intent = new Intent(getBaseContext(), CircusAnimalActivity.class);
                break;
            default:
                intent = new Intent(getBaseContext(), AnimalsActivity.class);  // just reload page if error
        }
        intent.putExtra("name", child_selection);
        startActivityForResult(intent, REQUEST_CODE_ANIMALS);
    }

}
