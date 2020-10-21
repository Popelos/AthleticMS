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
import popelos.dao.PerformancesDao;
import popelos.entity.Performances;

/**
 *
 * @author popelos
 */
@WebServlet(name = "ListPerformanceServlet", urlPatterns = {"/ListPerformanceServlet"})
public class ListPerformanceServlet extends HttpServlet {

private PerformancesDao pdao = new PerformancesDao();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        List<Performances> listOfPerformances = pdao.getPerformancesList();
        req.setAttribute("performances", listOfPerformances); 
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/performances/performancesList.jsp");
        dispatcher.forward(req, resp);
    }
    
}
