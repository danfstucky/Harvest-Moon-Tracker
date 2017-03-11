package com.danfstuckygmail.harvestmoontracker.animals;

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

public class FarmAnimalActivity extends AppCompatActivity {
    private Context mContext = this;
    private AnimalList animalList;
    private Farm mAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_farm_animal);
        animalList = AnimalList.instance();

        // Retrieve passed data
        Intent intent = getIntent();
        String animal_name = intent.getStringExtra("name");
        mAnimal = animalList.findFarmAnimal(animal_name);

        // Initialize UI Data
        setImage();
        updateAnimalDetails();
    }

    private void setImage() {
        TextView name_tv = (TextView) findViewById(R.id.animal_name);
        name_tv.setText(mAnimal.getName());
        ImageView pic_iv = (ImageView) findViewById(R.id.animal_imageView);
        String img = mAnimal.getName().toLowerCase().replace(" ", "_");
        int image = mContext.getResources().getIdentifier(img, "drawable", mContext.getPackageName());
        if (image > 0) {
            pic_iv.setImageResource(image);
        } else {
            pic_iv.setImageResource(R.drawable.no_image);
        }
    }

    private void updateAnimalDetails() {
        ((TextView) findViewById(R.id.animal_info)).setText(mAnimal.getInfo());
        ((TextView) findViewById(R.id.animal_produces_text)).setText(mAnimal.getProduces());
        ((TextView) findViewById(R.id.animal_pregnancy_text)).setText(mAnimal.getPregnancy());
        ((TextView) findViewById(R.id.animal_lifespan_text)).setText(mAnimal.getLifespan());
        TableLayout table = (TableLayout) findViewById(R.id.animal_product_table);
        if (!mAnimal.getSales().isEmpty()) {
            for (Map.Entry<String, String[]> entry : mAnimal.getSales().entrySet()) {
                // Inflate row "template" and fill out the fields.
                TableRow row = (TableRow) LayoutInflater.from(FarmAnimalActivity.this).inflate(R.layout.animal_table_row, null);
                ((TextView) row.findViewById(R.id.product_name)).setText(entry.getKey());
                ((TextView) row.findViewById(R.id.decent_value)).setText(entry.getValue()[0]);
                ((TextView) row.findViewById(R.id.good_value)).setText(entry.getValue()[1]);
                ((TextView) row.findViewById(R.id.perfect_value)).setText(entry.getValue()[2]);
                ((TextView) row.findViewById(R.id.shining_value)).setText(entry.getValue()[3]);
                table.addView(row);
            }
        } else {
            TableRow row = (TableRow) LayoutInflater.from(FarmAnimalActivity.this).inflate(R.layout.animal_table_row, null);
            ((TextView) row.findViewById(R.id.product_name)).setText("Nothing");
            table.addView(row);
        }
    }
}
