package com.example.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button linearLayout = findViewById(R.id.LinearLayoutbutton);
            Button relativeLayout = findViewById(R.id.relativeLayoutbutton);
            Button listView = findViewById(R.id.listbutton);
            Button cardviewspinner  = findViewById(R.id.cardViewSpinnerButton);
            Button recycleview  = findViewById(R.id.recyclerView);



            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent linearIntent = new Intent(MainActivity.this,LinearLayout.class);
                    startActivity(linearIntent);
                }
            });

            relativeLayout.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,RelativeLayout.class);
                    startActivity(intent);
                }
            });

            listView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, ListView.class);
                    startActivity(intent);
                }
            });

            cardviewspinner.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this,CardViewSpinner.class);
                    startActivity(intent);
                }
            });

            recycleview.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, RecyclerView.class);
                    startActivity(intent);
                }
            });
        }


    }