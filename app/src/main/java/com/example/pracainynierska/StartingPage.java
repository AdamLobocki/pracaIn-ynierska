package com.example.pracainynierska;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartingPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button exchange_Rate_Button = (Button) findViewById(R.id.exchangeRateButton);
        exchange_Rate_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartingPage.this, ExchangeRatePage.class));
            }
        });

        Button invest_session_button = (Button) findViewById(R.id.investButton);
        invest_session_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartingPage.this, CurrentSesion.class));
            }
        });

        Button transaction_history_button = (Button) findViewById(R.id.transactionHistoryButton);
        transaction_history_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StartingPage.this, History.class));
            }
        });


    }
}
