package com.danfstuckygmail.harvestmoontracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.danfstuckygmail.harvestmoontracker.expandableList.*;
import com.danfstuckygmail.harvestmoontracker.characters.*;

import java.util.ArrayList;

public class PeopleActivity extends AppCompatActivity {

    private static  final int REQUEST_CODE_PEOPLE = 1;
    private static final String ACTIVITY_TYPE = "PEOPLE";
    private ExpandableListAdapter expAdapter;
    private ArrayList<Group> expListItems;
    private ExpandableListView expandList;
    private PeopleList peopleList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_people);

        expandList = (ExpandableListView) findViewById(R.id.people_exp_list);
        expListItems = setPeopleGroups();
        expAdapter = new ExpandableListAdapter(PeopleActivity.this, expListItems);
        expandList.setAdapter(expAdapter);

        // Set on click listener for children items
        expandList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String parent_selection = expListItems.get(groupPosition).getGroupName().toUpperCase();
                String child_selection = expListItems.get(groupPosition).getPeople().get(childPosition).getName();
                Toast.makeText(getApplicationContext(), "Selected " + child_selection, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getBaseContext(), PersonActivity.class);
                intent.putExtra("group", parent_selection);
                intent.putExtra("name", child_selection);
                startActivityForResult(intent, REQUEST_CODE_PEOPLE);
                return false;
            }
        });
    }

    private ArrayList<Group> setPeopleGroups() {
        peopleList = PeopleList.instance();

        ArrayList<Group> list = new ArrayList<Group>();
        for (PeopleEnum.PeopleCategories group_name : PeopleEnum.PeopleCategories.values()) {
            Group group = new Group(group_name.getName());

            ArrayList<Child> ch_list = new ArrayList<Child>();
            if (group_name == PeopleEnum.PeopleCategories.BACHELORS) {
                for (PeopleEnum.Bachelors bachelor : PeopleEnum.Bachelors.values()) {
                    Child child = new Child(PeopleActivity.this, bachelor.getName(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            else if (group_name == PeopleEnum.PeopleCategories.BACHELORETTES) {
                for (PeopleEnum.Bachelorettes bachelorette : PeopleEnum.Bachelorettes.values()) {
                    Child child = new Child(PeopleActivity.this, bachelorette.getName(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            else if (group_name == PeopleEnum.PeopleCategories.VILLAGERS) {
                for (PeopleEnum.Villagers villager : PeopleEnum.Villagers.values()) {
                    Child child = new Child(PeopleActivity.this, villager.getName(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }

            group.setGroupNames(ch_list);
            list.add(group);
        }
        return list;
    }
}
