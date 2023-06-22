package academy.exercicios.introducao;

public class Exercicio01 {
    public static void main(String[] args) {
        // Escreva um programa que pegue dois valores A e B e imprima todos os números
        // ímpares entre A e B.

        int a = 5;
        int b = 90;

        System.out.println("Ímpares entre " + a + " e " + b);
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
