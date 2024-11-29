//Johan Quintero 192376
//Jhefer Solano 192378

import java.util.ArrayList;
import java.util.Scanner;

public class InventarioTienda {

    // Arrays para almacenar la información de productos
    static ArrayList<String> productos = new ArrayList<>();
    static ArrayList<Integer> cantidades = new ArrayList<>();
    static ArrayList<Double> precios = new ArrayList<>();

    // Función para registrar productos
    public static void registrarProducto(Scanner input) {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = input.nextLine();
        System.out.print("Ingrese la cantidad de " + nombre + ": ");
        int cantidad = input.nextInt();
        System.out.print("Ingrese el precio de " + nombre + ": ");
        double precio = input.nextDouble();
        input.nextLine();  // Limpiar buffer

        productos.add(nombre);
        cantidades.add(cantidad);
        precios.add(precio);
    }

    // Función para calcular el valor total del inventario
    public static void calcularValorTotal() {
        double valorTotalInventario = 0;
        System.out.println("\nReporte del inventario:");
        int size = productos.size();
        for (int i = 0; i < size ; i++) {
            double valorProducto = cantidades.get(i) * precios.get(i);
            valorTotalInventario += valorProducto;
            System.out.printf("%s: %d unidades a $%.2f cada una. Valor total: $%.2f%n",
                    productos.get(i), cantidades.get(i), precios.get(i), valorProducto);
        }
        System.out.printf("\nValor total del inventario: $%.2f%n", valorTotalInventario);
    }

    // Función para actualizar la cantidad de un producto
    public static void actualizarInventario(Scanner input) {
        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombreProducto = input.nextLine();
        if (productos.contains(nombreProducto)) {
            int indice = productos.indexOf(nombreProducto);
            System.out.print("Ingrese la nueva cantidad de " + nombreProducto + ": ");
            int nuevaCantidad = input.nextInt();
            input.nextLine();  // Limpiar buffer
            cantidades.set(indice, nuevaCantidad);
        } else {
            System.out.println("Producto no encontrado en el inventario.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Registro de los primeros 5 productos
        System.out.println("Registro de productos (mínimo 5):");
        for (int i = 0; i < 5; i++) {
            registrarProducto(input);
        }

        // Opción para agregar más productos
        while (true) {
            System.out.print("\n¿Desea agregar más productos? s=si n=no (s/n): ");
            String agregar = input.nextLine().toLowerCase();
            if (agregar.equals("s")) {
                registrarProducto(input);
            } else {
                break;
            }
        }

        // Opción para actualizar el inventario
        while (true) {
            System.out.print("\n¿Desea actualizar la cantidad de algún producto? s=si n=no (s/n): ");
            String actualizar = input.nextLine().toLowerCase();
            if (actualizar.equals("s")) {
                actualizarInventario(input);
            } else {
                break;
            }
        }

        // Generar el reporte final
        calcularValorTotal();

        input.close();
    }
}
