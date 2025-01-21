import java.util.Random;
import java.util.Scanner;


public class Principal {

    public void probarSingleton(){
        System.out.println("Creando una sola instancia del single");
        Single unica = Single.getInstance();
        unica.mostrarMensaje();
    }

    public void probarFactory(){
        String tipo = new String[]{"coche", "moto"}[new Random().nextInt(2)];
        Vehiculo vehiculo = Fabirca.crearVehiculo(tipo);
        vehiculo.conducir();

    }

    public void probarBuilder(){
        Carro carro1 = new Carro.CarroBuilder()
                        .setMarca("Toyota")
                        .setModelo("Corolla")
                        .setColor("Rojo")
                        .setMotor("V6")
                        .build();

        Carro carro2 = new Carro.CarroBuilder()
                        .setMarca("Honda")
                        .setModelo("Civic")
                        .setColor("Azul")
                        .setMotor("V4")
                        .build();

        System.out.println(carro1);
        System.out.println(carro2);

    }
    public void probarObserver(){
        Observado recurso = new Observado();
        Observer observador1 = new Observer("Observer 1");
        Observer observador2 = new Observer("Observer 2");

        recurso.agregarObserver(observador1);
        recurso.agregarObserver(observador2);

        recurso.setEstado("Cambio de estado!1");
        recurso.setEstado("Cambio de estado!2");
    }
    public void probarEstrategy(){
        ProcesadorPago procesador = new ProcesadorPago(new PagoBitCoin());
        procesador.procesarPago(250.00);

        // Cambiando al método de pago con PayPal
        procesador.setMetodoPago(new PagoPayPal());
        procesador.procesarPago(150.00);

    }
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Principal principal = new Principal();
        
        String opcion;
        
        // Bucle indefinido para el menú
        while (true) {
            System.out.println();
            // Mostrar el menú
            System.out.println("Elija una opción:");
            System.out.println("a) Probar el patrón Creacional Singleton");
            System.out.println("b) Probar el patrón Creacional Factory");
            System.out.println("c) Probar el patrón Creacional Builder");
            System.out.println("d) Probar el patrón De comportamieto Observer");
            System.out.println("e) Probar el patrón De comportamieto Estrategy");
            System.out.println("z) Salir");

            // Leer la opción del usuario
            opcion = scanner.nextLine().toLowerCase();

            // Ejecutar según la opción
            switch (opcion) {
                case "a":
                    principal.probarSingleton();
                    break;
                case "b":
                    principal.probarFactory();
                    break;
                case "c":
                    principal.probarBuilder();
                    break;
                    
                case "d":
                    principal.probarObserver();
                    break;

                case "e":
                    principal.probarEstrategy();
                    break;

                    
                case "z":
                    System.out.println("Saliendo...");
                    scanner.close();
                    return; // Termina el programa
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            try {
                Thread.sleep(2000); // Espera 2 segundos antes de mostrar el menú nuevamente
            } catch (InterruptedException e) {
                e.printStackTrace();
            }            
        }
    }
}
