package com.example.beataliptak.sharedpreference2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_mentes;
    private EditText editText_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_mentes = (Button) findViewById(R.id.button_mentes);
        editText_name = (EditText) findViewById(R.id.editt_name);

        btn_mentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("name",editText_name.getText().toString());
                editor.commit();

                Intent vissza_menube = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(vissza_menube);
                Toast.makeText(MainActivity.this,"Adat mentve",Toast.LENGTH_SHORT).show();
                finish();


            }
        });
    }
}