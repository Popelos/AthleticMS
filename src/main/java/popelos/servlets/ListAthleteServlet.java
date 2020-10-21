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
import popelos.dao.AthleteDao;
import popelos.entity.Athlete;




@WebServlet(name = "ListAthleteServlet", urlPatterns = {"/ListAthleteServlet"})
public class ListAthleteServlet extends HttpServlet {
    
private AthleteDao adao = new AthleteDao();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        List<Athlete> listOfAthletes = adao.getAthleteList();
        req.setAttribute("athletes", listOfAthletes); 
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/athlete/athleteList.jsp");
        dispatcher.forward(req, resp);
    }
    
        


 
}
