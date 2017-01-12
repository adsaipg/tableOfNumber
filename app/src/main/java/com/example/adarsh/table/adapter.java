package com.example.adarsh.table;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.adarsh.table.R;

/**
 * Created by adaRSH on 23-Aug-16.
 */


    public class adapter extends RecyclerView.Adapter<viewHolder> {


        private Context context;
        int ip1,ip2;

        public adapter(Context context,int i1,int i2) {
            this.context = context;
            ip1=i1;
            ip2=i2;
        }


        @Override
        public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {



            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(R.layout.table_row_details, parent, false);
            Log.d("adarsh","view created");

            return new viewHolder(view);
        }

        @Override
        public void onBindViewHolder(viewHolder holder, int position) {

            int multiplier = position + 1;
            String str =Integer.toString(ip1);
            Log.d("adarsh",str);
            int result = ip1 * multiplier;
            Log.d("adarsh","text created");
            TextView textView = (TextView) holder.itemView;
            textView.setText(ip1+ " X " + multiplier + " = " + result);


        }

        @Override
        public int getItemCount() {
            String str=null;

            str =Integer.toString(ip2);
            Log.d("adarsh",str);
            return ip2;
        }
    }
