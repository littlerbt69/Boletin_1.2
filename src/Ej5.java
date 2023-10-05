import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declara e inicializa las variables del inventario del personaje
        int monedasDeOro = 100;
        String nombreArma = "Espada de Acero";
        int nivelPersonaje = 5;
        double saludActual = 100.0;

        // Imprime el estado inicial del inventario
        System.out.println("Estado inicial del inventario:");
        System.out.println("Monedas de oro: " + monedasDeOro);
        System.out.println("Arma equipada: " + nombreArma);
        System.out.println("Nivel del personaje: " + nivelPersonaje);
        System.out.println("Salud actual: " + saludActual);

        // Pide al usuario ingresar el daño recibido
        System.out.print("Ingrese el daño recibido: ");
        double danoRecibido = scanner.nextDouble();

        // Resta el daño recibido a la salud actual
        saludActual -= danoRecibido;

        // Imprime el estado actualizado del inventario
        System.out.println("\nEstado actualizado del inventario:");
        System.out.println("Monedas de oro: " + monedasDeOro);
        System.out.println("Arma equipada: " + nombreArma);
        System.out.println("Nivel del personaje: " + nivelPersonaje);
        System.out.println("Salud actual: " + saludActual);

    }
}
