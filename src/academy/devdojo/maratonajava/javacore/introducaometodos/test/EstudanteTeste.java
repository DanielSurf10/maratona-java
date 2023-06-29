package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.ImprimeEstudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "Ana";
        estudante1.idade = 21;
        estudante1.sexo = 'F';

        estudante2.nome = "Marcia";
        estudante2.idade = 30;
        estudante2.sexo = 'F';

        ImprimeEstudante.imprime(estudante1);
        ImprimeEstudante.imprime(estudante2);
    }
}
