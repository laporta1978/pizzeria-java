package clase03_strings_listas;

public class Strings {

  public static void main(String[] args) {
    String textoCrudo = "    MENsaje dE TEXto                   ";
    String textoConFormato = formatearNombreProducto(textoCrudo);

    System.out.println(textoCrudo);
    System.out.println(textoConFormato);

    String sf1 = "El total a pagar es %s$".formatted(50);
    String sf2 = """
        Te damos la bienvenida %s!
        El precio unitario del producto %s es %s$
        El total a pagar es: %s$
        """.formatted("user1", "product1", 5000, 10000);

    String sf3 = String.format("""
        Te damos la bienvenida %s!
        El precio unitario del producto %s es %s$
        El total a pagar es: %s$
        """, "user1", "product1", 5000, 10000);

    System.out.println(sf1);

    System.out.println(sf2);
  }

  // "    MENsaje dE TEXto                   "
  // "Mensaje De Texto"
  public static String formatearNombreProducto(String nombre) {
    nombre = nombre.trim().toLowerCase();// "mensaje de texto"
    String[] palabras = nombre.split(" "); // ["mensaje", "de", "texto"]

    StringBuilder sb = new StringBuilder(); // texto4 = texto1 + texto2 + texto3
    // sb = "Mensaje De Texto "
    for (String palabra : palabras) {
      if (!palabra.isEmpty()) { // si el string no esta vacio
        sb.append(Character.toUpperCase(palabra.charAt(0)))
            .append(palabra.substring(1))
            .append(" ");
      }
    }
    return sb.toString().trim();
  }
}
