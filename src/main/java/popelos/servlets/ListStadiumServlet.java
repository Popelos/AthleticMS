/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import popelos.dao.StadiumDao;
import popelos.entity.Stadium;

/**
 *
 * @author popelos
 */
@WebServlet(name = "ListStadiumServlet", urlPatterns = {"/ListStadiumServlet"})
public class ListStadiumServlet extends HttpServlet {

private StadiumDao sdao = new StadiumDao();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        List<Stadium> listOfStadiums = sdao.getStadiumList();
        req.setAttribute("stadiums", listOfStadiums); 
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/stadium/stadiumList.jsp");
        dispatcher.forward(req, resp);
    }
    
        

}
