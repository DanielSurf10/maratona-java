package academy.exercicios.introducao;

public class Exercicio02 {
    public static void main(String[] args) {
        // Escreva um programa que leia um número inteiro e mostre a sua conversão em binário.

        int numero = 25;
        String binario = "1";

        while (numero / 2 > 0) {
            binario = binario.concat(Integer.toString(numero % 2));
            numero /= 2;
        }
        System.out.println(binario);
    }
}
