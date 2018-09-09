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

@WebServlet("/createtable")
public class CreateTable extends HttpServlet {
    public static void createTable(String nameTable, int col) {
        final String NAME_COL = "col";

        final String url = "jdbc:mysql://localhost:3306/myexcel";
        final String user = "root";
        final String password = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String nameCol = "";
        String typeCol = " VARCHAR (255)";
        for (int i = 0; i <= col; i++) {
            if (i == 0) {
                nameCol += "id int(11) NOT NULL AUTO_INCREMENT, ";
            } else if (i == col) {
                nameCol += NAME_COL + i + " " + typeCol + ", PRIMARY KEY (id));";
            } else {
                nameCol += NAME_COL + i + " " + typeCol + ",";
            }

            String query = "CREATE TABLE " + nameTable + " (" + nameCol;
            System.out.println(query);
            try (Connection connection = DriverManager.getConnection(url, user, password);
                 Statement statement = connection.createStatement()
            ) {
                statement.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nameTable = req.getParameter("nametablecreate");
        int col = Integer.parseInt(req.getParameter("col"));
        createTable(nameTable, col);
        resp.sendRedirect("/");

    }
}

