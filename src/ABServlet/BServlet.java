package ABServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pc on 17-3-5.
 */
@WebServlet(name = "BServlet",urlPatterns = "/BServlet")
public class BServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext scc = this.getServletContext();
        //查询名字为xxx的属性的值
        String s = (String) scc.getAttribute("name");
        response.getWriter().println(s);
        //修改名字为xxx的属性值
        scc.setAttribute("name","mahaun");
        String ss = (String) scc.getAttribute("name");
        response.getWriter().println("<h3>"+ss+" </h3>");

    }
}
