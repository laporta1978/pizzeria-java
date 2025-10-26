package clase02_condicionales_bucles.practica;

import java.util.Scanner;

public class Condicionales {

  /**
   * Enunciado de condicionales de la práctica de la clase 02.
   * <br>
   * Suponé que si el cliente quiere más de 100 unidades, le ofrecemos un descuento.
   * <br>
   * Implementá un if que verifique si cantidad > 100. Si es así, mostrá un mensaje indicando que
   * aplica un descuento especial.
   */
  public static void main(String[] args) {
    final int PRECIO_PRODUCTO = 1000;
    final double DESCUENTO_ESPECIAL = 0.10;

    Scanner scanner = new Scanner(System.in);

    System.out.println(
        "Te damos la bienvenida a la tienda uniproducto, solo vendemos un producto.");
    System.out.println("El precio por unidad del producto es: " + PRECIO_PRODUCTO + "$");
    System.out.print("Cuantas unidades quiere comprar? ");
    int cantidadUnidades = scanner.nextInt();

    double subTotal = cantidadUnidades * PRECIO_PRODUCTO;
    double precioFinal = subTotal;

    if (cantidadUnidades > 10) {
      // vamos a aplicar un descuento del 10%
      // 100% - 10% = 90%
      // 15k subTotal - 1.5k = 13.5k
      precioFinal = precioFinal * (1 - DESCUENTO_ESPECIAL);
    }

    System.out.println("El total a pagar es: " + precioFinal + "$");
  }
}
