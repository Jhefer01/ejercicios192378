import java.sql.*;
import java.util.Scanner;

public class Main34 {
    private static final String URL = "jdbc:mysql://localhost:3306/tu_base_de_datos";
    private static final String USUARIO = "tu_usuario";
    private static final String CONTRASENA = "tu_contrasena";

    public static void main(String[] args) {
        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA)) {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Añadir usuario\n2. Eliminar usuario\n3. Actualizar usuario");
            int opcion = input.nextInt();
            input.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = input.nextLine();
                    System.out.print("Correo: ");
                    String correo = input.nextLine();
                    String sqlInsertar = "INSERT INTO usuarios (nombre, correo) VALUES (?, ?)";
                    try (PreparedStatement ps = conexion.prepareStatement(sqlInsertar)) {
                        ps.setString(1, nombre);
                        ps.setString(2, correo);
                        ps.executeUpdate();
                    }
                    break;
                case 2:
                    System.out.print("ID del usuario a eliminar: ");
                    int idEliminar = input.nextInt();
                    String sqlEliminar = "DELETE FROM usuarios WHERE id = ?";
                    try (PreparedStatement ps = conexion.prepareStatement(sqlEliminar)) {
                        ps.setInt(1, idEliminar);
                        ps.executeUpdate();
                    }
                    break;
                case 3:
                    System.out.print("ID del usuario a actualizar: ");
                    int idActualizar = input.nextInt();
                    input.nextLine(); // Limpiar buffer
                    System.out.print("Nuevo nombre: ");
                    String nuevoNombre = input.nextLine();
                    System.out.print("Nuevo correo: ");
                    String nuevoCorreo = input.nextLine();
                    String sqlActualizar = "UPDATE usuarios SET nombre = ?, correo = ? WHERE id = ?";
                    try (PreparedStatement ps = conexion.prepareStatement(sqlActualizar)) {
                        ps.setString(1, nuevoNombre);
                        ps.setString(2, nuevoCorreo);
                        ps.setInt(3, idActualizar);
                        ps.executeUpdate();
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
