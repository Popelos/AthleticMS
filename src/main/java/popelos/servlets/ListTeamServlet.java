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
import popelos.dao.TeamDao;
import popelos.entity.Team;

/**
 *
 * @author popelos
 */
@WebServlet(name = "ListTeamServlet", urlPatterns = {"/ListTeamServlet"})
public class ListTeamServlet extends HttpServlet {

private TeamDao adao = new TeamDao();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        List<Team> listOfTeams = adao.getTeamList();
        req.setAttribute("teams", listOfTeams); 
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/team/teamList.jsp");
        dispatcher.forward(req, resp);
    }
    
       
}
