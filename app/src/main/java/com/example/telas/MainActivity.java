package com.example.telas;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context contexto = getApplicationContext();
        Toast toast = Toast.makeText(contexto, "OnCreate()", LENGTH_SHORT);
        toast.show();

        Button botao1;

        botao1 = (Button) findViewById(R.id.idBot1);

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }

    protected void onStart() {
        super.onStart();

        Context contexto = getApplicationContext();
        Toast toast = Toast.makeText(contexto, "OnStart()", LENGTH_SHORT);
        toast.show();
    }

    protected void onResume() {
        super.onResume();

        Context contexto = getApplicationContext();
        Toast toast = Toast.makeText(contexto, "onResume()", LENGTH_SHORT);
        toast.show();
    }

    protected void onPause() {
        super.onPause();

        Context contexto = getApplicationContext();
        Toast toast = Toast.makeText(contexto, "onPause()", LENGTH_SHORT);
        toast.show();
    }

    protected void onRestart() {
        super.onRestart();

        Context contexto = getApplicationContext();
        Toast toast = Toast.makeText(contexto, "onRestart()", LENGTH_SHORT);
        toast.show();
    }

    protected void onStop() {
        super.onStop();

        Context contexto = getApplicationContext();
        Toast toast = Toast.makeText(contexto, "onStop()", LENGTH_SHORT);
        toast.show();
    }

    protected void onDestroy() {
        super.onDestroy();

        Context contexto = getApplicationContext();
        Toast toast = Toast.makeText(contexto, "onDestroy()", LENGTH_SHORT);
        toast.show();
    }
}
