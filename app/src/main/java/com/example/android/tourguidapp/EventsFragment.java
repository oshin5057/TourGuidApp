package com.example.android.tourguidapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment implements AdapterView.OnItemClickListener {

    ArrayList<InfoDetailed> infoDetailed;

    public EventsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container,false);
        infoDetailed = new ArrayList<InfoDetailed>();

        infoDetailed.add(new InfoDetailed(getResources().getString(R.string.event_one_name),R.drawable.event_one,
                getResources().getString(R.string.event_one_phone),getResources().getString(R.string.event_one_address),
                getResources().getString(R.string.event_one_overview)));

        infoDetailed.add(new InfoDetailed(getResources().getString(R.string.event_two_name),R.drawable.event_two,
                getResources().getString(R.string.event_two_phone),getResources().getString(R.string.event_two_address),
                getResources().getString(R.string.event_two_overview)));

        infoDetailed.add(new InfoDetailed(getResources().getString(R.string.event_three_name),R.drawable.event_three,
                getResources().getString(R.string.event_three_phone),getResources().getString(R.string.event_three_address),
                getResources().getString(R.string.event_three_overview)));

        infoDetailed.add(new InfoDetailed(getResources().getString(R.string.event_four_name),R.drawable.event_four,
                getResources().getString(R.string.event_four_phone),getResources().getString(R.string.event_four_address),
                getResources().getString(R.string.event_four_overview)));

        infoDetailed.add(new InfoDetailed(getResources().getString(R.string.event_five_name),R.drawable.event_five,
                getResources().getString(R.string.event_five_phone),getResources().getString(R.string.event_five_address),
                getResources().getString(R.string.event_five_overview)));

        infoDetailed.add(new InfoDetailed(getResources().getString(R.string.event_six_name),R.drawable.event_six,
                getResources().getString(R.string.event_six_phone),getResources().getString(R.string.event_six_address),
                getResources().getString(R.string.event_six_overview)));

        TourAdapter adapter = new TourAdapter(getActivity(),infoDetailed);
        ListView listView = (ListView)rootView.findViewById(R.id.fragment_list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

        return rootView;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        Intent intent = new Intent(getActivity(),InfoDetailedActivity.class);
        intent.putExtra("place_data",infoDetailed.get(position));
        startActivity(intent);
    }

}

