package clase04_funciones;

public class Main {

  public static void main(String[] args) {
    String pizza = hacerUnaPizza("tomate y queso", "horno y bandeja");
    String pizza1 = hacerUnaPizza("queso y cebolla", "horno y bandeja de acero inoxidable");
    String pizza2 = hacerUnaPizza("queso y huevo", "horno y bandeja");

    System.out.println(pizza);
    System.out.println(pizza1);
    System.out.println(pizza2);
  }

  public static String hacerUnaPizza(String ingredientes, String materiales) {
    // proceso para realisar la pizza
//    return "Pizza hecha 🍕 con ingredientes: " + ingredientes + "y materiales: " + materiales;
    return "Pizza hecha 🍕 con ingredientes: %s y materiales: %s"
        .formatted(ingredientes, materiales);
  }

}
