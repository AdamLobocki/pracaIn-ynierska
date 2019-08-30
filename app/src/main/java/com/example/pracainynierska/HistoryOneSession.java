package com.example.pracainynierska;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HistoryOneSession extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_session_history);


        Button goToHistoryBT = (Button) findViewById(R.id.goToHistoryBT);
        goToHistoryBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HistoryOneSession.this, History.class));
            }
        });



        Button goToMainBT = (Button) findViewById(R.id.goToMainBT);
        goToMainBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HistoryOneSession.this, StartingPage.class));
            }
        });

    }
}