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
import popelos.dao.GamesDao;
import popelos.entity.Games;

/**
 *
 * @author popelos
 */
@WebServlet(name = "ListGamesServlet", urlPatterns = {"/ListGamesServlet"})
public class ListGamesServlet extends HttpServlet {

private GamesDao gdao = new GamesDao();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        List<Games> listOfGamess = gdao.getGamesList();
        req.setAttribute("games", listOfGamess); 
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/games/gamesList.jsp");
        dispatcher.forward(req, resp);
    }
    
 
}
