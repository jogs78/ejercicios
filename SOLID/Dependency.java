interface BaseDeDatos { //Clase abstracta
    void conectar();
}

class MySQL implements BaseDeDatos { //MySQL es clases concreta
    public void conectar() {
        System.out.println("Conectando a MySQL.");
    }
}

class PostgresSQL implements BaseDeDatos { //PostgresSQL es clases concreta
    public void conectar() {
        System.out.println("Conectando a PostgresSQL.");
    }
}

class Controlador { // Controlador es la clase que implementa (que usa)
    private BaseDeDatos db;
    
    public Controlador() {
        this.db = null;
    }
    public void Asignar(BaseDeDatos db) {
        this.db = db;
    }

    public void realizarAccion() {
        db.conectar();
        System.out.println("Acción realizada.");
    }
}

public class Dependency {
    public static void main(String[] args) {
        BaseDeDatos db = new MySQL();
        BaseDeDatos db2 = new PostgresSQL();

        Controlador controlador = new Controlador();
        controlador.Asignar(db);
        controlador.realizarAccion();
        controlador.Asignar(db2);
        controlador.realizarAccion();
    }
}
