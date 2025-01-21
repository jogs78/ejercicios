// Las clases abstractas nos ayudan a realizar el Polimorfismo de Inclusión
// Clase abstracta
abstract class Figura {
    abstract void dibujar(); // Método abstracto
    abstract double calcularArea(); // Otro método abstracto

    void descripcion() {
        System.out.println("Esto es una figura."); // Método concreto
    }
}

// Clase concreta que implementa los métodos abstractos
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    void dibujar() {
        System.out.println("Dibujando un círculo.");
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

public class Abstracta {
    public static void main(String[] args) {
        Figura figura = new Circulo(5.0);
        figura.dibujar();
        figura.descripcion();
        System.out.println("Área: " + figura.calcularArea());
    }
}