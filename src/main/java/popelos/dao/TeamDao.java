/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import popelos.entity.Team;

/**
 *
 * @author popelos
 */
public class TeamDao extends SuperDao{
    
        public List<Team> getTeamList(){
        EntityManager em = openConnection();
        TypedQuery<Team> query = em.createNamedQuery("Team.findAll", Team.class);
        List<Team> aList = query.getResultList();     
        closeConnection();
        return aList;
    }
}
