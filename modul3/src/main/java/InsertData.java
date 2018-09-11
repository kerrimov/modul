import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getdata")
public class InsertData extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String TableName = req.getParameter("nametabledata1");
        int row = Integer.parseInt(req.getParameter("row2"));
        String data = req.getParameter("data1");
        SQLData.insertData(TableName, row, data);
        resp.sendRedirect("/");
        resp.setContentType("application/json");
    }
}
