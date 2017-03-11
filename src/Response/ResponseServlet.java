package Response;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**响应正文测试缓冲区
 * Created by pc on 17-3-10.
 */
@WebServlet(name = "ResponseServlet",urlPatterns = "/ResponseServlet")
public class ResponseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            for(int i=0;i<1024;i++){
                response.getWriter().print("b");

            }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        response.getWriter().print("马欢");
        response.setHeader("Refresh","2,URL=http://www.baidu.com");
    }
}
