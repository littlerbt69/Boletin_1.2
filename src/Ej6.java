import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para obtener la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Preguntar al usuario el tipo de vehículo
        System.out.println("Por favor, ingresa el tipo de vehículo (coche, moto o camión): ");
        String tipoVehiculo = teclado.nextLine();

        // Determinar la velocidad según el tipo de vehículo
        int velocidad = 0;
        if (tipoVehiculo.equals("coche")) {
            velocidad = 120;
        } else if (tipoVehiculo.equals("moto")) {
            velocidad = 90;
        } else if (tipoVehiculo.equals("camión")) {
            velocidad = 80;
        } else {
            System.out.println("Tipo de vehículo no reconocido.");
            return;
        }

        // Imprimir la velocidad
        System.out.println("La velocidad de tu " + tipoVehiculo + " es de " + velocidad + " km/h.");
    }
}
