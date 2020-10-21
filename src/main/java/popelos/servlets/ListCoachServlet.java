/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import popelos.dao.CoachDao;
import popelos.entity.Coach;


@WebServlet(name = "ListCoachServlet", urlPatterns = {"/ListCoachServlet"})
public class ListCoachServlet extends HttpServlet {

private CoachDao cdao = new CoachDao();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        List<Coach> listOfCoachs = cdao.getCoachList();
        req.setAttribute("coaches", listOfCoachs); 
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/coach/coachList.jsp");
        dispatcher.forward(req, resp);
    }
    
    
}
