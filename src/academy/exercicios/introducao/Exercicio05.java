package academy.exercicios.introducao;

public class Exercicio05 {

    public static boolean verficaPrimo(long numero) {

        if (numero == 0 || numero == 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int numero = 1000;
        int contadorPrimoPrint = 0;

        System.out.println("Lista de números primos de 0 a " + numero);
        for (int i = 0; i < numero; i++) {
            if (verficaPrimo(i)) {
                System.out.print(i + " ");
                contadorPrimoPrint++;
            }
            if (contadorPrimoPrint == 10) {
                System.out.println();
                contadorPrimoPrint = 0;
            }
        }
    }
}
