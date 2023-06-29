package academy.exercicios.introducao;

import java.util.ArrayList;
import java.util.List;

public class Exercicio06 {

    public static String[] messesDoAno = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

    public static String mesDoAnoSwitch(int mes) {

        return switch (mes) {
            case 1 -> "Janeiro";
            case 2 -> "Fevereiro";
            case 3 -> "Março";
            case 4 -> "Abril";
            case 5 -> "Maio";
            case 6 -> "Junho";
            case 7 -> "Julho";
            case 8 -> "Agosto";
            case 9 -> "Setembro";
            case 10 -> "Outubro";
            case 11 -> "Novembro";
            case 12 -> "Dezembro";
            default -> null;
        };
    }

    public static String mesDoAnoVetor(int mes) {
        return messesDoAno[mes - 1];
    }

    public static void main(String[] args) {
        // Escreva uma função que receba como parâmetro um número inteiro relativo a um mês do ano e
        // retorne uma string com o nome deste mês por extenso.
        // Resolva o problema de suas maneiras:
        //      - sem um vetor, através de uma estrutura switch/case;
        //      - com um vetor.

        System.out.println("Com switch");
        for (int i = 1; i <= 12; i++) {
            System.out.print(mesDoAnoSwitch(i) + " ");

            if (i % 6 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nCom vetor");
        for (int i = 1; i <= 12; i++) {
            System.out.print(mesDoAnoVetor(i) + " ");

            if (i % 6 == 0) {
                System.out.println();
            }
        }
    }
}
