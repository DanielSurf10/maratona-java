package academy.devdojo.maratonajava.introducao;

public class Aula06EstuturaDeRepeticao01 {
    public static void main(String[] args) {

        int count = 0;

        System.out.println("while");
        while (count < 10) {
            System.out.println(++count);
        }
        System.out.println("\n");

        System.out.println("do-while");
        do {
            System.out.println(count);
        } while (count-- > 0);
        System.out.println("\n");

        System.out.println("for");
        for (int i = 0; i <= 50; i += 5) {
            System.out.println(i);
        }
    }
}
