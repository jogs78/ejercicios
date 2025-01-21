from abc import ABC, abstractmethod

class BaseDeDatos(ABC):
    @abstractmethod
    def conectar(self):
        pass

class MySQL(BaseDeDatos):
    def conectar(self):
        print("Conectando a MySQL.")

class PostgresSQL(BaseDeDatos):
    def conectar(self):
        print("Conectando a PostgresSQL.")

class Controlador:
    def __init__(self):
        self.db = None

    def Asignar(self, db: BaseDeDatos):
        self.db = db


    def realizar_accion(self):
        self.db.conectar()
        print("Acción realizada.")

if __name__ == "__main__":
    db = MySQL()
    db2 = PostgresSQL()
    controlador = Controlador()
    controlador.Asignar(db)
    controlador.realizar_accion()
    controlador.Asignar(db2)
    controlador.realizar_accion()
