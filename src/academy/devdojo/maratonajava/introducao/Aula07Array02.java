package academy.devdojo.maratonajava.introducao;

public class Aula07Array02 {
    public static void main(String[] args) {

        int[] numeros01 = new int[5];
        int[] numeros02 = {3, 4, 5, 9};
        int[] numeros03 = new int[]{6, 7, 8, 10};

        System.out.println("for");
        for (int i = 0; i < numeros02.length; i++) {
            System.out.println("Índice: " + i + " - " + numeros02[i]);
        }

        System.out.println("\nforeach");
        for (int i : numeros03) {
            System.out.println(i);
        }
    }
}
