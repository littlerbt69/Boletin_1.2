import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia a su destino en kilómetros: ");
        double distancia = scanner.nextDouble();

        System.out.print("Ingrese la velocidad a la que viajará en km/h: ");
        double velocidad = scanner.nextDouble();

        scanner.close();

        // Calcula el tiempo en horas
        double tiempoEnHoras = distancia / velocidad;

        // Convierte el tiempo en horas a horas y minutos
        int horas = (int) tiempoEnHoras;
        int minutos = (int) ((tiempoEnHoras - horas) * 60);

        System.out.println("Tiempo estimado de viaje: " + horas + " horas y " + minutos + " minutos.");
    }
}
