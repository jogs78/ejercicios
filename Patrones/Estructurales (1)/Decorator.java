interface Bebida {
 String descripcion();
 double costo();
}

class Cafe implements Bebida {
 public String descripcion() {
     return "Café";
 }

 public double costo() {
     return 1.99;
 }
}

class LecheDecorator implements Bebida {
 private Bebida bebida;

 public LecheDecorator(Bebida bebida) {
     this.bebida = bebida;
 }

 public String descripcion() {
     return bebida.descripcion() + ", Leche";
 }

 public double costo() {
     return bebida.costo() + 0.50;
 }
}

class AzucarDecorator implements Bebida {
 private Bebida bebida;

 public AzucarDecorator(Bebida bebida) {
     this.bebida = bebida;
 }

 public String descripcion() {
     return bebida.descripcion() + ", Azúcar";
 }

 public double costo() {
     return bebida.costo() + 0.25;
 }
}

public class Decorator {
 public static void main(String[] args) {
     Bebida bebida = new Cafe();
     bebida = new LecheDecorator(bebida);
     bebida = new AzucarDecorator(bebida);

     System.out.println(bebida.descripcion());
     System.out.println("Costo: " + bebida.costo());
 }
}
