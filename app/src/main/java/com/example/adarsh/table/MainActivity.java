package com.example.adarsh.table;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    EditText input1;
    EditText input2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.but1);
        input1 = (EditText) findViewById(R.id.text7);
        input2 = (EditText) findViewById(R.id.text8);
        Log.d("adarsh","main");
        button.setOnClickListener(new View.OnClickListener() {
                                     @Override

                                     public void onClick(View v) {
                                         submit(v);
                                     }
                                 }
        );

    }
        public void submit(View view) {
            Log.d("adarsh","button");
            int tableOf = Integer.parseInt(input1.getText().toString());
            int tableUpto = Integer.parseInt(input2.getText().toString());


            Intent intent = table2.createNewIntent(this, tableOf, tableUpto);
            startActivity(intent);
        }

}
