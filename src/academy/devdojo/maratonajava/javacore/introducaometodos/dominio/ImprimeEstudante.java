package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class ImprimeEstudante {
    public static void imprime(Estudante estudante) {
        System.out.println("--------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        // estudante.nome = "Alguém";
    }
}
