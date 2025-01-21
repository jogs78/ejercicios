import java.util.Date;

class Single {
    private static Single instance;
    private long time_stamp;

    private Single() { 
        this.time_stamp = System.currentTimeMillis();
    }

    public static Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }

    public void mostrarMensaje() {
        Date date = new Date(time_stamp);
        System.out.println("¡Hola Timestamp de creación: " + date.toString());
    }
}

public class Singleton{
    public static void main(String[] args) {
        Single singleton = Single.getInstance();
        singleton.mostrarMensaje();
    }
}


