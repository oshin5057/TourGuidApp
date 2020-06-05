package com.example.android.tourguidapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryFragmentAdapter extends FragmentPagerAdapter {

    private Context mcontext;

    public CategoryFragmentAdapter(Context context, FragmentManager fm){
        super(fm);
        mcontext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0){
            return new MonumentsFragment();
        }
        else if (position == 1){
            return new EventsFragment();
        }
        else if (position == 2){
            return new RestaurantsFragment();
        }
        else{
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0){
            return mcontext.getString(R.string.monuments);
        }
        else if (position == 1){
            return mcontext.getString(R.string.events);
        }
        else if (position == 2){
            return mcontext.getString(R.string.resturants);
        }
        else {
            return mcontext.getString(R.string.hotels);
        }
    }
}
