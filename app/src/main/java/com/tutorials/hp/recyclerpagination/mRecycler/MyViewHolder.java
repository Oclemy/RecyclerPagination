package com.tutorials.hp.recyclerpagination.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tutorials.hp.recyclerpagination.R;

public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nametxt;

        public MyViewHolder(View itemView) {
            super(itemView);
            nametxt= (TextView) itemView.findViewById(R.id.nameTxt);
        }
}
