package academy.exercicios.introducao;

public class Exercicio03 {
    public static void main(String[] args) {
        // Escreva um programa que leia um número inteiro e indique se ele faz
        // parte da sequência de Fibonacci.

        int numero = 34;

        int contador1 = 0;
        int contador2 = 1;
        boolean isNumeroFibonacci = false;

        while (contador1 <= numero) {
            if (numero == contador1 || numero == contador2) {
                isNumeroFibonacci = true;
            }

            contador1 += contador2;
            contador2 += contador1;
        }

        System.out.println("O número " + numero + (isNumeroFibonacci ? " ": " não ") + "faz parte da sequência");
    }
}
