package com.danfstuckygmail.harvestmoontracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.danfstuckygmail.harvestmoontracker.crops.Crop;
import com.danfstuckygmail.harvestmoontracker.crops.CropList;
import com.danfstuckygmail.harvestmoontracker.crops.CropSeasonEnum;
import com.danfstuckygmail.harvestmoontracker.crops.SingleCropActivity;
import com.danfstuckygmail.harvestmoontracker.expandableList.Child;
import com.danfstuckygmail.harvestmoontracker.expandableList.ExpandableListAdapter;
import com.danfstuckygmail.harvestmoontracker.expandableList.Group;

import java.util.ArrayList;

public class CropsActivity extends AppCompatActivity {

    private static final String ACTIVITY_TYPE = "CROPS";
    private static  final int REQUEST_CODE_CROP = 1;
    private ExpandableListAdapter expAdapter;
    private ArrayList<Group> expListItems;
    private ExpandableListView expandList;
    private CropList cropList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops);

        expandList = (ExpandableListView) findViewById(R.id.crop_exp_list);
        expListItems = setCropGroups();
        expAdapter = new ExpandableListAdapter(CropsActivity.this, expListItems);
        expandList.setAdapter(expAdapter);

        // Set on click listener for children items
        expandList.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v, int groupPosition, int childPosition, long id) {
                String parent_selection = expListItems.get(groupPosition).getGroupName().toUpperCase();
                String child_selection = expListItems.get(groupPosition).getPeople().get(childPosition).getName();
                Toast.makeText(getApplicationContext(), "Selected " + child_selection, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(getBaseContext(), SingleCropActivity.class);
                intent.putExtra("group", parent_selection);
                intent.putExtra("name", child_selection);
                startActivityForResult(intent, REQUEST_CODE_CROP);
                return false;
            }
        });
    }

    private ArrayList<Group> setCropGroups() {
        cropList = CropList.instance();

        ArrayList<Group> list = new ArrayList<Group>();
        for (CropSeasonEnum group_name : CropSeasonEnum.values()) {
            Group group = new Group(group_name.getSeason());

            ArrayList<Child> ch_list = new ArrayList<Child>();
            if (group_name == CropSeasonEnum.SPRING) {
                for (Crop crop : cropList.getSpringCrops()) {
                    Child child = new Child(CropsActivity.this, crop.getName(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            else if (group_name == CropSeasonEnum.SUMMER) {
                for (Crop crop : cropList.getSummerCrops()) {
                    Child child = new Child(CropsActivity.this, crop.getName(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            else if (group_name == CropSeasonEnum.FALL) {
                for (Crop crop : cropList.getFallCrops()) {
                    Child child = new Child(CropsActivity.this, crop.getName(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }
            else if (group_name == CropSeasonEnum.WINTER) {
                for (Crop crop : cropList.getWinterCrops()) {
                    Child child = new Child(CropsActivity.this, crop.getName(), ACTIVITY_TYPE);
                    ch_list.add(child);
                }
            }

            group.setGroupNames(ch_list);
            list.add(group);
        }
        return list;
    }
}
