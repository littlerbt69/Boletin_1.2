import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la longitud del primer lado del triángulo:");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingresa la longitud del segundo lado del triángulo:");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingresa la longitud del tercer lado del triángulo:");
        double lado3 = scanner.nextDouble();

        String tipoTriangulo = switch (determinarTipoTriangulo(lado1, lado2, lado3)) {
            case 1 -> "Equilátero";
            case 2 -> "Isósceles";
            case 3 -> "Escaleno";
            default -> "No es un triángulo válido";
        };

        System.out.println("El triángulo es de tipo: " + tipoTriangulo);
    }

    public static int determinarTipoTriangulo(double lado1, double lado2, double lado3) {
        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
            return 0; // No es un triángulo válido
        } else if (lado1 == lado2 && lado2 == lado3) {
            return 1; // Equilátero
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            return 2; // Isósceles
        } else {
            return 3; // Escaleno
        }
    }
}

