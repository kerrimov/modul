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

@WebServlet("/getdata")
public class InsertData extends HttpServlet {
    public static final String NAME_COL = "col";
    static int count = 0;

    public static void insertData(String nametable, int rowId, String data) {

        final String url = "jdbc:mysql://localhost:3306/myexcel";
        final String user = "root";
        final String password = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        int length = data.split(",").length;
        String query = "INSERT INTO " + nametable;
        for (int i = 0; i <= length; i++) {
            if (i == length) {
                query += "'" + addData(data) + "');";
            } else if (i == 0) {
                for (int j = 0; j <= length; j++) {
                    if (j == 0) {
                        query += "(id,";
                    } else if (j == 1) {
                        query += NAME_COL + j + ",";
                    } else if (j == length) {
                        query += NAME_COL + j + ") VALUES (" + rowId + ",";
                    } else {
                        query += NAME_COL + j + ",";
                    }
                }
            } else {
                query += "'" + addData(data) + "',";
            }
        }
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
        ) {
            statement.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            count = 0;
        }
    }

    public static String addData(String data) {
        String temp = "";
        for (int i = count; i < data.split(",").length; i++) {
            temp = data.split(",")[count];
            count++;
            break;
        }
        return temp;
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nameTable = req.getParameter("nametabledata1");
        int row = Integer.parseInt(req.getParameter("row2"));
        String data = req.getParameter("data1");
        insertData(nameTable, row, data);
        resp.sendRedirect("/");
        resp.setContentType("application/json");
    }
}
