package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturaCondicional01 {
    public static void main(String[] args) {
        int idade = 18;
        boolean maiorQue18 = idade >= 18;
        String permissao = "";

        if (maiorQue18) {
            permissao = "Pode comprar";
        } else {
            permissao = "Não pode comprar";
        }

        System.out.println(permissao);
    }
}
