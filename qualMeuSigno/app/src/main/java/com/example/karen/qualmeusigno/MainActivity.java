package com.example.karen.qualmeusigno;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMeuSigno = findViewById(R.id.btnMeuSigno);
        btnMeuSigno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MeuSignoActivity.class);
                startActivity(intent);
            }
        });

        Button btnCompatibilidade = findViewById(R.id.btnCompatibilidade);
        btnCompatibilidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CompatibilidadeActivity.class);
                startActivity(intent);
            }
        });
    }
}
