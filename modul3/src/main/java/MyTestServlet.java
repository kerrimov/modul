import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MyExcel")
public class MyTestServlet extends HttpServlet {

    public static final String COUNT = "count";

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        String name = httpServletRequest.getParameter("name");

        int counter = 0;
        Cookie[] cookies = httpServletRequest.getCookies();

        for (Cookie cookie: cookies){
            if(cookie.getName().equals(COUNT)){
                counter = Integer.valueOf(cookie.getValue());
            }
        }

        httpServletResponse.addCookie(new Cookie( COUNT, String.valueOf(++counter)));

        //httpServletResponse.addCookie(new Cookie( "Test", "Test2"));

        PrintWriter writer = httpServletResponse.getWriter();
        writer.println("<html><head></head><body>Hello,"+ name +"</body></html>");
        writer.flush();
        writer.close();
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        super.doPost(httpServletRequest, httpServletResponse);
    }
}
