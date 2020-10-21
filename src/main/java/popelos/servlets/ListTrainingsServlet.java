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
import popelos.dao.TrainingsDao;
import popelos.entity.Trainings;

/**
 *
 * @author popelos
 */
@WebServlet(name = "ListTrainingsServlet", urlPatterns = {"/ListTrainingsServlet"})
public class ListTrainingsServlet extends HttpServlet {


private TrainingsDao tdao = new TrainingsDao();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        List<Trainings> listOfTrainings = tdao.getTrainingsList();
        req.setAttribute("trainings", listOfTrainings); 
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/trainings/trainingsList.jsp");
        dispatcher.forward(req, resp);
    }
    
      
}
