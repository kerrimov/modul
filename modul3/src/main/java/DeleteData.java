import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleterow")
public class DeleteData extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nametable = req.getParameter("nametable5");
        int row = Integer.parseInt(req.getParameter("row3"));
        SQLData.deleteData(nametable, row);
        resp.sendRedirect("/");
    }
}
