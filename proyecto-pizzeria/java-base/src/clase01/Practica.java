package clase01;

import java.util.Scanner;

public class Practica {

  public static void main(String[] args) {
    // Ejercicio de variables
    double precioProducto = 25.5;

    // Pedir datos al usuario
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese su nombre de usuario: ");
    String nombreUsuario = sc.nextLine();

    System.out.println("Cuantos productos desea comprar " + nombreUsuario + ": ");
    int cantidadProducto = sc.nextInt();

    double costoTotal = precioProducto * cantidadProducto;

    System.out.println("El total a pagar es de: " + costoTotal + "💵");
    System.out.println("Gracias por su compra!");
  }
}
