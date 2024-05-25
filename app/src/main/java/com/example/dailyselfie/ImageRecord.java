package com.example.dailyselfie;

import android.graphics.Bitmap;

public class ImageRecord {
    private Bitmap mBitmap;
    private String mName;

    public ImageRecord(Bitmap bitmap, String name){
        this.mBitmap = bitmap;
        this.mName = name;
    }

    public ImageRecord(){}

    public Bitmap getmBitmap() {
        return mBitmap;
    }

    public void setmBitmap(Bitmap mBitmap) {
        this.mBitmap = mBitmap;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
