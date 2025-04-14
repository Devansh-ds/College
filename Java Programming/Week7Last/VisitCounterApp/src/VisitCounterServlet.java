import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VisitCounterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        int visitCount = 1;
        Cookie[] cookies = request.getCookies();

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if ("visitCount".equals(cookie.getName())) {
                    visitCount = Integer.parseInt(cookie.getValue()) + 1;
                    break;
                }
            }
        }

        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
        visitCookie.setMaxAge(60 * 60 * 24 * 365); // 1 year
        response.addCookie(visitCookie);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>You have visited this servlet " + visitCount + " times.</h2>");
        out.println("</body></html>");
    }
}
