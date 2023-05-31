package academy.devdojo.maratonajava.introducao;

public class Aula06EstuturaDeRepeticao02 {
    public static void main(String[] args) {

        // Mostrar na tela todos os números pares de 1 a 1000

        for (int i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
