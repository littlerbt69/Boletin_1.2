import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nivel actual");
        int nivel = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce las misiones completadas");
        int misiones = Integer.parseInt(teclado.nextLine());

        if (nivel >= 10 && misiones >= 20) {
            System.out.println("Tienes acceso a la mision especial");
        } else {
            System.out.println("No tienes acceso a la mision especial");
        }
    }
}
