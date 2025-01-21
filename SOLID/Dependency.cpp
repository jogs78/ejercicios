#include <iostream>
using namespace std;

class BaseDeDatos {
public:
    virtual void conectar() = 0;
};

class MySQL : public BaseDeDatos {
public:
    void conectar() override {
        cout << "Conectando a MySQL." << endl;
    }
};

class PostgresSQL : public BaseDeDatos {
public:
    void conectar() override {
        cout << "Conectando a PostgresSQL." << endl;
    }
};

class Controlador {
private:
    BaseDeDatos* db;
public:
    Controlador(){
        this->db = nullptr;
    }

    void Asignar(BaseDeDatos* db){
        this->db = db;
    }
    void realizarAccion() {
        db->conectar();
        cout << "Acción realizada." << endl;
    }
};

int main() {
    MySQL mysql;
    Controlador controlador;
    controlador.Asignar(&mysql);
    controlador.realizarAccion();

    PostgresSQL postgres;
    controlador.Asignar(&postgres);
    controlador.realizarAccion();

    return 0;
}
