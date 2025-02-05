import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    private static final String URL = "jdbc:postgresql://192.168.3.7:5432/BD_aiLarica";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "utfpr";

    public static Connection conectar() {
        try {
            Class.forName("org.postgresql.Driver"); 
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException e) {
            System.err.println("Driver JDBC não encontrado!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar com o banco de dados!");
            e.printStackTrace();
        }
        return null;
    }
}
