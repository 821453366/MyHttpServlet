package Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**测试重定向
 * Created by pc on 17-3-11.
 */
@WebServlet(name = "LogionServlet",urlPatterns = "/LogionServlet")
public class LogionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username=request.getParameter("username");
        String password = request.getParameter("password");

        if("mahuan".equals(username)&&"123456".equals(password)){
            response.sendRedirect("/index.jsp");

        }else{
            response.sendRedirect("/index.html");
        }
    }
}
