package com.example.recyclerviewexample;

public class RecyclerViewItem {
    private String  mId;
    private String mName;
    private String  mAge;
    private String  mImageView;

    public RecyclerViewItem(String id, String name, String age, String imageView) {
        this.mId = id;
        this.mName = name;
        this.mAge = age;
        mImageView = imageView;
    }

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getAge() {
        return mAge;
    }

    public String getImageView() {
        return mImageView;
    }
}
