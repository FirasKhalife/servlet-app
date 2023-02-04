import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet(urlPatterns = { "/salutations" })
public class Salutations extends HttpServlet {

  public void service(HttpServletRequest request, HttpServletResponse response) {
    response.setContentType("text/html");

    try {
      PrintWriter out = response.getWriter();
      String name = request.getParameter("name");

      out.println("<html><body>");
      out.println("<h1>Bonjour " + name);
      out.println("</body></html>");
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}