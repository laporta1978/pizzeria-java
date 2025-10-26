package clase02_condicionales_bucles;

import java.util.Scanner;

public class CompraProducto {

  public static void main(String[] args) {
    final int EDAD_PERMITIDA = 18;
    final double DINERO_CUENTA = 2000.0;
    final double PRECIO_PRODUCTO = 500.0;
    boolean tiendaAbierta = true;
    // nos sirve para cargar datos desde la consola
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese su edad: ");
    int edad = scanner.nextInt();

    System.out.println();

    if (edad >= EDAD_PERMITIDA) {
      System.out.println("usted no puedo comprar, necesita ser mayor de edad");
    } else {
      System.out.print("Ingrese cuantos productos desea comprar: ");
      int cantidadProducto = scanner.nextInt();

      double total = PRECIO_PRODUCTO * cantidadProducto;

      if (tiendaAbierta && total <= DINERO_CUENTA) {
        System.out.println("Compra realizada");
      } else {
        System.out.println("error en la compra, dinero insuficiente");
      }
    }

    String dia = scanner.nextLine();
    if (dia.equals("lunes") || dia.equals("miercoles") || dia.equals("viernes")) {
      System.out.println("descuento del 20%");
    } else if (dia.equals("martes") || dia.equals("sabados")) {
      System.out.println("descuento del 30%");
    } else { // jueves y domingo
      System.out.println("descuento del 50%");
    }

    // para dejar de usar recursos del sistema
    scanner.close();
  }
}
