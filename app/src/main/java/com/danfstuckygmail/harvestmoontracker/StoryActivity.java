package com.danfstuckygmail.harvestmoontracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.danfstuckygmail.harvestmoontracker.story.BellActivity;
import com.danfstuckygmail.harvestmoontracker.story.BellData;
import com.danfstuckygmail.harvestmoontracker.story.BellTypeEnum;

public class StoryActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton redBellButton;
    private ImageButton yellowBellButton;
    private ImageButton blueBellButton;
    private ImageButton greenBellButton;
    private ImageButton purpleBellButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        redBellButton = (ImageButton) findViewById(R.id.red_bell_button);
        yellowBellButton = (ImageButton) findViewById(R.id.yellow_bell_button);
        blueBellButton = (ImageButton) findViewById(R.id.blue_bell_button);
        greenBellButton = (ImageButton) findViewById(R.id.green_bell_button);
        purpleBellButton = (ImageButton) findViewById(R.id.purple_bell_button);

        redBellButton.setOnClickListener(this);
        yellowBellButton.setOnClickListener(this);
        blueBellButton.setOnClickListener(this);
        greenBellButton.setOnClickListener(this);
        purpleBellButton.setOnClickListener(this);

        // Initialize all of the story data.
        BellData.instance();
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, BellActivity.class);
        int button_id = v.getId();
        switch (button_id) {
            case R.id.red_bell_button:
                intent.putExtra("bellColor", BellTypeEnum.RED.getColor());
                break;

            case R.id.yellow_bell_button:
                intent.putExtra("bellColor", BellTypeEnum.YELLOW.getColor());
                break;

            case R.id.blue_bell_button:
                intent.putExtra("bellColor", BellTypeEnum.BLUE.getColor());
                break;

            case R.id.green_bell_button:
                intent.putExtra("bellColor", BellTypeEnum.GREEN.getColor());
                break;

            case R.id.purple_bell_button:
                intent.putExtra("bellColor", BellTypeEnum.PURPLE.getColor());
                break;
        }
        startActivity(intent);
    }
}
