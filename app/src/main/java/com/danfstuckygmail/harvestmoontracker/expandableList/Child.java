package com.danfstuckygmail.harvestmoontracker.expandableList;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by Dan on 6/16/2016.
 */
public class Child {
    private Context context;
    private String name;
    private int image;
    private String activity_group;

    public Child(Context context, String name, String activity_group) {
        this.context = context;
        this.name = name;
        this.activity_group = activity_group;
        setImage();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        if (image != 0) {
            return image;
        } else {
            String img = name.toLowerCase().replace(" ", "_");
            Resources.NotFoundException e = new Resources.NotFoundException("failed to find " + img);
            throw e;
        }
    }

    public void setImage() {
        String img = name.toLowerCase().replace(" ", "_");
        image = context.getResources().getIdentifier(img, "drawable", context.getPackageName());
    }

    public String getActivityGroup() {
        return this.activity_group;
    }
}
