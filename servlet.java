import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MonServlet extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
      // Set response content type
      response.setContentType("text/html");

      // Ecrit le contenu de la réponse
      PrintWriter out = response.getWriter();
      out.println("<html><body>");
      out.println("<h1>Bonjour depuis MonServlet!</h1>");
      out.println("</body></html>");
   }
}
