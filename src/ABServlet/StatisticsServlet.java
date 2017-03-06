package ABServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by pc on 17-3-6.
 */
@WebServlet(name = "StatisticsServlet",urlPatterns = "/DServlet")
public class StatisticsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        ServletContext context = this.getServletContext();
        Integer count = (Integer)context.getAttribute("count");
        if(count==null){
            count=1;
        }else{
            count++;
        }
        response.getWriter().print("<h2>本次页面被访问"+count+"次</h2>");
        context.setAttribute("count",count);


    }
}
