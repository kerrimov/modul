import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/InsertData")
public class InsertData extends HttpServlet {

    private final String url = "jdbc:mysql://localhost:3306/myexcel";
    private final String user = "root";
    private final String password = "root";

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {

        PreparedStatement preparedStatement = null;
        PrintWriter writer = httpServletResponse.getWriter();
        Connection connection = null;

        String insert ="insert into myexcel.accounts (id, name, age) values (?,?,?)";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(url, user, password);
            preparedStatement = connection.prepareStatement(insert);

            preparedStatement.setString(1,"Mike");
            preparedStatement.setString(2,"Mike@mail.ru");
            preparedStatement.setInt(3, 24);

            preparedStatement.executeUpdate();
            writer.println("Create new account");


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (connection != null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        httpServletResponse.setContentType("application/json");
    }
}
