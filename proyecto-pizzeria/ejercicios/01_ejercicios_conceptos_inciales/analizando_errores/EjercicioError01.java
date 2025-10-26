import java.util.Scanner;

/**
 * Ejercicio Error 1: Variables y Tipos de Datos
 * --------------------------------------------
 * Corrige el error para que el programa imprima correctamente el nombre y la edad.
 */
public class EjercicioError01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextInt(); // Error: debería ser nextLine()
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}
