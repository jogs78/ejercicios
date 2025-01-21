class Oficina {
    public void registrar() {
        System.out.println("Registrando entradas y salidas.");
    }
    public void guardarDatos() {
        System.out.println("Guardando datos del empleado.");
    }
    public void generarReporte() {
        System.out.println("Generando reporte.");
    }
}

class Checador {
    public void registrar() {
        System.out.println("Registrando entradas y salidas.");
    }
}

class Empleado {
    public void guardarDatos() {
        System.out.println("Guardando datos del empleado.");
    }
}

class GeneradorDeReportes {
    public void generarReporte() {
        System.out.println("Generando reporte.");
    }
}

public class Single {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        Checador registro = new Checador();
        GeneradorDeReportes reporte = new GeneradorDeReportes();
        Oficina oficina = new Oficina();

        //mal
        oficina.guardarDatos();
        oficina.registrar();
        oficina.generarReporte();

        //bien
        empleado.guardarDatos();
        registro.registrar();
        reporte.generarReporte();
    }
}
