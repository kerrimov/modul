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

@WebServlet("/deleterow")
public class DeleteData extends HttpServlet {
    public static void deleteData(String nametable, int row) {

        final String url = "jdbc:mysql://localhost:3306/myexcel";
        final String user = "root";
        final String password = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String query = "DELETE FROM " + nametable + " WHERE id = " + row + ";";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
        ) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nametable = req.getParameter("nametable5");
        int row = Integer.parseInt(req.getParameter("row3"));
        deleteData(nametable, row);
        resp.sendRedirect("/");
    }
}
