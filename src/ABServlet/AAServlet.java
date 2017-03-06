package ABServlet;


import sun.nio.ch.IOUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by pc on 17-3-5.
 */
@WebServlet(name = "AAServlet",urlPatterns = "/AAServlet")
public class AAServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        ServletContext sc = this.getServletContext();

        /*InputStream input = sc.getResourceAsStream("/AAServlet");
        resp.getWriter().println(IOUtil.toString(input));*/

        //设置域属性
        sc.setAttribute("name","xiaoming");
        resp.getWriter().println("成功添加xiaoming参数到name");



    }
}
