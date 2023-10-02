import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce numero de enemigos derrotados");
        int enemigos = Integer.parseInt(teclado.nextLine());

        if (enemigos >= 50) {
            System.out.println("Tus puntos son: " + enemigos*2);
        } else {
            System.out.println("Tus puntos son: " + enemigos);
        }
    }
}
