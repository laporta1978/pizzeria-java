import java.util.Scanner;

/**
 * Ejercicio Error 2: Operaciones Básicas
 * --------------------------------------
 * Corrige el error para que el programa realice correctamente la división.
 */
public class EjercicioError02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scanner.nextInt();
        int division = a / b;
        System.out.println("La división es: " + division);
        // Error: ¿Qué pasa si b es 0?
    }
}
