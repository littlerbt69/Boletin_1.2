import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resultado = 0;

        System.out.println("Introduce primer numero:");
        int numero1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce segundo numero:");
        int numero2 = Integer.parseInt(teclado.nextLine());

        System.out.println("Introduce operacion a realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        String operacion = String.valueOf(Integer.parseInt(teclado.nextLine()));


        switch (operacion) {
            case "1":
            case "+":
                resultado = numero1 + numero2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case "2":
            case "-":
                resultado = numero1 - numero2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case "3":
            case "*":
                resultado = numero1 * numero2;
                System.out.println("El resultado de la multiplicacion es: " + resultado);
                break;
            case "4":
            case "%":
                resultado = numero1 % numero2;
                System.out.println("El resultado de la division es: " + resultado);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

    }
}
