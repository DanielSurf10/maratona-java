package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        int num01 = 10, num02 = 20;

        // Aritiméticos: + - * / %
        int soma = num01 + num02;
        int subtracao = num01 - num02;
        int multiplicacao = num01 * num02;
        double divisao = (double) num01 / num02;
        int resto = num01 % 3;

        // Relacionais: < > == <= >= !=
        boolean isNum01MaiorQueNum02 = num01 > num02;
        boolean isNum01MenorQueNum02 = num01 < num02;
        boolean isNum01IgualQueNum02 = num01 == num02;
        boolean isNum01DiferenteDeNum02 = num01 != num02;

        // Lógicos: && (AND)  || (OR)  ^ (XOR)  ! (NOT)
        boolean AND = isNum01MaiorQueNum02 && isNum01MenorQueNum02;
        boolean OR = isNum01MenorQueNum02 || isNum01IgualQueNum02;
        boolean XOR = isNum01IgualQueNum02 || isNum01DiferenteDeNum02;
        boolean NOT = !isNum01MaiorQueNum02;

        // Atribuição: += -= *= /= %= ++ --
        num01 += 10;
        num02 -= 10;
        num02 *= num01;
        num01 /= 2;
        num02 %= 3;

        int outraSoma = 10;
        int somaDiferente = 5;

        System.out.println(outraSoma++);
        System.out.println(outraSoma);
        System.out.println(--somaDiferente);

    }
}
