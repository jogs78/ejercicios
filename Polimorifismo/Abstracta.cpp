#include <iostream>
using namespace std;

// Las clases abstractas nos ayudan a realizar el Polimorfismo de Inclusión (herencia)

class Figura { //esta es la clase abstracta
protected:
    double area;
public:
    Figura() {
        area = 0;
    }
    virtual void dibujar() = 0;
    virtual void calcularArea() = 0;    
    virtual void mostrarArea() {
        cout << "El area de la figura es: " << area << endl; //pero esta no se usara puesto que se sobreescribira
    }
    void descripcion() {
        cout << "Esto es una figura." << endl;
    }
};


class Circulo : public Figura { //esta es la clase concreta
private:
    double radio;
public:
//  Circulo(double r) : radio(r) {}
    Circulo(double r){
        radio = r;
    }
    void calcularArea() override {
        area = 3.141592659 * radio * radio;
    }
    void dibujar() override {
        cout << "Dibujando un circulo. "  << endl;
    }
    void descripcion ()  {
        cout << "Esto es una circulo." << endl;
    }

/*
    void mostrarArea() override {
        cout << "Area: " << area << endl;
    }
*/
};

int main() {

    Circulo figura(5.0);
    figura.dibujar();
    figura.descripcion();
    figura.calcularArea();
    figura.mostrarArea();
    return 0;
}