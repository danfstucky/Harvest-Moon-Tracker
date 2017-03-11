package com.danfstuckygmail.harvestmoontracker.upgrades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.danfstuckygmail.harvestmoontracker.R;

public class UpgradeTypeActivity extends AppCompatActivity {
    private String upgradeType;
    private String upgradeLevel;
    private Upgrade upgrade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrade_type);

        // Retrieve passed data
        Intent intent = getIntent();
        upgradeType = intent.getStringExtra("upgradeType");
        upgradeLevel = intent.getStringExtra("upgradeLevel");

        // Retrieve upgrade data.
        upgrade = getData();

        // Load Layout
        setLayout();
    }

    private Upgrade getData() {
        UpgradeList u = UpgradeList.instance();
        return u.findUpgrade(upgradeType, upgradeLevel);
    }

    private void setLayout() {
        TextView header_tv = (TextView) findViewById(R.id.upgrade_level_header);
        TextView info_tv = (TextView) findViewById(R.id.upgrade_info_value);
        TextView cost_tv = (TextView) findViewById(R.id.upgrade_cost_value);
        TextView lumber_tv = (TextView) findViewById(R.id.upgrade_lumber_value);
        TextView stone_tv = (TextView) findViewById(R.id.upgrade_stone_value);

        header_tv.setText(upgrade.getGroup());
        info_tv.setText(upgrade.getInfo());
        cost_tv.setText(upgrade.getCost());
        lumber_tv.setText(upgrade.getLumber());
        stone_tv.setText(upgrade.getStone());
    }
}
