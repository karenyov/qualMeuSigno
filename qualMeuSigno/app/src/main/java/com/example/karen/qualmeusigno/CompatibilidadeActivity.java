package com.example.karen.qualmeusigno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class CompatibilidadeActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compatibilidade);

        spinner = findViewById(R.id.spinner);
    }

    public void verificaCompatibilidade(View view) {
        int indice = spinner.getSelectedItemPosition();

        if (indice == 0) {
            Toast toast = Toast.makeText(this, "O campo Signo deve ser preenchido.", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            MeuSigno meuSigno = new MeuSigno();
            String signos = meuSigno.signosCompativeis(indice);
            Toast toast = Toast.makeText(this, "Signos compativeis: " + signos, Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
