/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popelos.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import popelos.entity.Performances;

/**
 *
 * @author popelos
 */
public class PerformancesDao extends SuperDao{

    public List<Performances> getPerformancesList(){
        EntityManager em = openConnection();
        TypedQuery<Performances> query = em.createNamedQuery("Performances.findAll", Performances.class);
        List<Performances> aList = query.getResultList();     
        closeConnection();
        return aList;
    }
}
