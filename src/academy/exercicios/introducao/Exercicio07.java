package academy.exercicios.introducao;

import java.util.Random;

public class Exercicio07 {

    public static double[] geraListaSalarioFuncionarios(int quantidadeDeFuncionarios) {

        double[] salarios = new double[quantidadeDeFuncionarios];
        Random random = new Random();

        for (int i = 0; i < salarios.length; i++) {
            salarios[i] = random.nextDouble(10000);
        }

        return salarios;
    }

    public static double mediaSalarioFuncionarios(double[] salariosFuncionarios) {
        double media = 0;

        for (double salario : salariosFuncionarios) {
            media += salario;
        }
        media /= salariosFuncionarios.length;

        return media;
    }

    public static void main(String[] args) {
        // Uma empresa precisa realizar uma estatística do salário de seus funcionários.
        // Para isto precisa de um programa que leia uma lista contendo os salários dos funcionários da empresa,
        // e imprima quantos funcionários ganham salário acima da média.
        // Sabe-se que a empresa possui 50 funcionários.
        //      - Considerando que não há um número fixo de 50 funcionários, o programa pergunta no início
        //      quantos funcionários possui a empresa e reliza o restante do processo.

        int numeroDeFuncionarios = 50;
        double[] salariosFuncionarios = geraListaSalarioFuncionarios(numeroDeFuncionarios);
        int contadorSalariosAcimaDaMedia = 0;
        int cotador = 0;
        double media = mediaSalarioFuncionarios(salariosFuncionarios);

        for (double salario : salariosFuncionarios) {
            if (salario > media) {
                cotador++;
            }
        }

        System.out.println("São " + numeroDeFuncionarios + " funcionários e " + cotador + " estão acima da média salarial");
    }
}
