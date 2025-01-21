class Oficina:
    def generar_reporte(self):
        print("Generando reporte.")
    def registrar(self):
        print("Registrando entradas y salidas.")
    def guardar_datos(self):
        print("Guardando datos del empleado.")



class Checador:
    def registrar(self):
        print("Registrando entradas y salidas.")

class Empleado:
    def guardar_datos(self):
        print("Guardando datos del empleado.")

class GeneradorDeReportes:
    def generar_reporte(self):
        print("Generando reporte.")

if __name__ == "__main__":
    empleados = Empleado()
    registros = Checador()
    reporte = GeneradorDeReportes()
    oficina = Oficina()
    # mal
    oficina.guardar_datos()
    oficina.registrar()
    oficina.generar_reporte()
    #debe ser
    empleados.guardar_datos()
    registros.registrar()
    reporte.generar_reporte()
