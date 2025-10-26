package clase03_strings_listas.practica;

import java.util.ArrayList;

public class Parte1Array {

  public static void main(String[] args) {
//    String[] productos = new String[5];
//    productos[0] = "p1";
//    productos[1] = "p2";
//    productos[2] = "p3";
//    productos[3] = "p4";
//    productos[4] = "p5";
//
//    for (String producto : productos) {
//      System.out.println(producto);
//    }

    ArrayList<String> productos = new ArrayList<>();
    // ["p1", "p2", "p3", "p4", "p5", "p6", "p6"]
    productos.add("p1");
    productos.add("p2");
    productos.add("p3");
    productos.add("p4");
    productos.add("p5");
    productos.add("p6");
    productos.add("p6");
    productos.add("p6");

    productos.remove("p6");

    System.out.println(productos.get(1));

    // indexOf sirve para busquedas exactas
    System.out.println(productos.indexOf("p6"));

    System.out.println(productos.lastIndexOf("p6"));

    for (String producto : productos) {
      System.out.println(producto);
    }

  }
}
