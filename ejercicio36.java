import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main36 {
    private static final String URL = "jdbc:mysql://localhost:3306/tu_base_de_datos";
    private static final String USUARIO = "tu_usuario";
    private static final String CONTRASENA = "tu_contrasena";

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
            // Realiza operaciones de base de datos
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        } finally {
            if (conexion != null) {
                try {
                    conexion.close();
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}
