// Interfaz Componente
interface Componente {
 void mostrar();
}

// Clase Hoja: representa un archivo individual
class Archivo implements Componente {
 private String nombre;

 public Archivo(String nombre) {
     this.nombre = nombre;
 }

 @Override
 public void mostrar() {
     System.out.println("Archivo: " + nombre);
 }
}

// Clase Compuesta: representa una carpeta que puede contener archivos y otras carpetas
class Carpeta implements Componente {
 private String nombre;
 private List<Componente> componentes = new ArrayList<>();

 public Carpeta(String nombre) {
     this.nombre = nombre;
 }

 public void agregar(Componente componente) {
     componentes.add(componente);
 }

 public void eliminar(Componente componente) {
     componentes.remove(componente);
 }

 @Override
 public void mostrar() {
     System.out.println("Carpeta: " + nombre);
     for (Componente componente : componentes) {
         componente.mostrar();
     }
 }
}

// Clase principal
public class Composite {
 public static void main(String[] args) {
     // Creando archivos individuales
     Archivo archivo1 = new Archivo("documento.txt");
     Archivo archivo2 = new Archivo("imagen.jpg");
     Archivo archivo3 = new Archivo("video.mp4");

     // Creando carpetas
     Carpeta carpeta1 = new Carpeta("Carpeta Personal");
     Carpeta carpeta2 = new Carpeta("Carpeta de Trabajo");

     // Agregando archivos a las carpetas
     carpeta1.agregar(archivo1);
     carpeta1.agregar(archivo2);

     carpeta2.agregar(archivo3);

     // Creando una carpeta raíz y agregando las carpetas
     Carpeta carpetaRaiz = new Carpeta("Raiz");
     carpetaRaiz.agregar(carpeta1);
     carpetaRaiz.agregar(carpeta2);

     // Mostrando la estructura del sistema de archivos
     carpetaRaiz.mostrar();
 }
}