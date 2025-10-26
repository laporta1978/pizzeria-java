import java.util.Scanner;

/**
 * Ejercicio Error 4: Bucle While
 * ------------------------------
 * Corrige el error para que el programa sume correctamente los números ingresados.
 */
public class EjercicioError04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero = 1;
        while (numero != 0) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            suma = numero; // Error: debería acumular la suma
        }
        System.out.println("La suma es: " + suma);
    }
}
