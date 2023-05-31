package academy.devdojo.maratonajava.introducao;

public class Aula07Array01 {
    public static void main(String[] args) {

        // Arrays inicialização
        // byte, short, int, long, float, double = 0
        // char = '\u0000'
        // bool = false
        // String, object = null

        int[] numeros = new int[3]; // <- [0, 0, 0]

        numeros[0] = 10;
        numeros[1] = 12;
        numeros[2] = 20;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] * 8);
        }
    }
}
