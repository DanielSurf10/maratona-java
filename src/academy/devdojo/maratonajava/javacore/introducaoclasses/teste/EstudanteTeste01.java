package academy.devdojo.maratonajava.javacore.introducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Luffy";
        estudante.sexo = 'M';
        estudante.idade = 21;

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
