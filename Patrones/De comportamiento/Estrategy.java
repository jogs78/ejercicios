// Interfaz Estrategia
interface MetodoPago {
    void pagar(double cantidad);
}

// Estrategia concreta: Pago con BitCoin
class PagoBitCoin implements MetodoPago {
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pagando " + cantidad + " con bit coins.");
    }
}

// Estrategia concreta: Pago con PayPal
class PagoPayPal implements MetodoPago {
    @Override
    public void pagar(double cantidad) {
        System.out.println("Pagando " + cantidad + " con PayPal.");
    }
}

// Contexto que usa las estrategias
class ProcesadorPago {
    private MetodoPago metodoPago;

    public ProcesadorPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesarPago(double cantidad) {
        metodoPago.pagar(cantidad);
    }
}
