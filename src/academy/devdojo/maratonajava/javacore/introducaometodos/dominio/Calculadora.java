package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int numero1, int numero2) {
        System.out.println(numero1 * numero2);
    }

    public double divideDoisNumeros(double dividendo, double divisor) {
        if (divisor == 0) {
            return 0;
        }
        return dividendo / divisor;
    }
}
