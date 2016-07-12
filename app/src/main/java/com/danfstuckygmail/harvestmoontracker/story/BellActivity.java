package com.danfstuckygmail.harvestmoontracker.story;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.danfstuckygmail.harvestmoontracker.R;

public class BellActivity extends AppCompatActivity {

    private Context mContext = this;
    private String bellColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bell);

        // Retrieve passed data
        Intent intent = getIntent();
        bellColor = intent.getStringExtra("bellColor");

        // Load Layout
        setImage();
        setInfo();
    }

    private void setImage() {
        ImageView bell_iv = (ImageView) findViewById(R.id.story_bell_imageView);
        String img = bellColor + "_button";
        int image = mContext.getResources().getIdentifier(img, "drawable", mContext.getPackageName());
        if (image > 0) {
            bell_iv.setImageResource(image);
        } else {
            bell_iv.setImageResource(R.drawable.no_image);
        }
    }

    private void setInfo() {
        BellData bellData = BellData.instance();
        TextView info_tv = (TextView) findViewById(R.id.story_bell_info);
        info_tv.setText(bellData.getBellInfo(bellColor));
    }
}
