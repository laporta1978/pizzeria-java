import java.util.Scanner;
import java.util.HashMap;

/**
 * Ejercicio Error 10: Actualizar valores en un diccionario
 * -------------------------------------------------------
 * Corrige el error para que la función sume correctamente 1 año a la edad de cada persona.
 */
public class EjercicioError10 {
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
        System.out.println(actualizarEdades(personas));
    }

    /**
     * Suma 1 año a la edad de cada persona en el diccionario.
     * @param mapa HashMap con nombre y edad
     * @return HashMap actualizado
     */
    public static HashMap<String, Integer> actualizarEdades(HashMap<String, Integer> mapa) {
        for (String nombre : mapa.keySet()) {
            mapa.put(nombre, mapa.get(nombre)); // Error: no suma 1
        }
        return mapa;
    }
}
