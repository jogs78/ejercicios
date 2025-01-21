#include <iostream>
using namespace std;

class Checador {
public:
    void registrar() {
        cout << "Registrando entradas y salidas." << endl;
    }
};

class Empleado {
public:
    void guardarDatos() {
        cout << "Guardando datos del empleado." << endl;
    }
};

class GeneradorDeReportes {
public:
    void generarReporte() {
        cout << "Generando reporte." << endl;
    }
};

//estaria mal
class Oficina{
public:
    void guardarDatos() {
        cout << "Guardando datos del empleado." << endl;
    }
    void registrar() {
        cout << "Registrando entradas y salidas." << endl;
    }
    void generarReporte() {
        cout << "Generando reporte." << endl;
    }
};

int main() {
    Empleado empleado;
    Checador registro;
    GeneradorDeReportes reporte;
    Oficina oficina;

    //estaria mal
    oficina.guardarDatos();
    oficina.registrar();
    oficina.generarReporte();

    //deberia ser
    empleado.guardarDatos();
    registro.registrar();
    reporte.generarReporte();

    return 0;
}
