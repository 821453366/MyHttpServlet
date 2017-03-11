package Request_Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**获取请求头
 * Created by pc on 17-3-11.
 */
@WebServlet(name = "Request_Servlet",urlPatterns="/Request_Servlet")
public class Request_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // String value= request.getHeader("User-Agent");
        //response.getWriter().print(value);

        Enumeration names = request.getHeaderNames();
        while(names.hasMoreElements()){
            String name= (String) names.nextElement();
           String value=(String) request.getAttribute("name");
            response.getWriter().print("name:"+name+"  value:"+value+" \n");

        }
    }
}
