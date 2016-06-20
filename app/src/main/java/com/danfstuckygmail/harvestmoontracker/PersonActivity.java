package com.danfstuckygmail.harvestmoontracker;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.danfstuckygmail.harvestmoontracker.characters.PeopleEnum;
import com.danfstuckygmail.harvestmoontracker.characters.PeopleList;
import com.danfstuckygmail.harvestmoontracker.characters.Person;

public class PersonActivity extends AppCompatActivity {
    private Context mContext = this;
    private PeopleList peopleList;
    private Person mPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
        peopleList = PeopleList.instance();

        // Retrieve passed data
        Intent intent = getIntent();
        String person_name = intent.getStringExtra("name");
        String person_group = intent.getStringExtra("group");
        mPerson = peopleList.findPerson(PeopleEnum.PeopleCategories.valueOf(person_group), person_name);

        // Initialize UI Data
        setImage();
        updatePersonDetails();

    }

    private void setImage() {
        TextView name_tv = (TextView) findViewById(R.id.person_name);
        name_tv.setText(mPerson.getName());
        ImageView pic_iv = (ImageView) findViewById(R.id.person_imageView);
        String img = mPerson.getName().toLowerCase().replace(" ", "_");
        int image = mContext.getResources().getIdentifier(img, "drawable", mContext.getPackageName());
        if (image > 0) {
            pic_iv.setImageResource(image);
        } else {
            pic_iv.setImageResource(R.drawable.no_image);
        }
    }

    private void updatePersonDetails() {
        ((TextView) findViewById(R.id.info_text)).setText(mPerson.getInfo());
        ((TextView) findViewById(R.id.birthday_text)).setText(mPerson.getBirthday());
        TextView best_gifts_tv = (TextView) findViewById(R.id.best_gifts_text);
        TextView good_gifts_tv = (TextView) findViewById(R.id.good_gifts_text);
        TextView bad_gifts_tv = (TextView) findViewById(R.id.bad_gifts_text);
        TextView rival_tv = (TextView) findViewById(R.id.rival_text);

        best_gifts_tv.setText(mPerson.bestGiftsDisplay());
        good_gifts_tv.setText(mPerson.goodGiftsDisplay());
        bad_gifts_tv.setText(mPerson.badGiftsDisplay());
        if (mPerson.getRival() == null){
            TextView rival_label = (TextView) findViewById(R.id.rival_label);
            rival_label.setVisibility(View.INVISIBLE);
        } else {
            rival_tv.setText(mPerson.getRival());
        }
    }
}
