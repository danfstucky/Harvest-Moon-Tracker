package com.danfstuckygmail.harvestmoontracker.animals;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.danfstuckygmail.harvestmoontracker.R;

public class PetActivity extends AppCompatActivity {
    private Context mContext = this;
    private AnimalList animalList;
    private Pet mAnimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet);
        animalList = AnimalList.instance();

        // Retrieve passed data
        Intent intent = getIntent();
        String animal_name = intent.getStringExtra("name");
        mAnimal = animalList.findPet(animal_name);

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
        ((TextView) findViewById(R.id.animal_season_text)).setText(mAnimal.getSeason());
        ((TextView) findViewById(R.id.animal_location_text)).setText(mAnimal.getLocation());
        ((TextView) findViewById(R.id.animal_speed_text)).setText(mAnimal.getSpeed());
        ((TextView) findViewById(R.id.animal_likes_text)).setText(mAnimal.goodGiftsDisplay());
        ((TextView) findViewById(R.id.animal_dislikes_text)).setText(mAnimal.badGiftsDisplay());
    }
}
