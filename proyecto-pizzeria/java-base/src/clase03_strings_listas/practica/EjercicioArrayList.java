package clase03_strings_listas.practica;

import java.util.ArrayList;

public class EjercicioArrayList {

  public static void main(String[] args) {
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

    ArrayList<String> productosConFormato = new ArrayList<>();

    for (String producto : productos) {

      String textoOriginal = producto;
      String textoSinEspaciosEnMinuscula = textoOriginal.trim().toLowerCase(); // "té chai"
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

      productosConFormato.add(textoFormateado);

    }

    for (String producto : productosConFormato) {
      System.out.println(producto);
    }
  }
}
