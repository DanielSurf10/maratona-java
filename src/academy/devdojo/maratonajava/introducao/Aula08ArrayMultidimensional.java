package academy.devdojo.maratonajava.introducao;

public class Aula08ArrayMultidimensional {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][3];

        arrayInt[0][0] = 0;
        arrayInt[0][1] = 1;
        arrayInt[0][2] = 2;

        arrayInt[1][0] = 10;
        arrayInt[1][1] = 11;
        arrayInt[1][2] = 12;

        for (int[] i : arrayInt) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        int[][] arrayInt2 = new int[4][];

        arrayInt2[0] = new int[2];
        arrayInt2[1] = new int[4];
        arrayInt2[2] = new int[6];
        arrayInt2[3] = new int[3];


        System.out.println();
        for (int i = 0; i < arrayInt2.length; i++) {
            for (int j = 0; j < arrayInt2[i].length; j++) {
                System.out.print(i + "" + j + " ");
            }
            System.out.println();
        }

        int[][] arrayint3 = {{1,2,3},{0,1,2,3,4},{7,9,10,12}};

        System.out.println();
        for (int[] i : arrayint3) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
