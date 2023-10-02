import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce comida favorita entre las siguientes:");
        System.out.println("1. Pizza");
        System.out.println("2. Hamburguesa");
        System.out.println("3. Tacos");
        int eleccion = Integer.parseInt(teclado.nextLine());


        switch (eleccion) {
            case 1:
                System.out.println("Amante de la masa y el queso.");
                break;
            case 2:
                System.out.println("Amante de la carne.");
                break;
            case 3:
                System.out.println("Amante de los tacos");
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
