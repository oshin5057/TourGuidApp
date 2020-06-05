package com.example.android.tourguidapp;

import android.os.Parcel;
import android.os.Parcelable;


public class InfoDetailed implements Parcelable {
    private String mPlaceName;
    private int mImageResourceId;
    private String mPhoneNo;
    private String mAddress;
    private String mOverview;

    public InfoDetailed(String placeName, int imageResourceId, String phoneNo, String address, String overview){
        mPlaceName = placeName;
        mImageResourceId = imageResourceId;
        mPhoneNo = phoneNo;
        mAddress = address;
        mOverview = overview;
    }

    protected InfoDetailed(Parcel in){
        mPlaceName = in.readString();
        mImageResourceId = in.readInt();
        mPhoneNo = in.readString();
        mAddress = in.readString();
        mOverview = in.readString();
    }

    public static final Creator<InfoDetailed> CREATOR = new Creator<InfoDetailed>() {
        @Override
        public InfoDetailed createFromParcel(Parcel in) {
            return new InfoDetailed(in);
        }

        @Override
        public InfoDetailed[] newArray(int size) {
            return new InfoDetailed[size];
        }
    };

    public String getPlaceName(){
        return mPlaceName;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public String getPhoneNo(){
        return mPhoneNo;
    }

    public String getAddress(){
        return mAddress;
    }

    public String getOverview(){
        return mOverview;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mPlaceName);
        parcel.writeInt(mImageResourceId);
        parcel.writeString(mPhoneNo);
        parcel.writeString(mAddress);
        parcel.writeString(mOverview);
    }
}
