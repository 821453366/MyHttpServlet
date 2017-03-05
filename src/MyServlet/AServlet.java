package MyServlet;

import java.io.IOException;

/**
 * Created by pc on 17-3-5.
 */
@javax.servlet.annotation.WebServlet(name = "AServlet",urlPatterns = "/AServlet")
public class AServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        response.getWriter().println("<h1>账号："+username+"</h1> <br> <h1>密码："+password+"</h1>");
    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
       doPost(request,response);
    }


}
