import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Welcom extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Welcome</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Welcome!</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
