#include <iostream>
using namespace std;

//Seria incorrecto
class Dispositivo{
    virtual void apagar() = 0;
    virtual void reiniciar() = 0;
    virtual void tomarFoto() = 0;
};

//Lo correcto es crear interfaces con menos métodos
class Electronico {
public:
    virtual void apagar() = 0;
    virtual void reiniciar() = 0;
};

class Camara {
public:
    virtual void tomarFoto() = 0;
};

class Computadora : public Electronico {
public:
    void apagar() override {
        cout << "Apagando computadora." << endl;
    }

    void reiniciar() override {
        cout << "Reiniciando computadora." << endl;
    }
};

class Celular : public Electronico, public Camara{
public:
    void apagar() override {
        cout << "Apagando teléfono." << endl;
    }

    void reiniciar() override {
        cout << "Reiniciando teléfono." << endl;
    }

    void tomarFoto() override {
        cout << "Tomando foto con el teléfono." << endl;
    }
};

int main() {
    Computadora dispositivo_digital;
    dispositivo_digital.apagar();
    dispositivo_digital.reiniciar();
    Celular otro;
    otro.apagar();
    otro.reiniciar();

    return 0;
}
