import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ejercicio Error 9: Función para calcular promedio
 * ------------------------------------------------
 * Corrige el error para que la función calcule correctamente el promedio.
 */
public class EjercicioError09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.print("¿Cuántos números vas a ingresar? ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un número: ");
            numeros.add(scanner.nextInt());
        }
        System.out.println("El promedio es " + calcularPromedio(numeros));
    }

    /**
     * Calcula el promedio de una lista de números enteros.
     * @param numeros Lista de números enteros
     * @return El promedio como double
     */
    public static double calcularPromedio(ArrayList<Integer> numeros) {
        int suma = 0;
        for (int n : numeros) {
            suma += n;
        }
        return suma; // Error: falta dividir por la cantidad de elementos
    }
}
