# No se demuestra como tal la carteristica por su  naturaleza dinámica que no especifica tipos de datos.
# Clase genérica Bolsa
class Bolsa:
    def __init__(self, contenido):
        self.contenido = contenido

    # Método para mostrar el contenido
    def mostrar_contenido(self):
        print(f"Contenido: {self.contenido}")


# Clase principal llamada Plantilla
def main():
    # Crear instancias de Bolsa con diferentes tipos de datos
    bolsa_enteros = Bolsa(123)
    bolsa_cadenas = Bolsa("Hola Mundo")
    bolsa_dobles = Bolsa(3.14)

    # Mostrar el contenido de cada bolsa
    bolsa_enteros.mostrar_contenido()
    bolsa_cadenas.mostrar_contenido()
    bolsa_dobles.mostrar_contenido()


# Ejecutar el programa
if __name__ == "__main__":
    main()
