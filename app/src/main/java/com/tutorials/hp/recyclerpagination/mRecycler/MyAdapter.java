package com.tutorials.hp.recyclerpagination.mRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.tutorials.hp.recyclerpagination.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder>  {
    Context c;
    ArrayList<String> spacecrafts;
    public MyAdapter(Context c, ArrayList<String> spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }

    //INITIALIZE VH
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        return new MyViewHolder(v);
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //BIND DATA
        holder.nametxt.setText(spacecrafts.get(position));
    }
    //TOTAL NUM
    @Override
    public int getItemCount() {
        return spacecrafts.size();
    }
}
