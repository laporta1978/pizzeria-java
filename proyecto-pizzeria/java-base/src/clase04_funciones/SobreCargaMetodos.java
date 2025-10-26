package clase04_funciones;

public class SobreCargaMetodos {

  public static void main(String[] args) {

    double dato = aplicarDescuento(1000, 10, 0, 0);

    int entero = suma(1, 1);
    double real = suma(1, 1);
  }

  public static int suma(int a, int b) {
    return a + b;
  }

  public static double suma(double a, double b) {
    return a + b;
  }

  // Descuento básico con porcentaje
  public static double aplicarDescuento(double precio, double porcentaje) {
    return aplicarDescuento(precio, porcentaje, 0);
  }

  // Descuento con bonus fijo adicional
  public static double aplicarDescuento(double precio, double porcentaje, double bonusFijo) {
    return aplicarDescuento(precio, porcentaje, bonusFijo, 0);
  }

  public static double aplicarDescuento(double precio, double porcentaje, double bonusFijo,
      int noUso) {
    double descuento = precio * (porcentaje / 100.0);
    return precio - descuento - bonusFijo;
  }
}
