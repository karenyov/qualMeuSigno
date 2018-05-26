package com.example.karen.qualmeusigno;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MeuSignoActivity extends AppCompatActivity {

    private EditText dataNascimento;
    private TextView signo;
    private ImageView imagemSigno;
    private int dia, mes, ano;
    static final int DATE_ID = 0;
    Calendar c = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meu_signo);

        dataNascimento = (EditText) findViewById(R.id.dataNascimento);
        mes = c.get(Calendar.MONTH);
        dia = c.get(Calendar.DAY_OF_MONTH);
        ano = c.get(Calendar.YEAR);

        dataNascimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog(DATE_ID);
            }
        });

        Button btnEnviar = findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buscarSigno();
            }
        });
    }

    private void atualizaData() {
        dataNascimento.setText((dia) + "/" + mes + "/" + ano + " ");
    }

    private void buscarSigno() {

        if (dataNascimento.getText().toString().isEmpty()) {
            Toast toast = Toast.makeText(this, "O campo data de nascimento deve ser preenchido.", Toast.LENGTH_SHORT);
            toast.show();
        } else {
            String[] data = dataNascimento.getText().toString().replaceAll(" ", "").split("\\/");
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data[0]));
            calendar.set(Calendar.MONTH, Integer.parseInt(data[1]));
            calendar.set(Calendar.YEAR, Integer.parseInt(data[2]));

            MeuSigno meuSigno = new MeuSigno();
            Toast toast = Toast.makeText(this, "Seu signo é " + meuSigno.qualMeuSigno(calendar), Toast.LENGTH_SHORT);
            toast.show();

            //mostrando imagem do signo
            imagemSigno = (ImageView) findViewById(R.id.imagemSigno);
            int resID = getResources().getIdentifier(meuSigno.getImagem(), "drawable", getPackageName());
            Drawable drawable = getResources().getDrawable(resID);
            imagemSigno.setImageDrawable(drawable);
        }
    }

    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    ano = year;
                    mes = monthOfYear + 1;
                    dia = dayOfMonth;
                    atualizaData();
                }
            };

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id) {
            case DATE_ID:
                return new DatePickerDialog(this, mDateSetListener, ano, mes, dia);
        }
        return null;
    }
}
