#include <iostream>
using namespace std;

class Animal {
public:
    virtual void hacerSonido() {
        cout << "Haciendo sonido." << endl;
    }
};

class Perro : public Animal {
public:
    void hacerSonido() override {
        cout << "Guau!" << endl;
    }
};

int main() {
    Animal* animal = new Perro();
    animal->hacerSonido();

    delete animal;
    return 0;
}
