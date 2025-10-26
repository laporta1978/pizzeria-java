package clase01;

public class Main {

  public static void main(String[] args) {
    // todo lo que sigue de esto es codigo a ejecutar
    // convencion de nombres:
    /*
     * PascalCase
     * camelCase: cada palabra nueva tiene la primer letra en mayuscula
     * snake_case
     * SCREAM_CASE: para constantes
     * */
    // Variables
    // declaracion de variables
    // Tipo de dato | variable | Operador de asignación | Dato de la variable | Punto y coma
    // numeros
    int numerito;
    // pueden agregar <final> al principio de la declaracion de una variable para indicar que no quieren
    // que esa variable se modifique
    // final significa constante
    final int EJEMPLO_CONSTANTE = 123;
    final int creditoInicialUsuario = 555;
    int cantidadProductosSistema = 123; // numero entero
    int cantidadDeProductosEnElSistema = 123; // numero entero
    double numeroDecimal = 23.88;

    // operaciones numericas
    numerito = cantidadProductosSistema + cantidadDeProductosEnElSistema;
    cantidadProductosSistema = numerito - (cantidadDeProductosEnElSistema * 5);
    cantidadProductosSistema = creditoInicialUsuario;
    int restoNumero = cantidadProductosSistema % 2;
    System.out.println(restoNumero);

    System.out.println(cantidadProductosSistema);

    cantidadProductosSistema = 199999;

    System.out.println(cantidadProductosSistema);

    cantidadProductosSistema = 187264;

    System.out.println(cantidadProductosSistema);

    // texto
    String mensaje = "es la comisión 25254!#$$%$%/%&()🎓🚀🐯⏰🛠️💾💬 'alskjd' \"mensaje\" ";
    String nuevoMensaje = mensaje + " - " + restoNumero;
    // 2+2 = 4
    // "2" + "2" = "22"
    System.out.println(nuevoMensaje);
    char caracter = 'e';

    // salida de datos
    // mostrar mensaje en consola
    System.out.println(mensaje); // println, agrega al final del mensaje un salto de linea
//    System.out.println(mensaje);
//    System.out.println(mensaje);

    // print, no agrega nada al final, puede hacer que varios mensajes se muestren en una sola linea
//    System.out.print(mensaje);
//    System.out.print(mensaje);
//    System.out.printf(mensaje); // printf: sirve para texto con formato

    // booleanos
    int edadUsuario = 20;
    final int EDAD_PERMITIDA = 18;
    boolean esMayorEdad = edadUsuario >= EDAD_PERMITIDA; // = >
    System.out.println(esMayorEdad);

  }
}