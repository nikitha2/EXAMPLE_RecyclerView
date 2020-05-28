package com.nikitha.android.recyclerviewexample;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class customAdaptor extends androidx.recyclerview.widget.RecyclerView.Adapter {
    ArrayList<ListItems> items;
    int i=0;
    public customAdaptor(ArrayList<ListItems> items) {
        this.items=items;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public View v;
        public MyViewHolder(View v) {
            super(v);
            this.v = v;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.listitem, parent, false);
       // v.setBackgroundColor(Color.parseColor("#80008"+i));i+=1;
        TextView sampleText = (TextView) v.findViewById(R.id.textView3);
        sampleText.setText("ViewHolder: "+i);i++;
        MyViewHolder myViewHolder=new MyViewHolder(v);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ListItems currentword = items.get(position);
        TextView textView=(TextView) holder.itemView.findViewById(R.id.textView);
        textView.setText(currentword.text);

        TextView textView1=(TextView) holder.itemView.findViewById(R.id.textView1);
        textView1.setText(currentword.text1);
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"showing item: "+ v.getTag(),Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
