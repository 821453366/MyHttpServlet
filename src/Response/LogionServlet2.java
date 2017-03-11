package Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pc on 17-3-11.
 */
@WebServlet(name = "LogionServlet2" ,urlPatterns = "/LogionServlet2")
public class LogionServlet2 extends HttpServlet {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
       // username = new String (username.getBytes("utf-8"),"utf-8");
        //password = new String (password.getBytes("ISO-8859-1"),"utf-8");
        System.out.print("username="+username+" password="+password);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("username="+username+" password="+password);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("username="+username+" password="+password);
    }
}
