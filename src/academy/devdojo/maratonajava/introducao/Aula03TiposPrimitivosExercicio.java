package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salário de <salário>, nada data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Daniel";
        String endereco = "Rua tal";
        double salario = 2500;
        int dia = 10, mes = 5, ano = 2020;

        System.out.println("Eu "+nome+", morando no endereço "+endereco+",");
        System.out.println("confirmo que recebi o sálario de "+salario+", nada data "+dia+"/"+mes+"/"+ano);
    }
}
