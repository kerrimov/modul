import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySql {
    public static void main(String[] args) {
            CreateTable table = new CreateTable();
            try(Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/employees", "root", "TK98kerri7");){
                //table.createTables(connection);

            }catch (SQLException e){
                e.printStackTrace();
            }
    }

}
