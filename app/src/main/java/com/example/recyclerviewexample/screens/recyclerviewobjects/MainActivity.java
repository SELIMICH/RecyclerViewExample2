package com.example.recyclerviewexample.screens.recyclerviewobjects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewexample.R;
import com.example.recyclerviewexample.RecyclerViewAdapter;
import com.example.recyclerviewexample.RecyclerViewItem;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<RecyclerViewItem> customObjects = new ArrayList<>();
        customObjects.add(new RecyclerViewItem("1","1 картина","19","https://avatars.mds.yandex.net/get-pdb/195449/5a0a8ea9-2109-4f29-9b14-b1a7ba179945/s1200?webp=false"));
        customObjects.add(new RecyclerViewItem("2","2 картина","19","https://avatars.mds.yandex.net/get-pdb/2001933/68fdaa1f-347b-4bb1-914f-6267090f83b2/s1200?webp=false"));
        customObjects.add(new RecyclerViewItem("3","3 картина","19","https://avatars.mds.yandex.net/get-pdb/750514/40b34561-5edb-4eaa-8df4-5c60b436a919/s1200?webp=false"));
        customObjects.add(new RecyclerViewItem("4","4 картина","19","https://avatars.mds.yandex.net/get-pdb/2804075/310d7c0b-2bd6-4722-b4bf-14cf5436b99d/s1200?webp=false"));
        customObjects.add(new RecyclerViewItem("5","5 картина","19","https://avatars.mds.yandex.net/get-pdb/2805977/780ad6a8-2a1c-487a-ab2a-0f6ca9b2d852/s1200?webp=false"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mAdapter = new RecyclerViewAdapter(customObjects);
        mLayoutManager = new LinearLayoutManager(this);

        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(mLayoutManager);


    }
}
