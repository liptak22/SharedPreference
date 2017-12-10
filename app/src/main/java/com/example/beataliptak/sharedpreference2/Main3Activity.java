package com.example.beataliptak.sharedpreference2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    // a vissza gomb példányosítása
    private Button visszamenube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        visszamenube = (Button) findViewById(R.id.visszamenube);
        visszamenube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goback = new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(goback);
                finish();
            }
        });
    }
}
