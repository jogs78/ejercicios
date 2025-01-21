import java.util.ArrayList;
import java.util.List;

public class Observer{
    private String nombre;

    public Observer(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió el mensaje: " + mensaje);
    }
}


class Observado {
    private List<Observer> observadores = new ArrayList<>();
    private String estado;

    public void agregarObserver(Observer observador) {
        observadores.add(observador);
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarObserveres();
    }

    public void notificarObserveres() {
        for (Observer observador : observadores) {
            observador.actualizar(estado);
        }
    }
}

/* 
public class Principal {
    public static void main(String[] args) {
    }
}
    */
