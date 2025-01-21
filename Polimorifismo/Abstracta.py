from abc import ABC, abstractmethod

# Clase abstracta
class Figura(ABC):
    @abstractmethod
    def dibujar(self):
        pass  # Método abstracto

    @abstractmethod
    def calcular_area(self):
        pass  # Otro método abstracto

    def descripcion(self):
        print("Esto es una figura.")  # Método concreto

# Clase concreta que implementa los métodos abstractos
class Circulo(Figura):
    def __init__(self, radio):
        self.radio = radio

    def dibujar(self):
        print("Dibujando un círculo.")

    def calcular_area(self):
        return 3.14159 * self.radio * self.radio

figura = Circulo(5.0)
figura.dibujar()
figura.descripcion()
print("Área:", figura.calcular_area())
