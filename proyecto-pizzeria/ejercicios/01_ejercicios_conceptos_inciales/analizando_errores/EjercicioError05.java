import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ejercicio Error 5: Listas
 * ------------------------
 * Corrige el error para que el programa guarde y muestre correctamente los nombres ingresados.
 */
public class EjercicioError05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nombres = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese un nombre: ");
            String nombre = scanner.nextInt(); // Error: debería ser nextLine()
            nombres.add(nombre);
        }
        System.out.println(nombres);
    }
}
