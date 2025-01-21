
abstract class Pago {
    public abstract void procesarPago();
}

class PagoConTarjeta extends Pago {
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta.");
    }
}ja

class PagoConBitcoin extends Pago {
    public void procesarPago() {
        System.out.println("Procesando pago con Bitcoin.");
    }
}

public class Open {
    public static void main(String[] args) {
        Pago pago = new PagoConTarjeta();
        pago.procesarPago();

        pago = new PagoConBitcoin();
        pago.procesarPago();
    }
}
