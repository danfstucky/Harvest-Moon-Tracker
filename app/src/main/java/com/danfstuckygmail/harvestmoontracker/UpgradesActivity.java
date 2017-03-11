package com.danfstuckygmail.harvestmoontracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.danfstuckygmail.harvestmoontracker.expandableList.Child;
import com.danfstuckygmail.harvestmoontracker.expandableList.ExpandableListAdapter;
import com.danfstuckygmail.harvestmoontracker.expandableList.Group;
import com.danfstuckygmail.harvestmoontracker.upgrades.Upgrade;
import com.danfstuckygmail.harvestmoontracker.upgrades.UpgradeGroups;
import com.danfstuckygmail.harvestmoontracker.upgrades.UpgradeList;
import com.danfstuckygmail.harvestmoontracker.upgrades.UpgradeTypeActivity;

import java.util.ArrayList;

public class UpgradesActivity extends AppCompatActivity {
    private static final int REQUEST_CODE_UPGRADES = 1;
    private static final String ACTIVITY_TYPE = "UPGRADES";
    private ExpandableListAdapter expAdapter;
    private ArrayList<Group> expListItems;
    private ExpandableListView expandList;
    private UpgradeList upgradeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrades);

        expandList = (ExpandableListView) findViewById(R.id.upgrade_exp_list);
        expListItems = setUpgradeGroups();
        expAdapter = new ExpandableListAdapter(UpgradesActivity.this, expListItems);
        expandList.setAdapter(expAdapter);

        // Set on click listener for children items
        expandList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String parent_selection = expListItems.get(groupPosition).getGroupName();
                String child_selection = expListItems.get(groupPosition).getPeople().get(childPosition).getName();
                Toast.makeText(getApplicationContext(), "Selected " + child_selection, Toast.LENGTH_SHORT).show();

                buildUpgradeIntent(parent_selection, child_selection);
                return false;
            }
        });
    }

    private ArrayList<Group> setUpgradeGroups() {

        upgradeList = UpgradeList.instance();

        ArrayList<Group> list = new ArrayList<Group>();
        for (UpgradeGroups group_name : UpgradeGroups.values()) {
            Group group = new Group(group_name.getName());

            ArrayList<Child> ch_list = new ArrayList<Child>();
            if (group_name == UpgradeGroups.HOUSE) {
                for (Upgrade upgrade : upgradeList.getHouseUpgrades()) {
                    Child child = new Child(UpgradesActivity.this, upgrade.getLevel(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            else if (group_name == UpgradeGroups.BARN) {
                for (Upgrade upgrade : upgradeList.getBarnUpgrades()) {
                    Child child = new Child(UpgradesActivity.this, upgrade.getLevel(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            else if (group_name == UpgradeGroups.COOP) {
                for (Upgrade upgrade : upgradeList.getCoopUpgrades()) {
                    Child child = new Child(UpgradesActivity.this, upgrade.getLevel(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            group.setGroupNames(ch_list);
            list.add(group);
        }
        return list;
    }

    private void buildUpgradeIntent(String upgrade_group, String child_selection) {
        Intent intent = new Intent(getBaseContext(), UpgradeTypeActivity.class);
        intent.putExtra("upgradeType", upgrade_group);
        intent.putExtra("upgradeLevel", child_selection);
        startActivityForResult(intent, REQUEST_CODE_UPGRADES);
    }
}
