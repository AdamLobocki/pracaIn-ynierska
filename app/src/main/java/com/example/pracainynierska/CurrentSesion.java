package com.example.pracainynierska;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CurrentSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sesion_current);


        Button goToMainBT = (Button) findViewById(R.id.goToMainBT);
        goToMainBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CurrentSesion.this, StartingPage.class));
            }
        });

        Button goToRateBT = (Button) findViewById(R.id.goToRateBT);
        goToRateBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(CurrentSesion.this, ExchangeRatePage.class));
            }
        });


    }
}
