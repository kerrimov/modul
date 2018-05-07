

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;


@WebServlet("/createTable")
public class CreateTable extends HttpServlet {

    private final String url = "jdbc:mysql://localhost:3306/myexcel";
    private final String user = "root";
    private final String password = "TK98kerri7";

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        PreparedStatement preparedStatement = null;
        PrintWriter writer = httpServletResponse.getWriter();
        Connection connection = null;

        String query = "CREATE TABLE person (id int (20) NOT NULL AUTO_INCREMENT, name varchar(40) DEFAULT NULL, email varchar(100) DEFAULT NULL, age  int(3), PRIMARY KEY (id))";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.executeUpdate();
            writer.println("Create success");
        } catch (SQLException e) {
            e.printStackTrace();
        }


        httpServletResponse.setContentType("application/json");


    }

}

