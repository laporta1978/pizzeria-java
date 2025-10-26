package clase02_condicionales_bucles.practica;

import java.util.Scanner;

public class Bucles {

  /**
   * Enunciado de bucles de la práctica de la clase 02.
   * <br>
   * Pedile al usuario que ingrese un número, y luego usá un bucle for para imprimir desde 1 hasta
   * ese número.
   * <br>
   * Repetí lo mismo con un while y compará cuál te resulta más intuitivo.
   */
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingrese el numero hasta el cual quiere contar (se empieza en 1): ");
    int topeContador = entrada.nextInt(); // 10

    int contador = 1;
    while (contador <= topeContador) {
      System.out.println(contador);

      contador = contador + 1;
    }

    System.out.println("Terminamos de contar");
    // TODO: tarea, contar desde el numero que ingresa el usuario hasta 1.
    // item 2: lo mismo pero de 2 en 2.

    for (int contador2 = 1; contador2 <= topeContador; contador2++) {
      System.out.println(contador2);
    }

    System.out.println("Terminamos de contar en el bucle for");
  }
}
