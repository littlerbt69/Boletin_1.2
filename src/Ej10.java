import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce animal favorito:");
        String animal = String.valueOf(Integer.parseInt(teclado.nextLine()));

        System.out.println("Introduce color favorito:");
        String color = String.valueOf(Integer.parseInt(teclado.nextLine()));

        System.out.println("Introduce asignatura favorita:");
        String asignatura = String.valueOf(Integer.parseInt(teclado.nextLine()));

        if ((animal == "gato") && (color == "rojo")) {

        }
    }
}
