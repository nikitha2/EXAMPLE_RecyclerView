package com.nikitha.android.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ListItems> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //fake data setup
        data.add(new ListItems("asf0","adfds0"));
        data.add(new ListItems("asf1","adfds1"));
        data.add(new ListItems("asf2","adfds2"));
        data.add(new ListItems("asf3","adfds3"));
        data.add(new ListItems("asf4","adfds4"));
        data.add(new ListItems("asf5","adfds5"));
        data.add(new ListItems("asf6","adfds6"));
        data.add(new ListItems("asf7","adfds7"));
        data.add(new ListItems("asf8","adfds8"));
        data.add(new ListItems("asf9","adfds9"));
        data.add(new ListItems("asf10","adfds10"));
        data.add(new ListItems("asf11","adfds11"));
        data.add(new ListItems("asf12","adfds12"));
        data.add(new ListItems("asf13","adfds13"));
        data.add(new ListItems("asf14","adfds14"));
        data.add(new ListItems("asf15","adfds15"));
        data.add(new ListItems("asf16","adfds16"));
        data.add(new ListItems("asf17","adfds17"));
        data.add(new ListItems("asf18","adfds18"));
        data.add(new ListItems("asf19","adfds19"));

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recyclerview);
        adapter=new customAdaptor(data);
        layoutManager=new LinearLayoutManager(this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
