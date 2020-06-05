package com.example.android.tourguidapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoDetailedActivity extends AppCompatActivity {
    ImageView mImage;
    TextView mPlaceNameText;
    TextView mAddressText;
    TextView mPhoneNoText;
    TextView mOverviewText;
    InfoDetailed mInfoDetailed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_info);

        mInfoDetailed = getIntent().getParcelableExtra("place_data");

        mImage = (ImageView)findViewById(R.id.image_view_detailed_info);
        mPlaceNameText = (TextView)findViewById(R.id.detailed_name_text_view);
        mAddressText = (TextView) findViewById(R.id.detailed_address_text_view);
        mPhoneNoText = (TextView) findViewById(R.id.detailed_phone_text_view);
        mOverviewText = (TextView) findViewById(R.id.detailed_overview_text_view);

        mPlaceNameText.setText(mInfoDetailed.getPlaceName());
        mImage.setImageResource(mInfoDetailed.getImageResourceId());
        mAddressText.setText(mInfoDetailed.getAddress());
        mPhoneNoText.setText(mInfoDetailed.getPhoneNo());
        mOverviewText.setText(mInfoDetailed.getOverview());
    }
}
