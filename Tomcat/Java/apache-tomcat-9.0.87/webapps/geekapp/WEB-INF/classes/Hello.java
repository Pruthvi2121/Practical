import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Hello implements Servlet {
    public void init(ServletConfig sc) throws ServletException {
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest req, ServletResponse res) throws ServletException {
        String name = req.getParameter("name");
        try {
            PrintWriter ot = res.getWriter();
            ot.println("Hello " + name);
        } catch (IOException e) {
            throw new ServletException("Error getting PrintWriter", e);
        }
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
    }
}
