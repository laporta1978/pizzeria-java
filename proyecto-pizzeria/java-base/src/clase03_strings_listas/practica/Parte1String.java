package clase03_strings_listas.practica;

public class Parte1String {

  public static void main(String[] args) {
    // Dada una cadena " té CHAi ", formateala para que quede "Té Chai".
    String textoOriginal = " té CHAi y cafe ";
//    String textoOriginal = " u ";
    String textoSinEspaciosEnMinuscula = textoOriginal.trim().toLowerCase(); // "té chai"
    String[] palabras = textoSinEspaciosEnMinuscula.split(" "); // ["té", "chai"]

    String textoFormateado = "";

    for (String palabra : palabras) {
      if (palabra.length() == 1) {
        textoFormateado += palabra + " ";
      } else {
        String primerLetra = String.valueOf(palabra.charAt(0));
        String restoPalabra = palabra.substring(1);
        textoFormateado += primerLetra.toUpperCase() + restoPalabra + " ";
      }
    }

    System.out.println(textoFormateado.trim());
  }
}
