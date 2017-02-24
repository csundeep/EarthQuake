package com.example.sundeepchilukur.earthquake;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthQuakeAdapter extends ArrayAdapter<EarthQuake> {


    public EarthQuakeAdapter(Activity context, ArrayList<EarthQuake> androidFlavors) {

        super(context, 0, androidFlavors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }


        EarthQuake earthQuake = getItem(position);


        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeTextView.setText(earthQuake.getMagnitude());

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        locationTextView.setText(earthQuake.getLocation());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(earthQuake.getDate());

        return listItemView;
    }

}
