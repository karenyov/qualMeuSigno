package com.example.karen.qualmeusigno;

import java.util.Calendar;

/**
 * Created by Karen on 01/05/2018.
 */

public class MeuSigno {

    String signo;

    public String qualMeuSigno(Calendar calendar) {
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) { //Aquário 20 de Janeiro – 18 de Fevereiro
            this.setSigno("Aquário");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) { //Peixe 19 de Fevereiro – 20 de Março
            this.setSigno("Peixe");
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) { //Áries 21 de Março – 19 de Abril
            this.setSigno("Áries");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) { //Touro 20 de Abril – 20 de Maio
            this.setSigno("Touro");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) { //Gêmeos 21 de Maio – 20 de Junho
            this.setSigno("Gêmeos");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) { //Câncer 21 de Junho – 22 de Julho
            this.setSigno("Câncer");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) { //Leão 23 de Julho – 22 de Agosto
            this.setSigno("Leão");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) { //Virgem 23 de Agosto – 22 de Setembro
            this.setSigno("Virgem");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) { //Libra 23 de Setembro – 22 de Outubro
            this.setSigno("Libra");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) { //Escorpião October 23 - November 21
            this.setSigno("Escorpião");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) { //Sagitário 22 de Novembro – 21 de Dezembro
            this.setSigno("Sagitário");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) { //Capricórnio 22 de Dezembro – 19 de Janeiro
            this.setSigno("Capricórnio");
        }
        return this.getSigno();
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
}
