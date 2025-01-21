#include <iostream>
using namespace std;

class Pago {
public:
    virtual void procesarPago() = 0;
};

class PagoConTarjeta : public Pago {
public:
    void procesarPago() override {
        cout << "Procesando pago con tarjeta." << endl;
    }
};

class PagoConBitcoin : public Pago {
public:
    void procesarPago() override {
        cout << "Procesando pago con Bitcoin." << endl;
    }
};

int main() {
    Pago* pago = new PagoConTarjeta();
    pago->procesarPago();

    pago = new PagoConBitcoin();
    pago->procesarPago();

    return 0;
}
