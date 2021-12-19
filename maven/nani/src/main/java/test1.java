import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class test1 extends HttpServlet {
    private String message;
    public void init() {
        message = "Hello World!";
    }
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println(request);
        response.setContentType("text/html;charset=utf-8");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + request.getRequestURI()+"埃里给" + "</h1>");
        out.println("</body></html>");
    }
    public void destroy() {
    }
}