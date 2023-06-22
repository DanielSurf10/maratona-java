package academy.exercicios.introducao;

public class Exercicio04 {
    public static void main(String[] args) {
        // Escreva um programa que determine se uma cadeia de caracteres é um palíndromo ou não.
        // Um palíndromo é uma cadeia que é igual à sua inversa.

        String string = "atorredaderrota";
        boolean isPalindromo = true;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - 1 - i)) {
                isPalindromo = false;
                break;
            }
        }

        System.out.println("A palavra " + string + (isPalindromo ? " " : " não ") + "é palíndroma");
    }
}
