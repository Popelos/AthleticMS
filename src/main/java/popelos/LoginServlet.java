/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.ConnectionService;

/**
 *
 * @author popelos
 */

@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"}, initParams = {
    @WebInitParam(name = "onoma", value = "NotValid")})
public class LoginServlet extends HttpServlet {

     ConnectionService service = new ConnectionService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        String username = request.getParameter("onoma");
        String password = request.getParameter("kwdikos");
        String path;
        if (username.equals("admin") && password.equals("1234")) {
            service.openManagerFactoryConnection();
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            path = "/index.jsp";
        } else {
            String message = "Credentials are wrong!!!";
            request.setAttribute("message", message);
            path = "/login.jsp";
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(path);
        dispatcher.forward(request, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextPath = req.getContextPath();
        resp.sendRedirect(contextPath+"/login.jsp");
    }
    
    

}
