package com.example.gabriel.fortniteskinviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSkins = (Button) findViewById(R.id.btnSkins);

        btnSkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySkins();
            }
        });
    }

    void openActivitySkins () {
        Intent intent = new Intent (this, Skins.class);
        startActivity(intent);
    }
}
