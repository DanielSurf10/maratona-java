package academy.exercicios.introducao;

import java.util.Random;

public class Exercicio08 {
    public static void main(String[] args) {
        double[] pesos = new double[150];
        double menorPeso = 0;
        Random random = new Random();

        for (int i = 0; i < pesos.length; i++) {
            pesos[i] = random.nextDouble(20, 100);
        }

        menorPeso = pesos[0];
        for (double peso : pesos) {
            if (peso < menorPeso) {
                menorPeso = peso;
            }
        }

        System.out.println("O menor peso é " + menorPeso);
    }
}
