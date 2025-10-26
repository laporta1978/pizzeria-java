import java.util.Scanner;

/**
 * Ejercicio Error 3: Condicionales
 * -------------------------------
 * Corrige el error para que el programa indique correctamente si el número es positivo, negativo o cero.
 */
public class EjercicioError03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("El número es negativo."); // Error: mensaje incorrecto
        } else if (numero < 0) {
            System.out.println("El número es positivo."); // Error: mensaje incorrecto
        } else {
            System.out.println("El número es cero.");
        }
    }
}
