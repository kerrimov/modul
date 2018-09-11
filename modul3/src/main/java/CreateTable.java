import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/createtable")
public class CreateTable extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nameTable = req.getParameter("nametablecreate");
        int columnn = Integer.parseInt(req.getParameter("col"));
        SQLData.createTable(nameTable, columnn);
        resp.sendRedirect("/");
    }
}
