package clase04_funciones;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioArrayListConFunciones {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int numerito = 20000000;
    boolean condicion = false;

    String texto = "alksd";

    ArrayList<String> productos = generarProductosMalFormateados();
    System.out.println("Productos sin formato: ");
    mostrarProductos(productos);

    ArrayList<String> productosConFormato = formatearProductos(productos);

    System.out.println("Productos formateados: ");
    mostrarProductos(productosConFormato);
  }

  public static ArrayList<String> formatearProductos(ArrayList<String> productos) {
    if (productos.isEmpty()) {
      // se deberia usar un logger, por ahora esto es lo que tenemos
      System.out.println(
          "[formatearProductos] No se formateo nada porque la lista de productos estaba vacia");
      return new ArrayList<>();
    }

    ArrayList<String> productosConFormato = new ArrayList<>();

    for (String producto : productos) {
      String productoFormateado = formatearTexto(producto);

      productosConFormato.add(productoFormateado);
    }

    return productosConFormato; // lo que sigue al return nunca se ejecuta
    // no deberia haber nada por debajo del return
  }

  public static ArrayList<String> generarProductosMalFormateados() {
    ArrayList<String> productos = new ArrayList<>();

    productos.add(" té CHAi ");
    productos.add("CAFÉ   espresso");
    productos.add("  yerba  MATE");
    productos.add("AGUA con   gas ");
    productos.add(" jugo  de naranja ");
    productos.add("LECHE descremada");
    productos.add("   azúcar   blanca");
    productos.add("aceite DE oliva ");
    productos.add(" pan integral ");
    productos.add("Mermelada DE frutilla ");

    return productos;
  }

  public static String formatearTexto(String textoCrudo) {
    String textoSinEspaciosEnMinuscula = textoCrudo.trim().toLowerCase(); // "té chai"
    String[] palabras = textoSinEspaciosEnMinuscula.split(" "); // ["té", "chai"]

    String textoFormateado = "";

    for (String palabra : palabras) {
      if (palabra.length() == 1) {
        textoFormateado += palabra + " ";
      } else if (palabra.length() > 1) {
        String primerLetra = String.valueOf(palabra.charAt(0));
        String restoPalabra = palabra.substring(1);
        textoFormateado += primerLetra.toUpperCase() + restoPalabra + " ";
      }// no agregamos un else porque seria el caso del string vacio y queremos omitir eso
    }

    return textoFormateado;
  }

  public static void mostrarProductos(ArrayList<String> productos) {
    System.out.println("🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦");
    for (String producto : productos) {
      System.out.println(producto);
    }
    System.out.println("🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦🟦");
  }
}
