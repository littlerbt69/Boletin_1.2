import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int notas;

        System.out.print("ingrese cantidad de notas:");
        notas = teclado.nextInt();

        for (int i = 1; i <= notas; i++) {
            System.out.println("ingrese nota" + " " + i + " " + "de" + " " + notas + ":");

            int nota = teclado.nextInt();
            int suma = 0;
            int prom = 0;
            suma = suma + i;
            prom = prom + suma / notas;
            System.out.println("promedio de las notas:" + prom);
        }
    }
}
