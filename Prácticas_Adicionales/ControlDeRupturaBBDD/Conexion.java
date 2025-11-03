import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = System.getenv("DB_URL");
    private static final String USUARIO = System.getenv("DB_USUARIO");
    private static final String PASS = System.getenv("DB_PASS");

    public Connection conectar(){
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USUARIO, PASS);
//            System.out.println("Conexión establecida a la BD");
        }catch (SQLException e){
            System.out.println("No se pudo conectar a la Base de datos" + e.getMessage());
        }
        return conexion;
    }
}
