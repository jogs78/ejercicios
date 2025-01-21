// Esta es una de las estrategias para realizar el Polimorfismo Paramétrico (Plantillas/Genéricos)
// Clase genérica Bolsa
class Bolsa<T> {
    private T contenido;

    // Constructor para inicializar el contenido
    public Bolsa(T contenido) {
        this.contenido = contenido;
    }

    // Método para mostrar el contenido
    public void mostrarContenido() {
        System.out.println("Contenido: " + contenido);
    }
}

// Clase principal llamada Plantilla
public class Plantilla {
    public static void main(String[] args) {
        // Crear instancias de Bolsa con diferentes tipos de datos
        Bolsa<Integer> bolsa_enteros = new Bolsa<>(123);
        Bolsa<String> bolsa_Cadenas = new Bolsa<>("Hola Mundo");
        Bolsa<Double> bolsa_dobles = new Bolsa<>(3.14);

        // Mostrar el contenido de cada bolsa
        bolsa_enteros.mostrarContenido();
        bolsa_Cadenas.mostrarContenido();
        bolsa_dobles.mostrarContenido();
    }
}
