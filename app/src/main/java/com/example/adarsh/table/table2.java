package com.example.adarsh.table;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

public class table2 extends AppCompatActivity {

    String tv1,tv2;
    int i1,i2;
    private static final String EXTRA_TABLE_OF = "qwerty";
    private static final String EXTRA_TABLE_UPTO = "asdfgh";

    RecyclerView TablerecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table2);
        TablerecyclerView=(RecyclerView)findViewById(R.id.recyle1) ;
        Log.d("adarsh","table called");
        Intent intent = getIntent();

        int i1 = intent.getIntExtra(EXTRA_TABLE_OF, 0);
        int i2 = intent.getIntExtra(EXTRA_TABLE_UPTO, 0);


        TablerecyclerView.setLayoutManager(new LinearLayoutManager(this));
        TablerecyclerView.setAdapter(new adapter(this,i1,i2));


    }
    public static Intent createNewIntent(Context context, int tableOf, int tableUpto) {
        Intent intent = new Intent(context, table2.class);
        intent.putExtra(EXTRA_TABLE_OF, tableOf);
        intent.putExtra(EXTRA_TABLE_UPTO, tableUpto);
        return intent;
    }
}
