package com.danfstuckygmail.harvestmoontracker.crops;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.danfstuckygmail.harvestmoontracker.R;

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
}
