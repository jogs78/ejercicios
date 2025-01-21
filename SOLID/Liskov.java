
class Animal {
    public void hacerSonido() {
        System.out.println("Haciendo sonido.");
    }
}

class Perro extends Animal {
    public void hacerSonido() {
        System.out.println("Guau!");
    }
}

public class Liskov {
    public static void main(String[] args) {


        Animal animal = new Perro();
        animal.hacerSonido();


    }
}
