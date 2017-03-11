package com.danfstuckygmail.harvestmoontracker.crops;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.danfstuckygmail.harvestmoontracker.R;

import java.util.Map;

public class SingleCropActivity extends AppCompatActivity {

    private Context mContext = this;
    private Crop mCrop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_crop);
        CropList cropList = CropList.instance();

        // Retrieve passed data
        Intent intent = getIntent();
        String crop_name = intent.getStringExtra("name");
        String crop_group = intent.getStringExtra("group");
        System.out.println(crop_group);
        mCrop = cropList.findCrop(CropSeasonEnum.valueOf(crop_group), crop_name);

        // Initialize UI Data
        setImage();
        updateCropDetails();
    }


    private void setImage() {
        TextView name_tv = (TextView) findViewById(R.id.crop_name);
        name_tv.setText(mCrop.getName());
        ImageView pic_iv = (ImageView) findViewById(R.id.crop_imageView);
        String img = mCrop.getName().toLowerCase().replace(" ", "_");
        int image = mContext.getResources().getIdentifier(img, "drawable", mContext.getPackageName());
        if (image > 0) {
            pic_iv.setImageResource(image);
        } else {
            pic_iv.setImageResource(R.drawable.no_image);
        }
    }

    private void updateCropDetails() {
        TextView seeds_tv = (TextView) findViewById(R.id.crop_seeds_text);
        TextView days_tv = (TextView) findViewById(R.id.crop_days_text);
        TextView regrows_tv = (TextView) findViewById(R.id.crop_regrows_text);

        seeds_tv.setText(mCrop.getSeeds());
        days_tv.setText(mCrop.getDays());
        regrows_tv.setText(mCrop.getRegrows());

        TableLayout table = (TableLayout) findViewById(R.id.crop_prices_table);
        if (mCrop.getSales().length == 0) {
            TableRow row = (TableRow) LayoutInflater.from(SingleCropActivity.this).inflate(R.layout.crop_table_row, null);
            ((TextView) row.findViewById(R.id.decent_value)).setText("Nothing");
            table.addView(row);
        } else {
            TableRow row = (TableRow) LayoutInflater.from(SingleCropActivity.this).inflate(R.layout.crop_table_row, null);
            String[] crop_sales = mCrop.getSales();
            // Inflate row "template" and fill out the fields.
            ((TextView) row.findViewById(R.id.crop_decent_value)).setText(crop_sales[0]);
            ((TextView) row.findViewById(R.id.crop_good_value)).setText(crop_sales[1]);
            ((TextView) row.findViewById(R.id.crop_perfect_value)).setText(crop_sales[2]);
            ((TextView) row.findViewById(R.id.crop_shining_value)).setText(crop_sales[3]);
            table.addView(row);
        }
    }
}
