package academy.exercicios.introducao;

import java.util.Arrays;
import java.util.Random;

public class Exercicio09 {

    public static double[] geraListaPesos(int quantidade) {
        double[] pesos = new double[quantidade];
        Random random = new Random();

        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = random.nextDouble(20, 100);
        }

        Arrays.sort(pesos);
        return pesos;
    }

    public static double[] mergeListaPesos(double[] lista1, double[] lista2) {
        double[] listaMerged = new double[lista1.length + lista2.length];
        int contadorPeso1 = 0;
        int contadorPeso2 = 0;

        for (int i = 0; i < listaMerged.length; i++) {
            if (contadorPeso1 != lista1.length && contadorPeso2 != lista2.length) {
                if (lista1[contadorPeso1] < lista2[contadorPeso2]) {
                    listaMerged[i] = lista1[contadorPeso1++];
                } else {
                    listaMerged[i] = lista2[contadorPeso2++];
                }
            } else {
                if (contadorPeso1 == lista1.length) {
                    listaMerged[i] = lista2[contadorPeso2++];
                } else {
                    listaMerged[i] = lista1[contadorPeso1++];
                }
            }
        }

        return listaMerged;
    }

    public static void main(String[] args) {
        // Escreva uma função que receba como parâmetros dois vetores (vetor 1 e vetor 2) contendo duas listas
        // de pesos que já estão classificadas em ordem.
        // A função deverá fazer um merge do conteúdo dos dois vetores em um terceiro
        // (vetor resultante retornado pela função) mantendo, porém, a ordem

        double[] pesos1 = geraListaPesos(10);
        double[] pesos2 = geraListaPesos(7);
        double[] listaDePesos = mergeListaPesos(pesos1, pesos2);

        System.out.println("Pesos 1");
        for (double peso : pesos1) {
            System.out.println(peso);
        }

        System.out.println("\nPesos 3");
        for (double peso : pesos2) {
            System.out.println(peso);
        }

        System.out.println("\nPesos juntos");
        for (double peso : listaDePesos) {
            System.out.println(peso);
        }
    }
}
