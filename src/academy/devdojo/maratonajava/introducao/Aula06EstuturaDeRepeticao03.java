package academy.devdojo.maratonajava.introducao;

public class Aula06EstuturaDeRepeticao03 {
    public static void main(String[] args) {
        System.out.println("continue");
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("\nbreak");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}
