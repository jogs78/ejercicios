//Seria incorrectos
interface Dispositivo{
    void apagar();
    void reiniciar();
    void tomarFoto();
}

//Lo correcto es crear interfaces con menos métodos
interface Electronico {
    void apagar();
    void reiniciar();
}

interface Camara {
    void tomarFoto();
}

// La computadora solo implementa las interfaces que necesita
class Computadora implements Electronico {
    public void apagar() {
        System.out.println("Apagando computadora.");
    }

    public void reiniciar() {
        System.out.println("Reiniciando computadora.");
    }
}

// Un teléfono, por ejemplo, implementa las interfaces que necesita
class Celular implements Electronico, Camara {
    public void apagar() {
        System.out.println("Apagando teléfono.");
    }

    public void reiniciar() {
        System.out.println("Reiniciando teléfono.");
    }

    public void tomarFoto() {
        System.out.println("Tomando foto con el teléfono.");
    }
}

public class Interface{
    public static void main(String[] args) {

        Computadora dispositivo_digital = new Computadora() ;
        dispositivo_digital.apagar();
        dispositivo_digital.reiniciar();

        Celular otro = new Celular() ;
        otro.apagar();
        otro.reiniciar();

    }

}