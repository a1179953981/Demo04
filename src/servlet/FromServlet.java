package servlet;

import com.AdminEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FromServlet")
public class FromServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String username=request.getParameter("username");
        String password=request.getParameter("password");
//        System.out.println(username);
        response.setContentType("text/html;charset=utf-8");
        AdminEntity a=new AdminEntity(username,password);
        AdminEntity exitUser=userService.login(a);
        if(exitUser!=null)
        {
            request.getSession().setAttribute("user",exitUser);
            response.sendRedirect("show.html");
        }

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);
    }
}
