import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/droptable")
public class DeleteTable extends HttpServlet {
    public static void deleteTable(String nametable){
        final String url = "jdbc:mysql://localhost:3306/myexcel";
        final String user = "root";
        final String password = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String query = "DROP TABLE " + nametable;
        try (Connection connection = DriverManager.getConnection(url, user,password);
             Statement statement = connection.createStatement();
        ) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nameTable = req.getParameter("nametabledrop");
        deleteTable(nameTable);
        resp.sendRedirect("/");
    }
}
