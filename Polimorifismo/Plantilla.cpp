#include <iostream>
using namespace std;

// Esta es una de las estrategias para realizar el Polimorfismo Paramétrico (Plantillas/Genéricos)
template <typename T>
class Bolsa {
private:
    T contenido;
public:
    Bolsa(T c){
        contenido = c;
    }
    void mostrarContenido() {
        cout << "Contenido: " << contenido << endl;
    }
};

int main() {
    Bolsa<int> bolsa_enteros(123);
    Bolsa<string> bolsa_cadenas("Hola Mundo");
    Bolsa<double> boslsa_dobles(3.14);
//    Bolsa<Carro>
    //CasaAzul
    //casaAzul
    //CasaAzul
    //casa_azul
    ////casa-azul
    bolsa_enteros.mostrarContenido();
    bolsa_cadenas.mostrarContenido();
    boslsa_dobles.mostrarContenido();

    return 0;
}
