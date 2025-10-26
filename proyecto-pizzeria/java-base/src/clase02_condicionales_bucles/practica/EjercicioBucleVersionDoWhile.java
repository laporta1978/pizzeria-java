package clase02_condicionales_bucles.practica;

import java.util.Scanner;

public class EjercicioBucleVersionDoWhile {

  public static void main(String[] args) {
    final int TOPE_NOTAS = 5;

    Scanner entrada = new Scanner(System.in);
    double notaActual = 0;
    int contadorNotas = 0;
    double sumaNotas = 0;
    // 1 significa si, 0 significa no
    int opcionCargaNota;

    System.out.println("Desea cargar notas?");
    System.out.println("1 - Si");
    System.out.println("0 - NO");
    opcionCargaNota = entrada.nextInt();

    boolean seguirCargandoNotas = opcionCargaNota == 1;

    while (seguirCargandoNotas && contadorNotas < TOPE_NOTAS) {
      System.out.print("Ingrese la nota n°" + (contadorNotas + 1) + ": ");
      notaActual = entrada.nextDouble();

      // validacion
      while (notaActual < 1) {
        System.out.println("Che, cualquiera lo que cargaste, ingresa un numero mayor a cero");
        notaActual = entrada.nextDouble();
      }

      sumaNotas += notaActual;
      contadorNotas++;

      System.out.println("Desea cargar más notas?");
      opcionCargaNota = entrada.nextInt();
      seguirCargandoNotas = opcionCargaNota == 1;
    }

    double promedio = 0;

    if (contadorNotas > 0) {
      promedio = sumaNotas / contadorNotas;
    }

    System.out.println("El promedio de las " + contadorNotas + " notas es: " + promedio);
  }
}
