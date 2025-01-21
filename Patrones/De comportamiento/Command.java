interface Comando {
 void ejecutar();
}

class LuzEncendidaCommand implements Comando {
 private Luz luz;

 public LuzEncendidaCommand(Luz luz) {
     this.luz = luz;
 }

 public void ejecutar() {
     luz.encender();
 }
}

class LuzApagadaCommand implements Comando {
 private Luz luz;

 public LuzApagadaCommand(Luz luz) {
     this.luz = luz;
 }

 public void ejecutar() {
     luz.apagar();
 }
}

class Luz {
 public void encender() {
     System.out.println("La luz está encendida");
 }

 public void apagar() {
     System.out.println("La luz está apagada");
 }
}

class ControlRemoto {
 private Comando comando;

 public void setComando(Comando comando) {
     this.comando = comando;
 }

 public void presionarBoton() {
     comando.ejecutar();
 }
}

public class Command {
 public static void main(String[] args) {
     Luz luz = new Luz();
     Comando luzEncendida = new LuzEncendidaCommand(luz);
     Comando luzApagada = new LuzApagadaCommand(luz);

     ControlRemoto control = new ControlRemoto();
     control.setComando(luzEncendida);
     control.presionarBoton();

     control.setComando(luzApagada);
     control.presionarBoton();
 }
}
