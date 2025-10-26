import java.util.Scanner;
import java.util.HashMap;

/**
 * Ejercicio Error 7: Diccionarios
 * ------------------------------
 * Corrige el error para que el programa guarde y busque correctamente la edad por nombre.
 */
public class EjercicioError07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> personas = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();
            personas.put(nombre, edad);
        }
        System.out.print("¿Qué nombre quieres buscar? ");
        String buscar = scanner.nextLine();
        if (personas.containsKey(buscar)) {
            System.out.println(buscar + " tiene " + personas.get(buscar) + " años.");
        } else {
            System.out.println("No se encontró a " + buscar);
        }
    }
}
