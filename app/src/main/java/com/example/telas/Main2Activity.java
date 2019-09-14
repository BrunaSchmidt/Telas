package com.example.telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button botao2 ;

        botao2 = (Button) findViewById(R.id.idBot2);

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Intent intent2 = getIntent();
        String dicas = intent2.getStringExtra("DICA");

        Context contexto = getApplicationContext();
        Toast toast = Toast.makeText(contexto, dicas, Toast.LENGTH_LONG);
        toast.show();
    }
}
