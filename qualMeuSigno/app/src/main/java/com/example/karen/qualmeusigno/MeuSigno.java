package com.example.karen.qualmeusigno;

import java.util.Calendar;

/**
 * Created by Karen on 01/05/2018.
 */

public class MeuSigno {

    String signo;
    String imagem;
    int indice;

    public String qualMeuSigno(Calendar calendar) {
        int mes = calendar.get(Calendar.MONTH);
        int dia = calendar.get(Calendar.DAY_OF_MONTH);

        if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) { //Aquário 20 de Janeiro – 18 de Fevereiro
            this.setSigno("Aquário");
            this.setImagem("aquario");
            this.setIndice(1);
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) { //Peixe 19 de Fevereiro – 20 de Março
            this.setSigno("Peixe");
            this.setImagem("peixes");
            this.setIndice(2);
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) { //Áries 21 de Março – 19 de Abril
            this.setSigno("Áries");
            this.setImagem("aries");
            this.setIndice(3);
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) { //Touro 20 de Abril – 20 de Maio
            this.setSigno("Touro");
            this.setImagem("touro");
            this.setIndice(4);
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) { //Gêmeos 21 de Maio – 20 de Junho
            this.setSigno("Gêmeos");
            this.setImagem("gemeos");
            this.setIndice(5);
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) { //Câncer 21 de Junho – 22 de Julho
            this.setSigno("Câncer");
            this.setImagem("cancer");
            this.setIndice(6);
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) { //Leão 23 de Julho – 22 de Agosto
            this.setSigno("Leão");
            this.setImagem("leao");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) { //Virgem 23 de Agosto – 22 de Setembro
            this.setSigno("Virgem");
            this.setImagem("virgem");
            this.setIndice(7);
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) { //Libra 23 de Setembro – 22 de Outubro
            this.setSigno("Libra");
            this.setImagem("libra");
            this.setIndice(8);
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) { //Escorpião October 23 - November 21
            this.setSigno("Escorpião");
            this.setImagem("escorpiao");
            this.setIndice(9);
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) { //Sagitário 22 de Novembro – 21 de Dezembro
            this.setSigno("Sagitário");
            this.setImagem("sagitario");
            this.setIndice(10);
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) { //Capricórnio 22 de Dezembro – 19 de Janeiro
            this.setSigno("Capricórnio");
            this.setImagem("capricornio");
            this.setIndice(11);
        }
        return this.getSigno();
    }

    public String signosCompativeis(int indice) {
        String resultado = null;
        switch (indice) {
            case 1:
                resultado = " leão, capricórnio e peixes.";
                break;
            case 2:
                resultado = " virgem, Áries e sagitário.";
                break;
            case 3:
                resultado = " Libra, touro e câncer.";
                break;
            case 4:
                resultado = " Escorpião, gêmeos e leão.";
                break;
            case 5:
                resultado = " Sagitário, câncer e virgem";
                break;
            case 6:
                resultado = " capricórnio, áries e libra.";
                break;
            case 7:
                resultado = " Aquário,  touro e virgem.";
                break;
            case 8:
                resultado = " Libra, peixes e o sagitário";
                break;
            case 9:
                resultado = " Áries, touro e câncer.";
                break;
            case 10:
                resultado = " touro, sagitário e aquário.";
                break;
            case 11:
                resultado = " Peixes, virgem e capricórnio";
                break;
            case 12:
                resultado = "Câncer, aquário e libra ";
                break;
            default:
                resultado = null;
        }

        return resultado;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }
}
