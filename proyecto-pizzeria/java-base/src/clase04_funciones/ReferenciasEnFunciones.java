package clase04_funciones;

import java.util.ArrayList;

public class ReferenciasEnFunciones {

  public static void main(String[] args) {
    ArrayList<String> productos = new ArrayList<>();
    ArrayList<String> productos1 = productos;
    ArrayList<String> productos2 = productos1;

    agregarElemento(productos);

    productos2.add("elemento de productos 2");

    System.out.println(productos);
    System.out.println(productos1);
    System.out.println(productos2);
  }

  public static void agregarElemento(ArrayList<String> prods) {
    prods.add("nuevo elemento");
    System.out.println(prods);
  }
}
