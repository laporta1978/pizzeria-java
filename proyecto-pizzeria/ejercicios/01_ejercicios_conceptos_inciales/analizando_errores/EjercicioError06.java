import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ejercicio Error 6: Buscar en una Lista
 * --------------------------------------
 * Corrige el error para que el programa indique correctamente si el número está en la lista.
 */
public class EjercicioError06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.print("¿Cuántos números vas a ingresar? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            numeros.add(scanner.nextInt());
        }
        System.out.print("¿Qué número quieres buscar? ");
        int buscar = scanner.nextInt();
        if (numeros == buscar) { // Error: comparación incorrecta
            System.out.println("El número " + buscar + " está en la lista.");
        } else {
            System.out.println("El número " + buscar + " no está en la lista.");
        }
    }
}
