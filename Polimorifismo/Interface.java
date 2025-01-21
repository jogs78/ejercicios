// Definición de la interfaz Animal
interface Animal {
    void hacerSonido(); // Método abstracto
}

// Clase Perro que implementa la interfaz Animal
class Perro implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Guau, guau!");
    }
    public void moverse(){
        System.out.println("Va de aquí para allá");   
    }
}

// Clase Gato que implementa la interfaz Animal
class Gato implements Animal {
    @Override
    public void hacerSonido() {
        System.out.println("¡Miau, miau!");
    }
}

// Clase principal para probar la interfaz y las clases que la implementan
public class Interface {
    public static void main(String[] args) {
        Animal perro = new Perro(); // Variable polimórfica
        Animal gato = new Gato();   // Variable polimórfica
        perro.hacerSonido();
        gato.hacerSonido();
    }
}
