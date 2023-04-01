package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        int numeroComCast = (int) 4294967296L;
        long numeroGrande = 100000;
        double numeroDecimal = 250.6;
        float numeroDecimalMenor = 514.14F;
        byte umByte = 15;
        short doisByte = 32767;
        boolean estado = true;
        char letra = 'A';
        char letraUnicode = '\u0054';
        String texto = "Este é um texto";

        System.out.println("letra unicode: "+letraUnicode);
        System.out.println("Número com cast: "+numeroComCast);
        System.out.println("Texto: "+texto);

    }
}
