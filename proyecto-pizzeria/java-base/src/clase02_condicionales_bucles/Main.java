package clase02_condicionales_bucles;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    final int EDAD_PERMITIDA = 18;
    final String USUARIO_DB = "admin";
    // nos sirve para cargar datos desde la consola
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese su nombre de usuario: ");
    String ingresoUsuario = scanner.nextLine();

    System.out.print("Ingrese su edad: ");
    int edad = scanner.nextInt();

    System.out.println(ingresoUsuario);
    System.out.println(edad);

    if (edad >= EDAD_PERMITIDA) {
      System.out.println("Eres mayor de edad");
    } else {
      System.out.println("Eres menor de edad");
    }

    // "admin" con equals se fija que sea el mismo valor de string
    if (USUARIO_DB.equalsIgnoreCase(ingresoUsuario)) {
      System.out.println("Login correcto a la aplicacion");
    } else {
      System.out.println("El usuario es incorrecto");
    }

    // para dejar de usar recursos del sistema
    scanner.close();
  }
}
