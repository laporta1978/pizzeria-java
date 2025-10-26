import java.util.Scanner;
import java.util.HashMap;

/**
 * Ejercicio Error 8: Recorrer un Diccionario
 * -----------------------------------------
 * Corrige el error para que el programa muestre correctamente los nombres de personas mayores de edad.
 */
public class EjercicioError08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> personas = new HashMap<>();
        System.out.print("¿Cuántas personas vas a ingresar? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese nombre: ");
            String nombre = scanner.nextLine(); // Error: nextLine() después de nextInt()
            System.out.print("Ingrese edad: ");
            int edad = scanner.nextInt();
            personas.put(nombre, edad);
        }
        System.out.print("Personas mayores de edad: [");
        for (String nombre : personas.keySet()) {
            if (personas.get(nombre) > 18) { // Error: debería ser >= 18
                System.out.print(nombre + ", ");
            }
        }
        System.out.println("]");
    }
}
