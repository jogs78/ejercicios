public class Carro {
    private String marca;
    private String modelo;
    private String color;
    private String motor;

    // Constructor privado
    private Carro(CarroBuilder builder) {
        this.marca = builder.marca;
        this.modelo = builder.modelo;
        this.color = builder.color;
        this.motor = builder.motor;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + "]";
    }

    // Clase Builder
    public static class CarroBuilder {
        private String marca;
        private String modelo;
        private String color;
        private String motor;

        // Métodos para cada atributo del Carro
        public CarroBuilder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public CarroBuilder setModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public CarroBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarroBuilder setMotor(String motor) {
            this.motor = motor;
            return this;
        }

        // Método que construye el objeto final
        public Carro build() {
            return new Carro(this);
        }
    }
}
