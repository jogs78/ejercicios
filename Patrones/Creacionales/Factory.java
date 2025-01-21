
interface Vehiculo {
    void conducir();
}

class Coche implements Vehiculo {
    public void conducir() {
        System.out.println("Conduciendo un coche");
    }
}

class Moto implements Vehiculo {
    public void conducir() {
        System.out.println("Conduciendo una moto");
    }
}

class Fabirca {
    public static Vehiculo crearVehiculo(String tipo) {
        if (tipo.equals("coche")) {
            return new Coche();
        } else if (tipo.equals("moto")) {
            return new Moto();
        }
        return null;
    }
}

class Factory {
    public static void main(String[] args) {
        Vehiculo vehiculo = Fabirca.crearVehiculo("coche");
        vehiculo.conducir();
    }

}