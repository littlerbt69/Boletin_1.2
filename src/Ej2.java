import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una temperatura en grados:");
        double grados = Double.parseDouble(teclado.nextLine());

        System.out.println("La temperatura en grados es: " + grados + " y la temperatura en farenheit es: " + (grados*9/5)+32);
    }
}
