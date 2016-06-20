package com.danfstuckygmail.harvestmoontracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton peopleButton;
    private ImageButton animalsButton;
    private ImageButton cropsButton;
    private ImageButton upgradesButton;
    private ImageButton storyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        peopleButton = (ImageButton) findViewById(R.id.people_button);
        animalsButton = (ImageButton) findViewById(R.id.animals_button);
        cropsButton = (ImageButton) findViewById(R.id.crops_button);
        upgradesButton = (ImageButton) findViewById(R.id.upgrades_button);
        storyButton = (ImageButton) findViewById(R.id.story_button);

        peopleButton.setOnClickListener(this);
        animalsButton.setOnClickListener(this);
        cropsButton.setOnClickListener(this);
        upgradesButton.setOnClickListener(this);
        storyButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        int button_id = v.getId();
        switch (button_id) {
            case R.id.people_button:
                intent = new Intent(this, PeopleActivity.class);
                break;

            case R.id.animals_button:
                intent = new Intent(this, AnimalsActivity.class);
                break;

            case R.id.crops_button:
                intent = new Intent(this, CropsActivity.class);
                break;

            case R.id.upgrades_button:
                intent = new Intent(this, UpgradesActivity.class);
                break;
            case R.id.story_button:
                intent = new Intent(this, StoryActivity.class);
                break;

            default:
        }
        if (intent != null) {
            startActivity(intent);
        }
    }
}
