from abc import ABC, abstractmethod

class Pago(ABC):
    @abstractmethod
    def procesar_pago(self):
        pass

class PagoConTarjeta(Pago):
    def procesar_pago(self):
        print("Procesando pago con tarjeta.")

class PagoConBitcoin(Pago):
    def procesar_pago(self):
        print("Procesando pago con Bitcoin.")

if __name__ == "__main__":
    pago = PagoConTarjeta()
    pago.procesar_pago()

    pago = PagoConBitcoin()
    pago.procesar_pago()
