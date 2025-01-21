class Animal:
    def hacer_sonido(self):
        print("Haciendo sonido.")

class Perro(Animal):
    def hacer_sonido(self):
        print("Guau!")

if __name__ == "__main__":
    animal = Perro()
    animal.hacer_sonido()
