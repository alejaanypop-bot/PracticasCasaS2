public class Main {
    public static void main(String[] args) {

        // ===== EJERCICIO 1: PRODUCTOS =====
        System.out.println("===== PRODUCTOS =====");
        Producto producto1 = new Producto();
        Producto producto2 = new Producto();
        Producto producto3 = new Producto();

        producto1.nombre = "Audífonos Bluetooth";
        producto1.precio = 32.50;
        producto1.categoria = "Tecnología";
        producto1.disponible = true;

        producto2.nombre = "Mouse Gamer";
        producto2.precio = 18.99;
        producto2.categoria = "Computación";
        producto2.disponible = true;

        producto3.nombre = "Teclado Mecánico";
        producto3.precio = 45.00;
        producto3.categoria = "Computación";
        producto3.disponible = true;

        producto1.mostrarInformacion();
        producto1.mostrarPrecio();
        producto1.mostrarDisponibilidad();

        // Cambio solo el producto 1
        producto1.cambiarDisponibilidad(false);
        System.out.println("--- Después del cambio ---");
        producto1.mostrarDisponibilidad();
        producto2.mostrarDisponibilidad();
        producto3.mostrarDisponibilidad();

        // ===== EJERCICIO 2: TAREAS =====
        System.out.println();
        System.out.println("===== TAREAS =====");
        Tarea tarea1 = new Tarea();
        Tarea tarea2 = new Tarea();
        Tarea tarea3 = new Tarea();

        tarea1.titulo = "Diseñar base de datos";
        tarea1.responsable = "Ana";
        tarea1.horasEstimadas = 8;

        tarea2.titulo = "Crear pantalla de login";
        tarea2.responsable = "Luis";
        tarea2.horasEstimadas = 5.5;

        tarea3.titulo = "Probar el sistema";
        tarea3.responsable = "María";
        tarea3.horasEstimadas = 10;

        // Completo solamente una
        tarea2.completar();

        tarea1.mostrarEstado();
        tarea2.mostrarEstado();
        tarea3.mostrarEstado();
        tarea2.mostrarResponsable();
        tarea2.mostrarInformacion();

        // ===== EJERCICIO 3: MOTORES =====
        System.out.println();
        System.out.println("===== MOTORES =====");
        Motor motor1 = new Motor();
        Motor motor2 = new Motor();
        Motor motor3 = new Motor();

        motor1.nombre = "Motor Banda A";
        motor1.potencia = 5.5;
        motor1.velocidad = 1500;

        motor2.nombre = "Motor Bomba B";
        motor2.potencia = 3.0;
        motor2.velocidad = 1200;

        motor3.nombre = "Motor Ventilador C";
        motor3.potencia = 1.5;
        motor3.velocidad = 900;

        // Enciendo y apago solamente el motor 1
        motor1.encender();
        motor1.mostrarEstado();
        motor2.mostrarEstado();
        motor3.mostrarEstado();

        motor1.apagar();
        motor1.mostrarEstado();
        motor1.mostrarInformacion();
    }
}
