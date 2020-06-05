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
public class MonumentsFragment extends Fragment implements AdapterView.OnItemClickListener {

    ArrayList<InfoDetailed> infoDetailed;

    public MonumentsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container,false);
         infoDetailed = new ArrayList<InfoDetailed>();

         infoDetailed.add(new InfoDetailed(getResources().getString(R.string.statu_name),R.drawable.monumets_statu_liberty,
                 getResources().getString(R.string.statu_phone),getResources().getString(R.string.statu_address),
                 getResources().getString(R.string.statu_overview)));

         infoDetailed.add(new InfoDetailed(getResources().getString(R.string.alice_name),R.drawable.monumets_alice_wonderland,
                getResources().getString(R.string.alice_phone),getResources().getString(R.string.alice_address),
                getResources().getString(R.string.alice_overview)));

         infoDetailed.add(new InfoDetailed(getResources().getString(R.string.atlus_name),R.drawable.monumets_atlus,
                getResources().getString(R.string.atlus_phone),getResources().getString(R.string.atlus_address),
                getResources().getString(R.string.atlus_overview)));

         infoDetailed.add(new InfoDetailed(getResources().getString(R.string.john_memorial_name),R.drawable.monumets_jhon,
                getResources().getString(R.string.john_memorial_phone),getResources().getString(R.string.john_memorial_address),
                getResources().getString(R.string.john_memorial_overview)));

         infoDetailed.add(new InfoDetailed(getResources().getString(R.string.memorial_name),R.drawable.monumets_memorial_wall,
                getResources().getString(R.string.memorial_phone),getResources().getString(R.string.memorial_address),
                getResources().getString(R.string.memorial_overview)));

         infoDetailed.add(new InfoDetailed(getResources().getString(R.string.oculus_name),R.drawable.monumets_oculus,
                getResources().getString(R.string.oculus_phone),getResources().getString(R.string.oculus_address),
                getResources().getString(R.string.oculus_overview)));

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
