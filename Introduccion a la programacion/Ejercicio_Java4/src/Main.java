public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        cliente.edad = 19;
        cliente.nombre = "Cristian";
        cliente.telefono = 630257845;
        cliente.credito = 500;
        trabajador.salario = 2500500;
        System.out.println("Nombre: " + cliente.nombre + " " + "Edad: " + cliente.edad + " " + "Credito: " + cliente.credito + " " + "Sueldo: " + trabajador.salario);
    }
}
class Persona {
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona {
    int credito;
}
class Trabajador extends Persona {
    float salario;
}