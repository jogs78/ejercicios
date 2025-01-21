// Clase EnchufeEuropeo
class EnchufeEuropeo {
    public void conectar() {
        System.out.println("Enchufe europeo conectado.");
    }
}

// Clase EnchufeAmericano
class EnchufeAmericano {
    public void enchufar() {
        System.out.println("Enchufe americano conectado.");
    }
}

// Clase Adaptador que adapta EnchufeAmericano a EnchufeEuropeo
class Adaptador extends EnchufeEuropeo {
    private EnchufeAmericano enchufeAmericano;

    public Adaptador(EnchufeAmericano enchufe) {
        this.enchufeAmericano = enchufe;
    }

    @Override
    public void conectar() {
        enchufeAmericano.enchufar();
    }
}

// Clase principal para probar el adaptador
public class Adapter {
    public static void main(String[] args) {
        EnchufeAmericano enchufeAmericano = new EnchufeAmericano();
        Adaptador adaptador = new Adaptador(enchufeAmericano);

        adaptador.conectar();
    }
}