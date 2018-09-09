import com.google.gson.JsonObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

@WebServlet("/json")
public class JsonTable extends HttpServlet {
    public static ArrayList<String> arrayId = new ArrayList<>();
    public static ArrayList<JsonObject> getJson(String nametable) {
        final String url = "jdbc:mysql://localhost:3306/myexcel";
        final String user = "root";
        final String password = "root";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<JsonObject> resList = new ArrayList<>();
        ArrayList<String> nameColumns = new ArrayList<>();
        String query = "SELECT * FROM " + nametable + ";";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            int columns = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columns; i++) {
                nameColumns.add(resultSet.getMetaData().getColumnName(i));
            }
            while (resultSet.next()) {
                JsonObject jsonObject = new JsonObject();
                for (int j = 1; j <= columns; j++) {
                    if (j == 1) {
                        arrayId.add(resultSet.getString(j));
                    } else {
                        String key = nameColumns.get(j - 1);
                        String value = resultSet.getString(j);
                        jsonObject.addProperty(key, value);
                        System.out.println(key);
                        System.out.println(value);
                    }
                }
                resList.add(jsonObject);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return resList;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nametable = req.getParameter("tablename7");
        ArrayList<JsonObject> jsonData = getJson(nametable);
        PrintWriter writer = resp.getWriter();
        for (int i = 0; i < jsonData.size(); i++) {
            if (jsonData.size() == 1) {
                writer.print("{" + getArrayId().get(i) + ":");
                writer.print(jsonData.get(i) + "}");
                break;
            } else if (i == 0) {
                writer.print("{" + getArrayId().get(i) + ":");
                writer.print(jsonData.get(i) + ", ");
            } else if (i == jsonData.size() - 1) {
                writer.print(getArrayId().get(i) + ":");
                writer.print(jsonData.get(i) + "}");
            } else {
                writer.print(getArrayId().get(i) + ":");
                writer.print(jsonData.get(i) + ", ");
            }
        }
        writer.flush();
        writer.close();
    }

    public static ArrayList<String> getArrayId() {
        return arrayId;
    }
}
