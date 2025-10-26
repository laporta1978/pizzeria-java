package clase03_strings_listas;

import java.util.ArrayList;

public class Listas {

  public static void main(String[] args) {
    // String[]
    // int []
    ArrayList<String> productos = new ArrayList<>();

    productos.add("Café Premium Molido");
    productos.add("Té Verde Orgánico");
    productos.add("Chocolate Amargo 80%");

    // ["Café Premium Molido", "Té Verde Orgánico", "Chocolate Amargo 80%"]
    for (String producto : productos) {
      System.out.println(producto);
    }
  }

}
