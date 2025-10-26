package clase02_condicionales_bucles.practica;

import java.util.Scanner;

/**
 * Ejercicio 3.5 – Promedio de calificaciones con centinela
 * -------------------------------------------------------- Ingresar calificaciones 0–5. La carga
 * termina si se ingresa un valor fuera de rango. Mostrar el promedio.
 * <p>
 * Ejemplo: Ingrese calificación: 4 Ingrese calificación: 5 Ingrese calificación: -1 Salida:
 * Promedio: 4.5
 * <p>
 * Tip: while con corte por condición; contar y acumular. Tip: el promedio es la suma de los valores
 * a promediar divido la cantidad de valores.
 */
public class EjercicioBucles {

  // comentario sobre el do-while
  // es util cuando queremos que el código del bucle se ejecute al menos una vez, ya que la condicion esta al final
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Cuantas notas va a cargar para calcular el promedio? ");
    int cantidadNotas = entrada.nextInt();
    double sumaNotas = 0;

    for (int contador = 1; contador <= cantidadNotas; contador++) {
      System.out.print("Ingrese la nota n°" + contador + ": ");
      // sumaNotas = sumaNotas + numero
      double notaActual = entrada.nextDouble();

      while (notaActual < 1) {
        System.out.println("Che, cualquiera lo que cargaste, ingresa un numero mayor a cero");
        notaActual = entrada.nextDouble();
      }

      sumaNotas += notaActual;
    }
    double promedio = 0;

    if (cantidadNotas > 0) {
      promedio = sumaNotas / cantidadNotas;
    }

    System.out.println("El promedio de las " + cantidadNotas + " notas es: " + promedio);
  }
}
