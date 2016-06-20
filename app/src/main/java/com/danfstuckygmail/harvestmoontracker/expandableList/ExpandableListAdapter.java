package com.danfstuckygmail.harvestmoontracker.expandableList;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.danfstuckygmail.harvestmoontracker.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dan on 6/16/2016.
 */
public class ExpandableListAdapter extends BaseExpandableListAdapter {
    private Context context;
    private List<Group> people_headers;

    public ExpandableListAdapter(Context context, ArrayList<Group> people_headers) {
        this.context = context;
        this.people_headers = people_headers;
    }

    @Override
    public int getGroupCount() {
        return people_headers.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        ArrayList<Child> childList = people_headers.get(groupPosition).getPeople();
        return childList.size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return people_headers.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        ArrayList<Child> childList = people_headers.get(groupPosition).getPeople();
        return childList.get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return groupPosition;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        Group group = (Group) getGroup(groupPosition);
        if (convertView == null) {
            LayoutInflater layout = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layout.inflate(R.layout.list_header_layout, null);
        }
        TextView tv = (TextView) convertView.findViewById(R.id.heading_item);
        tv.setText(group.getGroupName());
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {

        Child child = (Child) getChild(groupPosition, childPosition);
        if (convertView == null) {
            LayoutInflater layout = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layout.inflate(R.layout.list_child_layout, null);
        }
        TextView tv = (TextView) convertView.findViewById(R.id.child_name);
        ImageView iv = (ImageView) convertView.findViewById(R.id.child_image);

        tv.setText(child.getName());
        try {
            iv.setImageResource(child.getImage());
        } catch (Resources.NotFoundException e) {
            iv.setImageResource(R.drawable.no_image);
        }

        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
