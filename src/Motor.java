public class Motor {
    // Atributos public
    public String nombre;
    public double potencia;

    // Atributos con acceso por defecto
    double velocidad;
    boolean encendido;

    // Métodos public
    public void encender() {
        encendido = true;
        System.out.println(nombre + " encendido.");
    }

    public void mostrarInformacion() {
        System.out.println("Motor: " + nombre);
        System.out.println("Potencia: " + potencia + " kW");
        System.out.println("Velocidad: " + velocidad + " rpm");
        System.out.println("Encendido: " + encendido);
    }

    // Métodos con acceso por defecto
    void apagar() {
        encendido = false;
        velocidad = 0;
        System.out.println(nombre + " apagado.");
    }

    void mostrarEstado() {
        if (encendido) {
            System.out.println(nombre + " está ENCENDIDO.");
        } else {
            System.out.println(nombre + " está APAGADO.");
        }
    }
}