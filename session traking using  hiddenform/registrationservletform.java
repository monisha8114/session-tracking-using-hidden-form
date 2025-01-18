import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationServletOne extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String profession = request.getParameter("profession");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body style='background-color: #faf0e6; font-family: Arial, sans-serif;'>");
        out.println("<center>");
        out.println("<h1 style='color: #8b0000;'>Complete Your Registration</h1>");
        out.println("<form action='./registertwo' method='post'>");
        out.println("<input type='hidden' name='name' value='" + name + "'>");
        out.println("<input type='hidden' name='password' value='" + password + "'>");
        out.println("<input type='hidden' name='profession' value='" + profession + "'>");
        out.println("Email ID: <input type='email' name='email' placeholder='Enter your email' required><br><br>");
        out.println("Phone No: <input type='tel' name='cell' placeholder='Enter your phone number' required><br><br>");
        out.println("<input type='submit' value='Register Now'>");
        out.println("</form>");
        out.println("</center>");
        out.println("</body></html>");
        out.close();
    }
}
