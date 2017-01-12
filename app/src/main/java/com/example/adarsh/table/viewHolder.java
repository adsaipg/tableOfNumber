package com.example.adarsh.table;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.adarsh.table.R;

/**
 * Created by adaRSH on 23-Aug-16.
 */



    public class viewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public viewHolder(View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
        }
    }
