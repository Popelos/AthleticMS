/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import popelos.entity.Games;

/**
 *
 * @author popelos
 */
public class GamesDao extends SuperDao{

    public List<Games> getGamesList(){
        EntityManager em = openConnection();
        TypedQuery<Games> query = em.createNamedQuery("Games.findAll", Games.class);
        List<Games> aList = query.getResultList();     
        closeConnection();
        return aList;
        
    }
}
