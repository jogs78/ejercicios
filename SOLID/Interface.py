from abc import ABC, abstractmethod

#Seria incorrecto
class Dispositivo:
    @abstractmethod
    def apagar(self):
        pass
    @abstractmethod
    def reiniciar(self):
        pass
    @abstractmethod
    def tomarFoto(self):
        pass


#Lo correcto es crear interfaces con menos métodos
class Electronico(ABC):
    @abstractmethod
    def apagar(self):
        pass
    @abstractmethod
    def reiniciar(self):
        pass

class Camara(ABC):
    @abstractmethod
    def tomarFoto(self):
        pass

class Computadora(Electronico):
    def apagar(self):
        print("Apagando computadora.")

    def reiniciar(self):
        print("Reiniciando computadora.")


class Celular(Electronico, Camara):
    def apagar(self):
        print("Apagando teléfono.")
    def reiniciar(self):
        print("Reiniciando teléfono.")
    def tomarFoto(self):
        print("Tomando foto con el teléfono.")

if __name__ == "__main__":
    dispositivo_digital = Computadora()
    dispositivo_digital.apagar()
    dispositivo_digital.reiniciar()

    otro = Celular()
    otro.apagar();
    otro.reiniciar();
