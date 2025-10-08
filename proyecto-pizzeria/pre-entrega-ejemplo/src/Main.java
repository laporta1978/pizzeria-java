import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class
Main {

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    ArrayList<String> productosDB = obtenerProductos();
    int opcionUsuario;

    System.out.println("Te damos la bienvenida PIZZERIA TINCHO 🛒");
    label:
    while (true) {
      System.out.println("""
          Ingrese el número equivalente a la opción:
          0 - Finaliza el programa
          1 - Crea un Producto
          2 - Listar Productos
          3 - Búsqueda por nombre
          4 - Editar nombre producto
          5 - Borrar producto
          6 - nueva funcion
          """);
      opcionUsuario = entrada.nextInt();

      switch (opcionUsuario) {
        case 1 -> crearProducto(productosDB); // - >
        case 2 -> listarProductos(productosDB);
        case 3 -> buscarProductoPorNombre(productosDB);
        case 4 -> editarProducto(productosDB);
        case 5 -> borrarProducto(productosDB);
        case 6 -> System.out.println("Funcionalida en progreso...");
        case 0 -> {
          System.out.println("Gracias por usar la app!");
          break label; // corta el bucle donde se ejecuta
        }
        default -> System.out.println("Opción incorrecta, intente de nuevo");
      }
    }
  }

  public static void crearProducto(ArrayList<String> productos) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Creando Nuevo Producto");
    System.out.print("Ingrese el nombre del nuevo producto: ");
    String nombre = entrada.nextLine();

    productos.add(nombre);

    // TODO: agregar un mensaje de confirmación cuando se crea el producto
    pausa();
  }

  public static void listarProductos(ArrayList<String> productos) {
    System.out.println("=======================================");
    System.out.println("        LISTA DE PRODUCTOS");
    System.out.println("=======================================");

    if (productos == null || productos.isEmpty()) {
      System.out.println("⚠️  No hay productos para mostrar.");
    } else {
      int contador = 1;
      for (String producto : productos) {
        System.out.printf(" %2d. %s%n", contador++, producto);
      }
    }

    System.out.println("=======================================");
    pausa();
  }

  public static void buscarProductoPorNombre(ArrayList<String> productos) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese un nombre de un producto: ");
    String busqueda = entrada.nextLine();
    ArrayList<String> productoEncontrados = new ArrayList<>();

    for (String producto : productos) {
      if (estaIncluido(producto, busqueda)) {
        productoEncontrados.add(producto);
      }
    }

    listarProductos(productoEncontrados);
  }

  public static void editarProducto(List<String> productos) {
    Scanner entrada = new Scanner(System.in);
    int indiceProducto = obtenerIdProducto(productos);
    // TODO: validar que encontramos el indice
    String nombreOriginal = productos.get(indiceProducto);
    System.out.println("Producto a editar:");
    System.out.println(nombreOriginal);
    // TODO: validar que el usuario quiere editar el producto que se encontro
    System.out.print("Ingrese el nuevo nombre: ");
    String nuevoNombre = entrada.nextLine();

    // ["p1", "p2", "p3"]
    // set(1, "p38")
    // ["p1", "p38", "p3"]
    productos.set(indiceProducto, nuevoNombre);

    System.out.printf("El nombre del producto cambio de %s a %s", nombreOriginal, nuevoNombre);
  }

  public static void borrarProducto(List<String> productos) {
    Scanner entrada = new Scanner(System.in);
    int indiceProducto = obtenerIdProducto(productos);
    // TODO: validar que encontramos el indice
    String nombreOriginal = productos.get(indiceProducto);
    System.out.println("Producto a eliminar:");
    System.out.println(nombreOriginal);
    // TODO: validar que el usuario quiere borrar el producto que se encontro

    productos.remove(indiceProducto);

    System.out.printf("El producto %s se borro", nombreOriginal);
  }

  /* UTILIDADES */
  /* Busqueda por id - ahora mismo solo funciona con el indice, en el futuro se va a cambiar */
  public static int obtenerIdProducto(List<String> productos) {
    Scanner entrada = new Scanner(System.in);
    int idProducto = -1; // el -1 representa que no encontramos el producto
    String busqueda = entrada.nextLine();

    for (String producto : productos) {
      if (estaIncluido(producto, busqueda)) {
        return productos.indexOf(producto);
      }
    }

    return idProducto;
  }

  public static boolean estaIncluido(String nombreCompleto, String nombreParcial) {
    String nombreCompletoFormateado = formatoBusqueda(nombreCompleto);

    return nombreCompletoFormateado.contains(formatoBusqueda(nombreParcial));
  }

  public static String formatoBusqueda(String texto) {
    return texto.trim().toLowerCase();
  }

  public static void pausa() {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Pulse ENTER para continuar...");
    entrada.nextLine();
    for (int i = 0; i < 20; ++i) {
      System.out.println();
    }
    // TODO: limpiar la pantalla de la consola
  }

  public static ArrayList<String> obtenerProductos() {
    ArrayList<String> productos = new ArrayList<>();

    productos.add("EMPANADAS CARNE ");
    productos.add("PIZZAS MUZZARELLA");
    productos.add("TARTAS INDIVIDUALES");
    productos.add("BEBIDAS SIN ALCOHOL");
    productos.add("PASTELITOS");
    productos.add("VINOS");
    productos.add("MILANESA CON PURE");
    productos.add("ENSALADA RUSA");
    productos.add("PASTEL DE PAPA");
    productos.add("PASTA ");

    return productos;
  }
}
