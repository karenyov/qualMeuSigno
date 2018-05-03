package com.example.karen.qualmeusigno;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private EditText dataNascimento;
    private TextView signo;
    private int dia, mes, ano;
    static final int DATE_ID = 0;
    Calendar c = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
    }

    private void atualizaData() {
        dataNascimento.setText((dia + 1) + "/" + mes + "/" + ano + " ");
    }

    private void buscarSigno() {
        String[] data = dataNascimento.getText().toString().replaceAll(" ", "").split("\\/");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data[0]));
        calendar.set(Calendar.MONTH, Integer.parseInt(data[1]));
        calendar.set(Calendar.YEAR, Integer.parseInt(data[2]));

        MeuSigno meuSigno = new MeuSigno();
        signo = (TextView) findViewById(R.id.txtSigno);
        signo.setText(meuSigno.qualMeuSigno(calendar));
    }

    private DatePickerDialog.OnDateSetListener mDateSetListener =
            new DatePickerDialog.OnDateSetListener() {
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    ano = year;
                    mes = monthOfYear;
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
