package com.example.latihanpassingdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActivity extends AppCompatActivity {

    ImageView menuGomart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        menuGomart = (ImageView) findViewById(R.id.imageGomart);
        menuGomart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gomart = new Intent(HomeActivity.this, GomartActivity.class);
                startActivity(gomart);
            }
        });

    }
}
